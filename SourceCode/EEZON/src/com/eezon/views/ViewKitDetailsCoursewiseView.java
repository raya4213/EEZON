package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.eezon.viewkitdetails.stratergy.BtnBackAction;
import com.eezon.viewkitdetails.stratergy.BtnHomeAction;
import com.eezon.viewkitdetails.stratergy.BtnLogoutAction;
import com.eezon.viewkitdetails.stratergy.BtnViewAction;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;



public class ViewKitDetailsCoursewiseView {
	private Table tblViewDetails;
	private Button btnHome;
	private Display display;
	private Button btnBack;
	private Combo cmbSelectSem;
	private Combo cmbSelectYear;
	private Combo cmbSelectCourse;
	private Combo cmbSelectKitType;
	Button btnView;
	Shell shlEezonView;
	TableColumn tblColumn;
	private Button btnLogout;
	private Label lblNewLabel;
	private Label lblSemester;
	private Label lblCourse;
	private Label lblKittype;
	
	public Table getTblViewDetails() {
		return tblViewDetails;
	}



	public Button getBtnView() {
		return btnView;
	}



	public void setBtnView(Button btnView) {
		this.btnView = btnView;
	}



	public Shell getShlEezonView() {
		return shlEezonView;
	}



	public void setShlEezonView(Shell shlEezonView) {
		this.shlEezonView = shlEezonView;
	}



	public void setTblViewDetails(Table tblViewDetails) {
		this.tblViewDetails = tblViewDetails;
	}



	public Button getBtnHome() {
		return btnHome;
	}



	public void setBtnHome(Button btnHome) {
		this.btnHome = btnHome;
	}



	public Display getDisplay() {
		return display;
	}



	public void setDisplay(Display display) {
		this.display = display;
	}



	public Button getBtnBack() {
		return btnBack;
	}



	public void setBtnBack(Button btnBack) {
		this.btnBack = btnBack;
	}



	public Combo getCmbSelectSem() {
		return cmbSelectSem;
	}



	public void setCmbSelectSem(Combo cmbSelectSem) {
		this.cmbSelectSem = cmbSelectSem;
	}



	public Combo getCmbSelectYear() {
		return cmbSelectYear;
	}



	public void setCmbSelectYear(Combo cmbSelectYear) {
		this.cmbSelectYear = cmbSelectYear;
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



	/**
	 * Open the window.
	 */
	public ViewKitDetailsCoursewiseView()
	{
		display = Display.getDefault();
		shlEezonView = new Shell();
		shlEezonView.setSize(888, 545);
		shlEezonView.setText("EEZON - View Kit Details");
		shlEezonView.setLocation(450,200);
		
		
		btnHome = new Button(shlEezonView, SWT.NONE);
		btnHome.setBounds(10, 10, 75, 25);
		btnHome.setText("Home");
		btnHome.setData(new BtnHomeAction());
		
		btnBack = new Button(shlEezonView, SWT.NONE);
		btnBack.setBounds(404, 10, 75, 25);
		btnBack.setText("Back");
		btnBack.setData(new BtnBackAction());
		
		cmbSelectSem = new Combo(shlEezonView, SWT.NONE);
		cmbSelectSem.setItems(new String[] {"Fall", "Spring", "Summer"});
		cmbSelectSem.setBounds(339, 129, 215, 23);
		
		cmbSelectYear = new Combo(shlEezonView, SWT.NONE);
		cmbSelectYear.setItems(new String[] {"2015", "2016", "2017"});
		cmbSelectYear.setBounds(339, 80, 215, 23);
		
		cmbSelectCourse = new Combo(shlEezonView, SWT.NONE);
		cmbSelectCourse.setItems(new String[] {"Embedded System Design", "Computer Vision", "Real Time Embedded Systems", "Computer Architecture", "Programmable System on Chip", "Internet of Things", "Low Power Embedded Design Techniques"});
		cmbSelectCourse.setBounds(339, 180, 215, 23);
		
		cmbSelectKitType = new Combo(shlEezonView, SWT.NONE);
		cmbSelectKitType.setItems(new String[] {"Raspberry II", "Raspberry Pi III", "Beagle Bone", "Leopard Gecko", "SAM B11", "DE1SOC", "JETSON", "MAX 10"});
		cmbSelectKitType.setBounds(339, 233, 215, 23);
		
		tblViewDetails = new Table(shlEezonView, SWT.BORDER | SWT.FULL_SELECTION);
		tblViewDetails.setBounds(30, 349, 812, 127);
		tblViewDetails.setHeaderVisible(true);
		tblViewDetails.setLinesVisible(true);
		
		btnView = new Button(shlEezonView, SWT.NONE);
		btnView.setBounds(404, 297, 75, 25);
		btnView.setText("View");
		btnView.setData(new BtnViewAction());
		
		tblColumn = new TableColumn(tblViewDetails, SWT.NULL);
		tblColumn.setWidth(81);
		tblColumn.setText("SerialNum");
		
		tblColumn = new TableColumn(tblViewDetails, SWT.NULL);
		tblColumn.setWidth(101);
		tblColumn.setText("CheckInDate");
		
		tblColumn = new TableColumn(tblViewDetails, SWT.NULL);
		tblColumn.setWidth(109);
		tblColumn.setText("CheckOutDate");
		
		tblColumn = new TableColumn(tblViewDetails, SWT.NULL);
		tblColumn.setWidth(116);
		tblColumn.setText("CourseName");
		
		/*tblColumn = new TableColumn(tblViewDetails, SWT.NULL);
		tblColumn.setWidth(93);
		tblColumn.setText("KitPenalty");*/
		
		tblColumn = new TableColumn(tblViewDetails, SWT.NULL);
		tblColumn.setWidth(88);
		tblColumn.setText("KitType");
		
		tblColumn = new TableColumn(tblViewDetails, SWT.NULL);
		tblColumn.setWidth(113);
		tblColumn.setText("StudentEmail");
		
		tblColumn = new TableColumn(tblViewDetails, SWT.NULL);
		tblColumn.setWidth(276);
		tblColumn.setText("StudentName");
		
		btnLogout = new Button(shlEezonView, SWT.NONE);
		btnLogout.setText("LogOut");
		btnLogout.setBounds(767, 10, 75, 25);
		btnLogout.setData(new BtnLogoutAction());
		
		lblNewLabel = new Label(shlEezonView, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblNewLabel.setBounds(239, 79, 55, 25);
		lblNewLabel.setText("Year");
		
		lblSemester = new Label(shlEezonView, SWT.NONE);
		lblSemester.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblSemester.setText("Semester");
		lblSemester.setBounds(239, 128, 83, 25);
		
		lblCourse = new Label(shlEezonView, SWT.NONE);
		lblCourse.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblCourse.setText("Course");
		lblCourse.setBounds(239, 183, 70, 25);
		
		lblKittype = new Label(shlEezonView, SWT.NONE);
		lblKittype.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblKittype.setText("KitType");
		lblKittype.setBounds(239, 233, 70, 28);

	}



	public TableColumn getTblColumn() {
		return tblColumn;
	}



	public void setTblColumn(TableColumn tblColumn) {
		this.tblColumn = tblColumn;
	}



	public Button getBtnLogout() {
		return btnLogout;
	}



	public void setBtnLogout(Button btnLogout) {
		this.btnLogout = btnLogout;
	}
}
