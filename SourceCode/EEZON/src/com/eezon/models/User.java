package com.eezon.models;

import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class User {

	@Id
	private String email;
	private String password;
	private String fullName;
	private String userRole;
	private int unsuccessfulLogins;
	
	//@Embedded
	//private CourseToEmbed courses;
	
	private String courses;
	
	@Transient
	private ArrayList<CourseToEmbed> coursesList;

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
	
	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public ArrayList<CourseToEmbed> getCoursesList() {
		return coursesList;
	}

	public void setCoursesList(ArrayList<CourseToEmbed> coursesList) {
		this.coursesList = coursesList;
	}

	
	/*public CourseToEmbed getCourses() {
		return courses;
	}

	public void setCourses(CourseToEmbed courses) {
		this.courses = courses;
	}*/
	
}
