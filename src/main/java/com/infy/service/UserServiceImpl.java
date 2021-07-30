package com.infy.service;

import java.util.Set;
import com.infy.dao.UserDAO;
import com.infy.dao.UserDAOImpl;
import com.infy.exception.MovieCatalogException;
import com.infy.model.User;
import com.infy.model.UserReport;
import com.infy.validator.Validator;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO = new UserDAOImpl();

	public String addUser(User user) throws MovieCatalogException {
		Validator validator = new Validator();
			validator.validate(user);
			return userDAO.addUser(user);
	}

	public String allocateBadge(Integer noOfReviewsGiven) {
		String badge = null;
		if (noOfReviewsGiven > 0 && noOfReviewsGiven <= 20) {
			badge = "*NAIVE*";
		}
		if (noOfReviewsGiven > 20 && noOfReviewsGiven <= 40) {
			badge = "**INTERMEDIATE**";
		}
		if (noOfReviewsGiven > 40 && noOfReviewsGiven < 100) {
			badge = "***CRITIC***";
		}
		return badge;

	}

	public Set<UserReport> getUser(Float ratingGiven) throws MovieCatalogException {
	return null;

	}

}
