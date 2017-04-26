package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;

public class RequestUnavailableItemScreen {
	private Text text;
	private Text EnterName;
	private Text EnterLink;
	private Text enterCost;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RequestUnavailableItemScreen window = new RequestUnavailableItemScreen();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shlEezon = new Shell();
		shlEezon.setToolTipText("Enter Cost");
		shlEezon.setSize(1094, 679);
		shlEezon.setText("EEZON - Request for Unavailable Items - Student  ");
		
		Button btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setBounds(76, 36, 105, 35);
		btnHome.setText("HOME");
		
		Button btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(209, 36, 105, 35);
		btnBack.setText("BACK");
		
		text = new Text(shlEezon, SWT.BORDER);
		text.setBounds(242, 103, 596, 75);
		
		Combo cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setBounds(461, 232, 104, 33);
		
		Combo cmbSelectItemType = new Combo(shlEezon, SWT.NONE);
		cmbSelectItemType.setBounds(461, 283, 104, 33);
		
		EnterName = new Text(shlEezon, SWT.BORDER);
		EnterName.setToolTipText("Enter Name");
		EnterName.setBounds(468, 348, 80, 31);
		
		EnterLink = new Text(shlEezon, SWT.BORDER);
		EnterLink.setToolTipText("Enter Link");
		EnterLink.setBounds(468, 396, 80, 31);
		
		enterCost = new Text(shlEezon, SWT.BORDER | SWT.MULTI);
		enterCost.setToolTipText("Enter Cost");
		enterCost.setBounds(468, 447, 80, 31);
		
		Combo comNumOfItems = new Combo(shlEezon, SWT.NONE);
		comNumOfItems.setBounds(461, 502, 104, 33);
		
		Button btnRequest = new Button(shlEezon, SWT.NONE);
		btnRequest.setBounds(461, 563, 105, 35);
		btnRequest.setText("REQUEST");

		shlEezon.open();
		shlEezon.layout();
		while (!shlEezon.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
