package com.eezon.models;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Id;

@Embeddable
public class KitToEmbed {
	private String kitType;
	@Embedded
	private CourseToEmbed kitCourse;
	private String kitSerialNum;
	private Date kitCheckInDate;
	private Date kitCheckOutDate;
	private String kitCheckInStatus;
	private String studentEmailKit;
	private String studentNameForKit;
	private double kitPenalty;
	
	public String getKitType() {
		return kitType;
	}
	
	public String getKitCheckInStatus() {
		return kitCheckInStatus;
	}


	public void setKitCheckInStatus(String kitCheckInStatus) {
		this.kitCheckInStatus = kitCheckInStatus;
	}


	public void setKitType(String kitType) {
		this.kitType = kitType;
	}
	
	public CourseToEmbed getKitCourse() {
		return kitCourse;
	}
	
	public void setKitCourse(CourseToEmbed kitCourse) {
		this.kitCourse = kitCourse;
	}
	
	public String getKitSerialNum() {
		return kitSerialNum;
	}
	
	public void setKitSerialNum(String kitSerialNum) {
		this.kitSerialNum = kitSerialNum;
	}
	
	public Date getKitCheckInDate() {
		return kitCheckInDate;
	}
	
	public void setKitCheckInDate(Date kitCheckInDate) {
		this.kitCheckInDate = kitCheckInDate;
	}
	
	public Date getKitCheckOutDate() {
		return kitCheckOutDate;
	}
	
	public void setKitCheckOutDate(Date kitCheckOutDate) {
		this.kitCheckOutDate = kitCheckOutDate;
	}
	
	public String getStudentEmailKit() {
		return studentEmailKit;
	}
	
	public void setStudentEmailKit(String studentEmailKit) {
		this.studentEmailKit = studentEmailKit;
	}
	
	public String getStudentNameForKit() {
		return studentNameForKit;
	}
	
	public void setStudentNameForKit(String studentNameForKit) {
		this.studentNameForKit = studentNameForKit;
	}
	
	public double getKitPenalty() {
		return kitPenalty;
	}
	
	public void setKitPenalty(double kitPenalty) {
		this.kitPenalty = kitPenalty;
	}
	

}
