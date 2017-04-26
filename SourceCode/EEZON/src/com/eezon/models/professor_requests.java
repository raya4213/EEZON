package com.eezon.models;

import javax.persistence.Entity;

@Entity
public class professor_requests extends requests{
	
	private Boolean profSignUpApproval;

	public Boolean getProfSignUpApproval() {
		return profSignUpApproval;
	}

	public void setProfSignUpApproval(Boolean profSignUpApproval) {
		this.profSignUpApproval = profSignUpApproval;
	}
}
