package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Table;

public class PenaltyManagement {
	private Text txtEmailId;
	private Table tblViewPenalties;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PenaltyManagement window = new PenaltyManagement();
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
		Shell shell = new Shell();
		shell.setSize(678, 495);
		shell.setText("SWT Application");
		
		Button btnHome = new Button(shell, SWT.NONE);
		btnHome.setText("Home");
		btnHome.setBounds(10, 10, 75, 25);
		
		Button btnBack = new Button(shell, SWT.NONE);
		btnBack.setBounds(577, 10, 75, 25);
		btnBack.setText("Back");
		
		Button radView = new Button(shell, SWT.RADIO);
		radView.setBounds(305, 14, 90, 16);
		radView.setText("View");
		
		Button radOverride = new Button(shell, SWT.RADIO);
		radOverride.setText("Override");
		radOverride.setBounds(305, 36, 90, 16);
		
		Button btnByCourse = new Button(shell, SWT.RADIO);
		btnByCourse.setText("By Course");
		btnByCourse.setBounds(305, 96, 90, 16);
		
		Button btnByEmail = new Button(shell, SWT.RADIO);
		btnByEmail.setText("By Email");
		btnByEmail.setBounds(305, 118, 90, 16);
		
		Combo cmbSelectSem = new Combo(shell, SWT.NONE);
		cmbSelectSem.setBounds(212, 153, 268, 23);
		cmbSelectSem.setText("Select Sem");
		
		Combo cmbSelectYear = new Combo(shell, SWT.NONE);
		cmbSelectYear.setBounds(212, 190, 268, 23);
		cmbSelectYear.setText("Select Year");
		
		Combo cmbSelectCourse = new Combo(shell, SWT.NONE);
		cmbSelectCourse.setBounds(212, 235, 268, 23);
		cmbSelectCourse.setText("Select Course");
		
		txtEmailId = new Text(shell, SWT.BORDER);
		txtEmailId.setText("Email Id");
		txtEmailId.setBounds(212, 283, 268, 21);
		
		Button btnView = new Button(shell, SWT.NONE);
		btnView.setBounds(305, 326, 75, 25);
		btnView.setText("View");
		
		Button btnOverride = new Button(shell, SWT.NONE);
		btnOverride.setText("Override");
		btnOverride.setBounds(305, 423, 75, 25);
		
		tblViewPenalties = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		tblViewPenalties.setBounds(212, 361, 268, 45);
		tblViewPenalties.setHeaderVisible(true);
		tblViewPenalties.setLinesVisible(true);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
