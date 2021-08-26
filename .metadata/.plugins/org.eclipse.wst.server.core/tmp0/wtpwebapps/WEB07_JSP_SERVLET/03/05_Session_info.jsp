<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
<h3> 세션 정보를 얻어오는 메서드를 사용하기</h3>

<%
String id_str = session.getId(); //현재 세션의 고유코드 얻음
long lasttime = session.getLastAccessedTime(); // 마지막 접근시간 -밀리초
long createdtime = session.getCreationTime(); // 생성시간 - 밀리초
// 사용시간 - 결과도 미리초 -> 1000으로 나누어 초단위로
long time_used = (lasttime - createdtime) /1000;
session.setMaxInactiveInterval(3600);
int inactive = session.getMaxInactiveInterval() / 60; // 수명 - 분
boolean b_new = session.isNew();  // 새로만든 세션의 여부
%>

[1] 세션 ID[<%=id_str %>] 입니다. <br><br>
[2] 당신의 웹사이트에 머문시간은<%=time_used %> 초입니다. <br><br>
[3] 세션의 유효  시간은 <%=inactive%>분입니다. <br><br>
[4] 세션이 새로 만들어졌나요?

<%
if(b_new) out.print("예! 새로운 세션을 만들었습니다.");
else out.print("아니요 새로운 세션을 만들지 않았습니다.");
%>



</body>
</html>