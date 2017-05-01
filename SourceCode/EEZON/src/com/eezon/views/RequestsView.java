package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;

public class RequestsView {
	
	
	Button btnHome;
	Shell shlEezon;
	Button btnBack;
	Button btnReqCourse;
	Button btnReqUnavailableItem;
	Button btnReqCheckinExtension;
	Display display;
	Button btnLogout;
	/**
	 * Launch the application.
	 * @param args
	 *
	public static void main(String[] args) {
		try {
			RequestsView window = new RequestsView();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	/**
	 * Open the window.
	 */
	public RequestsView() {
		display = Display.getDefault();
		shlEezon = new Shell();
		shlEezon.setSize(450, 300);
		shlEezon.setLocation(450,200);
		shlEezon.setText("EEZON - Requests Screen");
		
		btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setBounds(25, 22, 90, 30);
		btnHome.setText("Home");
		btnHome.setData("btnHome");
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(161, 22, 90, 30);
		btnBack.setText("Back");
		btnBack.setData("btnBack");
		
		btnReqCourse = new Button(shlEezon, SWT.NONE);
		btnReqCourse.setBounds(101, 81, 243, 30);
		btnReqCourse.setText("Request to enroll into Course");
		btnReqCourse.setData("btnReqCourse");
		
		btnReqUnavailableItem = new Button(shlEezon, SWT.NONE);
		btnReqUnavailableItem.setBounds(101, 131, 243, 30);
		btnReqUnavailableItem.setText("Request for Unavailable Item");
		btnReqUnavailableItem.setData("btnReqUnavailableItem");
		
		btnReqCheckinExtension = new Button(shlEezon, SWT.NONE);
		btnReqCheckinExtension.setText("Request Check IN Extension");
		btnReqCheckinExtension.setBounds(101, 182, 243, 30);
		btnReqCheckinExtension.setData("btnReqCheckinExtension");
		
		btnLogout = new Button(shlEezon, SWT.NONE);
		btnLogout.setBounds(302, 22, 90, 30);
		btnLogout.setText("Logout");
		btnLogout.setData("btnLogout");

	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Button getBtnHome() {
		return btnHome;
	}

	public void setBtnHome(Button btnHome) {
		this.btnHome = btnHome;
	}

	public Shell getShlEezon() {
		return shlEezon;
	}

	public void setShlEezon(Shell shlEezon) {
		this.shlEezon = shlEezon;
	}

	public Button getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(Button btnBack) {
		this.btnBack = btnBack;
	}

	public Button getBtnReqCourse() {
		return btnReqCourse;
	}

	public void setBtnReqCourse(Button btnReqCourse) {
		this.btnReqCourse = btnReqCourse;
	}

	public Button getBtnReqUnavailableItem() {
		return btnReqUnavailableItem;
	}

	public void setBtnReqUnavailableItem(Button btnReqUnavailableItem) {
		this.btnReqUnavailableItem = btnReqUnavailableItem;
	}

	public Button getBtnReqCheckinExtension() {
		return btnReqCheckinExtension;
	}

	public void setBtnReqCheckinExtension(Button btnReqCheckinExtension) {
		this.btnReqCheckinExtension = btnReqCheckinExtension;
	}

	public Button getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(Button btnLogout) {
		this.btnLogout = btnLogout;
	}
}
