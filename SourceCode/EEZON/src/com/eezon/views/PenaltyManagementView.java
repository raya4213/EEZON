package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;



import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

import com.eezon.models.Kit;
import com.eezon.observer.IKitObserver;
import com.eezon.penalty.strategy.BtnBackAction;
import com.eezon.penalty.strategy.BtnByCourseAction;
import com.eezon.penalty.strategy.BtnByEmailAction;
import com.eezon.penalty.strategy.BtnHomeAction;
import com.eezon.penalty.strategy.BtnLogoutAction;
import com.eezon.penalty.strategy.BtnOverrideAction;
import com.eezon.penalty.strategy.BtnViewAction;
import com.eezon.penalty.strategy.RadOverrideAction;
import com.eezon.penalty.strategy.RadViewAction;

import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Group;

import org.eclipse.swt.widgets.TableItem;

import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Label;


public class PenaltyManagementView implements IKitObserver{
	 
	 Button btnHome;
	 Button btnBack;
	 Group grpByViewOverride;
	 Button radView;
	 Button radOverride;
	 Group grpByCourseEmail;
	 Button btnByCourse;
	 Button btnByEmail;
	 Group grpByCourse;
	 Combo cmbSelectSem;
	 Combo cmbSelectYear;
	 Combo cmbSelectCourse;
	 Group grpByEmail;
	 Text txtEmailId;
	 Table tblViewPenalties;
	 Button btnOverride;
	 Button btnView;
	 
