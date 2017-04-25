package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;

public class UpdateCinCoutScreen {
	private Text text;
	private Table tblCinCoutDetails;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UpdateCinCoutScreen window = new UpdateCinCoutScreen();
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
		Shell shlEezonCheck = new Shell();
		shlEezonCheck.setSize(1132, 684);
		shlEezonCheck.setText("EEZON - Check IN/Check OUT");
		
		Button btnHome = new Button(shlEezonCheck, SWT.NONE);
		btnHome.setBounds(44, 27, 105, 35);
		btnHome.setText("HOME");
		
		Button btnBack = new Button(shlEezonCheck, SWT.NONE);
		btnBack.setBounds(186, 27, 105, 35);
		btnBack.setText("BACK");
		
		text = new Text(shlEezonCheck, SWT.BORDER);
		text.setToolTipText("Enter Email ID");
		text.setBounds(443, 94, 162, 31);
		
		Button btnCheckIn = new Button(shlEezonCheck, SWT.RADIO);
		btnCheckIn.setBounds(459, 153, 133, 25);
		btnCheckIn.setText("Check IN");
		
		Button btnCheckOut = new Button(shlEezonCheck, SWT.RADIO);
		btnCheckOut.setBounds(459, 184, 133, 25);
		btnCheckOut.setText("Check OUT");
		
		Combo cmbSelectCourse = new Combo(shlEezonCheck, SWT.NONE);
		cmbSelectCourse.setBounds(470, 235, 104, 33);
		
		Combo cmbSelectKitType = new Combo(shlEezonCheck, SWT.NONE);
		cmbSelectKitType.setBounds(470, 284, 104, 33);
		
		Combo cmbKitSerialNumber = new Combo(shlEezonCheck, SWT.NONE);
		cmbKitSerialNumber.setBounds(470, 338, 104, 33);
		
		Button btnCheckOut_1 = new Button(shlEezonCheck, SWT.NONE);
		btnCheckOut_1.setBounds(469, 396, 105, 35);
		btnCheckOut_1.setText("Check OUT");
		
		tblCinCoutDetails = new Table(shlEezonCheck, SWT.BORDER | SWT.FULL_SELECTION);
		tblCinCoutDetails.setBounds(258, 449, 520, 61);
		tblCinCoutDetails.setHeaderVisible(true);
		tblCinCoutDetails.setLinesVisible(true);
		
		Button btnCheckIn_1 = new Button(shlEezonCheck, SWT.NONE);
		btnCheckIn_1.setBounds(469, 521, 105, 35);
		btnCheckIn_1.setText("Check IN");

		shlEezonCheck.open();
		shlEezonCheck.layout();
		while (!shlEezonCheck.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
