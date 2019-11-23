package com.MovieHunter.service;

import org.springframework.stereotype.Component;

import com.MovieHunter.dto.MovieDTO;

@Component
public class MovieServiceStub implements IMovieService {
//	I would rename this to MovieDAO
//	A service layer typically contains logic to operate on and transform an object,
//	This class seems to only contain the logic for interacting with the database
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
	public bool saveNew(MovieDTO movieDTO) {
		
		//create new record in the db
		//var result = saveToDatabase();
		var result = true;
		if (result)
		{
			return true;
			//then when you call this you can do if(saveNew) {return string "Movie successfully saved"}
		}
		else 
		{
			return false;
			//then when you call this you can do if(saveNew==false) {return string "Error saving movie"}
		}
		
	}
	
	//method for updating movies
	public bool update(MovieDTO movieDTO)
	{
		//validate the Id before doing anything
		if (IdIsValid(movieDTO.movieId))
		{
			//update the record in the db using movieDTO
			//var result = saveToDatabase();
			var result = true;
			if (result)
			{
				return true;
				//then when you call this you can do if(update) {return string "Movie successfully updated"}
			}
			else 
			{
				return false;
				//then when you call this you can do if(update==false) {return string "Error updating movie"}
			}
		}
		return false;
	}
	
	//method for deleting movies
	public bool delete(int Id)
	{
		//validate the Id before doing anything
		if (IdIsValid(Id))
		{
			//delete the record in the db using the id
			//var result = deleteFromDatabase();
			var result = true;
			if (result)
			{
				return true;
				//then when you call this you can do if(delete) {return string "Movie successfully deleted"}
			}
			else 
			{
				return false;
				//then when you call this you can do if(delete==false) {return string "Error deleting movie"}
			}
		}
		return false;	
	}
	
	//method for validating movieId
	public bool IdIsValid(int id)
	{
		//you could call the database here, but I try to keep db calls to a minimum as they can be costly
		if (id > 0)
		{
			return true;
		}
		return false;
	}
}
