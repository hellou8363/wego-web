<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <title>소셜로그인페이지</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="shortcut icon" href="./ico/favicon.ico" type="image/x-icon" />
    <link rel="icon" href="./ico/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/login.css" />
    <script src="./js/login.js" defer></script>
  </head>
  <body>
    <div class="container">
      <h1>LOGIN</h1>
      <div class="wrap">
        <form action="/login" method="get" class="social-login">
          <button type="submit" name="naver"></button>
          <button type="submit" name="kakao"></button>
          <button type="submit" name="google"></button>
        </form>
      </div>
    </div>
  </body>
</html>