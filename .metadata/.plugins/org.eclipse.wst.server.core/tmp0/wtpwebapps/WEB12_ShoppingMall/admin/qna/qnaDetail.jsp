<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/admin/header.jsp"%>
<%@ include file = "/admin/sub_menu.jsp"%>
<script type ="text/javascript">
	function go_rep(qseq){ 
		document.frm.qseq.value = qseq;
		document.frm.action="shop.do?command=adminQnaRepsave";
		document.frm.submit();
	}
</script>

<article>
<h1>Q&amp;A 게시판</h1>
<form name ="frm" method ="post"> <!-- esl로 qseq value에 넣어도 상관없음(7번라인) -->
<input type = "hidden" name = "qseq" value = "${qnaVO.qseq}">
	<table id = "orderList">
		<tr><th width = "20%">제목</th><td align ="left">${qnaVO.subject}${qnaVO.rep}</td></tr>
		<tr><th>등록일</th><td align ="left"><fmt:formatDate value="${qnaVO.indate}"/></td></tr>
		<tr><th>내용</th><td align ="left">${qnaVO.content}</td></tr>
	</table>
<c:choose>
	<c:when test = '${qnaVO.rep=="1"}'> <!--관리자 답변 전 표시-->
		<table id = "orderList"> <!-- 답변을 넣을 수 있는 란 -->
		<tr><td colspan = "2"><img src = "admin/images/opinionimg01.gif"></td></tr>
		<tr><td colspan = "2">
		<textarea name ="reply"rows="3" cols="50"></textarea>
		<input type ="button" class = "btn"value ="저장" onclick= "go_rep('${qnaVO.qseq}')">
		</td></tr>
		</table>
	</c:when>
	<c:otherwise><!--관리자 답변완료 후 표시 -->
		<table id ="orderList"> <!--답변의 내용을 화면에 보여줌  -->
		<tr><th>댓글</th><td>${qnaVO.reply}</td></tr>
		</table>
	</c:otherwise>
</c:choose>
<input type ="button" class = "btn" value = "목록" onclick="go_list()">

</form>
</article>
<%@ include file = "/admin/footer.jsp"%>