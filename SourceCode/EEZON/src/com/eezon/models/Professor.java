package com.eezon.models;

import javax.persistence.Entity;

@Entity
public class Professor extends User {

	private Boolean signUpApprovalStatus;

	public Boolean getSignUpApprovalStatus() {
		return signUpApprovalStatus;
	}

	public void setSignUpApprovalStatus(Boolean signUpApprovalStatus) {
		this.signUpApprovalStatus = signUpApprovalStatus;
	}
}
