package com.ezen.mgt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.MemberDao;

/**
 * Servlet implementation class MemberDeleteServlet
 */
@WebServlet("/delete.do")
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터로 아이디를 전송 받습니다
		String userid=request.getParameter("userid");
		// Dao 객체를 생성합니다
		MemberDao mdao = MemberDao.getInstance();
		// Dao의  delete 메서드를 실행하고 결과로 1 또는 0을 리턴받습니다
		int result = mdao.delete(userid);
		// 최종 로그인페이지로 포워딩 되며, delete메서드의 결과에 따라 메세지를 request 에 담습니다
		if(result==1)request.setAttribute("message", "회원삭제를 완료하였습니다");
		else request.setAttribute("message", "회원삭제를 완료하지 못하였습니다");
		
		RequestDispatcher dp = request.getRequestDispatcher("member/loginForm.jsp");
		dp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
