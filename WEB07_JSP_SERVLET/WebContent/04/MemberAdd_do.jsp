<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- 선언부 개념 확실히 -->

<%@page import= "java.sql.DriverManager" %> 
<%@page import= "java.sql.DriverAction" %> 
<%@page import= "java.sql.ResultSet" %>
<%@page import= "java.sql.PreparedStatement" %>    
<%@page import= "java.sql.Connection" %>  

<%
Connection con = null; 
PreparedStatement pstmt = null; 
String driver = "oracle.jdbc.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String uid = "scott";
String pass = "tiger";

String name = request.getParameter("name"); // 정보얻어오는 란
String userid = request.getParameter("userid");
String pwd = request.getParameter("pwd");
String phone = request.getParameter("phone");

try{
	Class.forName(driver);
	con = DriverManager.getConnection(url, uid, pass);
	String sql = "insert into mem(name, id, pwd, phone) values(?,?,?,?)";
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, name); // setString(순번, 값) -> 위 ?의 번호
	pstmt.setString(2, userid);
	pstmt.setString(3, pwd);
	pstmt.setString(4, phone);
	int result = pstmt.executeUpdate();
	if(result == 1) response.sendRedirect("MemberMGR.jsp"); 
	// result == 1이라는 것은 정보가 올바르게 입력되었다는 의미 저장된 데이터 베이스 보여주는 공간
	else response.sendRedirect("MemberAdd.jsp"); // 회원정보입력 폼으로 돌아감
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(pstmt!= null) pstmt.close();
		if(con!= null) con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
%>

