<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/admin/header.jsp"%>
<%@ include file = "/admin/sub_menu.jsp"%>

<!-- <article> 태그는 해당 문서나 페이지 또는 사이트와는 
완전히 독립적으로 구성할 수 있는 요소를 정의할 때 사용합니다. -->
<article>
<h1>상품 상세 보기</h1>
<form name ="frm" method="post">
<table id = "list">
	<tr><th>상품 분류</th><td colspan= "5">${kind }</td></tr>
	<tr><th align = "center">상품 명</th><td colspan = '5'> ${productVO.name}</td></tr>
	
	<tr>
	<th>원가[A] </th> <td width = "60"> ${productVO.price1}</td>
	<th>판매가 [B] </th><td width = "60"> ${productVO.price2}</td>
	<th>[B-A] </th><td> ${productVO.price3}</td>
	</tr>
	
	<tr><th>상세 설명 </th><td colspan="5"> ${productVO.content }</td></tr>
	
	<tr><th>상품 이미지</th>
	<td colspan= "5 " align = "center">
	<img  src=" product_images/${productVO.image }"  width ="200px"></td></tr>
	</table>

	<input class ="btn" type = "button" value = "수정" onclick="go_mod('${productVO.pseq }')">
	<input class ="btn" type = "button" value = "목록" onclick="go_mov()">
	</form>
	</article>
	
	
<%@ include file = "/admin/footer.jsp"%>
	
	