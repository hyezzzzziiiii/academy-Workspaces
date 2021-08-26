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
<!-- 반복실행문의 또다른 사용 예 -->
<br/> <h3> 반복 실행문의 또다른 사용 예</h3><br/> <!-- step은 증감량을 나타냄 -->
<c:forEach var = "cnt" begin ="1" end = "10" step="2" varStatus = "status">
	${cnt}&nbsp;${status.index} <c:if test = "${not status.last}">,</c:if>
</c:forEach><br><br>
<br>

<!-- 위의 cnt와 아래의 cnt는 별개 -->
<table border ="1" style = "width: 50%; text-align:center;" align = "left">
	<tr><th> index</th><th>count</th><th>cnt</th></tr>
	
	<c:forEach var ="cnt" begin = "7" end = "10" varStatus = "status">
		<tr>
			<td> ${status.index}</td><td>${status.count}</td><td>${cnt}</td>
		</tr>
	</c:forEach>
</table>


</body>
</html>