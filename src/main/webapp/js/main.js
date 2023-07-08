// các xử lý kịch bản cho index.html

// khai báo các biến
var def = "---Tu khoa---"; // khai báo rồi vẫn khai báo đc lại
let emp = ""; // từ phiên bản js 2015

function setFirstTime(){
	
	// tham chiếu đối tượng textbox
	window.document.frmSearch.txtKeyword.value = def;
	//window.document.forms[0].txtKeyword.value = def;
	//document.getElementById("txtKeyword").value = def;
}

function setFirstTime_v2 (fn){
	fn.txtKeyword.value = def;
}

function setKeyword(fn, isClicked){
	// lay gia tri trong hộp văn bản
	let value = fn.txtKeyword.value;

	if(isClicked){
		if(value.trim() == def) {
			fn.txtKeyword.value = emp;
		}
	}else{
		if(value.trim() == emp ){
			fn.txtKeyword.value = def;
		}
	}
}

function checkValidKeyword(fn){
	//lay ra tu khoa
	let value = fn.txtKeyword.value;
	var message = "Nhập vào từ khóa cần tìm kiếm.";
	
	if((value.trim() == def) || (value.trim() == emp)){
		window.alert(message);
		
		fn.txtKeyword.focus();
		fn.txtKeyword.select();
	}
}