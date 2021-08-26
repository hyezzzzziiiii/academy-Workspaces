function go_total(){ /*전체 보기 또한 클릭했을 떄 1page가 출력됩*/
	document.frm.key.value=""; //검색어를 없앤다.
	document.frm.action = "shop.do?command=adminProductList&page=1";
	document.frm.submit();
}



function go_search(){ /*검색의 결과는 항상 1page(&page=1을 사용)*/
	if(document.frm.key.value=="") return; //빈칸을 입력하고 검색하면 그대로 전체
	document.frm.action = "shop.do?command=adminProductList&page=1";
	document.frm.submit();

}

function go_list(){
	location.href="shop.do?command=adminQnaList";
}

function go_view(qseq){
	var theForm = document.frm;
	theForm.action = "shop.do?command=adminQnaDetail&qseq="+qseq;
	theForm.submit(); 
}


function go_order_save(){
	var count = 0;
	
	/*체크된 체크 박스 갯수를 카운트로 하는 코드 - 참고 :command=cartDelete*/
	/*테이블의 result가 아닌 orderlist.jsp의 체크박스의 name일 뿐*/
	
	if(document.frm.result.length==undefined){  
		if (document.frm.result.checked == true) count++;
	}else {
		for(var i=0; i<document.frm.result.length; i++){
				if(document.frm.result[i].checked == true) count++;
		} 
	}
	if(count == 0){
		alert("주문처리할 항목을 선택해 주세요.");
	}else{
		document.frm.action = "shop.do?command=adminOrderSave";
		document.frm.submit();
	}
}


function go_mod_save(){ /*확인 - 수정이랑 연결*/
	if(document.frm.kind.value == ''){
		alert('상품분류를 선택하세요');
		document.frm.kind.focus();
	}else if(document.frm.name.value == ''){
		alert('상품명을 입력하세요');
		document.frm.name.focus();
	}else if(document.frm.price1.value == ''){
		alert('원가을 입력하세요');
		document.frm.price1.focus();
	}else if(document.frm.price2.value == ''){
		alert('판매가를 입력하세요');
		document.frm.price2.focus();
	}else if(document.frm.content.value == ''){
		alert('상품상세를 입력하세요');
		document.frm.content.focus();
	}else{
		if(confirm('수정하시겠습니까?')){
		document.frm.action="shop.do?command=adminProductUpdate";
		document.frm.submit();
		}
	}
}

function go_mod(pseq){ /*클라이언트가 수정클릭 시 상품수정페이지로 넘어감*/
	document.frm.action = "shop.do?command=adminProductUpdateForm&pseq="+pseq;
	document.frm.submit();
}

function go_mov(){
	location.href ="shop.do?command=adminProductList"; //아래와 같이 submit을 이용가능
	
}


function go_save(){
	var theForm = document.frm;
	if(theForm.kind.value == ""){
		alert('상품 분류를 선택하세요'); 
		theForm.kind.focus();
	}else if(theForm.name.value==''){
		alert('상품명을 입력하세요'); 
		theForm.name.focus();
	}else if(theForm.price1.value==''){
		alert('원가를 입력하세요'); 
		theForm.price1.focus();
	}else if(theForm.price2.value==''){
		alert('판매가를 입력하세요'); 
		theForm.price2.focus();
	}else if(theForm.content.value==''){
		alert('상품상세을 입력하세요'); 
		theForm.content.focus();
	}else if(theForm.image.value==''){
		alert('상품이미지를 입력하세요'); 
		theForm.image.focus();
	}else{
		theForm.action = "shop.do?command=adminProductWrite";
		theForm.submit();
	}
}

function go_wrt(){
	document.frm.action = "shop.do?command=adminProductWriteForm";
	document.frm.submit();
	}


function go_detail(pseq){
	document.frm.action = "shop.do?command=adminProductDetail&pseq=" +pseq;
	document.frm.submit();
}