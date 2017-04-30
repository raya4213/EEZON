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

	Button btnHome;
	Button btnBack;
	Combo cmbSelectKit;
	Combo cmbSelectCourse;
	Button btnRequest;
	Display display;
	Shell shlEezon;
	
	/**
	 * Open the window.
	 */
	public CheckInExtensionReqView() {
		display = Display.getDefault();
		shlEezon = new Shell();
		shlEezon.setSize(681, 433);
		shlEezon.setText("EEZON - Request for Check IN Extension");
		
		btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setText("Home");
		btnHome.setBounds(10, 10, 75, 25);
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setText("Back");
		btnBack.setBounds(577, 10, 75, 25);
		
		cmbSelectKit = new Combo(shlEezon, SWT.NONE);
		cmbSelectKit.setBounds(198, 215, 268, 23);
		cmbSelectKit.setText("Select Kit");
		
		cmbSelectTimeFrame = new Combo(shlEezon, SWT.NONE);
		cmbSelectTimeFrame.setBounds(198, 267, 268, 23);
		cmbSelectTimeFrame.setText("Select Time Frame");
		
		cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setBounds(198, 161, 268, 23);
		cmbSelectCourse.setText("Select Course");
		
		btnRequest = new Button(shlEezon, SWT.NONE);
		btnRequest.setText("Request");
		btnRequest.setBounds(286, 325, 75, 25);
		
		table = new Table(shlEezon, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(172, 44, 359, 91);
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

	public Combo getCmbSelectTimeFrame() {
		return cmbSelectTimeFrame;
	}

	public void setCmbSelectTimeFrame(Combo cmbSelectTimeFrame) {
		this.cmbSelectTimeFrame = cmbSelectTimeFrame;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
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

	public Combo getCmbSelectKit() {
		return cmbSelectKit;
	}

	public void setCmbSelectKit(Combo cmbSelectKit) {
		this.cmbSelectKit = cmbSelectKit;
	}

	public Combo getCmbSelectCourse() {
		return cmbSelectCourse;
	}

	public void setCmbSelectCourse(Combo cmbSelectCourse) {
		this.cmbSelectCourse = cmbSelectCourse;
	}

	public Button getBtnRequest() {
		return btnRequest;
	}

	public void setBtnRequest(Button btnRequest) {
		this.btnRequest = btnRequest;
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
}
