package com.eezon.views;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.models.CheckInExtensionRequest;
import com.eezon.models.Request;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.observer.IReqObserver;
import com.eezon.requests.strategy.CheckInExtensionBackBtnAction;
import com.eezon.requests.strategy.CheckInExtensionLogoutBtnAction;
import com.eezon.requests.strategy.CheckInExtensionReqBtnAction;

public class CheckInExtensionReqView implements IReqObserver{
	
	private Combo cmbSelectTimeFrame;
	private Table tblReqDetails;
	Button btnBack;
	Combo cmbSelectKit;
	Combo cmbSelectCourse;
	Button btnRequest;
	Display display;
	Shell shlEezon;
	TableColumn tblColumn;
	private Button btnLogout;
	
	/**
	 * Open the window.
	 */
	public CheckInExtensionReqView() {
		display = Display.getDefault();
		shlEezon = new Shell();
		shlEezon.setSize(1015, 560);
		shlEezon.setText("EEZON - Request for Check IN Extension");
		shlEezon.setLocation(450,200);
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setText("Back");
		btnBack.setBounds(10, 10, 75, 25);
		btnBack.setData(new CheckInExtensionBackBtnAction());
		
		cmbSelectKit = new Combo(shlEezon, SWT.NONE);
		cmbSelectKit.setItems(new String[] {"10000-Raspberry Pi", "10010-Beaglebone", "10020-Leopard Gecko", "10040-Arduino"});
		cmbSelectKit.setBounds(279, 278, 268, 23);
		cmbSelectKit.setText("Select Kit");
		
		cmbSelectTimeFrame = new Combo(shlEezon, SWT.NONE);
		cmbSelectTimeFrame.setItems(new String[] {"15", "30", "60"});
		cmbSelectTimeFrame.setBounds(279, 330, 268, 23);
		cmbSelectTimeFrame.setText("Select Time Frame (Days)");
		
		cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setItems(new String[] {"Embedded System Design", "Internet of Things", "Real Time Embedded Systems", "Computer Architecture", "Computer Vision"});
		cmbSelectCourse.setBounds(279, 224, 268, 23);
		cmbSelectCourse.setText("Select Course");
		
		btnRequest = new Button(shlEezon, SWT.NONE);
		btnRequest.setText("Request");
		btnRequest.setBounds(351, 383, 91, 30);
		btnRequest.setData(new CheckInExtensionReqBtnAction());
		
		tblReqDetails = new Table(shlEezon, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		tblReqDetails.setBounds(41, 57, 912, 130);
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
  		tblColumn.setWidth(104);
  		tblColumn.setText("KitSerialNum");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(104);
  		tblColumn.setText("KitType");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(105);
  		tblColumn.setText("Num of Days");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(179);
  		tblColumn.setText("CheckOutDate");
  		
  		tblColumn = new TableColumn(tblReqDetails, SWT.NULL);
  		tblColumn.setWidth(245);
  		tblColumn.setText("Course Name");
  		
  		btnLogout = new Button(shlEezon, SWT.NONE);
  		btnLogout.setText("Logout");
  		btnLogout.setBounds(878, 10, 75, 25);
  		btnLogout.setData(new CheckInExtensionLogoutBtnAction());

	}
	
	public Button getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(Button btnLogout) {
		this.btnLogout = btnLogout;
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

	public Combo getCmbSelectTimeFrame() {
		return cmbSelectTimeFrame;
	}

	public void setCmbSelectTimeFrame(Combo cmbSelectTimeFrame) {
		this.cmbSelectTimeFrame = cmbSelectTimeFrame;
	}

	public Table getTable() {
		return tblReqDetails;
	}

	public void setTable(Table table) {
		this.tblReqDetails = table;
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

	@Override
	public void updateDetailsTable(Request req) {
		// TODO Auto-generated method stub
		CheckInExtensionRequest itemReq = (CheckInExtensionRequest) req;
		TableItem item = new TableItem(tblReqDetails, 0);
		item.setText(0, itemReq.getReqId()+"");
        item.setText(1, itemReq.getReqStatus());
        item.setText(2, itemReq.getRequestKit().getKitSerialNum());
        item.setText(3, itemReq.getRequestKit().getKitType());
        item.setText(4, itemReq.getNumDays()+"");
        item.setText(5, itemReq.getRequestKit().getKitCheckOutDate()+"");
        item.setText(6, itemReq.getRequestKit().getKitCourse().getCourseName());
	}
}

