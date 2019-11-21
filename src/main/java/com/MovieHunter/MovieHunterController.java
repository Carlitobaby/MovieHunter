package com.MovieHunter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieHunterController {

	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	@RequestMapping("/signIn")
	public String signIn() {
		return "signIn";
	}
}
