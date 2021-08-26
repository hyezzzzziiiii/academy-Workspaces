<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var = "now" value = "<%=new java.util.Date() %>"></c:set>
톰캣서버의 기본 로케일 : <%=response.getLocale() %><br>
<fmt:setLocale value = "ko_KR"></fmt:setLocale>
로케일을 한국으로 설정 후 로케일 확인 : <%=response.getLocale() %><br><br>
통화(currency) : <fmt:formatNumber value ="10000" type = "currency"></fmt:formatNumber>
<fmt:formatNumber value ="1000.1234" type = "number" maxFractionDigits="3"></fmt:formatNumber> 
<br>
날짜 : <fmt:formatDate value = "${now}"></fmt:formatDate>
<br><br>

<fmt:setLocale value = "ja_JP"></fmt:setLocale>
로케일을 일본어으로 설정 후 로케일 확인 : <%=response.getLocale() %><br><
통화(currency) : <fmt:formatNumber value ="10000" type = "currency"></fmt:formatNumber>
날짜 : <fmt:formatDate value = "${now}"></fmt:formatDate>

<fmt:setLocale value = "en_US"></fmt:setLocale>  <!-- 확인필요 -->
로케일을 영어으로 설정 후 로케일 확인 : <%=response.getLocale() %><br>
통화(currency) : <fmt:formatNumber value ="10000" type = "currency"></fmt:formatNumber>
날짜 : <fmt:formatDate value = "${now}"></fmt:formatDate>

<fmt:requestEncoding value ="UTF-8"></fmt:requestEncoding>
<%-- <%request.setCharacterEncoding("UTF-8");%> --%>


</body>
</html>