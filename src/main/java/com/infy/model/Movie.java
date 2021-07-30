package com.infy.model;

import java.time.LocalTime;

public class Movie {
	
	private Integer movieId;
	private String movieName;
	private Float ratingGiven;
	private String type;
	private LocalTime duration;
	
	public Movie(Integer movieId,String movieName,Float ratingGiven,String type, LocalTime duration) {
		super();
		this.movieId=movieId;
		this.movieName=movieName;
		this.ratingGiven=ratingGiven;
		this.type=type;
		this.duration=duration;
	}
	
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Float getRatingGiven() {
		return ratingGiven;
	}
	public void setRatingGiven(Float ratingGiven) {
		this.ratingGiven = ratingGiven;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalTime getDuration() {
		return duration;
	}
	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
	
}
