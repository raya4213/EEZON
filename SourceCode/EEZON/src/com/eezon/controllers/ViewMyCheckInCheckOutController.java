package com.eezon.controllers;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.eezon.models.Course;
import com.eezon.views.ViewMyCheckInCheckOut;

public class ViewMyCheckInCheckOutController implements MouseListener, SelectionListener{
	private ViewMyCheckInCheckOut viewMyCheckInCheckOut;
	private Course courseModel;
	
	// Constructor
	public ViewMyCheckInCheckOutController() {
		viewMyCheckInCheckOut = new ViewMyCheckInCheckOut();
		courseModel = new Course();
		initializeMouseListeners();
	}
	
	private void initializeMouseListeners(){
		//viewMyCheckInCheckOut.getBtnBack().addMouseListener();
		//viewMyCheckInCheckOut.getBtnBack().addMouseListener();
		
	}
	
	public void displayView(){
		Shell shell = viewMyCheckInCheckOut.getShlEezon();
		Display display = viewMyCheckInCheckOut.getDisplay();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	
	// Getters and Setters
	public ViewMyCheckInCheckOut getCheckIncheckOutView() {
		return viewMyCheckInCheckOut;
	}

	public void setCheckIncheckOutView(ViewMyCheckInCheckOut viewMyCheckInCheckOut) {
		this.viewMyCheckInCheckOut = viewMyCheckInCheckOut;
	}

	public Course getCourseModel() {
		return courseModel;
	}

	public void setCourseModel(Course courseModel) {
		this.courseModel = courseModel;
	}

	@Override
	public void mouseDoubleClick(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseUp(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void widgetSelected(SelectionEvent paramSelectionEvent) {
		// TODO Auto-generated method stub
		System.out.println("Other option selected in View My check in/check out");
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent paramSelectionEvent) {
		// TODO Auto-generated method stub
		System.out.println("Defalut Widget Selected in View My check in/check out");
	}
	
}
