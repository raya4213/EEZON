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
public class CheckInExtensionRequest extends Request{

	@Embedded
	private KitToEmbed requestKit;
	private int numDays;
	public KitToEmbed getRequestKit() {
		return requestKit;
	}
	
	public void setRequestKit(KitToEmbed requestKit){
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
		CheckInExtensionRequest request = (CheckInExtensionRequest)req;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(request); 
		session.getTransaction().commit();
		return true;	
	}
	
	public ArrayList<CheckInExtensionRequest> getCheckInExtensionRequests(String email){
		ArrayList<CheckInExtensionRequest> reqsFound = new ArrayList<CheckInExtensionRequest>();
		
		String hql = "FROM CheckInExtensionRequest K WHERE K.reqFrom = '"+email+"'";

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		Query query = session.createQuery(hql);
		List list = query.list();
		System.out.println("QuerySize::"+query.list().size());
		
		Iterator listIterator = list.iterator();
		while(listIterator.hasNext()){
			CheckInExtensionRequest reqFound = (CheckInExtensionRequest)listIterator.next();
			reqsFound.add(reqFound);
		}
		
		return reqsFound;
	}
	
	
}
