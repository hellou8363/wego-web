package org.zerock.wego.controller;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.wego.domain.MountainInfoViewVO;
import org.zerock.wego.domain.RecruitmentViewVO;
import org.zerock.wego.domain.ReviewViewVO;
import org.zerock.wego.exception.ControllerException;
import org.zerock.wego.service.MountainInfoService;
import org.zerock.wego.service.RecruitmentService;
import org.zerock.wego.service.ReviewService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@AllArgsConstructor

@RequestMapping("/") // BASE URL
@Controller
public class FrontController {
	private MountainInfoService mountainInfoService;
	private RecruitmentService recruitmentService;
	private ReviewService reviewService;
	
	@GetMapping("") // http://eunhye:8080
	public String main(Model model) throws ControllerException {
		log.trace("main() invoked.");
		
		try {
			// =========== 산정보 ===========
			Set<MountainInfoViewVO> mountainInfoList = this.mountainInfoService.get10List();
			model.addAttribute("mountainInfoList", mountainInfoList);
		
			// =========== 모집글 ===========
			List<RecruitmentViewVO> recruitmentList = this.recruitmentService.getList();
			model.addAttribute("recruitmentList", recruitmentList);
		
			// =========== 후기글 ===========
			List<ReviewViewVO> reviewList = this.reviewService.getList();
			model.addAttribute("reviewList", reviewList);
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
		
		return "main";
	} // main
	
	@GetMapping("/search") // http://eunhye:8080/search?search=한라산
	public String searchResult(String word) {
		log.trace("searchResult({}) invoked.", word);
		
		// TODO: 산정보, 모집글, 후기글의 제목을 조회하여 반환
		
		return "searchResult";
	} // searchResult

} // end class
