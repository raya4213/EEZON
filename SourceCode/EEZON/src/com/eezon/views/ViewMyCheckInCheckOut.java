package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class ViewMyCheckInCheckOut {
	
	private Text textSelection;
	Button btnHome;
	Button btnBack;
	Combo cmbSelectCourse;
	Combo cmbSelectStudent;
	Display display;
	Shell shlEezon;
	Button btnView;
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			ViewMyCheckInCheckOut window = new ViewMyCheckInCheckOut();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}


	/**
	 * Open the window.
	 */
	public ViewMyCheckInCheckOut() {
		display = Display.getDefault();
		shlEezon = new Shell();
		shlEezon.setSize(957, 554);
		shlEezon.setText("EEZON - View my Check IN / Check OUT - Student");
		
		btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setBounds(76, 23, 105, 35);
		btnHome.setText("HOME");
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(224, 23, 105, 35);
		btnBack.setText("BACK");
		
		cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setBounds(376, 124, 104, 33);
		
		cmbSelectStudent = new Combo(shlEezon, SWT.NONE);
		cmbSelectStudent.setBounds(376, 229, 104, 33);
		
		textSelection = new Text(shlEezon, SWT.BORDER);
		textSelection.setBounds(259, 315, 348, 65);
		
		btnView = new Button(shlEezon, SWT.NONE);
		btnView.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnView.setBounds(375, 399, 105, 35);
		btnView.setText("VIEW");

	}
	

	public Text getTextSelection() {
		return textSelection;
	}


	public void setTextSelection(Text textSelection) {
		this.textSelection = textSelection;
	}


	public Button getBtnHome() {
		return btnHome;
	}


	public void setBtnHome(Button btnHome) {
		this.btnHome = btnHome;
	}


	public Button getBtnBack() {
		return btnBack;
	}


	public void setBtnBack(Button btnBack) {
		this.btnBack = btnBack;
	}


	public Combo getCmbSelectCourse() {
		return cmbSelectCourse;
	}


	public void setCmbSelectCourse(Combo cmbSelectCourse) {
		this.cmbSelectCourse = cmbSelectCourse;
	}


	public Combo getCmbSelectStudent() {
		return cmbSelectStudent;
	}


	public void setCmbSelectStudent(Combo cmbSelectStudent) {
		this.cmbSelectStudent = cmbSelectStudent;
	}


	public Display getDisplay() {
		return display;
	}


	public void setDisplay(Display display) {
		this.display = display;
	}


	public Shell getShlEezon() {
		return shlEezon;
	}


	public void setShlEezon(Shell shlEezon) {
		this.shlEezon = shlEezon;
	}


	public Button getBtnView() {
		return btnView;
	}


	public void setBtnView(Button btnView) {
		this.btnView = btnView;
	}
	
}
