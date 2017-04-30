package com.eezon.controllers;


import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.eezon.models.Course;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.views.UnavailableItemReqView;

public class UnavailableItemReqController implements MouseListener {
	private UnavailableItemReqView unavailableItemReqView;
	private Course courseModel;
	private UnavailableItemRequest unavailableItemReqModel;
	
	public UnavailableItemReqController(){
		this.unavailableItemReqView= new UnavailableItemReqView();
		this.courseModel=new Course();
		this.unavailableItemReqModel=new UnavailableItemRequest();
	
	}
	
	public void displayView(){
		Shell shell= unavailableItemReqView.getShlEezon();
		Display display= unavailableItemReqView.getDisplay();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public UnavailableItemReqView getUnavailableItemReqView() {
		return unavailableItemReqView;
	}
	public void setUnavailableItemReqView(UnavailableItemReqView unavailableItemReqView) {
		this.unavailableItemReqView = unavailableItemReqView;
	}
	public Course getCourseModel() {
		return courseModel;
	}
	public void setCourseModel(Course courseModel) {
		this.courseModel = courseModel;
	}
	public UnavailableItemRequest getUnavailableItemReqModel() {
		return unavailableItemReqModel;
	}
	public void setUnavailableItemReqModel(UnavailableItemRequest unavailableItemReqModel) {
		this.unavailableItemReqModel = unavailableItemReqModel;
	}

	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Button btnPressed = (Button)arg0.widget;
		
		switch(btnPressed.getData().toString()){
			case "btnRequest":
				
				break;
			case "btnHome":
				break;
			case "btnBack":
				break;
		}
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	 
}
