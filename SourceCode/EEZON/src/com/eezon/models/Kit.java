package com.eezon.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



@Entity
public class Kit {
	
	//@Id
	private String kitType;
	
	@Embedded
	private CourseToEmbed kitCourse;
	
	@Id
	private String kitSerialNum;
	private Date kitCheckInDate;
	private Date kitCheckOutDate;
	private String studentEmailKit;
	private String studentNameForKit;
	private double kitPenalty;
	
	public String getKitType() {
		return kitType;
	}
	
	public void setKitType(String kitType) {
		this.kitType = kitType;
	}
	
	public CourseToEmbed getKitCourse() {
		return kitCourse;
	}
	
	public void setKitCourse(CourseToEmbed kitCourse) {
		this.kitCourse = kitCourse;
	}
	
	public String getKitSerialNum() {
		return kitSerialNum;
	}
	
	public void setKitSerialNum(String kitSerialNum) {
		this.kitSerialNum = kitSerialNum;
	}
	
	public Date getKitCheckInDate() {
		return kitCheckInDate;
	}
	
	public void setKitCheckInDate(Date kitCheckInDate) {
		this.kitCheckInDate = kitCheckInDate;
	}
	
	public Date getKitCheckOutDate() {
		return kitCheckOutDate;
	}
	
	public void setKitCheckOutDate(Date kitCheckOutDate) {
		this.kitCheckOutDate = kitCheckOutDate;
	}
	
	public String getStudentEmailKit() {
		return studentEmailKit;
	}
	
	public void setStudentEmailKit(String studentEmailKit) {
		this.studentEmailKit = studentEmailKit;
	}
	
	public String getStudentNameForKit() {
		return studentNameForKit;
	}
	
	public void setStudentNameForKit(String studentnameForKit) {
		this.studentNameForKit = studentnameForKit;
	}
	
	public double getKitPenalty() {
		return kitPenalty;
	}
	
	public void setKitPenalty(double kitPenalty) {
		this.kitPenalty = kitPenalty;
	}
	
	public ArrayList<Kit> getCourseSpecificKitDetails(Course course){
		ArrayList<Kit> kitsFound = new ArrayList<Kit>();
		
		//String hql = "FROM Kit K WHERE AND K.courseName ='" + course.getCourseName() +"'";
		String hql = "FROM Kit K";
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		Query query = session.createQuery(hql);
		List list = query.list();
		System.out.println("QuerySize::"+query.list().size());
		
		
		Iterator listIterator = list.iterator();
		while(listIterator.hasNext()){
			
			Kit kitFound = (Kit)listIterator.next();
			if(kitFound.getKitCourse().getCourseName().equalsIgnoreCase(course.getCourseName()) &&
					kitFound.getKitCourse().getYear().equalsIgnoreCase(course.getYear()) &&
					kitFound.getKitCourse().getSemester().equalsIgnoreCase(course.getSemester())){
				
				System.out.println(kitFound.getKitCourse().getCourseName());
				kitsFound.add(kitFound);	
			}
			
		}
		
		return kitsFound;
	}
	
	public ArrayList<Kit> getStudentSpecificKitDetails(String email){
		
		ArrayList<Kit> kitsFound = new ArrayList<Kit>();
		
		String hql = "FROM Kit K WHERE K.studentEmailKit = '"+email+"'";

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		Query query = session.createQuery(hql);
		List list = query.list();
		System.out.println("QuerySize::"+query.list().size());
		
		Iterator listIterator = list.iterator();
		while(listIterator.hasNext()){
			Kit kitFound = (Kit)listIterator.next();
			kitsFound.add(kitFound);
		}
		
		return kitsFound;
	}
	
	public ArrayList<Kit> getStudentSpecificKitDetailsWithPenalty(String email){
		
		ArrayList<Kit> kitsFound = new ArrayList<Kit>();
		
		String hql = "FROM Kit K WHERE K.studentEmailKit = '"+email+"' AND K.kitPenalty > 0.0";

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		Query query = session.createQuery(hql);
		List list = query.list();
		System.out.println("QuerySize::"+query.list().size());
		
		Iterator listIterator = list.iterator();
		while(listIterator.hasNext()){
			Kit kitFound = (Kit)listIterator.next();
			kitsFound.add(kitFound);
		}
		
		return kitsFound;
	}
	
	public Kit getKitDetailsForSerialNum(String serialNum){

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		
		Kit kitFound = session.get(com.eezon.models.Kit.class, serialNum); 
		
		return kitFound;
	}
	
	public Boolean updateKitDetails(Kit kitToUpdate){

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(kitToUpdate); 
		session.getTransaction().commit();

		
		return true;
	}
	
	public ArrayList<Kit> getKitSerialNums(String KitType, Course course){
		ArrayList<Kit> kitsFound = new ArrayList<Kit>();
		
		String hql = "FROM Kit K WHERE K.kitType = '"+KitType+"'";

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		Query query = session.createQuery(hql);
		List list = query.list();
		System.out.println("QuerySize::"+query.list().size());
		
		Iterator listIterator = list.iterator();
		while(listIterator.hasNext()){
			
			Kit kitFound = (Kit)listIterator.next();
			if(kitFound.getKitCourse().getCourseName().equalsIgnoreCase(course.getCourseName()) &&
					kitFound.getKitCourse().getYear().equalsIgnoreCase(course.getYear()) &&
					kitFound.getKitCourse().getSemester().equalsIgnoreCase(course.getSemester())){
				
				System.out.println(kitFound.getKitCourse().getCourseName());
				kitsFound.add(kitFound);	
			}
			
		}
		
		return kitsFound;
	}
		
	public ArrayList<Kit> getStudentCheckedOutKits(String email, Course course){
		ArrayList<Kit> kitsFound = new ArrayList<Kit>();
		
		//String hql = "FROM Kit K WHERE K.kitType = '"+KitType+"' AND K.courseName='"+course.getCourseName() 
		//+"' AND K.year='" + course.getYear() + "' AND K.semester='" + course.getSemester() + "'";	

		String hql = "FROM Kit K WHERE K.studentEmailKit = '"+email+"'";

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		Query query = session.createQuery(hql);
		List list = query.list();
		System.out.println("QuerySize::"+query.list().size());
		
		Iterator listIterator = list.iterator();
		while(listIterator.hasNext()){
			
			Kit kitFound = (Kit)listIterator.next();
			if(kitFound.getKitCourse().getCourseName().equalsIgnoreCase(course.getCourseName()) &&
					kitFound.getKitCourse().getYear().equalsIgnoreCase(course.getYear()) &&
					kitFound.getKitCourse().getSemester().equalsIgnoreCase(course.getSemester())){
				
				System.out.println(kitFound.getKitCourse().getCourseName());
				kitsFound.add(kitFound);	
			}
			
		}
		
		return kitsFound;		
		
	}
	
}
