package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

public class ViewCinCoutScreen {
	private Text textSelection;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ViewCinCoutScreen window = new ViewCinCoutScreen();
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
		shlEezon.setSize(957, 554);
		shlEezon.setText("EEZON - View my Check IN / Check OUT - Student");
		
		Button btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setBounds(76, 23, 105, 35);
		btnHome.setText("HOME");
		
		Button btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(224, 23, 105, 35);
		btnBack.setText("BACK");
		
		Combo cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setBounds(376, 124, 104, 33);
		
		Combo cmbSelectStudent = new Combo(shlEezon, SWT.NONE);
		cmbSelectStudent.setBounds(376, 229, 104, 33);
		
		textSelection = new Text(shlEezon, SWT.BORDER);
		textSelection.setBounds(259, 315, 348, 65);

		shlEezon.open();
		shlEezon.layout();
		while (!shlEezon.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
