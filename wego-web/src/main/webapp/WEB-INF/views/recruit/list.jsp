<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>WeGo-Recruit</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="등산멤버 모집 커뮤니티" />
<link rel="shortcut icon" href="/resources/ico/favicon.ico"
	type="image/x-icon" />
<link rel="icon" href="/resources/ico/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="/resources/css/header.css" />
<link rel="stylesheet" href="/resources/css/footer.css" />
<link rel="stylesheet" href="/resources/css/recruitItem.css" />
<link rel="stylesheet" href="/resources/css/remote.css" />
<script src="/resources/js/header.js" defer></script>
<!-- <script src="./js/scroll.js" defer></script> -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.4.0/jquery-migrate.min.js"></script>
</head>
<body>
	<div class="total-wrap">
		<%@include file="/WEB-INF/views/common/header.jsp"%>
		<!-- main start -->
		<section>
			<!-- Contents -->
			<div class="container">
				<div class="recruit">
					<!-- 정렬 -->
					<div class="select-sort">
						<form action="#" method="post" class="sort">
							<select class="sortBy">
								<option value="">정렬기준</option>
								<option value="">최신순</option>
								<option value="">오래된순</option>
								<option value="">좋아요순</option>
							</select>
						</form>
					</div>
					<!-- Item -->
					<c:forEach var="item" items="${list}">
					<a href="/recruit/detail?sanPartyId=${item.sanPartyId}">
						<div class="recruit-item">
							<img class="user-img" src="${item.userPic} alt="img" />
							<p class="user-name" id="userName">${item.nickName}</p>
							<p class="mountain-name" id="mountainName">${item.sanName}</p>
							<img class="recruit-img" src="${item.img}" alt="img" />
							<p class="recruit-title" id="title">${item.title}</p>
							<p class="recruit-schedule-schedule">날짜:</p>
							<p class="recruit-schedule" id="schedule"><fmt:formatDate value="${item.partyDt}" pattern="yyyy-MM-dd" /></p>
							<p class="recruit-schedule-time">시간:</p>
							<p class="recruit-time" id="time"><fmt:formatDate value="${item.partyDt}" pattern="HH:mm" /></p>
							<p class="recruit-schedule-member">참여 인원:</p>
							<p class="recruit-member" id="memberCount">${item.userCnt} /
								${item.partyMax}</p>
							<form class="recruit-like" action="#" method="get">
								<button type="submit" name="favorite" value="true"
									class="favorite"></button>
								<span class="favorite-count">${item.likeCnt}</span>
							</form>
							<p class="recruit-date" id="date"><fmt:formatDate value="${item.createDt}" pattern="yyyy-MM-dd" /></p>
						</div>
						<!-- recruit-item -->
						</a>
					</c:forEach>
				</div>
				<!-- recruit -->
			</div>
			<!-- container -->
		</section>
		<!-- main end -->
		<!-- 리모컨 -->
		<a href="/recruit/write" class="add-item"> <img src="/resources/svg/add-item.svg">
		</a>
		<a href="##" class="scrollToTop"> <img src="/resources/svg/top.svg">
		</a>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>