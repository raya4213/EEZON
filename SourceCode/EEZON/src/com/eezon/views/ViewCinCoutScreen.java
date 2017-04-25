package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;

public class ViewCinCoutScreen {

	protected Shell shlView;
	private Text tableList;

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
		createContents();
		shlView.open();
		shlView.layout();
		while (!shlView.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlView = new Shell();
		shlView.setToolTipText("Enter Email ID");
		shlView.setSize(873, 490);
		shlView.setText("EEZON - View my CheckIN/CheckOUT - Student");
		
		Button btnHome = new Button(shlView, SWT.NONE);
		btnHome.setBounds(40, 31, 105, 35);
		btnHome.setText("HOME");
		
		Button btnBack = new Button(shlView, SWT.NONE);
		btnBack.setBounds(191, 31, 105, 35);
		btnBack.setText("BACK");
		
		Combo cmbSelectCourse = new Combo(shlView, SWT.NONE);
		cmbSelectCourse.setToolTipText("Select Course");
		cmbSelectCourse.setBounds(284, 119, 250, 33);
		
		Combo cmbSelectStudent = new Combo(shlView, SWT.NONE);
		cmbSelectStudent.setBounds(284, 202, 250, 33);
		
		tableList = new Text(shlView, SWT.BORDER);
		tableList.setBounds(269, 274, 294, 56);

	}

}
