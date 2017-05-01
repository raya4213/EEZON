package com.eezon.controllers;


import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.*;

import com.eezon.models.*;
import com.eezon.penalty.strategy.IPenaltyBtnAction;
import com.eezon.views.PenaltyManagementView;

public class PenaltyManagementController implements MouseListener, SelectionListener {
	
	private PenaltyManagementView penaltyView;
	private Course courseModel;
	private Kit kitModel;
	private Shell prevShell;
	private User userModel;
	private Shell loginShell;

	public PenaltyManagementController(User _userModel, Shell _prevShell, Shell _loginShell) {
		// TODO Auto-generated constructor stub
		penaltyView = new PenaltyManagementView();
		courseModel = new Course();
		kitModel = new Kit();
		userModel = _userModel;
		prevShell = _prevShell;
		loginShell = _loginShell;
		hideAllOptions();
		initializeListeners();
		kitModel.attach(penaltyView);
	}
	
	public void displayView(){
		this.prevShell.setVisible(false);
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
	
	private void initializeListeners(){
		
		penaltyView.getRadView().addMouseListener(this);
		penaltyView.getRadOverride().addMouseListener(this);
		penaltyView.getBtnByCourse().addMouseListener(this);
		penaltyView.getBtnByEmail().addMouseListener(this);
		penaltyView.getBtnView().addMouseListener(this);
		penaltyView.getBtnOverride().addMouseListener(this);
		penaltyView.getBtnHome().addMouseListener(this);
		penaltyView.getBtnBack().addMouseListener(this);
		penaltyView.getBtnLogout().addMouseListener(this);
		
		penaltyView.getCmbSelectCourse().addSelectionListener(this);
		penaltyView.getCmbSelectSem().addSelectionListener(this);
		penaltyView.getCmbSelectYear().addSelectionListener(this);
	}
	
	public Shell getLoginShell() {
		return loginShell;
	}

	public void setLoginShell(Shell loginShell) {
		this.loginShell = loginShell;
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
	
	public Shell getPrevShell() {
		return prevShell;
	}

	public void setPrevShell(Shell prevShell) {
		this.prevShell = prevShell;
	}

	public User getUserModel() {
		return userModel;
	}

	public void setUserModel(User userModel) {
		this.userModel = userModel;
	}
	
	public void hideAllOptions(){
		penaltyView.getGrpByCourseEmail().setVisible(false);
		penaltyView.getGrpByCourse().setVisible(false);
		penaltyView.getGrpByEmail().setVisible(false);
		penaltyView.getBtnView().setVisible(false);
		penaltyView.getTblViewPenalties().setVisible(true);
		penaltyView.getBtnOverride().setVisible(false);
		
		penaltyView.getBtnByCourse().setSelection(false);
		penaltyView.getBtnByEmail().setSelection(false);
	}
	
	public void hideCourseEmailOptions(){
		penaltyView.getGrpByCourse().setVisible(false);
		penaltyView.getGrpByEmail().setVisible(false);
		penaltyView.getBtnView().setVisible(false);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Default option selected");
	}

	@Override
	public void widgetSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Other option selected");
	}

	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Button btnPressed = (Button)arg0.widget;
		System.out.println("mouseDown" + arg0);
		
		System.out.println("btnPressed.getData()" + btnPressed.getData());
		IPenaltyBtnAction btnAction = (IPenaltyBtnAction)btnPressed.getData();
		btnAction.doAction(this, penaltyView, kitModel);

	}
	
	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}