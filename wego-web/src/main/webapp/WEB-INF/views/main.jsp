<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
					<div class="mountain-item">
						<img class="mountain-img" src="./img/gray.png" alt="img" />
						<h3 class="mountain-name" id="mountainName">한라산</h3>
						<p class="contents" id="text">Lorem ipsum dolor sit amet.Lorem
							ipsum dolor sit amet.Lorem ipsum dolor sit amet.Lorem ipsum dolor
							sit amet.Lorem ipsum dolor sit amet.Lorem ipsum dolor sit
							amet.Lorem ipsum dolor sit amet.Lorem ipsum dolor sit amet.</p>
						<form class="mountain-like" action="#" method="get">
							<button type="submit" name="favorite" value="true"
								class="favorite"></button>
							<span class="favorite-count">1000</span>
						</form>
					</div>
				</div>
			</div>
			<div class="recruit">
				<h2>❤️ 모집 글 ❤️</h2>
				<div class="wrap">
					<div class="recruit-item">
						<img class="user-img" src="./img/gray.png" alt="img" />
						<p class="user-name" id="userName">작성자</p>
						<p class="mountain-name" id="mountainName">산이름</p>
						<img class="recruit-img" src="./img/gray.png" alt="img" />
						<p class="recruit-title" id="title">제목</p>
						<p class="recruit-schedule-schedule">날짜:</p>
						<p class="recruit-schedule" id="schedule">2023. 12. 15.</p>
						<p class="recruit-schedule-time">시간:</p>
						<p class="recruit-time" id="time">오전 11시 30분</p>
						<p class="recruit-schedule-member">참여 인원:</p>
						<p class="recruit-member" id="memberCount">35 / 45</p>

						<form class="recruit-like" action="#" method="get">
							<button type="submit" name="favorite" value="true"
								class="favorite"></button>
							<span class="favorite-count">1000</span>
						</form>
						<p class="recruit-date" id="date">작성일자</p>
					</div>
				</div>
			</div>
			<div class="review">
				<h2>❤️ 후기 글 ❤️</h2>
				<div class="wrap">
					<div class="review-item">
						<img class="user-img" src="./img/gray.png" alt="img" />
						<p class="user-name" id="userName">작성자</p>
						<p class="mountain-name" id="mountainName">산이름</p>
						<img class="review-img" src="./img/gray.png" alt="img" />
						<h3 class="review-title" id="title">제목</h3>
						<p class="review-contents" id="text">Lorem ipsum dolor sit
							amet.Lorem ipsum dolor sit amet.Lorem ipsum dolor sit amet.Lorem
							ipsum dolor sit amet.Lorem ipsum dolor sit amet.Lorem ipsum dolor
							sit amet.Lorem ipsum dolor sit amet.Lorem ipsum dolor sit amet.</p>
						<form class="review-like" action="#" method="get">
							<button type="submit" name="favorite" value="true"
								class="favorite"></button>
							<span class="favorite-count">1000</span>
						</form>
						<p class="review-date" id="date">작성일자</p>
					</div>
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