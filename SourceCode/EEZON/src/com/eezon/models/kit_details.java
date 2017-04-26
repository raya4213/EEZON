package com.eezon.models;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class kit_details {
	
	@Id
	private String kitType;
	@Embedded
	private Course kitCourse;
	private String kitSerialNum;
	private Date kitCheckInDate;
	private Date kitCheckOutDate;
	private String studentEmailKit;
	private String studentnameForKit;
	private double kitPenalty;
	
	public String getKitType() {
		return kitType;
	}
	
	public void setKitType(String kitType) {
		this.kitType = kitType;
	}
	
	public Course getKitCourse() {
		return kitCourse;
	}
	
	public void setKitCourse(Course kitCourse) {
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
	
	public String getStudentnameForKit() {
		return studentnameForKit;
	}
	
	public void setStudentnameForKit(String studentnameForKit) {
		this.studentnameForKit = studentnameForKit;
	}
	
	public double getKitPenalty() {
		return kitPenalty;
	}
	
	public void setKitPenalty(double kitPenalty) {
		this.kitPenalty = kitPenalty;
	}
	
}
