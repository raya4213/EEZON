package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import com.eezon.checkincheckout.strategy.BtnCheckInAction;
import com.eezon.checkincheckout.strategy.BtnCheckOutAction;
import com.eezon.checkincheckout.strategy.RadCheckInAction;
import com.eezon.checkincheckout.strategy.RadCheckOutAction;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class UpdateCheckInCheckOutView {
	private Text txtEmail;
	private Table tblCinCoutDetails;
	Button btnHome;
	Button btnBack;
	Group group;
	Button radCheckIn;
	Button radCheckOut;
	Combo cmbSelectCourse;
	Combo cmbSelectKitType;
	Combo cmbKitSerialNumber;
	Button btnCheckOut;
	Button btnCheckIn;
	Display display;
	Shell shlEezonCheck;
	private Group grpByCheckOut;
	private Group grpByCheckIn;
	
	TableColumn tblColumn;
	
	// Hello world

	public TableColumn getTblColumn() {
		return tblColumn;
	}

	public void setTblColumn(TableColumn tblColumn) {
		this.tblColumn = tblColumn;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			UpdateCheckInCheckOutView window = new UpdateCheckInCheckOutView();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	// Getters and setters
	
	public Group getGrpByCheckOut() {
		return grpByCheckOut;
	}

	public void setGrpByCheckOut(Group grpByCheckOut) {
		this.grpByCheckOut = grpByCheckOut;
	}

	public Group getGrpByCheckIn() {
		return grpByCheckIn;
	}

	public void setGrpByCheckIn(Group grpByCheckIn) {
		this.grpByCheckIn = grpByCheckIn;
	}

	/**
	 * Open the window.
	 */
	public UpdateCheckInCheckOutView() {
		display = Display.getDefault();
		shlEezonCheck = new Shell();
		shlEezonCheck.setSize(1132, 723);
		shlEezonCheck.setText("EEZON - Check IN/Check OUT");
		
		btnHome = new Button(shlEezonCheck, SWT.NONE);
		btnHome.setBounds(44, 27, 105, 35);
		btnHome.setText("HOME");
		
		btnBack = new Button(shlEezonCheck, SWT.NONE);
		btnBack.setBounds(943, 27, 105, 35);
		btnBack.setText("BACK");
		
		txtEmail = new Text(shlEezonCheck, SWT.BORDER);
		txtEmail.setText("Enter Email ID");
		txtEmail.setToolTipText("Enter Email ID");
		txtEmail.setBounds(443, 78, 162, 31);
		
		group = new Group(shlEezonCheck, SWT.NONE);
		group.setBounds(456, 115, 149, 81);
		
		radCheckIn = new Button(group, SWT.RADIO);
		radCheckIn.setBounds(10, 23, 133, 25);
		radCheckIn.setText("Check IN");
		radCheckIn.setData(new RadCheckInAction());
		
		radCheckOut = new Button(group, SWT.RADIO);
		radCheckOut.setBounds(10, 54, 133, 25);
		radCheckOut.setText("Check OUT");
		radCheckOut.setData(new RadCheckOutAction());
		
		grpByCheckOut = new Group(shlEezonCheck, SWT.NONE);
		grpByCheckOut.setBounds(409, 205, 234, 224);
		
		cmbSelectCourse = new Combo(grpByCheckOut, SWT.NONE);
		cmbSelectCourse.setBounds(34, 25, 162, 33);
		cmbSelectCourse.setItems(new String[] {"Embedded System Design", "Computer Vision", "Real Time Embedded Systems", "Computer Architecture", "Programmable System on Chip", "Internet of Things", "Low Power Embedded Design Techniques"});
		cmbSelectCourse.setText("Select Course");
		
		cmbSelectKitType = new Combo(grpByCheckOut, SWT.NONE);
		cmbSelectKitType.setItems(new String[] {"Raspberry II", "Raspberry Pi III", "Beagle Bone", "Leopard Gecko", "SAM B11", "DE1SOC", "JETSON", "MAX 10"});
		cmbSelectKitType.setBounds(34, 74, 162, 33);
		cmbSelectKitType.setText("Select Kit Type");
		
		cmbKitSerialNumber = new Combo(grpByCheckOut, SWT.NONE);
		cmbKitSerialNumber.setItems(new String[] {"Ras1", "Ras2", "Ras3"});
		cmbKitSerialNumber.setBounds(3, 128, 228, 33);
		cmbKitSerialNumber.setText("Select Kit Serial Number");
		
		btnCheckOut = new Button(grpByCheckOut, SWT.NONE);
		btnCheckOut.setBounds(60, 186, 105, 35);
		btnCheckOut.setText("Check OUT");
		btnCheckOut.setData(new BtnCheckOutAction());
		
		grpByCheckIn = new Group(shlEezonCheck, SWT.NONE);
		grpByCheckIn.setBounds(81, 439, 929, 218);
		
		tblCinCoutDetails = new Table(grpByCheckIn, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		tblCinCoutDetails.setBounds(3, 25, 916, 142);
		tblCinCoutDetails.setHeaderVisible(true);
		tblCinCoutDetails.setLinesVisible(true);
		
		btnCheckIn = new Button(grpByCheckIn, SWT.NONE);
		btnCheckIn.setBounds(392, 173, 105, 35);
		btnCheckIn.setText("Check IN");
		btnCheckIn.setData(new BtnCheckInAction());
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(106);
		tblColumn.setText("SerialNum");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(114);
		tblColumn.setText("CheckInDate");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(130);
		tblColumn.setText("CheckOutDate");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(118);
		tblColumn.setText("CourseName");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(99);
		tblColumn.setText("KitPenalty");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(73);
		tblColumn.setText("KitType");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(128);
		tblColumn.setText("StudentEmail");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(235);
		tblColumn.setText("StudentName");

	}

	public Button getRadCheckIn() {
		return radCheckIn;
	}

	public void setRadCheckIn(Button radCheckIn) {
		this.radCheckIn = radCheckIn;
	}

	public Button getRadCheckOut() {
		return radCheckOut;
	}

	public void setRadCheckOut(Button radCheckOut) {
		this.radCheckOut = radCheckOut;
	}

	public Text getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(Text txtEmail) {
		this.txtEmail = txtEmail;
	}

	public Table getTblCinCoutDetails() {
		return tblCinCoutDetails;
	}

	public void setTblCinCoutDetails(Table tblCinCoutDetails) {
		this.tblCinCoutDetails = tblCinCoutDetails;
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

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Button getBtnCheckIn() {
		return btnCheckIn;
	}

	public void setBtnCheckIn(Button btnCheckIn) {
		this.btnCheckIn = btnCheckIn;
	}

	public Button getBtnCheckOut() {
		return btnCheckOut;
	}

	public void setBtnCheckOut(Button btnCheckOut) {
		this.btnCheckOut = btnCheckOut;
	}

	public Combo getCmbSelectCourse() {
		return cmbSelectCourse;
	}

	public void setCmbSelectCourse(Combo cmbSelectCourse) {
		this.cmbSelectCourse = cmbSelectCourse;
	}

	public Combo getCmbSelectKitType() {
		return cmbSelectKitType;
	}

	public void setCmbSelectKitType(Combo cmbSelectKitType) {
		this.cmbSelectKitType = cmbSelectKitType;
	}

	public Combo getCmbKitSerialNumber() {
		return cmbKitSerialNumber;
	}

	public void setCmbKitSerialNumber(Combo cmbKitSerialNumber) {
		this.cmbKitSerialNumber = cmbKitSerialNumber;
	}

	public Button getBtnCheckOut_1() {
		return btnCheckOut;
	}

	public void setBtnCheckOut_1(Button btnCheckOut_1) {
		this.btnCheckOut = btnCheckOut_1;
	}


	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Shell getShlEezonCheck() {
		return shlEezonCheck;
	}

	public void setShlEezonCheck(Shell shlEezonCheck) {
		this.shlEezonCheck = shlEezonCheck;
	}
}
