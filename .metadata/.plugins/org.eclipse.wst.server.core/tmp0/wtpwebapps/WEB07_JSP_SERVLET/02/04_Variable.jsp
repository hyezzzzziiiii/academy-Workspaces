<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_Variable.jsp</title>
<%!
	int global_cnt = 0; 
%>
</head>
<body> <!-- 선언부 -->
<% int local_cnt = 0; %>
<br> local_cnt : <%=++local_cnt %> <!-- 새로고침해도 변동없음 -->
<br> global_cnt : <%= ++global_cnt %> <!-- 새로고침 시 변동 -->

<!-- 선언부(Declare)에 선언된 변수는 전액변수와 같이 사용되어, jsp페이지 어디서나 사용가능하며,
값도 일관되게 유지가 됩니다. 또한 페이지를 새로고침해도, 이전값이 유지되는 특성이 있으며, 이는 나중에 
공부하게 될 세션값과 비슷하게 작용되어 서버가 재설정될 때까지 같이 유지되는 특성이 있습니다
  -->
</body>
</html>