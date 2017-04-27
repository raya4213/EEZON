package com.eezon.models;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class UnavailableItem {
	
	
	private String unavailableItemType;
	
	@Embedded
	private CourseToEmbed requestForCourse;
	
	private String name;
	private Double cost;
	private String link;
	private int numComponents;
	
	public String getUnavailableItemType() {
		return unavailableItemType;
	}
	
	public void setUnavailableItemType(String unavailableItemType) {
		this.unavailableItemType = unavailableItemType;
	}
	
	public CourseToEmbed getRequestForCourse() {
		return requestForCourse;
	}
	
	public void setRequestForCourse(CourseToEmbed requestForCourse) {
		this.requestForCourse = requestForCourse;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getCost() {
		return cost;
	}
	
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public int getNumComponents() {
		return numComponents;
	}
	
	public void setNumComponents(int numComponents) {
		this.numComponents = numComponents;
	}

}
