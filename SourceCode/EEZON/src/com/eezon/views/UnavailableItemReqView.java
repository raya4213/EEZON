package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import com.eezon.models.CheckInExtensionRequest;
import com.eezon.models.Request;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.observer.IReqObserver;
import com.eezon.requests.strategy.UnavailableItemBackBtnAction;
import com.eezon.requests.strategy.UnavailableItemLogoutBtnAction;
import com.eezon.requests.strategy.UnavailableItemReqBtnAction;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class UnavailableItemReqView implements IReqObserver {
	private Text EnterName;
	private Text EnterLink;
	private Text enterCost;
	Button btnBack;
	Combo cmbSelectCourse;
	Combo cmbSelectItemType;
	Combo comNumOfItems;
	Button btnRequest;
	Display display;
	Shell shlEezon;
	Table tblReqDetails;
	TableColumn tblColumn;
	Button btnLogout;
	private Label lblCourse;
	private Label lblItemType;
	private Label lblItemName;
	private Label lblItemLink;
	private Label lblItemCost;
	private Label lblNumberOfItems;
	

	/**
	 * Open the window.
	 */
	public UnavailableItemReqView() {
		display = Display.getDefault();
		shlEezon = new Shell();
		shlEezon.setToolTipText("Enter Cost");
		shlEezon.setSize(1094, 679);
		shlEezon.setLocation(450,200);
		shlEezon.setText("EEZON - Request for Unavailable Items  ");
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(39, 36, 105, 35);
		btnBack.setText("Back");
		btnBack.setData(new UnavailableItemBackBtnAction());
		
		cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setItems(new String[] {"Embedded System Design", "Real Time Embedded Systems", "Internet of Things", "Advanced Computer Architecture", "Computer Vision"});
		cmbSelectCourse.setBounds(471, 232, 215, 28);
		
		cmbSelectItemType = new Combo(shlEezon, SWT.NONE);
		cmbSelectItemType.setItems(new String[] {"Dev Kit", "Component"});
		cmbSelectItemType.setBounds(471, 284, 215, 28);
		
		EnterName = new Text(shlEezon, SWT.BORDER);
		EnterName.setToolTipText("Enter Name");
		EnterName.setBounds(468, 348, 105, 31);
		
		EnterLink = new Text(shlEezon, SWT.BORDER);
		EnterLink.setToolTipText("Enter Link");
		EnterLink.setBounds(468, 396, 105, 31);
		
		enterCost = new Text(shlEezon, SWT.BORDER | SWT.MULTI);
		enterCost.setToolTipText("Enter Cost");
		enterCost.setBounds(468, 447, 105, 31);
		
		comNumOfItems = new Combo(shlEezon, SWT.NONE);
		comNumOfItems.setItems(new String[] {"1", "2", "3", "4", "5"});
		comNumOfItems.setBounds(469, 500, 151, 28);
		
		btnRequest = new Button(shlEezon, SWT.NONE);
		btnRequest.setText("Request");
		btnRequest.setBounds(468, 561, 105, 35);
	    btnRequest.setData(new UnavailableItemReqBtnAction());
	    
	    tblReqDetails = new Table(shlEezon, SWT.BORDER | SWT.FULL_SELECTION);
	    tblReqDetails.setBounds(134, 97, 816, 114);
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
  		tblColumn.setWidth(94);
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
  		
  		btnLogout = new Button(shlEezon, SWT.NONE);
  		btnLogout.setText("Logout");
  		btnLogout.setBounds(944, 36, 105, 35);
  		btnLogout.setData(new UnavailableItemLogoutBtnAction());
  		
  		lblCourse = new Label(shlEezon, SWT.NONE);
  		lblCourse.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
  		lblCourse.setBounds(349, 240, 91, 20);
  		lblCourse.setText("Course");
  		
  		lblItemType = new Label(shlEezon, SWT.NONE);
  		lblItemType.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
  		lblItemType.setText("Item Type");
  		lblItemType.setBounds(349, 287, 91, 25);
  		
  		lblItemName = new Label(shlEezon, SWT.NONE);
  		lblItemName.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
  		lblItemName.setText("Item Name");
  		lblItemName.setBounds(349, 351, 104, 28);
  		
  		lblItemLink = new Label(shlEezon, SWT.NONE);
  		lblItemLink.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
  		lblItemLink.setText("Item Link");
  		lblItemLink.setBounds(349, 399, 104, 28);
  		
  		lblItemCost = new Label(shlEezon, SWT.NONE);
  		lblItemCost.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
  		lblItemCost.setText("Item Cost");
  		lblItemCost.setBounds(349, 450, 104, 28);
  		
  		lblNumberOfItems = new Label(shlEezon, SWT.NONE);
  		lblNumberOfItems.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
  		lblNumberOfItems.setText("Number of \r\nitems");
  		lblNumberOfItems.setBounds(349, 503, 104, 50);
		
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

	public Button getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(Button btnLogout) {
		this.btnLogout = btnLogout;
	}


	@Override
	public void updateDetailsTable(Request req) {
		// TODO Auto-generated method stub
		UnavailableItemRequest itemReq = (UnavailableItemRequest) req;
		TableItem item = new TableItem(tblReqDetails, SWT.NULL);
        item.setText(0, itemReq.getReqId()+"");
        item.setText(1, itemReq.getReqStatus());
        item.setText(2, itemReq.getUnavailableItem().getUnavailableItemType());
        item.setText(3, itemReq.getUnavailableItem().getName());
        item.setText(4, itemReq.getUnavailableItem().getNumComponents()+"");
        item.setText(5, itemReq.getUnavailableItem().getCost()+"");
        item.setText(6, itemReq.getUnavailableItem().getRequestForCourse().getCourseName());
	}
}
