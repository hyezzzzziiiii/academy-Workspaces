<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.Calendar"%> <!-- JSP 의 임포트 명령 -->

<html>
<head>

<%!
/* 이 영역은 변수나 객체를 선언하는 용도로 많이 사용합니다 JSP 영역 표기 와 ! 함께 사용하여 선언부로 
사용합니다 */
Calendar sDay = Calendar.getInstance(); // Calendar 객체로 오늘 날짜 객체 얻습니다
int sYear = sDay.get(Calendar.YEAR); // 년도 추출
int sMonth = sDay.get(Calendar.MONTH) + 1; // 월추출
int pYear = 0; // 전년
int pMonth = 0; // 전월
int nYear = 0;	// 후년
int nMonth = 0;	// 다음달
%>

<meta charset="UTF-8">
<title>07_Calendar.jsp</title>
<style type="text/css">
table>tbody>tr>td{font-size:110%; font-weight:bold;}
table>tbody>tr>td:first-child{color:red;}
table>tbody>tr>td:last-child{color:blue;}
</style>
</head>
<body>

<%
if( request.getParameter("sYear")!=null ){
sYear = Integer.parseInt(request.getParameter("sYear"));
sMonth = Integer.parseInt(request.getParameter("sMonth"));
}

//전달된 파라미터 값이 널이 아니라면 전달된 값으로 년과 월을 바꿉니다
//널이라면 위에서 계산한 오늘 날짜의 년월로 설정합니다
// getParameter()메서드의 경우 String타입을 리턴하는반면,
// getAttribute()는 Object 타입을 리턴하기 때문에 주로 빈 객체나 다른 클래스를 받아올때 사용된다
if(sMonth-1 == 0){ // 현재월이 1월인경우 이전달
pYear = sYear -1; // 전년도
pMonth = 12; //12월
}else{
pYear = sYear; // 현재월이 1월이 아난경우 이전달 -> 같은 년도
pMonth = sMonth - 1; // 이전달(-1)
}
if(sMonth+1 == 13){ // 현재월이 12월인경우 다음달

nYear = sYear + 1; // 다음년도

nMonth = 1; //1월

}else{

nYear = sYear; // 현재월이 12월이 아닌경우 다음달 -> 같은년도

nMonth= sMonth + 1; // 다음달(+1)

}

%>

<h1> <%=sYear%> 년 <%=sMonth %> 월</h1>

<table width="560" align="left" cellspacing="1" bgcolor="black">

<tr bgcolor="white" height="50">

<td align="center" width="80">일</td> <td align="center" width="80">월</td>

<td align="center" width="80">화</td> <td align="center" width="80">수</td>

<td align="center" width="80">목</td> <td align="center" width="80">금</td>

<td align="center" width="80">토</td>

</tr>

<%

int k = 1; // 맨 첫칸부터 어디까지 갔는지 카운트 하는 변수

for( int i=0; i<=5; i++){ %>

<tr bgcolor="white" height="60" align="right">

<%for( int j=0; j<=6; j++){ %>

<td><%=k++%></td>

<%}%>

</tr>

<%} %> 

<tr bgcolor="white" height="50">

<td colspan="7">

<input type="button" value="이전달" onClick = "location.href=

'07_Calendar2.jsp?sYear=<%=pYear%>&sMonth=<%=pMonth%>'"/>

<input type="button" value="다음달" onClick = "location.href=

'07_Calendar2.jsp?sYear=<%=nYear%>&sMonth=<%=nMonth%>'"/>

</td>

</tr>

</table>
</body>
</html>