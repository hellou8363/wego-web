const mountainInfo = selector(".mountain-info .wrap");
const recruit = selector(".recruit .wrap");
const review = selector(".review .wrap");

/**
 * @param {String} itemTitle - 제목
 * @param {String} itemContent - 내용
 * @param {String} itemImgPath - 이미지 경로
 * @param {String} itemPath - 상세페이지 경로
 * @returns
 */
const mountainItem = (title, content, imgPath, movePath) => ` 
<div class="item">
<a id="itemPath" href="${movePath}">
  <div class="item-info">
    <h3 id="itemTitle">${title}</h3>
    <div class="itemDetail">
      <p id="itemContent">
      ${content}
      </p>
      <img id="itemImg" src="${imgPath}" alt="img" />
    </div>
  </div>
</a>
</div>
`;

/**
 *
 * @param {String} mountainName - 산이름
 * @param {String} title - 제목
 * @param {String} date - 날짜
 * @param {String} time - 시간
 * @param {Number} member - 참여인원
 * @param {String} author - 작성자
 * @param {String} authorImgPath - 작성자 프로필 이미지
 * @param {String} postImgPath - 피드 이미지
 * @returns
 */
const recruitItem = (
  mountainName,
  title,
  date,
  time,
  member,
  author,
  authorImgPath,
  postImgPath
) => `
<div class="item">
<div class="user-info">
  <img id="userImg" src="${authorImgPath}" alt="img" />
  <span id="userName">${author}</span>
</div>
<hr />
<h3 id="mountainName">${mountainName}</h3>
<img src="${postImgPath}" alt="img" />
<div class="recruit-data">
  <p id="title">${title}</p>
  <p>날짜: <span id="date">${date}</span></p>
  <p>시간: <span id="time">${time}</span> AM</p>
  <p>참여 인원: <span id="memberCount">${member}</span>명</p>
</div>
<form action="#" method="get">
  <button
    type="submit"
    name="favorite"
    value="true"
    class="favorite"
  ></button>
  <span class="favorite-count">1000</span>
</form>
</div>`;

// Test Code
// 산정보
const mountains = {
  title: "한라산",
  context:
    "대한민국에서 가장 큰 섬인 제주도에 있으며 대한민국의 실효 지배 영토 내의 최고봉이자 가장 높은 산(해발 1,947m). 대한민국의 국립공원 중 하나다. 국립공원 전역이 유네스코 세계유산으로 지정되었다. 그리고 대한민국의 실효지배 영토 내 해상 활화산이다. 이름을 풀이하면 운한(雲漢: 은하수, 또는 높은 하늘)을 당긴다(拏)는 뜻으로 은하수를 붙잡을 정도로 높은 산이라는 뜻이다. 금강산, 지리산과 함께 대한민국 삼신산(三神山) 중 하나로 꼽힌다.",
  imgPath: "./img/mountain-sample.jpg",
  movePath: "#",
};

const recruits = {
  mountainName: "한라산",
  title: "정상찍고 라면 먹으러 갈 사람 구함",
  date: "2023-02-20",
  time: "08:00",
  member: 6,
  author: "김개똥",
  authorImgPath: "./img/mountain-sample.jpg",
  postImgPath: "./img/mountain-sample.jpg",
};

// 산정보 출력
for (let i = 0; i < 3; i++) {
  mountainInfo.innerHTML += mountainItem(
    mountains.title,
    mountains.context,
    mountains.imgPath,
    mountains.movePath
  );
} // for

// 모집글 출력
for (let i = 0; i < 3; i++) {
  recruit.innerHTML += recruitItem(
    recruits.mountainName,
    recruits.title,
    recruits.date,
    recruits.time,
    recruits.member,
    recruits.author,
    recruits.authorImgPath,
    recruits.postImgPath
  );
} // for

// 후기글 출력 => 임시로 산정보넣음
for (let i = 0; i < 3; i++) {
  review.innerHTML += mountainItem(
    mountains.title,
    mountains.context,
    mountains.imgPath,
    mountains.movePath
  );
} // for

selector(".recruit .wrap").addEventListener("wheel", (e) => {
  if (window.innerWidth < 1000 && window.innerWidth > 480) {
    e.preventDefault();
    e.currentTarget.scrollLeft += e.deltaY;
  } // if
});

// top (scroll이 200이상 일때 top버튼 노출)
$(window).scroll(function () {
  if ($(this).scrollTop() > 100) {
    $(".scrollToTop, .chat").fadeIn();
  } else {
    $(".scrollToTop, .chat").fadeOut();
  } // if-else
});

// 위로 올라가는 부드러운 애니메이션
$(".scrollToTop, .chat").click(function () {
  $("html, body").animate({ scrollTop: 0 }, 400);
  return false;
});
