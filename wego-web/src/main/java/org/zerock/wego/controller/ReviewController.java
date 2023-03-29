package org.zerock.wego.controller;

import java.io.File;
import java.util.Base64;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.wego.domain.ReviewDTO;
import org.zerock.wego.domain.ReviewViewVO;
import org.zerock.wego.exception.ControllerException;
import org.zerock.wego.service.ReviewService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor

@RequestMapping("/review") // BASE URL
@Controller
public class ReviewController {
	private ReviewService service;

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
	public void write(RedirectAttributes rttrs) { // 모집글 작성 요청처리
		log.trace("write() invoked.");
	} // write

	@PostMapping("/register")
	public void recruitmentUpload(String sanName, String title, String contents, String imgFile, RedirectAttributes rttrs) throws ControllerException {
//		log.trace("register({}, {}, {}, {}, {}) invoked.", sanName, title, contents, imgFile, rttrs);
		log.trace("sanName: {}", sanName);
		log.trace("title: {}", title);
		log.trace("contents: {}", contents);
		log.trace("imgFile: {}", imgFile);
		

		// 산이름으로 산ID조회 => sanName
		// 제목은 그대로 저장

		// TODO: 프론트에서 base64를 MultipartFile로 변환해서 서버로 넘길것
		
		
//		return "redirect:/review";
	} // recruitmentUpload

} // end class
