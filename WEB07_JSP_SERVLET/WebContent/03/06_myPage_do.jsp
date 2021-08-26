<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("loginUser") == null){
		response.sendRedirect("06_LoginForm.jsp");
	}  //로그인 유저에 비어있다면 다시 첫페이지로 
	response.sendRedirect("06_myPage.jsp");
	// 로그인된다면 마이페이지로
%>