<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1) -->
<c:import url = "http://localhost:8090/WEB07_JSP_SERVLET/06/02_Scope.jsp" var="data1">
</c:import>
${data1}
<hr/>
<!-- 2) -->
<c:url value = "../images/Koala.jpg" var = "data2"></c:url>
<h3>${data2}</h3>
<img src="${data2}" width='150' height='150'>
</body>
</html>