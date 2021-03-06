package com.board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//오버라디드 된 execute 메서드에 각 기능을 담고 있는 클래스를 전달받아 실행해주는 
//기능 실행의 주체
public interface Action {
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;
}
