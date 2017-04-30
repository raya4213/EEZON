package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;

public class UnavailableItemReqView {
	private Text EnterName;
	private Text EnterLink;
	private Text enterCost;

	Button btnHome;
	Button btnBack;
	Combo cmbSelectCourse;
	Combo cmbSelectItemType;
	Combo comNumOfItems;
	Button btnRequest;
	Display display;
	Shell shlEezon;
	Table tblReqDetails;
	TableColumn tblColumn;
	
	/**
	 * Open the window.
	 */
	public UnavailableItemReqView() {
		display = Display.getDefault();
		shlEezon = new Shell();
		shlEezon.setToolTipText("Enter Cost");
		shlEezon.setSize(1094, 679);
		shlEezon.setText("EEZON - Request for Unavailable Items - Student  ");
		
		btnHome = new Button(shlEezon, SWT.NONE);
		btnHome.setBounds(76, 36, 105, 35);
		btnHome.setText("HOME");
		btnHome.setData("btnHome");
		
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(209, 36, 105, 35);
		btnBack.setText("BACK");
		btnBack.setData("btnBack");
		
		cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setItems(new String[] {"Embedded System Design", "Real Time Embedded Systems", "Internet of Things", "Advanced Computer Architecture", "Computer Vision"});
		cmbSelectCourse.setBounds(471, 232, 215, 28);
		cmbSelectCourse.setText("Select Course");
		
		cmbSelectItemType = new Combo(shlEezon, SWT.NONE);
		cmbSelectItemType.setItems(new String[] {"Dev Kit", "Component"});
		cmbSelectItemType.setBounds(471, 284, 215, 28);
		cmbSelectItemType.setText("Select Item Type");
		
		EnterName = new Text(shlEezon, SWT.BORDER);
		EnterName.setText("Enter Name");
		EnterName.setToolTipText("Enter Name");
		EnterName.setBounds(468, 348, 105, 31);
		
		EnterLink = new Text(shlEezon, SWT.BORDER);
		EnterLink.setText("Enter Link");
		EnterLink.setToolTipText("Enter Link");
		EnterLink.setBounds(468, 396, 105, 31);
		
		enterCost = new Text(shlEezon, SWT.BORDER | SWT.MULTI);
		enterCost.setText("Enter Cost");
		enterCost.setToolTipText("Enter Cost");
		enterCost.setBounds(468, 447, 105, 31);
		
		comNumOfItems = new Combo(shlEezon, SWT.NONE);
		comNumOfItems.setItems(new String[] {"1", "2", "3", "4", "5"});
		comNumOfItems.setBounds(469, 500, 151, 28);
		comNumOfItems.setText("Number of items");
		
		btnRequest = new Button(shlEezon, SWT.NONE);
		btnRequest.setBounds(468, 561, 105, 35);
		btnRequest.setText("REQUEST");
	    btnRequest.setData("btnRequest");
	    
	    tblReqDetails = new Table(shlEezon, SWT.BORDER | SWT.FULL_SELECTION);
	    tblReqDetails.setBounds(134, 97, 835, 114);
	    tblReqDetails.setHeaderVisible(true);
	    tblReqDetails.setLinesVisible(true);
	    
	    //Creating all the columns inside the table for viewing 
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(70);
  		tblColumn.setText("Req Id");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(97);
  		tblColumn.setText("Req Status");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(165);
  		tblColumn.setText("UnavailableItem Type");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(154);
  		tblColumn.setText("Name");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(155);
  		tblColumn.setText("Num of Components");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(65);
  		tblColumn.setText("Cost");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(125);
  		tblColumn.setText("Course Name");
		
	}




	public Table getTblReqDetails() {
		return tblReqDetails;
	}




	public void setTblReqDetails(Table tblReqDetails) {
		this.tblReqDetails = tblReqDetails;
	}




	public TableColumn getTblColumn() {
		return tblColumn;
	}




	public void setTblColumn(TableColumn tblColumn) {
		this.tblColumn = tblColumn;
	}




	public Text getEnterName() {
		return EnterName;
	}


	public void setEnterName(Text enterName) {
		EnterName = enterName;
	}


	public Text getEnterLink() {
		return EnterLink;
	}


	public void setEnterLink(Text enterLink) {
		EnterLink = enterLink;
	}


	public Text getEnterCost() {
		return enterCost;
	}


	public void setEnterCost(Text enterCost) {
		this.enterCost = enterCost;
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


	public Combo getCmbSelectItemType() {
		return cmbSelectItemType;
	}


	public void setCmbSelectItemType(Combo cmbSelectItemType) {
		this.cmbSelectItemType = cmbSelectItemType;
	}


	public Combo getComNumOfItems() {
		return comNumOfItems;
	}


	public void setComNumOfItems(Combo comNumOfItems) {
		this.comNumOfItems = comNumOfItems;
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
