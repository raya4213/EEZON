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
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(314, 22, 90, 30);
		btnBack.setText("Back");
		
		btnReqCourse = new Button(shlEezon, SWT.NONE);
		btnReqCourse.setBounds(101, 81, 243, 30);
		btnReqCourse.setText("Request to enroll into Course");
		
		btnReqUnavailableItem = new Button(shlEezon, SWT.NONE);
		btnReqUnavailableItem.setBounds(101, 131, 243, 30);
		btnReqUnavailableItem.setText("Request for Unavailable Item");
		
		btnReqCheckinExtension = new Button(shlEezon, SWT.NONE);
		btnReqCheckinExtension.setText("Request Check IN Extension");
		btnReqCheckinExtension.setBounds(101, 182, 243, 30);

		shlEezon.open();
		shlEezon.layout();
		
		while (!shlEezon.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
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
}
