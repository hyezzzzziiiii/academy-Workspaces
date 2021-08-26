<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import= "java.sql.Connection" %> 
<%@page import= "java.sql.PreparedStatement" %> 
<%@page import= "java.sql.ResultSet" %>
<%@page import= "java.sql.DriverManager" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!
String driver = "oracle.jdbc.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String uid = "scott";
String pass = "tiger";
String subject = "";
int makeyear = 0; //int로 자료형을 지정해놨으므로 ""되면 error
int inprice = 0;
int outprice = 0;
String grade = "청소년 구매가능";

Connection con = null; 
PreparedStatement pstmt = null; 
ResultSet rs = null; 

%>
</head>
<body>
<%
String booknum = request.getParameter("booknum");
try{
	Class.forName(driver); 
	con = DriverManager.getConnection(url, uid, pass);
	String sql = "select * from booklist where booknum= ?";
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, booknum);
	rs = pstmt.executeQuery();
	if(rs.next()){ // next는 boolean값 판단 rs객체에 접근해 true로 판단되면 값을 얻어옴
		subject = rs.getString("subject");
		makeyear = rs.getInt("makeyear");
		inprice = rs.getInt("inprice");
		outprice = rs.getInt("outprice");
		grade = rs.getString("grade");
	}
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(pstmt!= null) pstmt.close();
		if(con!= null) con.close();
	}catch(Exception e){
		e.printStackTrace();}
}
%>
<form method = "get" action = "bookEdit_do.jsp">
	<table>
		<tr><td>제목</td>
			<td><input type = "text" name = "subject" size = "40" value = "<%=subject%>"></td></tr>
		<tr><td>출판년도</td>
			<td><input type = "text" name = "makeyear" size = "20" value = "<%=makeyear%>"></td></tr>
		<tr><td>입고가격</td>
			<td><input type = "text" name = "inprice" size = "20" value = "<%=inprice%>"></td></tr>
		<tr><td>출고가격</td>
			<td><input type = "text" name = "outprice" size = "20" value = "<%=outprice%>"></td></tr>
		<tr><td>등급</td><td>
		<input type = "radio" name = "grade" value = "전체" checked
		<%if(grade.equals("전체")){%>checked<%} %>> 전체&nbsp;
		<input type = "radio" name = "grade" value = "성인전용"
		<%if(grade.equals("성인전용")){%>checked<%} %>> 성인&nbsp;
		<input type = "radio" name = "grade" value = "청소년 구매가능" 
		<%if(grade.equals("청소년 구매가능")){%>checked<%} %>>청소년 &nbsp;
		<input type = "hidden" name = "booknum" value = "<%=booknum %>"> 
		<!-- 테이블 안 어느곳에든 넣어도 됨/ booknum이 보여질필요는 없으나 같이 전달이 되야하기 때문에  -->
		</td></tr>
	</table>
<input type = "submit" value = "전송">
</form>
</body>
</html>