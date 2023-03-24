package org.zerock.wego.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.wego.domain.MountainInfoViewVO;
import org.zerock.wego.domain.RecruitmentViewVO;
import org.zerock.wego.domain.ReviewVO;
import org.zerock.wego.domain.ReviewViewVO;
import org.zerock.wego.exception.ControllerException;
import org.zerock.wego.service.MountainInfoService;
import org.zerock.wego.service.RecruitmentService;
import org.zerock.wego.service.ReviewService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@AllArgsConstructor

@RequestMapping("/info") // BASE URL
@Controller
public class InfoController {
	private MountainInfoService service;
	
	@GetMapping("") // http://eunhye:8080
	public String info(Model model) throws ControllerException {
		log.trace("main() invoked.");
		
		try {
			List<MountainInfoViewVO> list = this.service.getList();
			model.addAttribute("list", list);
			
			return "info/list";
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // main
	
	
	@GetMapping("/detail")
	public void detail(Integer sanReviewId, Model model) throws ControllerException { // 후기글 상세조회 요청처리
		log.trace("detail({}, {}) invoked.", sanReviewId, model);

		try {
			MountainInfoViewVO vo = this.service.get(sanReviewId);

			model.addAttribute("vo", vo);
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // detail
	
//	@GetMapping("/search") // http://eunhye:8080/search?search=한라산
//	public String searchResult(String search) {
//		log.trace("searchResult({}) invoked.", search);
//		
//		// TODO: 산정보, 모집글, 후기글의 제목을 조회하여 반환
//		
//		return "searchResult";
//	} // searchResult

} // end class
