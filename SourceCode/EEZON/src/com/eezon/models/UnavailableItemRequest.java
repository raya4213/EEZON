package com.eezon.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.hibernate.Query;
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
		super.addRequest(req);
		return true;	
	}
	
	public ArrayList<UnavailableItemRequest> getUnavailableItemRequests(String email){
		ArrayList<UnavailableItemRequest> reqsFound = new ArrayList<UnavailableItemRequest>();
		
		String hql = "FROM UnavailableItemRequest K WHERE K.reqFrom = '"+email+"'";

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		Query query = session.createQuery(hql);
		List list = query.list();
		System.out.println("QuerySize::"+query.list().size());
		
		Iterator listIterator = list.iterator();
		while(listIterator.hasNext()){
			UnavailableItemRequest reqFound = (UnavailableItemRequest)listIterator.next();
			reqsFound.add(reqFound);
		}
		
		return reqsFound;
	}
	
}
