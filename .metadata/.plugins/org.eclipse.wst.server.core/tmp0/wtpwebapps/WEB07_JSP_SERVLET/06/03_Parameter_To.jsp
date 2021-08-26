<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 당신이 입력한 정보입니다. (고전적인 방식)<hr>
 아이디 : <%= request.getParameter("id") %><br>
 비밀번호 : <%= request.getParameter("pwd") %><br><br>
 
 
 당신이 입력한 정보입니다. (EL 방식)<hr>
 아이디 :${param.id} <br>
 비밀번호 : ${param["pwd"]}
 
 <!-- EL 문법은 절달된 파라미터가 널(null)값일때 equals()를 사용한 문자들과 비교하는 
 문법의 오류도 해결해줍니다 --> <!-- **이해 필요 -->
자바코드 <br>
equals() 사용결과 : error -equals메서드 "null값"으로 비교할 떄 오류를 발생시킵니다.<br>
request.getParameter("id").equals("hong") - error<br><br>
<hr> EL식
== 연산자 사용 결과 \${param.id =="hong"} -> ${param.id=="hong"}
<br><br><br>

jsp 문법 상 equals()에서 에서발생을 해결하는 방법
<pre>
<!-- <pre>태그: 입력한 그대로를 화면에 보여주려는 태그: 주로 코딩 내역을 화면에 표시할 때 사용 -->
if(request.getParameter("id") != null){
	if(request.getParameter("id").equals("hong")){
	}

	}else{
	out.print("id가 없습니다");

}</pre>
</body>
</html>