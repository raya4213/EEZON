package com.eezon.controllers;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.eezon.models.User;
import com.eezon.views.RequestsView;

public class RequestsController implements MouseListener{
	private RequestsView requestsView;
	private Shell prevShell;
	private User userModel;
	
	public RequestsController(User userModel,Shell prevShell ){
		this.requestsView = new RequestsView();
		this.userModel=userModel;
		this.prevShell=prevShell;
	}
	

	public RequestsView getRequestsView() {
		return requestsView;
	}


	public void setRequestsView(RequestsView requestsView) {
		this.requestsView = requestsView;
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


	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void displayView(){
		this.prevShell.setVisible(false);
		Display display = requestsView.getDisplay();
		Shell shell = requestsView.getShlEezon();
		shell.open();
		shell.layout();
		while (!display.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
