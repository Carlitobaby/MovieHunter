package com.MovieHunter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieHunterController {

	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
//When attempting to debug and run the application it says that the
	//"Selection does not contain a main type.  I'm going to review the code from ours and
	//see if I can add what you're missing to get your start page to run
	
}
