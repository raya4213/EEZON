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
import com.eezon.viewkitdetails.stratergy.IViewKitDetailsBtnAction;
import com.eezon.views.ViewKitDetailsCoursewiseView;

public class ViewKitDetailsCoursewiseController implements MouseListener, SelectionListener {
	ViewKitDetailsCoursewiseView viewKitDetailsCoursewiseView;
	Course courseModel;
	Kit kitModel;
	Shell prevShell;
	User userModel;
	Shell loginShell;

	public ViewKitDetailsCoursewiseController(User userModel, Shell prevShell, Shell loginShell) {
		viewKitDetailsCoursewiseView = new ViewKitDetailsCoursewiseView();
		courseModel = new Course(); 
		kitModel = new Kit();
		initializeListeners();
		this.userModel = userModel;
		this.prevShell = prevShell;
		this.loginShell = loginShell;
	}
	
	private void initializeListeners(){
		System.out.println("Inside this function");
		viewKitDetailsCoursewiseView.getBtnView().addMouseListener(this);
	
	}
	
	public void displayView(){
		this.prevShell.setVisible(false);
		
		Display display = viewKitDetailsCoursewiseView.getDisplay();
		Shell shell = viewKitDetailsCoursewiseView.getShlEezonView();
		shell.open();
		shell.layout();
		while (!display.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public ViewKitDetailsCoursewiseView getViewKitDetailsCoursewiseView() {
		return viewKitDetailsCoursewiseView;
	}

	public User getUserModel() {
		return userModel;
	}

	public void setUserModel(User userModel) {
		this.userModel = userModel;
	}

	public Shell getLoginShell() {
		return loginShell;
	}

	public void setLoginShell(Shell loginShell) {
		this.loginShell = loginShell;
	}

	public void setViewKitDetailsCoursewiseView(ViewKitDetailsCoursewiseView viewKitDetailsCoursewiseView) {
		this.viewKitDetailsCoursewiseView = viewKitDetailsCoursewiseView;
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
	
	@Override
	public void widgetDefaultSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void widgetSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		
		Button btnPressed = (Button)arg0.widget;
		System.out.println("mouseDown" + arg0);
		
		IViewKitDetailsBtnAction IViewBtnAction = (IViewKitDetailsBtnAction)btnPressed.getData();
		IViewBtnAction.doAction(viewKitDetailsCoursewiseView, kitModel);
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}



