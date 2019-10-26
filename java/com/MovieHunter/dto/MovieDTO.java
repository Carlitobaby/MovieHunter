package com.MovieHunter.dto;

public class MovieDTO {

	private int movieId;
	private String title;
	private String director;
	private String description;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getMovieInfo(){
		return movieId + ": " + title + " - " + director + " - " + description;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + " - " + director;
	}
}
