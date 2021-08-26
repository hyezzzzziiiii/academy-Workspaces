package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.MemberDao;

public class Delete_Action implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("userid");
		MemberDao mdao = MemberDao.getInstance();
		int result = mdao.deleteMember(userid);
		if(result==1)request.setAttribute("message", "회원삭제 완료");
		else request.setAttribute("message", "회원삭제 실패. 관리자에게 문의하세요");
		RequestDispatcher dp = request.getRequestDispatcher("member/loginForm.jsp");
		dp.forward(request, response);
	}
}
