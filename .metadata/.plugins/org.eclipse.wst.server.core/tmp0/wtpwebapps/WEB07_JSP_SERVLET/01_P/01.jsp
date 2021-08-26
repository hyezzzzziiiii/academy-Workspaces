<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action</title>
</head>
<body>
<% 
int age = Integer.parseInt(request.getParameter("age"));
if(age<=19){

%>

<%
}else{
	//request 내부에 있는 Attribute라는 저장소에 name이라는 이름으로 
	//"홍길동"을 저장해두고 jsp로 이동(forward)시킵니다.
	// jsp에서는 이전 페이지에서 보내준 request, response를 전달인수로 
	// 받아 name값을 꺼내 사용가능
	request.setAttribute("name", "홍길동"); //request attribute에 저장
	
	RequestDispatcher dispatcher
	= request.getRequestDispatcher("08_Form.jps");
	dispatcher.forward(request, response); 
	// 해당 페이지로 request와 reponse를 갖고 
	// 보통 파라미터를 통해서 전달하고 request.getParameter()를 사용하여 전달된 값을 추출하여
	// 전달인자를 저장하고, 수명을 다할지 모를 이전 페이지의 request와 response를 전달인수로 전달하여
	// forward라는 명령으로 페이지를 이동한 다음... 이동한 페이지에서 Attribute를 사용하게 합니다.
	
}
%>

</body>
</html>