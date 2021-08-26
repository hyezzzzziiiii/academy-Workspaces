<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- JSP영역은 중간에 끝나고 이후 다시 시작 되더라도 명령문법의 내용이 이어집니다.
	   따라서 위처럼 두개의 영역에 하나의 반복실행문이 걸쳐서 구성되기도합니다.  -->
1부터 100까지의 합을 각 숫자들의 합을 모두 출력하면서 최종 100까지의 합 출력<br/>
<%  
 	int sum = 0;
	for(int i = 1; i<= 100; i++){
		sum +=1;
%>
<!-- 반복실행문이 끝나지 않은 채 JSP영역 종료 -->
		<%= sum %> <!-- JSP변수의 현재 값을 출력 -->
<!-- JSP가 다시 시작되어 끝나지 않은 반복실행문을 종료하는 구문 추가  -->
<% 					
	}
%>
<!-- JSP의 사용은 HTML5코드 사이에 JSP가 껴드는 형식이지만,  -->
<!-- JSP명령이 시작되어서 진행되다가 JSP명령이외에 HTML5 내용이 중간에 삽입될 필요가 있는 경우
		JSP영역을 종료하고 해당내용을 기술한 후에 JSP영역을 다시 시작합니다.  -->
</body>
</html>