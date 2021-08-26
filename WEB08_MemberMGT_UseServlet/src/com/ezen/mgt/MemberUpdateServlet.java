package com.ezen.mgt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/update.do")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 업데이트 폼을 포워딩
		String url = "member/updateForm.jsp";  // 포워딩될 페이지의 경로 설정
		String userid = request.getParameter("userid");
		MemberDao mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.selectMember(userid);
		request.setAttribute("member" , mdto );
		
		HttpSession session = request.getSession(); 
		if( session.getAttribute("loginUser") == null )
			url = "member/loginForm.jsp";
		
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전달된 내용으로 회원정보 업데이트
		request.setCharacterEncoding("UTF-8");
		MemberDto mdto = new MemberDto();
		mdto.setName( request.getParameter("name") );
		mdto.setUserid( request.getParameter("userid") );
		mdto.setPwd( request.getParameter("pwd") );
		mdto.setEmail( request.getParameter("email") );
		mdto.setPhone( request.getParameter("phone") );
		mdto.setAdmin( Integer.parseInt( request.getParameter("admin") ) );
		
		MemberDao mdao = MemberDao.getInstance();
		int result = mdao.update(mdto);
		
		if(result==1) {
			request.setAttribute("message", "회원 정보를 수정하였습니다.");
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mdto);
		}else {
			request.setAttribute("message", "회원 정보를 수정하지 못했습니다.");
		}
		RequestDispatcher dp = request.getRequestDispatcher("main.jsp");
		dp.forward(request, response);
	}

}
