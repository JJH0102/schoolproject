<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/resources/css/join.css">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>

<div class="wrapper">
	<form id="join_form" method="post">
	<div class="wrap">
			<div class="subjecet">
				<span>회원가입</span>
			</div>
			<div class="id_wrap">
				<div class="id_name">아이디</div>
				<div class="id_input_box">
					<input class="id_input" name="userid">
				</div>
				<span class="id_input_re_1">사용 가능한 아이디입니다.</span>
				<span class="id_input_re_2">이미 존재하는 아이디입니다.</span>
				<span class="final_id_ck">아이디를 입력해주세요.</span>
			</div>
			<div class="pw_wrap">
				<div class="pw_name">비밀번호</div>
				<div class="pw_input_box">
					<input class="pw_input" name="userpwd">
				</div>
				<span class="final_pw_ck">비밀번호를 입력해주세요.</span>
			</div>
			<div class="pwck_wrap">
				<div class="pwck_name">비밀번호 확인</div>
				<div class="pwck_input_box">
					<input class="pwck_input">
				</div>
				<span class="final_pwck_ck">비밀번호 확인을 입력해주세요.</span>
				<span class="pwck_input_re_1">비밀번호가 일치합니다.</span>
                <span class="pwck_input_re_2">비밀번호가 일치하지 않습니다.</span>
			</div>
			<div class="user_wrap">
				<div class="user_name">이름</div>
				<div class="user_input_box">
					<input class="user_input" name="username">
				</div>
				<span class="final_name_ck">이름을 입력해주세요.</span>
			</div>
			<div class="join_button_wrap">
				<input type="button" class="join_button" value="가입하기">
			</div>
		</div>
	</form>
</div>

<script>

/* 회원가입 유효성 검사(사용자가 빠진 정보 없이 옳바른 정보를 입력해야 함) 통과유무 변수 */
var idCheck = false;       // 아이디
var idckCheck = false;     // 아이디 중복 검사
var pwCheck = false;       // 비번
var pwckCheck = false;     // 비번 확인
var pwckcorCheck = false;  // 비번 확인 일치 확인
var nameCheck = false;     // 이름

	$(document).ready(function(){
	//회원가입 버튼(회원가입 기능 작동)
	$(".join_button").click(function(){
		
		/* 입력값 변수 */
        var id = $('.id_input').val();      // id 입력란
        var pw = $('.pw_input').val();      // 비밀번호 입력란
        var pwck = $('.pwck_input').val();  // 비밀번호 확인 입력란
        var name = $('.user_input').val();  // 이름 입력란
        
        /* 아이디 유효성검사 */
        if(id == ""){
            $('.final_id_ck').css('display','block');
            idCheck = false;
        }else{
            $('.final_id_ck').css('display', 'none');
            idCheck = true;
        }
        
        /* 비밀번호 유효성 검사 */
        if(pw == ""){
            $('.final_pw_ck').css('display','block');
            pwCheck = false;
        }else{
            $('.final_pw_ck').css('display', 'none');
            pwCheck = true;
        }
        
        /* 비밀번호 확인 유효성 검사 */
        if(pwck == ""){
            $('.final_pwck_ck').css('display','block');
            pwckCheck = false;
        }else{
            $('.final_pwck_ck').css('display', 'none');
            pwckCheck = true;
        }
        
        /* 이름 유효성 검사 */
        if(name == ""){
            $('.final_name_ck').css('display','block');
            nameCheck = false;
        }else{
            $('.final_name_ck').css('display', 'none');
            nameCheck = true;
        }
        
        /* 최종 유효성 검사 */
        if(idCheck&&idckCheck&&pwCheck&&pwckCheck&&pwckcorCheck&&nameCheck){
        	$("#join_form").attr("action", "/member/join");
            $("#join_form").submit();
        }
        
        return false;
        
		//$("#join_form").attr("action", "/member/join");
		//$("#join_form").submit();
	});
});

//아이디 중복검사
$('.id_input').on("propertychange change keyup paste input", function(){

	var userid = $('.id_input').val(); // .id_input에 입력되는 값
	var data = {userid : userid} // '컨트롤에 넘길 데이터 이름' : '데이터(.id_input에 입력되는 값)'
	
	$.ajax({
		type : "post",
		url : "/member/memberIdChk",
		data : data,
		success : function(result){
			if(result != 'fail'){
				$('.id_input_re_1').css("display","inline-block");
				$('.id_input_re_2').css("display", "none");	
				idckCheck = true; // 아이디가 중복되지 않은 경우
			} else {
				$('.id_input_re_2').css("display","inline-block");
				$('.id_input_re_1').css("display", "none");
				idckCheck = false; // 아이디가 중복된 경우
			}
		}// 성공 종료
	}); // ajax 종료

});// function 종료

/* 비밀번호 확인 일치 유효성 검사 */

$('.pwck_input').on("propertychange change keyup paste input", function(){
	var pw = $('.pw_input').val();
    var pwck = $('.pwck_input').val();
    $('.final_pwck_ck').css('display', 'none');
    
    if(pw == pwck){
        $('.pwck_input_re_1').css('display','block');
        $('.pwck_input_re_2').css('display','none');
        pwckcorCheck = true;
    }else{
        $('.pwck_input_re_1').css('display','none');
        $('.pwck_input_re_2').css('display','block');
        pwckcorCheck = false;
    } 
});  

</script>

</body>
</html>