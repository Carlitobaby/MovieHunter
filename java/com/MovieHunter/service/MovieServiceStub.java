package com.MovieHunter.service;

import org.springframework.stereotype.Component;

import com.MovieHunter.dto.MovieDTO;

@Component
public class MovieServiceStub implements IMovieService {
	
	@Override
	public MovieDTO fetchById(int id) {
		MovieDTO movieDTO = new MovieDTO();
		movieDTO.setMovieId(12);
		return movieDTO;
	}
	
	@Override
	public void save(MovieDTO movieDTO) {
		
	}
}
