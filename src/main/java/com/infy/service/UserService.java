package com.infy.service;

import java.util.Set;

import com.infy.exception.MovieCatalogException;
import com.infy.model.User;
import com.infy.model.UserReport;

public interface UserService {
	
	public String addUser(User user) throws MovieCatalogException;

	public String allocateBadge(Integer noOfReviewsGiven);


	public Set<UserReport> getUser(Float ratingGiven) throws MovieCatalogException;

}
