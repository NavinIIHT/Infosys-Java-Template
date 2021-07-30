package com.infy.model;

import java.util.List;

public class UserReport {
	
	private String userName;
	private Long phoneNo;
	private String badge;
	private List<Movie> moviesWatched;
	
	public UserReport(String userName, Long phoneNo, String badge, List<Movie> moviesWatched) {
		super();
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.badge = badge;
		this.moviesWatched = moviesWatched;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	public List<Movie> getMoviesWatched() {
		return moviesWatched;
	}
	public void setMoviesWatched(List<Movie> moviesWatched) {
		this.moviesWatched = moviesWatched;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserReport other = (UserReport) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
}
