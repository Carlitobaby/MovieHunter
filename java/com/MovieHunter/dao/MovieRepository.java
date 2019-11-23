package com.MovieHunter.dao;

import org.springframework.data.repository.CrudRepository;

import com.MovieHunter.dto.MovieDTO;

//Auto implemented by Spring

public interface MovieRepository extends CrudRepository<MovieDTO, Integer> {

}
