package com.eezon.models;

import javax.persistence.Entity;

@Entity
public class ProfessorRequest extends Request{
	
	private Boolean profSignUpApproval;

	public Boolean getProfSignUpApproval() {
		return profSignUpApproval;
	}

	public void setProfSignUpApproval(Boolean profSignUpApproval) {
		this.profSignUpApproval = profSignUpApproval;
	}
}
