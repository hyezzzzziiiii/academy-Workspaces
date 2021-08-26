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
<%! //선언부
String driver = "oracle.jdbc.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String uid = "scott";
String pass = "tiger";

Connection con = null; 
PreparedStatement pstmt = null; 
ResultSet rs = null; 
%>

</head>
<body>
<table width = '800' border = '1'>
<tr><th> 이름 </th><th>아이디</th><th>암호</th><th>전화번호</th></tr>
<!-- <tr><td></td>...</tr> -->
<!-- 데이터 베이스에 연결하고, mem테이블에서 레코드를 일겅와서, 레코드 갯수만큼 <tr></tr>을 반복
추가합니다. -->
<%
	try{
	Class.forName(driver); 
	con = DriverManager.getConnection(url, uid, pass);
	String sql = "select * from mem";
	pstmt = con.prepareStatement(sql);
	rs = pstmt.executeQuery();
	while(rs.next()){  //rs.next()를 기준으로 레코드가 있으면 계속되고 아니면 끝나도록
		// 레코드 단위로 <tr><td></td>...</tr>이 추가됩니다.
		out.print("<tr><td>" + rs.getString("name") + "</td>"); //tr로 시작
		String anchor = "<td><a href = 'MemberEdit.jsp?userid=" 
			+rs.getString("id") + "'>"
			+rs.getString("id") +"</a></td>";
			out.println(anchor);
		// 현재id값으로 각레코드별 다른 링크 생성하여 anchor태그에 링크를 걸어줍니다.
		// out.print("<td>" + rs.getString("id") + "</td>");
		out.print("<td>" + rs.getString("pwd") + "</td>");
		out.print("<td>" + rs.getString("phone") + "</td></tr>"); // tr로끝
	}
	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!= null) rs.close(); // rs에 값이 있으면 닫는 명령
			if(pstmt!= null) pstmt.close();
			if(con!= null) con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>
 <!-- 만약 classNotFound가 실행한되는 경우 ojdbc6.jar을 lib로 삽입 -->
<tr><td colspan = "6" align = "center">
	<input type = "button" value = "추기" onClick = "location.href = 'MemberAdd.jsp'"/>
</td></tr>
</table>
</body>
</html>