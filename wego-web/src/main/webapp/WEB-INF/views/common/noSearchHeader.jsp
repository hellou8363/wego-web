<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header>
	<div class="header">
		<div class="logoDiv">
			<a href="/"> <span class="wegoLogo"></span>
			<span class="wogoTitle"></span>
			</a>
		</div>
		<div>
			<nav>
				<ul class="navbar">
					<li><a href="/info">산정보</a></li>
					<li><a href="/review">등산후기</a></li>
					<li><a href="/rank">랭킹</a></li>
					<li><a href="/recruit">모집</a></li>
				</ul>
			</nav>
		</div>
		<div class="user">
			<!-- 로그인 상태 => 현재 display: none; 상태 -->
			<img id="userImg" class="user-profile-img"
				src="https://picsum.photos/id/684/600/400" alt="회원 프로필 이미지" />
			<!-- 비로그인 상태 -->
			<button class="login-btn"></button>
			<div class="menubar">
				<ul>
					<li><a href="../mypage/mypage.html">마이페이지</a></li>
					<li><a href="#">알림</a></li>
					<li><a href="#">문의하기</a></li>
					<li class="text-red"><a href="#">로그아웃</a></li>
				</ul>
			</div>
		</div>
	</div>
</header>