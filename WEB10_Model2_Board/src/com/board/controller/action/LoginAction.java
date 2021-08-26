package com.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.dao.MemberDao;
import com.board.dto.MemberDto;

public class LoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String url = "member/loginForm.jsp";
		
		MemberDao mdao = MemberDao.getInstance();
		MemberDto  mdto = mdao.getMember(userid);
		if( mdto == null )
			request.setAttribute("message", "아이디가 없습니다");
		else 	if( mdto.getPwd() != null) {
				
			if(mdto.getPwd().equals(pwd)) {
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", mdto);
				url = "board.do?command=boardList";
			}else {
				request.setAttribute("message", "비밀번호가 맞지 않습니다");
			}
			
		}else {
				request.setAttribute("message", "회원정보에 오류가 있습니다. 관리자에게 문의하세요");
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
