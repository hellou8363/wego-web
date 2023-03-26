<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>WeGo-Mountain</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="등산멤버 모집 커뮤니티" />
<link rel="shortcut icon" href="/resources/ico/favicon.ico"
	type="image/x-icon" />
<link rel="icon" href="/resources/ico/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="/resources/css/header.css" />
<link rel="stylesheet" href="/resources/css/footer.css" />
<link rel="stylesheet" href="/resources/css/mountainItem.css" />
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
				<div class="mountain-info">
					<!-- 정렬 -->
					<div class="select-sort">
						<form action="#" method="post" class="sort">
							<select class="sortBy">
								<option value="">정렬기준</option>
								<option value="">ㄱㄴㄷ순</option>
								<option value="">좋아요순</option>
							</select>
						</form>
					</div>
					<!-- Item -->
					<c:forEach var="item" items="${list}">
						<a href="/info/detail?sanInfoId=${item.sanInfoId}">
							<div class="mountain-item">
								<img class="mountain-img" src="${item.img}" alt="img" />
								<h3 class="mountain-name" id="mountainName">${item.sanName}</h3>
								<p class="mountain-contents" id="text">${item.details}</p>
								<form class="mountain-like" action="#" method="get">
									<button type="submit" name="favorite" value="true"
										class="favorite"></button>
									<span class="favorite-count">${item.likeCnt}</span>
								</form>
							</div> <!-- mountain-item -->
						</a>
					</c:forEach>
				</div>
			</div>
		</section>
		<!-- main end -->
	</div>
	<!-- 리모컨 -->
	<a href="#" class="scrollToTop"> <img src="/resources/svg/top.svg">
	</a>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>