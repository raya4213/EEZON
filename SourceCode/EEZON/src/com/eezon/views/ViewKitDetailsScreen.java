package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;

public class ViewKitDetailsScreen {
	private Table tblViewDetails;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ViewKitDetailsScreen window = new ViewKitDetailsScreen();
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
		Shell shlEezonView = new Shell();
		shlEezonView.setSize(504, 424);
		shlEezonView.setText("EEZON - View Kit Details");
		
		Button btnHome = new Button(shlEezonView, SWT.NONE);
		btnHome.setBounds(10, 10, 75, 25);
		btnHome.setText("Home");
		
		Button btnBack = new Button(shlEezonView, SWT.NONE);
		btnBack.setBounds(404, 10, 75, 25);
		btnBack.setText("Back");
		
		Combo cmbSelectSem = new Combo(shlEezonView, SWT.NONE);
		cmbSelectSem.setBounds(134, 132, 215, 23);
		
		Combo cmbSelectYear = new Combo(shlEezonView, SWT.NONE);
		cmbSelectYear.setBounds(134, 83, 215, 23);
		
		Combo cmbSelectCourse = new Combo(shlEezonView, SWT.NONE);
		cmbSelectCourse.setBounds(134, 187, 215, 23);
		
		Combo cmbSelectKitType = new Combo(shlEezonView, SWT.NONE);
		cmbSelectKitType.setBounds(134, 245, 215, 23);
		
		tblViewDetails = new Table(shlEezonView, SWT.BORDER | SWT.FULL_SELECTION);
		tblViewDetails.setBounds(87, 308, 330, 67);
		tblViewDetails.setHeaderVisible(true);
		tblViewDetails.setLinesVisible(true);

		shlEezonView.open();
		shlEezonView.layout();
		while (!shlEezonView.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
