<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "get" action = "../Joindo">
		<label for = "userid"> 아이디 </label>
			<input type = "text" name = "id"><br>
		<label for = "pwd"> 암&nbsp;호 :  </label>
			<input type = "password" name = "pwd"><br>
		<label for = "gender"> 성별 </label>
			<input type = "radio" name = "gender" value = "1">남자 
			<input type = "radio" name = "gender" value = "2">여자 <br>
		<label for = "chk_mail"> 메일 정보 수신 여부 : </label>
			<input type = "radio" name = "chk_mail" value = "1">수신 
			<input type = "radio" name = "chk_mail" value = "0">거부 <br>
		<label for = "content"> 간단한 가입인사를 적어주세요. </label>
			<textarea name = "content" rows = "3" cols = "35"> </textarea><br>
		
		<label for = "item"> 구입항목</label>
			<input type = "checkbox" name = "item" value = "A">  신발
			<input type = "checkbox" name = "item" value = "B">  가방
			<input type = "checkbox" name = "item" value = "C"> 벨트 <br>
			<input type = "checkbox" name = "item" value = "D"> 모자  
			<input type = "checkbox" name = "item" value = "E"> 시계 
			<input type = "checkbox" name = "item" value = "F"> 쥬얼리 <br>
			
		<span style = "float : left;  margin-right: 20px">
			<label for = "job"> 직업 </label>
			<select if = "job" name = "job" size = "1">
			<option value = "Ⅰ">선택하세요 </option>
			<option value = "Ⅱ">학생 </option>
			<option value = "Ⅲ">컴퓨터/인터넷</option>
			<option value = "Ⅳ">언론 </option>
			<option value = "Ⅴ">공무원 </option>
			<option value = "Ⅵ">군인 </option>
			<option value = "Ⅶ">서비스업 </option>
			<option value = "Ⅷ">교육</option>

			</select>
			</span><br>

		<label for ="interest" style = "float:left;">관심분야 </label>
		<select if = "interest" name = "interest" size = '5' multiple = "multiple">
			<option value = "가">에스프레소 </option>
			<option value = "나">로스팅 </option>
			<option value = "다">생두</option>
			<option value = "라">원두 </option>
			<option value = "마">핸드드립 </option>
			</select><br><br>
			<input type = "submit" value = "전송" style  = "float :left; margin-right: 50px">
	</form>
</body>
</html>