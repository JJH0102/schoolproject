<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서원대 식당 리뷰 시스템</title>
<link rel="stylesheet" href="resources/css/main.css">
</head>
<body>

<div class="wrapper">
	<div class="wrap">
		<div class="top_area">
			<div class="login_area">  
			 
			<!-- 로그인 하지 않은 상태 -->
            <c:if test = "${member == null }">			             
				<div class="login_button"><a href="/member/login">로그인</a></div>
				<span><a href="/member/join">회원가입</a></span>
				<div class="search_area">
                <a href="/address/search">검색</a>
                </div>
			</c:if>
			
			<!-- 로그인한 상태 -->
            <c:if test="${ member != null }">
            	<div class="login_success_area">
            	<a href="/member/logout">로그아웃</a>
                </div>   
                <div class="search_area">
                <a href="/address/search">검색</a>
                </div>        
            </c:if>
			
			</div>
			<div class="clearfix"></div>			
		</div>
	</div>
</div>

</body>
</html>