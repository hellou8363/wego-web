package org.zerock.wego.recruitment.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j2;

@Log4j2

@RequestMapping("/recruitment")
@Controller
public class RecruitmentController {

//	@GetMapping("/write")
//	public String write() {
//		log.trace("write() invoked.");
//		return "recruitment/write";
//	} // write
	
	@PostMapping("/upload")
	public void recruitmentUpload(
			String mountainName, // 산이름
			String title, // 제목
			String contents, // 내용
			MultipartFile imgFile, // 이미지
			String data, // 등반일
			String time, // 등반시간
			String maxMember, // 모집 최대 인원
			String items, // 준비물
			String condition // 등반 조건
			) {
		log.trace("recruitmentUpload() invoked.");
		
		log.info("mountainName: {}", mountainName);
		log.info("title: {}", title);
		log.info("contents: {}", contents);
		log.info("==================================");
		log.info("imgFile: {}", imgFile);
		log.info("==================================");
		log.info("data: {}", data);
		log.info("time: {}", time);
		log.info("maxMember: {}", maxMember);
		log.info("items: {}", items);
		log.info("condition: {}", condition);
		
		// 첨부파일 저장
		if(!"".equals(imgFile.getOriginalFilename())) {
			try {
				imgFile.transferTo(new File("C:/temp/upload/" + imgFile.getOriginalFilename()));
				
				log.trace("이미지 파일 로컬 저장 성공!!");
				
				// TODO: 이미지의 로컬 경로를 저장할 변수 필요, DB에 저장할 이미지 경로
			} catch (Exception e) {
				e.printStackTrace();
			} // try-catch
		} // if
		
	} // recruitmentUpload
	
	
} // end class
