package com.eezon.controllers;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.eezon.models.User;
import com.eezon.views.RequestsView;

public class RequestsController implements MouseListener{
	private RequestsView requestsView;
	private Shell prevShell;
	private User userModel;
	private Shell loginShell;
	
	public RequestsController(User userModel,Shell prevShell, Shell loginShell ){
		this.requestsView = new RequestsView();
		this.userModel=userModel;
		this.prevShell=prevShell;
		this.loginShell = loginShell;
		initializeListeners();
	}
	
	public void initializeListeners(){
		requestsView.getBtnBack().addMouseListener(this);
		requestsView.getBtnHome().addMouseListener(this);
		requestsView.getBtnLogout().addMouseListener(this);
		requestsView.getBtnReqCheckinExtension().addMouseListener(this);
		requestsView.getBtnReqCourse().addMouseListener(this);
		requestsView.getBtnReqUnavailableItem().addMouseListener(this);
	}
	

	public Shell getLoginShell() {
		return loginShell;
	}

	public void setLoginShell(Shell loginShell) {
		this.loginShell = loginShell;
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
		
		Button btnPressed = (Button)arg0.widget;
		
		switch(btnPressed.getData().toString()){
			case "btnHome":
			case "btnBack":
				this.prevShell.setVisible(true);
				requestsView.getShlEezon().dispose();
				break;
			
			case "btnLogout":
				this.loginShell.setVisible(true);
				this.prevShell.dispose();
				requestsView.getShlEezon().dispose();
				
			case "btnReqCourse":
				break;
			case "btnReqUnavailableItem":
				UnavailableItemReqController unavailableItemReqController= new UnavailableItemReqController(userModel, requestsView.getShlEezon(), loginShell);
				unavailableItemReqController.displayView();
				break;
			case "btnReqCheckinExtension":
				CheckInExtensionReqController checkInExtensionReqController= new CheckInExtensionReqController(userModel, requestsView.getShlEezon(), loginShell);
				checkInExtensionReqController.displayView();
				break;
		}
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
