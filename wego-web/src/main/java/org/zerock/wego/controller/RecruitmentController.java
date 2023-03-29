package org.zerock.wego.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.wego.domain.RecruitmentDTO;
import org.zerock.wego.domain.RecruitmentViewVO;
import org.zerock.wego.exception.ControllerException;
import org.zerock.wego.service.MountainInfoService;
import org.zerock.wego.service.RecruitmentService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@AllArgsConstructor

@RequestMapping("/recruit") // BASE URL
@Controller
public class RecruitmentController {
	private RecruitmentService service;
	private MountainInfoService mountainService;

	@GetMapping("")
	public String list(Model model) throws ControllerException { // 모집글 전체목록 조회 요청처리
		log.trace("list() invoked.");

		try {
			List<RecruitmentViewVO> list = this.service.getList();

			model.addAttribute("list", list);
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch

		return "recruit/list";
	} // list

	@GetMapping({ "/detail", "/modify" })
	public void detail(Integer sanPartyId, Model model) throws ControllerException { // 모집글 상세조회 및 수정 요청처리
		log.trace("detail({}, {}) invoked.", sanPartyId, model);

		try {
			RecruitmentViewVO vo = this.service.get(sanPartyId);

			model.addAttribute("recruitment", vo);
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // detail

	@GetMapping("/remove")
	public String remove(Integer sanPartyId, RedirectAttributes rttrs) throws ControllerException { // 모집글 삭제 요청처리
		log.trace("remove({}, {}) invoked.", sanPartyId, rttrs);

		try {
			boolean success = this.service.remove(sanPartyId);

			rttrs.addAttribute("result", success ? "success" : "failure");

			return "redirect:/recruit";

		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // remove

	@PostMapping("/modify")
	public String modify(Integer sanPartyId, // 모집글 번호
			String sanName, // 산이름
			MultipartFile imgFile, // 이미지
			String date, // 등반일
			String time, // 등반시간
			RecruitmentDTO dto, RedirectAttributes rttrs) throws ControllerException { // 모집글 수정 요청처리
		log.trace("modify({}, {}) invoked.", dto, rttrs);

		try {
			// 산이름으로 산ID 조회
			Integer sanId = this.mountainService.selectSanName(sanName);
			dto.setSanInfoId(sanId);

			// 등반일 + 등반시간(TIMESTAMP 형식에 맞게)
			String dateTime = date + " " + time + ":00";
			dto.setPartyDt(dateTime);

			// 기존 이미지 경로를 불러오기(수정은 작성 시 이미지 폴더가 만들어져 있으므로 재 생성 X)
			RecruitmentViewVO currentPostInfo = this.service.get(sanPartyId);
			String oldImgPath = currentPostInfo.getImg();
			String basePath = "C:/upload";

			if (imgFile != null && !"".equals(imgFile.getOriginalFilename())) { // 기존 이미지 경로에 덮어쓰기

				// 기존 이미지가 디폴트 이미지일 경우
				if (oldImgPath.contains("defaultImg")) {
					Date currentPostCreatedDate = currentPostInfo.getCreateDt(); // 현재 모집글의 작성일자 불러오기

					String createdDate = new SimpleDateFormat("yyyyMMdd").format(currentPostCreatedDate);

					// DB에 저장할 원본파일명 및 UUID
					String originalName = imgFile.getOriginalFilename();
					String uuid = UUID.randomUUID().toString();

					log.info("originalName: {}", originalName); // 도구리-배경화면.png
					log.info("uuid: {}", uuid); // fb1b2f54-5a05-4d46-a77b-893b2c9909c7

					// MIME타입 추출
					String imgType = imgFile.getContentType();
					log.trace("imgType: {}", imgType); // imgType: image/png
					
					// TODO: DB에 원본파일명, UUID, 절대경로 INSERT 필요

					// 이미지 경로 설정
					String imgPath = basePath + "/" + createdDate + "/" + uuid;
					imgFile.transferTo(new File(imgPath)); // C:/upload/20230327/UUID

					dto.setImg(imgPath);

					log.trace("이미지 파일 로컬 저장 성공!!");
				} // if
			} else {
				// 이미지 변경이 없으면 기존 경로 유지(NullPotinerException방지)
				dto.setImg(oldImgPath);
			} // if-else

			boolean success = this.service.modify(dto);
			log.info("modify- success: {}", success);

			rttrs.addAttribute("result", success ? "success" : "failure");

			return "redirect:/recruit/detail?sanPartyId=" + dto.getSanPartyId();
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // modify

	@GetMapping("/write")
	public void write(RedirectAttributes rttrs) { // 모집글 작성 요청처리
		log.trace("write() invoked.");
	} // write

	@PostMapping("/register")
	public String recruitmentUpload(String sanName, // 산이름
			MultipartFile imgFile, // 이미지
			String date, // 등반일
			String time, // 등반시간
			RecruitmentDTO dto, RedirectAttributes rttrs) throws ControllerException {
		log.trace("register({}, {}) invoked.", dto, rttrs);

		try {
			// 산이름으로 산ID 조회
			Integer sanId = this.mountainService.selectSanName(sanName);
			dto.setSanInfoId(sanId);

			// 테스트용 유저 ID
			Integer userId = 9;
			dto.setUserId(userId);

			// 등반일 + 등반시간(TIMESTAMP 형식에 맞게)
			String dateTime = date + " " + time + ":00";
			dto.setPartyDt(dateTime);

			// 첨부파일 저장을 위한 디렉터리 생성
			String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

			// 첨부파일 Base경로 지정
			String basePath = "C:/upload/" + today;
			File Folder = new File(basePath); // C:/upload/20230327

			if (!Folder.exists()) { // 해당 디렉터리가 없을 경우 생성
				Folder.mkdir(); // 폴더 생성
				log.trace("----------폴더생성---------");
			} // if

			// 첨부 이미지가 있다면 저장
			if (imgFile != null && !"".equals(imgFile.getOriginalFilename())) {

				// DB에 저장할 원본파일명 및 UUID
				String originalName = imgFile.getOriginalFilename();
				String uuid = UUID.randomUUID().toString();

				log.info("originalName: {}", originalName); // 도구리-배경화면.png
				log.info("uuid: {}", uuid); // fb1b2f54-5a05-4d46-a77b-893b2c9909c7

				// MIME타입 추출
				String imgType = imgFile.getContentType();
				log.trace("imgType: {}", imgType); // imgType: image/png
				
				// TODO: DB에 원본파일명, UUID, 절대경로 INSERT 필요

				// 이미지 경로 설정
				String imgPath = basePath + "/" + uuid;
				imgFile.transferTo(new File(imgPath));

				log.trace("이미지 파일 로컬 저장 성공!!");

				dto.setImg(imgPath);
			} else {
				String defaultPath = basePath + "defaultImg.png";
				dto.setImg(defaultPath);
			} // if-else

			boolean success = this.service.register(dto);
			log.info("success: {}", success);

			rttrs.addFlashAttribute("sanPartyId", dto.getSanPartyId());

			return "redirect:/recruit";
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch

	} // recruitmentUpload

} // end class
