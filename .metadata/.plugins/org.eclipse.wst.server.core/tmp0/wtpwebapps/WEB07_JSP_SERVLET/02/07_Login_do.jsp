<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.net.URLEncoder"%>

<%

//현재 파일은 화면에 표시할 페이지가 아니고, 전달된 아이디와 비번이 유효한 아이디 비번인지만 판단하고,
//유효하면 login_ok.jsp로 이동하고, 유효하지 않으면 LoginForm.jsp 로 돌아가는 역할만 할 
//예정이어서 HTML 몸체 없이 작성합니다

String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String name = "홍길동";

if( id.equals("hong") && pwd.equals("1234") )
//jsp 의 페이지 이동 명령 : response.sendRedirect();
//response.sendRedirect("07_Login_ok.jsp?name=" + URLEncoder.encode(name, "UTF-8"));
response.sendRedirect("07_Login_ok.jsp?name=Gildong");
//위와 같이 uri 를 구성하는 것이 다음 페이지에 필요정보를 전달하는 첫번째 방법
else
response.sendRedirect("07_LoginForm.jsp");

//form 태그도 없고, input type="text" 태그도 없으며, submit 버튼도 없는 상태에서 다음페이지에
//현재페이지가 갖고 잇는 정보를 보내려면 위와 같이 주소 uri 에 전달인수로 전달하는 방법이 있습니다

%>
