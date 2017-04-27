package com.eezon.controllers;

import org.eclipse.swt.widgets.*;

import com.eezon.listeners.PenaltyMgtBtnListener;
import com.eezon.listeners.PenaltyMgtComboListener;
import com.eezon.models.*;
import com.eezon.views.PenaltyManagementView;

public class PenaltyManagementController {
	
	private PenaltyManagementView penaltyView;
	private Course courseModel;
	private Kit kitModel;
	
	public PenaltyManagementController() {
		// TODO Auto-generated constructor stub
		penaltyView = new PenaltyManagementView();
		courseModel = new Course();
		kitModel = new Kit();
		
		initializeMouseListeners();
	}
	
	public void displayView(){
		Display display = penaltyView.getDisplay();
		Shell shell = penaltyView.getShlPenaltyManagement();
		shell.open();
		shell.layout();
		while (!display.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	private void initializeMouseListeners(){
		PenaltyMgtBtnListener btnListener = new PenaltyMgtBtnListener(penaltyView, kitModel);
		PenaltyMgtComboListener comboListener = new PenaltyMgtComboListener(penaltyView);
		
		btnListener.hideAllOptions();
		
		penaltyView.getRadView().addMouseListener(btnListener);
		penaltyView.getRadOverride().addMouseListener(btnListener);
		penaltyView.getBtnByCourse().addMouseListener(btnListener);
		penaltyView.getBtnByEmail().addMouseListener(btnListener);
		penaltyView.getBtnView().addMouseListener(btnListener);
		penaltyView.getBtnOverride().addMouseListener(btnListener);
		penaltyView.getBtnHome().addMouseListener(btnListener);
		penaltyView.getBtnBack().addMouseListener(btnListener);
		
		penaltyView.getCmbSelectCourse().addSelectionListener(comboListener);
		penaltyView.getCmbSelectSem().addSelectionListener(comboListener);
		penaltyView.getCmbSelectYear().addSelectionListener(comboListener);
	}
	
	public PenaltyManagementView getPenaltyView() {
		return penaltyView;
	}
	
	public void setPenaltyView(PenaltyManagementView penaltyView) {
		this.penaltyView = penaltyView;
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

}
