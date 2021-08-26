<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% response.sendRedirect("member.do?command=login_form");%>
<!-- 클라이언트가 로그인 페이지를 요청하게 되고, 클라이언트 요청에 대한 응답할 응답정보를 가지고 있는다
	 이를 sendRedirect로 로그인 폼으로 이동
	 response 객체에서 제공하는 sendRedirect() 메소드는 응답 객체가 가진 헤더 정보에 클라이언트가 다음번에 어디로 갈지를 지정해주는 것!
	 포워딩처럼 제어 흐름을 다른 곳으로 넘기는 방식이 아닙니다. 
	 따라서 sendRedirect() 메소드가 실행된 이후의 코드 또한 계속 실행시키게 됩니다.-->
<!-- 커맨드라는 파라미터를 보냄 -->
</body>
</html>