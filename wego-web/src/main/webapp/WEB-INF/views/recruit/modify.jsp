<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>모집 글 작성</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="shortcut icon" href="/resources/ico/favicon.ico"
	type="image/x-icon" />
<meta name="description" content="등산멤버 모집 커뮤니티" />
<link rel="icon" href="/resources/ico/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="/resources/css/header.css" />
<link rel="stylesheet" href="/resources/css/footer.css" />
<link rel="stylesheet" href="/resources/css/recruitment-write.css" />
<script src="/resources/js/noSearchHeader.js" defer></script>
<script src="/resources/js/recruitment-write.js" defer></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.4.0/jquery-migrate.min.js"></script>
</head>
<body>	
	<div class="total-wrap">
		<%@include file="/WEB-INF/views/common/noSearchHeader.jsp"%>
		<section>
			<form action="/recruit/modify" method="post"
				enctype="multipart/form-data" class="container">
				<input type="hidden" name="sanPartyId"
					value="${recruitment.sanPartyId}">
				<!-- form 필수값 검증 후 값이 없는 경우 알림 -->
				<div class="alert-window">
					<p>
						말머리, 제목, 날짜, 시간, 참여인원은<br /> 필수사항입니다.
					</p>
					<button type="button">확인</button>
				</div>
				<!-- -------------- alert-end -------------- -->
				<div class="select-mountain">
					<span>산이름</span> <select name="sanName" required>
						<option value="${recruitment.sanName}">${recruitment.sanName}</option>
					</select>
				</div>
				<div class="title">
					<label for="title">제목</label> <input type="text" name="title"
						id="title" placeholder="제목을 입력하세요.(최소 2자 ~ 최대 20자 가능)"
						maxlength="20" required value="${recruitment.title}" />
				</div>
				<div class="detail">
					<div class="photo">
						<img src="/img/${fn:substring(recruitment.partyPic, 10, 55)}"></img>
					</div>
					<div class="add-photo">
						<div class="top">
							<div class="folder-icon"></div>
							<span>Upload a photo</span> <span class="cancel" type="reset"></span>
						</div>
						<div class="drag-and-drop">
							<div class="picture"></div>
							<p>
								여기로 이미지를 드래그하거나<br /> 파일을 업로드 하세요. (최대 20MB)
							</p>
						</div>
						<button type="button">등록</button>
					</div>
					<div class="wrap">
						<p>
							<span>날짜</span><input type="date" name="date" id="date" required
								value=<fmt:formatDate value="${recruitment.partyDt}" pattern="yyyy-MM-dd" /> />
						</p>
						<p>
							<span>시간</span><input type="time" name="time" id="time" required
								value=<fmt:formatDate value="${recruitment.partyDt}" pattern="HH:mm" /> />
						</p>
						<p>
							<span>참여인원</span><input type="number" name="partyMax" id="member"
								min="2" max="45" required value="${recruitment.partyMax}" />
						</p>
						<p>
							<span>준비물</span><input type="text" name="items" id="readyItems"
								maxlength="1500" value="${recruitment.items }" />
						</p>
						<p>
							<span>등반조건</span><input type="text" name="condition"
								id="condition" maxlength="1500" value="${recruitment.condition}" />
						</p>
					</div>
				</div>
				<div class="text">
					<p>하고 싶은 말</p>
					<textarea name="contents" id="text" maxlength="2000">${recruitment.contents}</textarea>
				</div>
				<div class="buttons">
					<button type="button" id="cancle">취소</button>
					<button type="button" id="upload">수정</button>
				</div>
				<div class="check-again">
					<div class="upload">
						<p>글을 수정하시겠습니까?</p>
						<input type="button" value="아니오" /> <input type="submit"
							value="예" />
					</div>
					<div class="unload">
						<p>
							작성중이던 글이 삭제됩니다.<br /> 취소하시겠습니까?
						</p>
						<input type="button" value="아니오" /> <input type="reset" value="예" />
					</div>
				</div>
			</form>
		</section>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>