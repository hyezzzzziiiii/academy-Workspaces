<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  request객체가 담고 있는 정보들 -->
컨텍스트 패스 : <%=request.getContextPath() %><br> 
<!-- 컨텍스트 패스 : /WEB07_JSP_SERVLET -->

요청방식 : <%=request.getMethod() %><br>  
<!-- 요청방식 : GET -->

요청한 URL : <%=request.getRequestURL() %><br>
<!-- 요청한 URL : http://localhost:8090/WEB07_JSP_SERVLET/02/06_Request_Object.jsp -->

요청한 URI : <%=request.getRequestURI() %><br>
<!-- 요청한 URI : /WEB07_JSP_SERVLET/02/06_Request_Object.jsp -->

서버의 이름 : <%=request.getServerName() %><br>
<!-- 서버의 이름 : localhost -->

프로토콜 : <%=request.getProtocol() %><br>
<!-- 프로토콜 : HTTP/1.1 -->

<!-- 
모든 jsp파일에는 response객체와 request 객채가 포함되어있습니다.
request는 주로 서버에서부터 외부에서 관련자료를 받는 역할을 담당하고
response는 주로 서버로 또는 화면으로 관련자료를 보내거나 출력하는 역할을 담당합니다.
out.print()함수로 사용되는 out객체도 현재 파일에 담겨있는 객체이며 자유롭게 사용이 가능합니다. 
-->


</body>
</html>