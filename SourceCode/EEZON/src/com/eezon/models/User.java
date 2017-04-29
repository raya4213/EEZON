package com.eezon.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@MappedSuperclass
public abstract class User {

	@Id
	private String email;
	private String password;
	private String fullName;
	private String userRole;
	private int unsuccessfulLogins;
	
	//@Embedded
	//private CourseToEmbed courses;
	
	private String courses;
	
	@Transient
	private ArrayList<CourseToEmbed> coursesList;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public int getUnsuccessfulLogins() {
		return unsuccessfulLogins;
	}

	public void setUnsuccessfulLogins(int unsuccessfulLogins) {
		this.unsuccessfulLogins = unsuccessfulLogins;
	}
	
	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public ArrayList<CourseToEmbed> getCoursesList() {
		return coursesList;
	}

	public void setCoursesList(ArrayList<CourseToEmbed> coursesList) {
		this.coursesList = coursesList;
	}

	
	/*public CourseToEmbed getCourses() {
		return courses;
	}

	public void setCourses(CourseToEmbed courses) {
		this.courses = courses;
	}*/
	
	public static String getUserRole(String email){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		Admin admin = session.get(com.eezon.models.Admin.class, email);
		Professor prof = session.get(com.eezon.models.Professor.class, email);
		TA ta = session.get(com.eezon.models.TA.class, email);
		Student student = session.get(com.eezon.models.Student.class, email);

		String userRole = "";
		if(admin != null){
			userRole = "admin";
		}else if(prof != null){
			userRole = "professor";
		}else if(ta != null){
			userRole = "ta";
		}else if(student != null){
			userRole = "student";
		}
		return userRole;
		
	}
	
	public static User getUserDetails(String email, String userRole){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		
		User user = new Student();
		
		switch(userRole){
			case "admin":
				user = session.get(com.eezon.models.Admin.class, email);
				break;
			case "professor":
				user = session.get(com.eezon.models.Professor.class, email);
				break;
			case "ta":
				user = session.get(com.eezon.models.TA.class, email);
				break;
			case "student":
				user = session.get(com.eezon.models.Student.class, email);
				break;
		}

		return user;
		
	}
	
}
