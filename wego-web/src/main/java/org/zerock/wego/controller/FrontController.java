package org.zerock.wego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;


@Log4j2

@Controller
public class FrontController {
	
	@GetMapping("/")
	public String main() {
		log.trace("main() invoked.");
		
		return "main";
	} // main

} // end class
