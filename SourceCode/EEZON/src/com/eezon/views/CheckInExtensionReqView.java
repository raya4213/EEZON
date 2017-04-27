package com.eezon.views;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;

public class CheckInExtensionReqView {
	private Combo cmbSelectTimeFrame;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CheckInExtensionReqView window = new CheckInExtensionReqView();
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
		shlEezon.setSize(681, 433);
		shlEezon.setText("EEZON - Request for Check IN Extension");
		
		Button btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setText("Home");
		btnHome.setBounds(10, 10, 75, 25);
		
		Button btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setText("Back");
		btnBack.setBounds(577, 10, 75, 25);
		
		Combo cmbSelectKit = new Combo(shlEezon, SWT.NONE);
		cmbSelectKit.setBounds(198, 215, 268, 23);
		cmbSelectKit.setText("Select Kit");
		
		cmbSelectTimeFrame = new Combo(shlEezon, SWT.NONE);
		cmbSelectTimeFrame.setBounds(198, 267, 268, 23);
		cmbSelectTimeFrame.setText("Select Time Frame");
		
		Combo cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setBounds(198, 161, 268, 23);
		cmbSelectCourse.setText("Select Course");
		
		Button btnRequest = new Button(shlEezon, SWT.NONE);
		btnRequest.setText("Request");
		btnRequest.setBounds(286, 325, 75, 25);
		
		table = new Table(shlEezon, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(172, 44, 325, 86);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		shlEezon.open();
		shlEezon.layout();
		while (!shlEezon.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
