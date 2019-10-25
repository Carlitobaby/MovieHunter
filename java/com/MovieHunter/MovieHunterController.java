package com.MovieHunter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MovieHunter.dto.MovieDTO;
import com.MovieHunter.service.IMovieService;


@Controller
public class MovieHunterController {
	
	@Autowired
	private IMovieService movieServiceStub;
	
	/** Handle the /start end point
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	@ResponseBody
	public MovieDTO read(Model model) {
		MovieDTO movieDTO = movieServiceStub.fetchById(12);
		model.addAttribute("movieDTO", movieDTO);
		return movieDTO;
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers = {"content-type=text/json"})
	public String readJSON() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
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
