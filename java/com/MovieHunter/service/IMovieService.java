package com.MovieHunter.service;

import com.MovieHunter.dto.MovieDTO;


/**
 * CRUD operations for movies
 * @author Administrator
 *
 */


public interface IMovieService {
	
	/**
	 * Get movies from a persistence layer
	 * @param id a unique lookup
	 * @return a movie with a matching ID.
	 *
	 */
	MovieDTO fetchById(int id);

	/**
	 * Persist the given DTO
	 * @param MovieDTO
	 *
	 */
	void save(MovieDTO movieDTO);

}