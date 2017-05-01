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

import com.eezon.checkincheckout.strategy.ICheckInCheckOutBtnAction;
import com.eezon.models.Course;
import com.eezon.models.CourseToEmbed;
import com.eezon.models.Kit;
import com.eezon.models.User;
import com.eezon.views.UpdateCheckInCheckOutView;

public class UpdateCheckInCheckOutController implements MouseListener, SelectionListener{
	private UpdateCheckInCheckOutView updateCheckInCheckOutView;
	private Course courseModel;
	private Kit kitModel;
	private User userModel;
	private Shell prevShell;
	
	public UpdateCheckInCheckOutView getUpdateCheckInCheckOutView() {
		return updateCheckInCheckOutView;
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

	public UpdateCheckInCheckOutController(User userModel,Shell prevShell){
		
		this.userModel=userModel;
		this.prevShell=prevShell;
		
		updateCheckInCheckOutView = new UpdateCheckInCheckOutView();
		courseModel = new Course();
		kitModel = new Kit();
		initializeListeners();
		kitModel.attach(updateCheckInCheckOutView);
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
		this.prevShell.setVisible(false);
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
		
		ICheckInCheckOutBtnAction btnAction = (ICheckInCheckOutBtnAction)btnPressed.getData(); 
		btnAction.doAction(this, updateCheckInCheckOutView, kitModel);
	}

	@Override
	public void mouseUp(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}
	
}
