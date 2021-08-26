<%@page import="com.ezen.dto.MemberBean"%>
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
<!-- 단순출력 -->
<c:out value = "HelloWorld"/><br>

<br>
<!-- 변수생성 및 초기화1 -->
<c:set var = "msg" value = "Hello"></c:set>
<!-- EL에 의한 출력 -->
 \${msg} =${msg}<br>

<!-- JSP에서 선언 및 초기화된 변수는 EL로 출력이 되지 않지만 위와 같이 JSTL변수는 가능합니다. -->

<!-- 변수생성 및 초기화2 -->
<c:set var = "age"> 30</c:set>  <!-- value값이 밖에 선언 -->
 \${age} =${age}<hr><br>
 
 
<c:set var = "member" value ="<%=new com.ezen.dto.MemberBean() %>"></c:set> 
<!-- MemberBean member = new MemberBean(); -->
 
 
<!-- 멤버변수에 값저장 -->
<c:set target="${member}" property="name" value = "홍길동"></c:set>
<c:set target="${member}" property="userid"> Hong </c:set>
 
<!-- 멤버변수 값 출력 -->
\${member.name} = ${member.name}<br> 
\${member.userid} = ${member.userid}<hr>
<!-- 사용중인 클래스에 getters/setters 를 생성해야 member.name처럼 
간단히 사용히 가능합니다. -->
 <br>
 
<c:set var = "add" value = "${10+5}"></c:set> 
 \${add} = ${add} <br>
<c:set var = "flag" value = "${10>5}"></c:set>
 \${flag} = ${flag} <br>
 
</body>
</html>