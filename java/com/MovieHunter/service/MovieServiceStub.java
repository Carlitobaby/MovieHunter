package com.MovieHunter.service;

import org.springframework.stereotype.Component;

import com.MovieHunter.dto.MovieDTO;

@Component
public class MovieServiceStub implements IMovieService {
	
	@Override
	public MovieDTO fetchById(int id) {
		MovieDTO movieDTO = new MovieDTO();
		movieDTO.setMovieId(12);
		movieDTO.setTitle("Us");
		movieDTO.setDirector("Jordan Peele");
		movieDTO.setDescription("A family's serene beach vaction turns to chaos when their doppelgangers appear and begin to terrorize them.");
		return movieDTO;
	}
	
	@Override
	public void save(MovieDTO movieDTO) {
		
	}
}
