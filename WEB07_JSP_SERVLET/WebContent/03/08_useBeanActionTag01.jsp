<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.ezen.dto.MemberBean"%>
<!-- 자바빈 관련 액션태그
 : JSP에서는 자바빈 파일을 쉽게 사용하기 위해서 몇 가지 유용한 액션태그를 지원한다. 
	1) useBean
	2) setProperty
	3) getPoperty 
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// jsp로 객체를 선언하는 방법
MemberBean  member1 = new MemberBean();
com.ezen.dto.MemberBean member2 = new com.ezen.dto.MemberBean();
%>
<!-- 액션태그로 객체를 만드는 방법  -->
<jsp:useBean id = "member3" class = "com.ezen.dto.MemberBean"/>


<!--
<!--  먼저 useBean 액션태그는 특정한 자바빈 파일을 사용한다고 명시할 때 사용된다. 형식은 아래와 같다.
<jsp:useBean id="빈 이름" class="자바빈 파일의 패키지.클래스명" scope="유효범위" />  -->
-->

<!--  
useBean 액션태그는 [ 클래스 빈이름 = new 클래스();] 와 동일한 의미를 갖는다. 
id 속성명은 객체명, JSP페이지에서 자바빈 객체에 접근 할 때 사용하는 이름이다.
class 속성명은 패키지 이름을 포함한 자바빈 클래스의 완전한 이름을 입력하며,
scope 속성은 유효범위를 의미하며 page(생성된 페이지 내), request(요청된 페이지 내), 
session(웹브라우저의 생명주기), application(어플리케이션의 생명주기)을 작성할 수 있으며, 
기본값은 page이다. 
-->
◎객체 생성 후 정보입력 <br>
<%
member3.setName("홍길동");
member3.setUserid("HongGilDong");
%>
이름 : <%= member3.getName() %> <br>
아이디 : <%= member3.getUserid() %> <br>
<br>

◎ 정보 변경한 후 변경된 정보 출력하기 <br>
<%
member3.setName("김하나");
member3.setUserid("KimHana");
%>
이름 : <%= member3.getName() %> <br>
아이디 : <%= member3.getUserid() %> 
<hr><br><br>

◎ 액션태그로 정보 변경한 후 변경된 정보 출력하기 <br><br>
<jsp:setProperty name = "member3" property = "name" value ="박찬호"/>
<jsp:setProperty name = "member3" property = "userid" value ="ParkChanHo"/>
<!-- setProperty 액션태그는 자바빈 파일의 setter 메서드를 사용하기 위해, 
즉 데이터의 값을 설정할 때 사용된다.  -->
이름 : <jsp:getProperty name = "member3" property = "name" /><br>
아이디 : <jsp:getProperty name = "member3" property = "userid" />
<!-- getProperty 액션태그는 자바빈 파일의 getter 메서드를 사용하기 위해, 
즉 저장된 데이터의 값을 읽어올 때 사용된다.  -->

<!-- 자바빈은 자바(JAVA)로 작성된 컴포넌트를 의미한다. 
간단하게 이야기하면 메서드와 프로퍼티(JSP에서는 필드를 프로퍼티라고 한다.)로 구성된 JAVA의 클래스이다. 
자바빈의 메서드는 getter, setter 메서드로 구성된다. 
즉, 자바빈은 데이터를 읽어 오거나 데이터를 저장하는 역할을 반복적으로 수행하기 위해 사용한다. -->
</body>
</html>