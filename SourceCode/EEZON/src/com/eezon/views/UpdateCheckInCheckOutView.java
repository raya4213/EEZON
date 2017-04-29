package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Group;

public class UpdateCheckInCheckOutView {
	private Text txtEmail;
	private Table tblCinCoutDetails;
	Button btnHome;
	Button btnBack;
	Group group;
	Button btnCheckIn;
	Button btnCheckOut;
	Combo cmbSelectCourse;
	Combo cmbSelectKitType;
	Combo cmbKitSerialNumber;
	Button btnCheckOut_1;
	Button btnCheckIn_1;
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
		shlEezonCheck.setSize(1132, 684);
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
		txtEmail.setBounds(443, 94, 162, 31);
		
		group = new Group(shlEezonCheck, SWT.NONE);
		group.setBounds(456, 131, 149, 81);
		
		btnCheckIn = new Button(group, SWT.RADIO);
		btnCheckIn.setBounds(10, 23, 133, 25);
		btnCheckIn.setText("Check IN");
		
		btnCheckOut = new Button(group, SWT.RADIO);
		btnCheckOut.setBounds(10, 54, 133, 25);
		btnCheckOut.setText("Check OUT");
		
		grpByCheckOut = new Group(shlEezonCheck, SWT.NONE);
		grpByCheckOut.setBounds(409, 221, 234, 224);
		
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
		
		btnCheckOut_1 = new Button(grpByCheckOut, SWT.NONE);
		btnCheckOut_1.setBounds(60, 186, 105, 35);
		btnCheckOut_1.setText("Check OUT");
		
		grpByCheckIn = new Group(shlEezonCheck, SWT.NONE);
		grpByCheckIn.setBounds(253, 455, 526, 135);
		
		tblCinCoutDetails = new Table(grpByCheckIn, SWT.BORDER | SWT.FULL_SELECTION);
		tblCinCoutDetails.setBounds(3, 25, 520, 61);
		tblCinCoutDetails.setHeaderVisible(true);
		tblCinCoutDetails.setLinesVisible(true);
		
		btnCheckIn_1 = new Button(grpByCheckIn, SWT.NONE);
		btnCheckIn_1.setBounds(214, 97, 105, 35);
		btnCheckIn_1.setText("Check IN");
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(70);
		tblColumn.setText("SerialNum");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(79);
		tblColumn.setText("CheckInDate");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(89);
		tblColumn.setText("CheckOutDate");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(83);
		tblColumn.setText("CourseName");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(65);
		tblColumn.setText("KitPenalty");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(51);
		tblColumn.setText("KitType");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(86);
		tblColumn.setText("StudentEmail");
		
		tblColumn = new TableColumn(tblCinCoutDetails, SWT.NULL);
		tblColumn.setWidth(86);
		tblColumn.setText("StudentName");

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
		return btnCheckOut_1;
	}

	public void setBtnCheckOut_1(Button btnCheckOut_1) {
		this.btnCheckOut_1 = btnCheckOut_1;
	}

	public Button getBtnCheckIn_1() {
		return btnCheckIn_1;
	}

	public void setBtnCheckIn_1(Button btnCheckIn_1) {
		this.btnCheckIn_1 = btnCheckIn_1;
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
