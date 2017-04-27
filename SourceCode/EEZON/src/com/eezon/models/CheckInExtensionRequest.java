package com.eezon.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class CheckInExtensionRequest extends Request{

	@Embedded
	private KitToEmbed requestKit;
	private int numDays;
	public KitToEmbed getRequestKit() {
		return requestKit;
	}
	
	public void setRequestKit(KitToEmbed requestKit) {
		this.requestKit = requestKit;
	}
	
	public int getNumDays() {
		return numDays;
	}
	
	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}
	
	
	
}
