<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>통합검색결과페이지</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="shortcut icon" href="resources/ico/favicon.ico"
	type="image/x-icon" />
<link rel="icon" href="resources/ico/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="resources/css/header.css" />
<link rel="stylesheet" href="resources/css/footer.css" />
<link rel="stylesheet" href="resources/css/searchResult.css" />
<script src="resources/js/header.js" defer></script>
<script src="resources/js/searchResult.js" defer></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.4.0/jquery-migrate.min.js"></script>
</head>
<body>
	<div class="total-wrap">
		<%@include file="/WEB-INF/views/common/header.jsp"%>
		<section>
			<div class="container">
				<div class="mountain-info">
					<div class="info-title">
						<h2>❤️ 산 ❤️</h2>
						<a href="#" class="more">더보기</a>
					</div>
					<div class="wrap">
						<div class="item">
							<a id="itemPath" href="${movePath}">
								<div class="item-info">
									<h3 id="itemTitle">${title}</h3>
									<div class="itemDetail">
										<p id="itemContent">${content}</p>
										<img id="itemImg" src="${imgPath}" alt="img" />
									</div>
								</div>
							</a>
						</div>
					</div>
				</div>
				<hr />
				<div class="recruit">
					<div class="info-title">
						<h2>❤️ 모집 글 ❤️</h2>
						<a href="#" class="more">더보기</a>
					</div>
					<div class="wrap"></div>
				</div>
				<hr />
				<div class="review">
					<div class="info-title">
						<h2>❤️ 후기 글 ❤️</h2>
						<a href="#" class="more">더보기</a>
					</div>
					<div class="wrap"></div>
				</div>
				<a href="#" class="scrollToTop"> <img src="svg/top.svg" />
				</a> <a href="#" class="chat"> <img src="svg/chat.svg" />
				</a>
			</div>
		</section>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>
