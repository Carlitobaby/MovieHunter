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
	
//When attempting to debug and run the application it says that the
	//"Selection does not contain a main type.  I'm going to review the code from ours and
	//see if I can add what you're missing to get your start page to run
	

	//This is where I'll begin importing the code 
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
}



