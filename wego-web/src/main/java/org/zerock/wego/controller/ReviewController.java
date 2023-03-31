package org.zerock.wego.controller;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.wego.domain.FileDTO;
import org.zerock.wego.domain.ReviewDTO;
import org.zerock.wego.domain.ReviewViewVO;
import org.zerock.wego.exception.ControllerException;
import org.zerock.wego.exception.ServiceException;
import org.zerock.wego.service.FileService;
import org.zerock.wego.service.MountainInfoService;
import org.zerock.wego.service.ReviewService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor

@RequestMapping("/review") // BASE URL
@Controller
public class ReviewController {
	private ReviewService service;
	private MountainInfoService mountainService;
	private FileService fileService;

	@GetMapping("")
	public String list(Model model) throws ControllerException { // 후기글 전체목록 조회 요청처리
		log.trace("list() invoked.");

		try {
			List<ReviewViewVO> list = this.service.getList();

			model.addAttribute("list", list);

			return "review/list";
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // list

	@GetMapping("/detail")
	public void detail(Integer sanReviewId, Model model) throws ControllerException { // 후기글 상세조회 요청처리
		log.trace("detail({}, {}) invoked.", sanReviewId, model);

		try {
			ReviewViewVO vo = this.service.get(sanReviewId);

			model.addAttribute("review", vo);
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // detail

	@GetMapping("/remove")
	public String remove(Integer sanReviewId, RedirectAttributes rttrs) throws ControllerException { // 후기글 삭제 요청처리
		log.trace("remove({}, {}) invoked.", sanReviewId, rttrs);

		try {
			boolean success = this.service.remove(sanReviewId);

			rttrs.addAttribute("result", success ? "success" : "failure");

			return "redirect:/review";
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // remove

	@PostMapping("/modify")
	public String modify(ReviewDTO dto, RedirectAttributes rttrs) throws ControllerException { // 후기글 수정 요청처리
		log.trace("modify({}, {}) invoked.", dto, rttrs);

		try {
			boolean success = this.service.modify(dto);
			log.info("modify- success: {}", success);

			rttrs.addAttribute("result", success ? "success" : "failure");

			return "redirect:/review";
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // modify

	@GetMapping("/write")
	public void write(RedirectAttributes rttrs) { // 후기글 작성 요청처리
		log.trace("write() invoked.");
	} // write

	@PostMapping("/register")
	public void recruitmentUpload(String sanName,
			List<MultipartFile> imgFiles, ReviewDTO dto, FileDTO fileDto, RedirectAttributes rttrs)
			throws ControllerException {
		log.trace("register({}, {}, {}, {}, {}) invoked.", sanName, imgFiles, dto, fileDto, rttrs);

		try {
			// 산이름으로 산ID 조회
			Integer sanId = this.mountainService.selectSanName(sanName);
			dto.setSanInfoId(sanId);

			// TODO: 테스트용 유저 ID로 소셜 로그인 구현 후 제거
			Integer userId = 9;
			dto.setUserId(userId);

			// 첨부파일을 제외한 데이터 저장
			boolean success = this.service.register(dto);
			log.info("success: {}", success);
	
			// 첨부 이미지가 있다면 저장
			if (imgFiles != null) {

				// 첨부파일 저장을 위한 디렉터리 생성
				String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

				// 첨부파일 Base경로 지정
				String basePath = "C:/upload/" + today;
				File Folder = new File(basePath); // C:/upload/20230327

				if (!Folder.exists()) { // 해당 디렉터리가 없을 경우 생성 => C:/upload까진 존재해야 함
					Folder.mkdir(); // 폴더 생성
					log.trace("----------폴더생성---------");
				} // if

				imgFiles.forEach(imgFile -> {
					if (!"".equals(imgFile.getOriginalFilename())) {
						// DB에 저장할 원본파일명 및 UUID
						String originalName = imgFile.getOriginalFilename();
						String uuid = UUID.randomUUID().toString();

						// 이미지 경로 설정 => C:/upload/20230330/UUID
						String imgPath = basePath + "/" + uuid;
						try {
							imgFile.transferTo(new File(imgPath));
							log.trace("이미지 파일 로컬 저장 성공!!");
						} catch (Exception e) {
							e.printStackTrace();
						} // try-catch

						// 첨부파일 테이블에 저장
						fileDto.setTargetGb("SAN_REVIEW");
						// 모집글 테이블에 최근 저장한 게시물의 번호 가져오기
						fileDto.setTargetCd(dto.getSanReviewId());
						fileDto.setFileName(originalName);
						fileDto.setUuid(uuid);
						fileDto.setPath(imgPath);

						try {
							boolean fileUploadSuccess = this.fileService.register(fileDto);
							log.info("fileUploadSuccess: {}", fileUploadSuccess);
						} catch (ServiceException e) {
							e.printStackTrace();
						} // try-catch
					} // if
				});
			} // if

//			rttrs.addFlashAttribute("sanPartyId", dto.get());

		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch

//		return "redirect:/review";
	} // recruitmentUpload

} // end class
