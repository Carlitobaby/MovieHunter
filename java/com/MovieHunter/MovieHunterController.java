package com.MovieHunter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MovieHunterController {

	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	

	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
}



