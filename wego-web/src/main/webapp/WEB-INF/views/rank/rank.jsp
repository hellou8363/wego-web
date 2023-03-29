<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8" />
<title>WeGo-badge</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="등산멤버 모집 커뮤니티" />

<link rel="shortcut icon" href="./ico/favicon.ico" type="image/x-icon" />
<link rel="icon" href="./ico/favicon.ico" type="image/x-icon" />

<link rel="stylesheet" href="/resources/css/header.css" />
<link rel="stylesheet" href="/resources/css/footer.css" />
<link rel="stylesheet" href="/resources/css/rank.css">

<script src="/resources/js/header.js" defer></script>
<script src="/resources/js/footer.js" defer></script>
<script src="/resources/js/rank.js" defer></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.4.0/jquery-migrate.min.js"></script>
</head>

<body>
	<!-- total-wrap start -->
	<div class="total-wrap">
		<%@include file="/WEB-INF/views/common/header.jsp"%>
		<!-- main start -->
		<section>
			<!-- Contents -->
			<div class="container">
				<div class="rank">
					<div class="head">
						<div class="title boxStyle">
							<span id="svg"></span> <span id="userName">RANKING</span> <span
								id="svg"></span>
						</div>
					</div>
					<div class="rankers">
						<div class="boxStyle" id="rankBox">
							<a href="#"> <!-- ranker detaile -->
								<div class="boxStyle" id="ranker" style="display: none">
									<div class="title">한우물왕</div>
									<div class="item" id="silver">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">요셉</div>
										<div class="rankerVal">10002</div>
										<div class="ranker-img"></div>
									</div>
									<div class="item" id="gold">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">김동희</div>
										<div class="rankerVal">10003</div>
										<div class="ranker-img"></div>
									</div>
									<div class="item" id="bronze">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
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
								<div class="boxStyle" id="ranker" style="display: none">
									<div class="title">제일높왕</div>
									<div class="item" id="silver">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">요셉</div>
										<div class="rankerVal">10002</div>
										<div class="ranker-img"></div>
									</div>
									<div class="item" id="gold">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">김동희</div>
										<div class="rankerVal">10003</div>
										<div class="ranker-img"></div>
									</div>
									<div class="item" id="bronze">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
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
								<div class="boxStyle" id="ranker" style="display: none">
									<div class="title">참대왕</div>
									<div class="item" id="silver">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">요셉</div>
										<div class="rankerVal">10002</div>
										<div class="ranker-img"></div>
									</div>
									<div class="item" id="gold">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">김동희</div>
										<div class="rankerVal">10003</div>
										<div class="ranker-img"></div>
									</div>
									<div class="item" id="bronze">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
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
								<div class="boxStyle" id="ranker" style="display: none">
									<div class="title">후기왕</div>
									<div class="item" id="silver">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">요셉</div>
										<div class="rankerVal">10002</div>
										<div class="ranker-img"></div>
									</div>
									<div class="item" id="gold">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">김동희</div>
										<div class="rankerVal">10003</div>
										<div class="ranker-img"></div>
									</div>
									<div class="item" id="bronze">
										<div class="rankerMedal">
											<span id="svg"></span>
										</div>
										<div class="rankerPic"></div>
										<div class="rankerName">KH</div>
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
			</div>
		</section>
		<!-- main end -->
	</div>
	<!-- total-wrap end -->
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>