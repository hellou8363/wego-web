<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${recruitment }<br>
<a href="/recruit/modify?sanPartyId=${recruitment.sanPartyId}">수정하기</a>
<a href="/recruit/remove?sanPartyId=${recruitment.sanPartyId}">삭제하기</a>
</body>
</html>