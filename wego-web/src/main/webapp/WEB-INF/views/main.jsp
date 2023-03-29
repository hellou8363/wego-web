<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>메인페이지</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="shortcut icon" href="/resources/ico/favicon.ico"
	type="image/x-icon" />
<link rel="icon" href="/resources/ico/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="/resources/css/header.css" />
<link rel="stylesheet" href="/resources/css/footer.css" />
<link rel="stylesheet" href="/resources/css/main.css" />
<script src="/resources/js/header.js" defer></script>
<script src="/resources/js/main.js" defer></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.4.0/jquery-migrate.min.js"></script>
</head>
<body>
	<div class="total-wrap">
		<%@include file="/WEB-INF/views/common/header.jsp"%>
		<section>
			<div class="rank">
				<div class="rankers">
					<div class="boxStyle" id="rankBox">
						<a href="#"> <!-- ranker detail -->
							<div class="boxStyle" id="rankers" style="display: none">
								<div class="item" id="silver">
									<div class="rankerMedal">🥈</div>
									<div class="rankerPic"></div>
									<div class="rankerName">요셉</div>
									<div class="rankerVal">10002</div>
									<div class="ranker-img"></div>
								</div>
								<div class="item" id="gold">
									<div class="rankerMedal">🥇</div>
									<div class="rankerPic"></div>
									<div class="rankerName">김동희</div>
									<div class="rankerVal">10003</div>
									<div class="ranker-img"></div>
								</div>
								<div class="item" id="bronze">
									<div class="rankerMedal">🥉</div>
									<div class="rankerPic"></div>
									<div class="rankerName">저셉</div>
									<div class="rankerVal">10001</div>
									<div class="ranker-img"></div>
								</div>
							</div> <!-- ranker -->
							<div class="item" id="deep-king">
								<div class="title">한우물왕</div>
								<div class="ranker-img"></div>
							</div>
						</a>
					</div>
					<div class="boxStyle" id="rankBox">
						<a href="#"> <!-- ranker detaile -->
							<div class="boxStyle" id="rankers" style="display: none">
								<div class="item" id="silver">
									<div class="rankerMedal">🥈</div>
									<div class="rankerPic"></div>
									<div class="rankerName">요셉</div>
									<div class="rankerVal">10002</div>
									<div class="ranker-img"></div>
								</div>
								<div class="item" id="gold">
									<div class="rankerMedal">🥇</div>
									<div class="rankerPic"></div>
									<div class="rankerName">김동희</div>
									<div class="rankerVal">10003</div>
									<div class="ranker-img"></div>
								</div>
								<div class="item" id="bronze">
									<div class="rankerMedal">🥉</div>
									<div class="rankerPic"></div>
									<div class="rankerName">저셉</div>
									<div class="rankerVal">10001</div>
									<div class="ranker-img"></div>
								</div>
							</div> <!-- ranker -->
							<div class="item" id="high-king">
								<div class="title">제일높왕</div>
								<div class="ranker-img"></div>
							</div>
						</a>
					</div>

					<div class="boxStyle" id="rankBox">
						<a href="#"> <!-- ranker detaile -->
							<div class="boxStyle" id="rankers" style="display: none">
								<div class="item" id="silver">
									<div class="rankerMedal">🥈</div>
									<div class="rankerPic"></div>
									<div class="rankerName">요셉</div>
									<div class="rankerVal">10002</div>
									<div class="ranker-img"></div>
								</div>
								<div class="item" id="gold">
									<div class="rankerMedal">🥇</div>
									<div class="rankerPic"></div>
									<div class="rankerName">김동희</div>
									<div class="rankerVal">10003</div>
									<div class="ranker-img"></div>
								</div>
								<div class="item" id="bronze">
									<div class="rankerMedal">🥉</div>
									<div class="rankerPic"></div>
									<div class="rankerName">저셉</div>
									<div class="rankerVal">10001</div>
									<div class="ranker-img"></div>
								</div>
							</div> <!-- ranker -->
							<div class="item" id="true-king">
								<div class="title">참대왕</div>
								<div class="ranker-img"></div>
							</div>
						</a>
					</div>

					<div class="boxStyle" id="rankBox">
						<a href="#"> <!-- ranker detaile -->
							<div class="boxStyle" id="rankers" style="display: none">
								<div class="item" id="silver">
									<div class="rankerMedal">🥈</div>
									<div class="rankerPic"></div>
									<div class="rankerName">요셉</div>
									<div class="rankerVal">10002</div>
									<div class="ranker-img"></div>
								</div>
								<div class="item" id="gold">
									<div class="rankerMedal">🥇</div>
									<div class="rankerPic"></div>
									<div class="rankerName">김동희</div>
									<div class="rankerVal">10003</div>
									<div class="ranker-img"></div>
								</div>
								<div class="item" id="bronze">
									<div class="rankerMedal">🥉</div>
									<div class="rankerPic"></div>
									<div class="rankerName">저셉</div>
									<div class="rankerVal">10001</div>
									<div class="ranker-img"></div>
								</div>
							</div> <!-- ranker -->
							<div class="item" id="review-king">
								<div class="title">후기왕</div>
								<div class="ranker-img"></div>
							</div>
						</a>
					</div>
				</div>
			</div>
			<div class="mountain-info">
				<h2>❤️ 산 ❤️</h2>
				<div class="wrap">
					<c:forEach var="item" items="${mountainInfoList}">
						<a href="/info/detail?sanInfoId=${item.sanInfoId}">
							<div class="mountain-item">
								<img class="mountain-img" src="/img/defaultImg.png" alt="img" />
								<h3 class="mountain-name" id="mountainName">${item.sanName}</h3>
								<p class="contents" id="text">${item.details}</p>
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
			<div class="recruit">
				<h2>❤️ 모집 글 ❤️</h2>
				<div class="wrap">
					<c:forEach var="item" items="${recruitmentList}">
						<a href="/recruit/detail?sanPartyId=${item.sanPartyId}">
							<div class="recruit-item">
								<img class="user-img" src="${item.userPic}" alt="img" />
								<p class="user-name" id="userName">${item.nickName}</p>
								<p class="mountain-name" id="mountainName">${item.sanName}</p>
								<img class="recruit-img" src="${item.img}" alt="img" />
								<p class="recruit-title" id="title">${item.title}</p>
								<p class="recruit-schedule-schedule">날짜:</p>
								<p class="recruit-schedule" id="schedule">
									<fmt:formatDate value="${item.partyDt}" pattern="yyyy-MM-dd" />
								</p>
								<p class="recruit-schedule-time">시간:</p>
								<p class="recruit-time" id="time">
									<fmt:formatDate value="${item.partyDt}" pattern="HH:mm" />
								</p>
								<p class="recruit-schedule-member">참여 인원:</p>
								<p class="recruit-member" id="memberCount">${item.userCnt}/
									${item.partyMax}</p>
								<form class="recruit-like" action="#" method="get">
									<button type="submit" name="favorite" value="true"
										class="favorite"></button>
									<span class="favorite-count">${item.likeCnt}</span>
								</form>
								<p class="recruit-date" id="date">
									<fmt:formatDate value="${item.createDt}" pattern="yyyy-MM-dd" />
								</p>
							</div> <!-- item -->
						</a>
					</c:forEach>
				</div>
				<!-- wrap -->
			</div>
			<!-- recruit -->
			<div class="review">
				<h2>❤️ 후기 글 ❤️</h2>
				<div class="wrap">
					<c:forEach var="item" items="${reviewList}">
						<a href="/review/detail?sanReviewId=${item.sanReviewId}">
							<div class="review-item">
								<img class="user-img" src="${item.userPic}" alt="img" />
								<p class="user-name" id="userName">${item.nickName}</p>
								<p class="mountain-name" id="mountainName">${item.sanName}</p>
								<img class="review-img" src="/img/defaultImg.png" alt="img" />
								<h3 class="review-title" id="title">${item.title}</h3>
								<p class="review-contents" id="text">${item.contents}</p>
								<form class="review-like" action="#" method="get">
									<button type="submit" name="favorite" value="true"
										class="favorite"></button>
									<span class="favorite-count">${item.likeCnt}</span>
								</form>
								<p class="review-date" id="date"><fmt:formatDate value="${item.createDt}" pattern="yyyy-MM-dd" /></p>
							</div>
							<!-- review-item -->
						</a>
					</c:forEach>
				</div>
			</div>
			<a href="#" class="scrollToTop"> <img
				src="/resources/svg/top.svg" />
			</a> <a href="#" class="chat"> <img src="/resources/svg/chat.svg" />
			</a>
		</section>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>