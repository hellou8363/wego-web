package org.zerock.wego.controller;

import java.io.File;
import java.time.LocalDate;
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

	@GetMapping("/detail")
	public void detail(Integer sanPartyId, Model model) throws ControllerException { // 모집글 상세조회 요청처리
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
	public String modify(
			String date, // 등반일
			String time, // 등반시간
			RecruitmentDTO dto, RedirectAttributes rttrs) throws ControllerException { // 모집글 수정 요청처리
		log.trace("modify({}, {}) invoked.", dto, rttrs);

		try {
			// 등반일 + 등반시간(TIMESTAMP 형식에 맞게)
			String dateTime = date + " " + time + ":00";
			dto.setPartyDate(dateTime);
			
			boolean success = this.service.modify(dto);
			log.info("modify- success: {}", success);

			rttrs.addAttribute("result", success ? "success" : "failure");

			return "redirect:/recruit";
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
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch

		Integer userId = 9; // 테스트용 유저 ID
		dto.setUserId(userId);

		// 등반일 + 등반시간(TIMESTAMP 형식에 맞게)
		String dateTime = date + " " + time + ":00";
		dto.setPartyDate(dateTime);

		// 첨부파일 저장을 위한 디렉터리 생성
		LocalDate today = LocalDate.now();

		String basePath = "C:/temp/upload";
		File Folder = new File(basePath + "/img/" + today);

		if (!Folder.exists()) { // 해당 디렉터리가 없을 경우 생성
			try {
				Folder.mkdir(); // 폴더 생성
			} catch (Exception e) {
				throw new ControllerException(e);
			} // try-catch
		} // if

		try {
			// 첨부 이미지가 있다면 저장
			if (imgFile != null && !"".equals(imgFile.getOriginalFilename())) {

				// 이미지 경로 설정
				String extension = imgFile.getOriginalFilename()
						.substring(imgFile.getOriginalFilename().lastIndexOf("."));
				String imgPath = "/img/" + today + "/" + UUID.randomUUID().toString() + extension;
				imgFile.transferTo(new File(basePath + imgPath));

				log.trace("이미지 파일 로컬 저장 성공!!");

				dto.setImg(imgPath);
			} else {
				String defaultPath = "/img/defaultImg.png";
				dto.setImg(defaultPath);
			} // if-else

			boolean success = this.service.register(dto);
			log.info("success: {}", success);

			rttrs.addFlashAttribute("sanPartyId", dto.getSanPartyId());

			log.trace("========== OKOKOKOKOKOK =======");
			return "redirect:/recruit";
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch

	} // recruitmentUpload

} // end class
