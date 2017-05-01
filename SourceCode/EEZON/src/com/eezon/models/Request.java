package com.eezon.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import com.eezon.observer.IReqObserver;

@MappedSuperclass
public abstract class Request {

	@Id
	@GeneratedValue
	private int reqId;
	private String reqType;
	private String reqStatus;
	private String reqFrom;
	@Transient
	private List<IReqObserver> observers = new ArrayList<IReqObserver>();
	public void attach(IReqObserver observer){
		observers.add(observer);
	}
	
	public void detach(IReqObserver observer){
		observers.remove(observer);
	}
	
	public void notifyAllObservers(Request req){
		for(IReqObserver observer : observers)
		{
			observer.updateDetailsTable(req);
		}
	}
	
	public int getReqId() {
		return reqId;
	}
	
	public void setReqId(int reqId) {
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
	
	public boolean addRequest(Request req){
		notifyAllObservers(req);
		return true;
	}
}
