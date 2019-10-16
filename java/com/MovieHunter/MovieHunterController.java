package com.MovieHunter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MovieHunterController {
	
	
	/** Handle the /start end point
	 * @return
	 */
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	/** Handle the /index end point
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
}
