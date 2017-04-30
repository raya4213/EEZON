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
import com.eezon.views.UpdateCheckInCheckOutView;

public class UpdateCheckInCheckOutController implements MouseListener, SelectionListener{
	private UpdateCheckInCheckOutView updateCheckInCheckOutView;
	private Course courseModel;
	private Kit kitModel;
	
	public UpdateCheckInCheckOutView getUpdateCheckInCheckOutView() {
		return updateCheckInCheckOutView;
	}

	public void setUpdateCheckInCheckOutView(UpdateCheckInCheckOutView updateCheckInCheckOutView) {
		this.updateCheckInCheckOutView = updateCheckInCheckOutView;
	}

	public Course getCourseModel() {
		return courseModel;
	}

	public void setCourseModel(Course courseModel) {
		this.courseModel = courseModel;
	}

	public Kit getKitModel() {
		return kitModel;
	}

	public void setKitModel(Kit kitModel) {
		this.kitModel = kitModel;
	}

	public UpdateCheckInCheckOutController(){
		updateCheckInCheckOutView = new UpdateCheckInCheckOutView();
		courseModel = new Course();
		kitModel = new Kit();
		initializeListeners();
	}
	
	public void hideAllOptions(){
		updateCheckInCheckOutView.getGrpByCheckIn().setVisible(false);
		updateCheckInCheckOutView.getGrpByCheckOut().setVisible(false);
	}
	
	private void initializeListeners(){
		hideAllOptions();
		updateCheckInCheckOutView.getBtnBack().addMouseListener(this);
		updateCheckInCheckOutView.getBtnHome().addMouseListener(this);
		updateCheckInCheckOutView.getBtnCheckIn().addMouseListener(this);
		updateCheckInCheckOutView.getRadCheckIn().addMouseListener(this);
		updateCheckInCheckOutView.getBtnCheckOut().addMouseListener(this);
		updateCheckInCheckOutView.getRadCheckOut().addMouseListener(this);
		
		updateCheckInCheckOutView.getCmbSelectCourse().addSelectionListener(this);
		updateCheckInCheckOutView.getCmbSelectKitType().addSelectionListener(this);
		updateCheckInCheckOutView.getCmbKitSerialNumber().addSelectionListener(this);
	}
	
	public void displayView(){
		Shell shlEezonCheck = updateCheckInCheckOutView.getShlEezonCheck();
		Display display = updateCheckInCheckOutView.getDisplay();
		shlEezonCheck.open();
		shlEezonCheck.layout();
		while (!shlEezonCheck.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	@Override
	public void widgetSelected(SelectionEvent paramSelectionEvent) {
		// TODO Auto-generated method stub
		System.out.println("Other selected");
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent paramSelectionEvent) {
		// TODO Auto-generated method stub
		System.out.println("Default selected");
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
			break;
		case "btnBack":
			break;
		case "radCheckIn":
			hideAllOptions();
			updateCheckInCheckOutView.getGrpByCheckIn().setVisible(true);
			
			/*System.out.println("Inside btnView onClick");
			Course course = new Course();
			course.setCourseName(viewMyCheckInCheckOut.getCmbSelectCourse().getText());
			course.setYear("2016");
			course.setSemester("Fall");
			
			ArrayList<Kit>kitsFound = new ArrayList<Kit>();
			viewMyCheckInCheckOut.getTblDetails().removeAll();
			
			if (viewMyCheckInCheckOut.getCmbSelectStudent().getText().equalsIgnoreCase("Mine")){
				kitsFound =  kitModel.getStudentCheckedOutKits("asd", course);
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
			}*/
			break;

		
		case "radCheckOut":
			hideAllOptions();
			updateCheckInCheckOutView.getGrpByCheckOut().setVisible(true);
			break;
			
		case "btnCheckIn":
			break;
			
		case "btnCheckOut":
			break;
		}			

		
	}

	@Override
	public void mouseUp(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}
	
}
