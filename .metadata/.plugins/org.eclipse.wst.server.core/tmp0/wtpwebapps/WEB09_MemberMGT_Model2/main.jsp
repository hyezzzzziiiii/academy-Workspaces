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
<table>
	<tr><td>안녕하세요. ${loginUser.name}(${loginUser.userid})님</td></tr>
	<tr><td> email : ${loginUser.email}</td></tr>
	<tr><td> 전화번호 : ${loginUser.phone}</td></tr>
	<tr><td>
		<input type="submit" value="로그아웃" 
				onclick="location.href='member.do?command=logout'"> 
		<input type="button" value="회원정보변경"
				onclick="location.href='member.do?command=update_Form'">
		<input type="button" value="회원탈퇴"
				onclick="location.href='member.do?command=delete&userid=${loginUser.userid}'">	
		<c:if test="${loginUser.admin==1}">
			<input type="button" value="멤버보기" 
				onclick="location.href='member.do?command=select_all'">
			<!-- select.do 를 거쳐서 멤버리스트와 함께 member/memberSelect.jsp 로 이동 -->
		</c:if>	
	</td></tr>
	<tr><td>${message }</td></tr>
</table>

</body>
</html>