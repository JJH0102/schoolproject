<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<link rel="stylesheet" href="/resources/css/login.css">
</head>
<body>

<div class="wrapper">	
	<div class="wrap">
		<div class="subjecet">
			<span>로그인</span>
		</div>
			<form id="login_form" method="post">
				<div class="login_wrap"> 
					<div class="id_wrap">
					<div class="id_name">아이디</div>
							<div class="id_input_box">
							<input class="id_input" name="userid">
						</div>
					</div>
				</div>
				
					<div class="pw_wrap">
					<div class="pw_name">비밀번호</div>
						<div class="pw_input_box">
							<input class="pw_iput" name="userpwd">
						</div>
					</div>	
					
					<c:if test = "${result == 0 }">
	                	<div class = "login_warn">ID 또는 비밀번호를 잘못 입력하셨습니다.</div>
	            	</c:if>
								
					<div class="login_button_wrap">
						<input type="button" class="login_button" value="로그인">
					</div>			
			</form>		
	</div>
</div>

<script>
 
    /* 로그인 버튼 클릭 메서드 */
    $(".login_button").click(function(){
            	
    	$("#login_form").attr("action", "/member/login");
        $("#login_form").submit();
        
    });
 
</script>

</body>
</html>