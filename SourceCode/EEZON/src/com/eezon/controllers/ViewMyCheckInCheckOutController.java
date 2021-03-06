package com.eezon.controllers;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.models.Course;
import com.eezon.models.Kit;
import com.eezon.models.User;
import com.eezon.views.ViewMyCheckInCheckOut;

public class ViewMyCheckInCheckOutController implements MouseListener, SelectionListener{
	private ViewMyCheckInCheckOut viewMyCheckInCheckOut;
	private Course courseModel;
	private Kit kitModel;
	private User userModel;
	private Shell prevShell;
	private Shell loginShell;
	
	// Constructor
	public ViewMyCheckInCheckOutController(User userModel,Shell prevShell, Shell loginShell) {
		viewMyCheckInCheckOut = new ViewMyCheckInCheckOut();
		courseModel = new Course();
		kitModel = new Kit();
		this.userModel =userModel;
		this.prevShell = prevShell;
		this.loginShell = loginShell;
		initializeListeners();
	}
	
	// Initialize listeners:: activates the button that are being used in the GUI
	
	private void initializeListeners(){
		viewMyCheckInCheckOut.getBtnBack().addMouseListener(this);
		viewMyCheckInCheckOut.getBtnHome().addMouseListener(this);
		viewMyCheckInCheckOut.getBtnView().addMouseListener(this);
		viewMyCheckInCheckOut.getCmbSelectCourse().addSelectionListener(this);
		viewMyCheckInCheckOut.getCmbSelectStudent().addSelectionListener(this);
	}
	
	// Displays the Screen
	public void displayView(){
		this.prevShell.setVisible(false);
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
	public Course getCourseModel() {
		return courseModel;
	}

	public void setCourseModel(Course courseModel) {
		this.courseModel = courseModel;
	}
	public ViewMyCheckInCheckOut getViewMyCheckInCheckOut() {
		return viewMyCheckInCheckOut;
	}

	public void setViewMyCheckInCheckOut(ViewMyCheckInCheckOut viewMyCheckInCheckOut) {
		this.viewMyCheckInCheckOut = viewMyCheckInCheckOut;
	}

	public Kit getKitModel() {
		return kitModel;
	}

	public void setKitModel(Kit kitModel) {
		this.kitModel = kitModel;
	}

	public User getUserModel() {
		return userModel;
	}

	public void setUserModel(User userModel) {
		this.userModel = userModel;
	}

	public Shell getPrevShell() {
		return prevShell;
	}

	public void setPrevShell(Shell prevShell) {
		this.prevShell = prevShell;
	}

	public Shell getLoginShell() {
		return loginShell;
	}

	public void setLoginShell(Shell loginShell) {
		this.loginShell = loginShell;
	}

	@Override
	public void mouseDoubleClick(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		Button btnPressed = (Button)paramMouseEvent.widget;
		System.out.println("mouseDown" + paramMouseEvent);
		
		switch(btnPressed.getData().toString()){
		
			// TODO: Will have to implement Home and Back buttons
			case "btnHome":
			case "btnBack":
				this.prevShell.setVisible(true);
				viewMyCheckInCheckOut.getShlEezon().dispose();
				break;
				
			case "btnLogout":
				this.loginShell.setVisible(true);
				this.prevShell.dispose();
				viewMyCheckInCheckOut.getShlEezon().dispose();
				
			case "btnView":
				System.out.println("Inside btnView onClick");
				Course course = new Course();
				course.setCourseName(viewMyCheckInCheckOut.getCmbSelectCourse().getText());
				course.setYear("2016");
				course.setSemester("Fall");
				
				ArrayList<Kit>kitsFound = new ArrayList<Kit>();
				viewMyCheckInCheckOut.getTblDetails().removeAll();
				
				if (viewMyCheckInCheckOut.getCmbSelectStudent().getText().equalsIgnoreCase("Mine")){
					kitsFound =  kitModel.getStudentCheckedOutKits("rahul.yamasani@colorado.edu", course);
				}
				
				else if (viewMyCheckInCheckOut.getCmbSelectStudent().getText().equalsIgnoreCase("All")){
					kitsFound =  kitModel.getCourseSpecificKitDetails(course);
				}
				
				for(Kit kitFound: kitsFound){
					
					TableItem item = new TableItem(viewMyCheckInCheckOut.getTblDetails(), SWT.NULL);
			        item.setText(0, kitFound.getKitSerialNum());
			        item.setText(1, kitFound.getKitCheckInDate().toString());
			        item.setText(2, kitFound.getKitCheckOutDate().toString());
			        item.setText(3, kitFound.getKitCourse().getCourseName());
			        item.setText(4, kitFound.getKitPenalty()+"");
			        item.setText(5, kitFound.getKitType());
			        item.setText(6, kitFound.getStudentEmailKit());
			        item.setText(7, kitFound.getStudentNameForKit());					
				}
			break;
		}
		
		
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
