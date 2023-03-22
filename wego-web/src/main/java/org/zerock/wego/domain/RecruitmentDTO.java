package org.zerock.wego.domain;

import lombok.Data;


@Data
public class RecruitmentDTO {
	
	Integer	sanPartyId; // 모집글 코드 시퀀스
	Integer sanInfoId; // 모집글 말머리 FK
	Integer userId; // 모집글 작성자 코드 FK
	String createDt; // 모집글 작성일(current_timestamp)
	String modifiedDt; // 모집글 수정일
	String title; // 모집글 제목
	String contents; // 모집글 내용
	String img; // 모집글 사진
	String partyYmd; // 모집글 등반일(yyyyMMdd)
	String partyTime; // 모집글 등반시간(HH:mm)
	Integer partyMax; // 모집 최대 인원
	String items; // 준비물
	String condition; // 등반조건
	
} // end class
