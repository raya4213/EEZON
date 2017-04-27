package com.eezon.models;

import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class TA extends User{

	private String coursesForTA;

	@Transient
	private ArrayList<CourseToEmbed> coursesForTAList;
	
	public ArrayList<CourseToEmbed> getCoursesForTAList() {
		return coursesForTAList;
	}

	public void setCoursesForTAList(ArrayList<CourseToEmbed> coursesForTAList) {
		this.coursesForTAList = coursesForTAList;
	}

	public String getCoursesForTA() {
		return coursesForTA;
	}

	public void setCoursesForTA(String coursesForTA) {
		this.coursesForTA = coursesForTA;
	}
	
	/*@Embedded
	private CourseToEmbed coursesForTA;

	public CourseToEmbed getCoursesForTA() {
		return coursesForTA;
	}

	public void setCoursesForTA(CourseToEmbed coursesForTA) {
		this.coursesForTA = coursesForTA;
	}*/
}
