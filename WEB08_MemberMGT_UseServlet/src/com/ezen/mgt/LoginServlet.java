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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 페이지 화면 로딩(포워딩)
		String url = "member/loginForm.jsp";  // 포워딩될 페이지의 경로 설정
		HttpSession session = request.getSession();  // 현재 웹사이트의 세션객체 얻어옵니다
		// loginUser 세션값이 널이 아니라면, (누군가 로그인되어 있는 상태라면)
		if( session.getAttribute("loginUser") != null )
			url = "main.jsp";  // 포워딩될 경로를 변경합니다
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);  // 설정된 경로로 포워딩 합니다.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 실제 입력된 아이디 비번을 이용한 로그인 처리후 main 페이지로 포워딩
		String url = "member/loginForm.jsp";  // 로그인 실패(아이디 비번오류)했을때 포워딩할 경로
		HttpSession session = request.getSession(); 
		//1. 파라미터 전달받습니다. request.getParameter() 이용
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		//2. 데이터베이스에서 전달받은 아이디로 검색한 회원 정보를 얻어옵니다
		MemberDto mdto = null; // 조회한 회원의 각 필드를 담을 dto 
		MemberDao mdao = MemberDao.getInstance(); // 데이터베이스 조회를 위한 객체 dao
		mdto = mdao.selectMember(userid);	// 없는 아이디이면 mdto 는 null 입니다
		//3. 회원 정보중 패스워드를 전달받은 파라미터와 비교합니다.
		//4. 맞으면 로그인, 틀리면 다시 로그인 폼으로 돌아갑니다
		if( mdto==null)
			request.setAttribute("message", "아이디가 존재하지 않습니다");
		else {
			if( mdto.getPwd() != null) {
				if( mdto.getPwd().equals(pwd) ) {
					session.setAttribute("loginUser", mdto);  // 로그인정보를 저장
					url = "main.jsp";
				}else {
					request.setAttribute("message", "비밀번호가 맞지 않습니다");
				}
			}else {
				request.setAttribute("message", "회원정보 오류 - 관리자에게 문의하세요");
			}
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(url);
		dp.forward(request, response);
		
	}

}
