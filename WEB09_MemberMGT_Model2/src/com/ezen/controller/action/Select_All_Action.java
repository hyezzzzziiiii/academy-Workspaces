package com.ezen.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.MemberDao;
import com.ezen.dto.MemberDto;

public class Select_All_Action implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao mdao = MemberDao.getInstance();
		ArrayList<MemberDto> list = mdao.selectAll();
		request.setAttribute("memberlist", list);
		RequestDispatcher dp = request.getRequestDispatcher("member/memberSelect.jsp");
		dp.forward(request, response);
	}
}
