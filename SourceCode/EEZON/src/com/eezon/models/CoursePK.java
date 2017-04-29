package com.eezon.models;

import java.io.Serializable;

public class CoursePK implements Serializable {
	protected String courseName;
	protected String year;
	protected String semester;
	
	public CoursePK(){}

	public CoursePK(String courseName, String year, String semester) {
		super();
		this.courseName = courseName;
		this.year = year;
		this.semester = semester;
	};
}
