package org.zerock.wego.controller;

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
import org.zerock.wego.service.SearchService;

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
	private SearchService searchService;

	@GetMapping("")
	public String main(Model model) throws ControllerException {
		log.trace("main() invoked.");

		try {
			// =========== 산정보 ===========
			Set<MountainInfoViewVO> mountainInfoList = this.mountainInfoService.getRandom10List();
			model.addAttribute("mountainInfoList", mountainInfoList);

			// =========== 모집글 ===========
			Set<RecruitmentViewVO> recruitmentList = this.recruitmentService.getRandom10List();
			model.addAttribute("recruitmentList", recruitmentList);

			// =========== 후기글 ===========
			Set<ReviewViewVO> reviewList = this.reviewService.getRandom10List();
			model.addAttribute("reviewList", reviewList);

			return "main";
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch
	} // main

	@GetMapping("/search")
	public void searchResult(String search, Model model) throws ControllerException {
		log.trace("searchResult({}) invoked.", search);

		try {
			// =========== 산정보 ===========
			Set<MountainInfoViewVO> mountainInfoList = this.searchService.selectSearchMountainInfo(search);
			model.addAttribute("mountainInfoList", mountainInfoList);

			// =========== 모집글 ===========
			Set<RecruitmentViewVO> recruitmentList = this.searchService.selectSearchRecruitment(search);
			model.addAttribute("recruitmentList", recruitmentList);

			// =========== 후기글 ===========
			Set<ReviewViewVO> reviewList = this.searchService.selectSearchReview(search);
			model.addAttribute("reviewList", reviewList);
		} catch (Exception e) {
			throw new ControllerException(e);
		} // try-catch

	} // searchResult

} // end class
