package com.eezon.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

	@Override
	public boolean addRequest(Request req) {
		// TODO Auto-generated method stub
		UnavailableItemRequest request = (UnavailableItemRequest)req;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(request); 
		session.getTransaction().commit();
		
		return true;	
	}
	
	
	
}
