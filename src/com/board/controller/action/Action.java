package com.board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 상속구현(implements)할때 각각 자신의 기능을 오버라이드한 execute메서드에 담고 있는,
// 각 class 들을 담아서 실행의 주체가 될 인터페이스
public interface Action {
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;
}
