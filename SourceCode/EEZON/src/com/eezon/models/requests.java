package com.eezon.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class requests {

	@Id
	@GeneratedValue
	private String reqId;
	private String reqType;
	private String reqStatus;
	private String reqFrom;
	
	public String getReqId() {
		return reqId;
	}
	
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	
	public String getReqType() {
		return reqType;
	}
	
	public void setReqType(String reqType) {
		this.reqType = reqType;
	}
	
	public String getReqStatus() {
		return reqStatus;
	}
	
	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}
	
	public String getReqFrom() {
		return reqFrom;
	}
	
	public void setReqFrom(String reqFrom) {
		this.reqFrom = reqFrom;
	}
	
}
