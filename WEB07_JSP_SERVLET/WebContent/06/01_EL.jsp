<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 표현 언어(EL, Expression Language
: JSP의 전달값이나 변수값 등 자료를 출력할 떄 번거로움을 간단히 해결하기 위해 만들어진 출력 문법
 -->
 JSP문법 사용 1: <%="HELLO" %><br>
 JSP문법 사용 2: <%out.print("HELLO"); %><br>
 EL문법 사용 : ${"HELLO"}<br>
<%--EL언어의 특징 : 모든 표현을 ${}을 이용하여 표현-출력합니다. 위 언어표현의 경우
${} 안에 JSP에서 값을 저장하고 있는 변수의 이름으로 써도 출력됩니다. 다만 별도의 변수 설정이 
필요합니다.--%>
<%
String s = "Hello World";
%>
JSP문법 사용 1: <%=s%><br>
JSP문법 사용 2: <%out.print(s); %><br>
EL문법 사용 1: ${s}<br> <!-- JSTL변수 설정 후에 출력이 가능합니다. -->
<br>
정수형 : ${10} <br>
실수형 : ${5.6} <br>
문자열형 : ${"홍길동"} <br>
논리형 : ${true} <br>
null : ${null} <br>
<br>

<%-- 표현언어의 (산술연산) --%>
10과 2의 합 : ${10 + 2}<br>
<!-- \${10-2}는 모양 그대로 출력, $(10-2}는 계산된 결과를 출력 -->
\${10 - 2} : ${10 - 2}<br>
\${10 * 2} : ${10 * 2}<br>
\${10 / 2} : ${10 / 2}<br>

\${10%2} : ${10%2}<br>
\${10 mod 2} : ${10 mod 2}<br> <!-- 0출력 -->
<br>

<%-- 표현언어의 (비교연산) --%>
\${10 == 2} : ${10 == 2}<br>
\${10 eq 2} : ${10 eq 2}<br>
\${10 < 2} : ${10 < 2}<br>
\${10 lt 2} : ${10 lt 2}<br>
\${10 >= 2} : ${10 >= 2}<br>
\${empty("")} : ${empty("")}<br>
<br>
<br>

<%-- 서로다른 자료형간의 연산 --%>
\${"2" + 5} : ${"2" + 5}<br> 
\${"2" * 5} : ${"2" * 5}<br>
\${null + 1} : ${null + 1}<br>
<br>

<%-- error
\${"이젠" + "아이티 아카데미"} : ${"이젠" + "아카데미" }<br> 
\${"일" + 5} : ${"일" + 5}<br>  //+로 문자열간의 연결하는 것을 허용하지 않음
 --%>

<%-- 문자열 연결(EL 3.0 추가)--%>
\${"문자" += "열" +="연결"} : ${"문자" += "열" +="연결"}<br> 
<br>
<%
	request.setAttribute("name", "홍길동");
	pageContext.setAttribute("name", "강감찬");
%>
<%= request.getAttribute("name") %><br> <!-- 홍길동 출력 -->
${requestScope.name}<br> <!-- 홍길동 출력 -->
${name} <!-- 강감찬 출력 -->
<!-- Attribute의 이름이 중복되었을 떄 우선순위 :pageContext> request> 
session> application 순서로 먼저 출력됩니다. -->
<br>
<br>
</body>
</html>