	 Display display;
	 Shell shlPenaltyManagement;
	 TableColumn tblColumn;
	 Button btnLogout;
	 private Label lblSelectSem;
	 private Label lblYear;
	 private Label lblCourse;
	 private Label lblEmailId;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	/*public static void main(String[] args) {
		try {
			PenaltyManagementView window = new PenaltyManagementView();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Open the window.
	 */
	public PenaltyManagementView() {
		
		display = Display.getDefault();
		shlPenaltyManagement = new Shell();
		shlPenaltyManagement.setSize(690, 621);
		shlPenaltyManagement.setText("Penalty Management");
		shlPenaltyManagement.setLocation(350, 120);
		
		btnHome = new Button(shlPenaltyManagement, SWT.NONE);
		btnHome.setText("Home");
		btnHome.setBounds(10, 10, 75, 25);
		btnHome.setData(new BtnHomeAction());
		
	    btnBack = new Button(shlPenaltyManagement, SWT.NONE);
		btnBack.setBounds(305, 10, 75, 25);
		btnBack.setText("Back");
		btnBack.setData(new BtnBackAction());
		
		grpByViewOverride = new Group(shlPenaltyManagement, SWT.NONE);
		grpByViewOverride.setBounds(305, 65, 96, 56);
		
		radView = new Button(grpByViewOverride, SWT.RADIO);
		radView.setBounds(3, 15, 90, 16);
		radView.setText("View");
		radView.setData(new RadViewAction());
		
		radOverride = new Button(grpByViewOverride, SWT.RADIO);
		radOverride.setBounds(3, 37, 90, 16);
		radOverride.setText("Override");
		radOverride.setData("radOverride");
		radOverride.setData(new RadOverrideAction());
		
		grpByCourseEmail = new Group(shlPenaltyManagement, SWT.NONE);
		grpByCourseEmail.setBounds(302, 136, 96, 56);
		
		btnByCourse = new Button(grpByCourseEmail, SWT.RADIO);
		btnByCourse.setBounds(3, 15, 90, 16);
		btnByCourse.setText("By Course");
		btnByCourse.setData(new BtnByCourseAction());
		
		btnByEmail = new Button(grpByCourseEmail, SWT.RADIO);
		btnByEmail.setBounds(3, 37, 90, 16);
		btnByEmail.setText("By Email");
		btnByEmail.setData(new BtnByEmailAction());
		
		grpByCourse = new Group(shlPenaltyManagement, SWT.NONE);
		grpByCourse.setBounds(103, 198, 386, 124);
		
		cmbSelectSem = new Combo(grpByCourse, SWT.NONE);
		cmbSelectSem.setItems(new String[] {"Fall", "Spring", "Summer"});
		cmbSelectSem.setBounds(109, 15, 264, 23);
		
		lblSelectSem = new Label(grpByCourse, SWT.NONE);
		lblSelectSem.setLocation(10, 18);
		lblSelectSem.setSize(55, 15);
		lblSelectSem.setText("Semester");
		
		cmbSelectYear = new Combo(grpByCourse, SWT.NONE);
		cmbSelectYear.setItems(new String[] {"2015", "2016", "2017"});
		cmbSelectYear.setBounds(109, 54, 267, 23);
		
		cmbSelectCourse = new Combo(grpByCourse, SWT.NONE);
		cmbSelectCourse.setItems(new String[] {"Embedded System Design", "Computer Vision", "Real Time Embedded Systems", "Computer Architecture", "Programmable System on Chip", "Internet of Things", "Low Power Embedded Design Techniques"});
		cmbSelectCourse.setBounds(108, 91, 268, 23);
		
		lblYear = new Label(grpByCourse, SWT.NONE);
		lblYear.setLocation(10, 58);
		lblYear.setSize(55, 15);
		lblYear.setText("Year");
		
		lblCourse = new Label(grpByCourse, SWT.NONE);
		lblCourse.setLocation(10, 94);
		lblCourse.setSize(55, 15);
		lblCourse.setText("Course");
		
		grpByEmail = new Group(shlPenaltyManagement, SWT.NONE);
		grpByEmail.setBounds(103, 328, 386, 39);
		
		txtEmailId = new Text(grpByEmail, SWT.BORDER);
		txtEmailId.setBounds(111, 10, 265, 21);
		
		btnView = new Button(shlPenaltyManagement, SWT.NONE);
		btnView.setBounds(305, 373, 75, 25);
		btnView.setText("View");
		btnView.setData(new BtnViewAction());
		
		btnOverride = new Button(shlPenaltyManagement, SWT.NONE);
		btnOverride.setBounds(305, 532, 75, 25);
		btnOverride.setText("Override");
		btnOverride.setData(new BtnOverrideAction());
		
		tblViewPenalties = new Table(shlPenaltyManagement, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		tblViewPenalties.setBounds(33, 416, 616, 95);
		tblViewPenalties.setHeaderVisible(true);
		tblViewPenalties.setLinesVisible(true);
		
		//Creating all the columns inside the table for viewing 
		tblColumn = new TableColumn(tblViewPenalties, SWT.NULL);
		tblColumn.setWidth(70);
		tblColumn.setText("SerialNum");
		
		tblColumn = new TableColumn(tblViewPenalties, SWT.NULL);
		tblColumn.setWidth(79);
		tblColumn.setText("CheckInDate");
		
		tblColumn = new TableColumn(tblViewPenalties, SWT.NULL);
		tblColumn.setWidth(89);
		tblColumn.setText("CheckOutDate");
		
		tblColumn = new TableColumn(tblViewPenalties, SWT.NULL);
		tblColumn.setWidth(83);
		tblColumn.setText("CourseName");
		
		tblColumn = new TableColumn(tblViewPenalties, SWT.NULL);
		tblColumn.setWidth(65);
		tblColumn.setText("KitPenalty");
		
		tblColumn = new TableColumn(tblViewPenalties, SWT.NULL);
		tblColumn.setWidth(51);
		tblColumn.setText("KitType");
		
		tblColumn = new TableColumn(tblViewPenalties, SWT.NULL);
		tblColumn.setWidth(86);
		tblColumn.setText("StudentEmail");
		
		tblColumn = new TableColumn(tblViewPenalties, SWT.NULL);
		tblColumn.setWidth(86);
		tblColumn.setText("StudentName");
		
		btnLogout = new Button(shlPenaltyManagement, SWT.NONE);
		btnLogout.setText("Logout");
		btnLogout.setBounds(549, 10, 75, 25);
		btnLogout.setData(new BtnLogoutAction());
		
		lblEmailId = new Label(shlPenaltyManagement, SWT.NONE);
		lblEmailId.setBounds(116, 347, 55, 15);
		lblEmailId.setText("Email Id");

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

	public Group getGrpByViewOverride() {
		return grpByViewOverride;
	}

	public void setGrpByViewOverride(Group grpByViewOverride) {
		this.grpByViewOverride = grpByViewOverride;
	}

	public Button getRadView() {
		return radView;
	}

	public void setRadView(Button radView) {
		this.radView = radView;
	}

	public Button getRadOverride() {
		return radOverride;
	}

	public void setRadOverride(Button radOverride) {
		this.radOverride = radOverride;
	}

	public Group getGrpByCourseEmail() {
		return grpByCourseEmail;
	}

	public void setGrpByCourseEmail(Group grpByCourseEmail) {
		this.grpByCourseEmail = grpByCourseEmail;
	}

	public Button getBtnByCourse() {
		return btnByCourse;
	}

	public void setBtnByCourse(Button btnByCourse) {
		this.btnByCourse = btnByCourse;
	}

	public Button getBtnByEmail() {
		return btnByEmail;
	}

	public void setBtnByEmail(Button btnByEmail) {
		this.btnByEmail = btnByEmail;
	}

	public Group getGrpByCourse() {
		return grpByCourse;
	}

	public void setGrpByCourse(Group grpByCourse) {
		this.grpByCourse = grpByCourse;
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

	public Group getGrpByEmail() {
		return grpByEmail;
	}

	public void setGrpByEmail(Group grpByEmail) {
		this.grpByEmail = grpByEmail;
	}

	public Text getTxtEmailId() {
		return txtEmailId;
	}

	public void setTxtEmailId(Text txtEmailId) {
		this.txtEmailId = txtEmailId;
	}

	public Table getTblViewPenalties() {
		return tblViewPenalties;
	}

	public void setTblViewPenalties(Table tblViewPenalties) {
		this.tblViewPenalties = tblViewPenalties;
	}

	public Button getBtnOverride() {
		return btnOverride;
	}

	public void setBtnOverride(Button btnOverride) {
		this.btnOverride = btnOverride;
	}

	public Button getBtnView() {
		return btnView;
	}

	public void setBtnView(Button btnView) {
		this.btnView = btnView;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Shell getShlPenaltyManagement() {
		return shlPenaltyManagement;
	}

	public void setShlPenaltyManagement(Shell shlPenaltyManagement) {
		this.shlPenaltyManagement = shlPenaltyManagement;
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

	@Override
	public void updateDetailsTable(Kit kitToUpdate) {
		// TODO Auto-generated method stub
		//this.tblViewPenalties.getIt
		TableItem tblItems[]= tblViewPenalties.getItems();
		for(TableItem tblItem:tblItems){
			if(tblItem.getText(0).equalsIgnoreCase(kitToUpdate.getKitSerialNum())){
				tblItem.setText(4, kitToUpdate.getKitPenalty()+"");
			}
		}
	}

}
