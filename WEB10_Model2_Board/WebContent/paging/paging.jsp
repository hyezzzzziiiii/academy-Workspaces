<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{text-align:center;}
	#paging{font-size: 110%;}
</style>
</head>
<body>
<div id="paging">
	<c:url var="action" value="board.do?command=boardList"/> <!-- 링크 경로 저장 -->
	<c:if test="${param.prev}">
		◀&nbsp;
	</c:if>
	<c:forEach begin="${param.beginPage}" end="${param.endPage}" var="index">
		<c:choose>
        	<c:when test="${param.page==index}">	
				${index}&nbsp;
			</c:when>
			<c:otherwise> 
            	<a href="${action}&page=${index}">
            		<span style="color:silver;font-weight:bold">${index}</span>
            	</a>
        	</c:otherwise>
        </c:choose>
	</c:forEach>
	<c:if test="${param.next}">
		▶&nbsp;
	</c:if>
</div>
</body>
</html>




