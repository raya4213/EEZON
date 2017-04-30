package com.eezon.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
