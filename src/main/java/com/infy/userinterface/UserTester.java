package com.infy.userinterface;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.infy.model.Movie;
import com.infy.model.UserReport;
import com.infy.service.UserService;
import com.infy.service.UserServiceImpl;

/**
 * Creates the user object and calls the methods in the service class. This is a
 * temporary class and will be replaced once the client tier is developed
 * 
 * @author ETA
 */

public class UserTester {
	private static final Log LOG = LogFactory.getLog(UserTester.class);
	private static PropertiesConfiguration propertiesConfiguration;

	public static void main(String[] args) throws ConfigurationException {
		//addUser();
		getUserDetails();
	}

	public static void addUser() throws ConfigurationException {
		propertiesConfiguration = new Configurations().properties("configuration.properties");
		
		Movie movie = new Movie(1234, "Undisputed", 4.5f, "Action", LocalTime.of(1, 50, 20));
		List<Movie> moviesWatched = new ArrayList<>();
		moviesWatched.add(movie);
//		User user = new User("John", 9658041322L, 15, moviesWatched);
//		
//		try {
//			UserService userService = new UserServiceImpl();
//			String msg = userService.addUser(user);
//			if (msg != null)
//				LOG.info(propertiesConfiguration.getProperty("Tester.SUCCESS") + " " + msg);
//			else
//				LOG.info(propertiesConfiguration.getProperty("Tester.FAILURE"));
//		} catch (Exception e) {
//
//			LOG.info(propertiesConfiguration.getProperty(e.getMessage()));
//		}
	}

	public static void getUserDetails() throws ConfigurationException {
		propertiesConfiguration = new Configurations().properties("configuration.properties");
		Float ratingGiven = 4.0F;

		try {
			UserService userService = new UserServiceImpl();

			Set<UserReport> userReport = userService.getUser(ratingGiven);
			//System.out.println();
			LOG.info(String.format("%-26s%-16s%n", "Name", "Badge"));
			LOG.info("====================================================");
			for (UserReport ur : userReport) {
				LOG.info(String.format("%-26s%-16s%n",  ur.getUserName(), ur.getBadge()));
			}
		} catch (Exception e) {

			LOG.info(propertiesConfiguration.getProperty(e.getMessage()));
		}
	}

}
