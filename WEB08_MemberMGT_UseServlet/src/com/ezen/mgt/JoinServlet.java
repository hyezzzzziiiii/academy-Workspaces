package com.ezen.mgt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dp = request.getRequestDispatcher("member/joinForm.jsp");
		dp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		/*String name = request.getParameter("name");
		String userid = request.getParameter("userid"); 
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		int admin = Integer.parseInt(request.getParameter("admin"));
		MemberDto mdto = new MemberDto();
		mdto.setName(name);
		mdto.setUserid(userid);
		mdto.setPwd(pwd);
		mdto.setEmail(email);
		mdto.setPhone(phone);
		mdto.setAdmin(admin);*/
		MemberDto mdto = new MemberDto();
		mdto.setName( request.getParameter("name") );
		mdto.setUserid( request.getParameter("userid") );
		mdto.setPwd( request.getParameter("pwd") );
		mdto.setEmail( request.getParameter("email") );
		mdto.setPhone( request.getParameter("phone") );
		mdto.setAdmin( Integer.parseInt(request.getParameter("admin") ) );
		
		MemberDao mdao = MemberDao.getInstance();
		int result = mdao.insertMember(mdto);
		if( result == 1 ) 
			request.setAttribute("message", "??????????????? ?????????????????????. ????????? ????????????");
		else 
			request.setAttribute("message", "??????????????? ????????? ??????????????????. ????????? ?????? ??????????????????");
		RequestDispatcher dp = request.getRequestDispatcher("member/loginForm.jsp");
		dp.forward(request, response);
	}

}
