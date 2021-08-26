package com.board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.dao.BoardDao;
import com.board.dto.BoardDto;

public class BoardWriteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		BoardDto bdto = new BoardDto();
		bdto.setUserid(request.getParameter("userid"));
		bdto.setPass(request.getParameter("pass"));
		bdto.setEmail(request.getParameter("email"));
		bdto.setTitle(request.getParameter("title"));
		bdto.setContent(request.getParameter("content"));
		
		BoardDao bdao = BoardDao.getInstance();
		bdao.insertBoard(bdto);
		
		response.sendRedirect("board.do?command=boardList");
		// .forward(request, response) 된 jsp 페이지는  
		// 최종 페이지(게시물이 추가된 페이지)에서 새로고침을 눌렀을때 
		// boardWrite.jsp 에서 부터 전달된 request 값들을 가지고 지금 의 execute 까지 다시 실행합니다
		// 새로고침 : 최종 페이지를 포워딩 해준 execute 부터 다시 새로 실행한다는 뜻입니다
		// 그래서 의도치 않게 새로고침으로 방금 추가한 게시물이 하나 더 추가 되는 결과가 생기게 됩니다
		// 그래서 포워딩 아니고 sendRedirect 를 실행하여 forward 로 연결될수 있는 실행을
		// 끊어 줍니다
	}

}
