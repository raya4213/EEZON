package com.eezon.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class UnavailableItemRequest extends Request {

	@Embedded
	private UnavailableItem unavailableItem;

	public UnavailableItem getUnavailableItem() {
		return unavailableItem;
	}

	public void setUnavailableItem(UnavailableItem unavailableItem) {
		this.unavailableItem = unavailableItem;
	}
	
}
