package org.zerock.wego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.wego.exception.ControllerException;
import org.zerock.wego.service.MountainInfoService;
import org.zerock.wego.service.RecruitmentService;
import org.zerock.wego.service.ReviewService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@AllArgsConstructor

@RequestMapping("/rank") // BASE URL
@Controller
public class RankController {
	private MountainInfoService mountainInfoService;
	private RecruitmentService recruitmentService;
	private ReviewService reviewService;
	
	@GetMapping("") // http://eunhye:8080
	public String rank() throws ControllerException {
		log.trace("rank() invoked.");
		
		return "rank/rank";
	} // rank

} // end class
