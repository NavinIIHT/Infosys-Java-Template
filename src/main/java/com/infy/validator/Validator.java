package com.infy.validator;

import java.util.List;

import com.infy.exception.MovieCatalogException;
import com.infy.model.Movie;
import com.infy.model.User;

public class Validator {

	
	public void validate(User user) throws MovieCatalogException
	{
//		String errorStatus = (!isValidNoOfReviewsGiven(user.getNoOfReviewsGiven())) ? "Validator.INVALID_NO_OF_REVIEWS_GIVEN" : 
//				(!isValidMoviesWatched(user.getMoviesWatched())) ? "Validator.INVALID_MOVIES_WATCHED" : 
//					(!isValidPhoneNo(user.getPhoneNo())) ? "Validator.INVALID_PHONE_NUMBER" : 
//						(!isValidUserName(user.getUserName())) ? "Validator.INVALID_USER_NAME" :  null	;
//		if (errorStatus != null) {
//			MovieCatalogException exception = new MovieCatalogException(errorStatus);
//			LogFactory.getLog(this.getClass()).error(exception.getMessage(), exception);
//			throw exception;
//		}
	}
	

	public Boolean isValidNoOfReviewsGiven(Integer noOfReviewsGiven)
	{
		return null;
	}

		
	public Boolean isValidMoviesWatched(List<Movie> moviesWatched)
	{return null;
	}

	public Boolean isValidPhoneNo(Long phoneNo)
	{
		return null;
	}
	
	public Boolean isValidUserName(String userName)
	{
		return null;
	}
}
