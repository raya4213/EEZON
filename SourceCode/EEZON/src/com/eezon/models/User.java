package com.eezon.models;

import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class User {
	
	@Id
	private String email;
	private String password;
	private String fullName;
	private String userRole;
	private int unsuccessfulLogins;
	
	@Embedded
	private CourseToEmbed courses;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public int getUnsuccessfulLogins() {
		return unsuccessfulLogins;
	}

	public void setUnsuccessfulLogins(int unsuccessfulLogins) {
		this.unsuccessfulLogins = unsuccessfulLogins;
	}

	public CourseToEmbed getCourses() {
		return courses;
	}

	public void setCourses(CourseToEmbed courses) {
		this.courses = courses;
	}
	
}
