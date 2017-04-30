package com.eezon.controllers;

import java.util.ArrayList;
import java.util.Date;

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
import com.eezon.models.CourseToEmbed;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;
import com.mysql.fabric.xmlrpc.base.Data;

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
			
			ArrayList<Kit> kitsFound = kitModel.getStudentSpecificKitDetails(updateCheckInCheckOutView.getTxtEmail().getText());
			
			updateCheckInCheckOutView.getGrpByCheckIn().setVisible(true);

			for(Kit kitFound: kitsFound){
				TableItem item = new TableItem(updateCheckInCheckOutView.getTblCinCoutDetails(), SWT.NULL);
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

		case "radCheckOut":
			System.out.println("Inside radio button checkout");
			hideAllOptions();
			updateCheckInCheckOutView.getGrpByCheckOut().setVisible(true);
			
			break;
			
		case "btnCheckIn":
			
			System.out.println("CheckIn Btn pressed");
			System.out.println("NumSelected"+updateCheckInCheckOutView.getTblCinCoutDetails().getSelectionCount());
			int selectedKitIndices [] = updateCheckInCheckOutView.getTblCinCoutDetails().getSelectionIndices();
			for(int selectedKitIndex : selectedKitIndices){
				System.out.println("SerialNum"+updateCheckInCheckOutView.getTblCinCoutDetails().getItem(selectedKitIndex));
				String serialNum = updateCheckInCheckOutView.getTblCinCoutDetails().getItem(selectedKitIndex).getText();
				System.out.println(serialNum);
				Kit kitSelected = kitModel.getKitDetailsForSerialNum(serialNum);
				Date currDate = new Date();
				kitSelected.setKitCheckInDate(currDate);
				kitModel.updateKitDetails(kitSelected);
				
			}
			
			break;
		case "btnCheckOut":
			System.out.println("Inside btnView onClick");
			CourseToEmbed course = new CourseToEmbed();
			course.setCourseName(updateCheckInCheckOutView.getCmbSelectCourse().getText());
			course.setYear("2016");
			course.setSemester("Fall");
			
			Kit kitType = new Kit();
			
			kitType.setKitType(updateCheckInCheckOutView.getCmbSelectKitType().getText());
			kitType.setKitSerialNum(updateCheckInCheckOutView.getCmbKitSerialNumber().getText());
			kitType.setStudentEmailKit(updateCheckInCheckOutView.getTxtEmail().getText());
			
			Date date = new Date();
			kitType.setKitCheckOutDate(date);
			kitType.setKitCourse(course);
			kitType.setStudentEmailKit("asd");
			
			kitModel.checkOut(kitType);
			break;
		}			

		
	}

	@Override
	public void mouseUp(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}
	
}
