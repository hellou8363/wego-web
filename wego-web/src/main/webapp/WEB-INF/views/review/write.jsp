<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>후기 글 작성</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="shortcut icon" href="/resources/ico/favicon.ico" type="image/x-icon" />
<meta name="description" content="등산멤버 모집 커뮤니티" />
<link rel="icon" href="/resources/ico/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="/resources/css/header.css" />
<link rel="stylesheet" href="/resources/css/footer.css" />
<link rel="stylesheet" href="/resources/css/review-write.css" />
<script src="/resources/js/noSearchHeader.js" defer></script>
<script src="/resources/js/review-write.js" defer></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.4.0/jquery-migrate.min.js"></script>
</head>
<body>
	<div class="total-wrap">
		<%@include file="/WEB-INF/views/common/noSearchHeader.jsp"%>
		<section>
			<form action="#" method="post" class="container">
				<!-- form 필수값 검증 후 값이 없는 경우 알림 -->
				<div class="alert-window">
					<p>
						산이름, 제목, 내용은<br /> 필수사항입니다.
					</p>
					<button type="button">확인</button>
				</div>
				<!-- -------------- alert-end -------------- -->
				<div class="select-mountain">
					<span>산이름</span> <select name="sanName" required>
						<option value="">산이름을 선택하세요.</option>
					</select>
				</div>
				<div class="title">
					<label for="title">제목</label> <input type="text" name="title"
						id="title" placeholder="제목을 입력하세요.(최소 2자 ~ 최대 20자 가능)"
						minlength="2" maxlength="20" required />
				</div>
				<div class="detail">
					<div class="photo"></div>
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
					<div contenteditable="true" name="contents" id="contents"></div>
				</div>
				<div class="buttons">
					<button type="button" id="cancle">취소</button>
					<button type="button" id="upload">등록</button>
				</div>
				<div class="check-again">
					<div class="upload">
						<p>글을 등록하시겠습니까?</p>
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
