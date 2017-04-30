package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;

public class UnavailableItemReqView {
	private Text text;
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
		
		btnBack = new Button(shlEezon, SWT.NONE);
		btnBack.setBounds(209, 36, 105, 35);
		btnBack.setText("BACK");
		
		text = new Text(shlEezon, SWT.BORDER);
		text.setBounds(242, 103, 596, 75);
		
		cmbSelectCourse = new Combo(shlEezon, SWT.NONE);
		cmbSelectCourse.setBounds(471, 232, 215, 28);
		cmbSelectCourse.setText("Select Course");
		
		cmbSelectItemType = new Combo(shlEezon, SWT.NONE);
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
		comNumOfItems.setBounds(469, 500, 151, 28);
		comNumOfItems.setText("Number of items");
		
		btnRequest = new Button(shlEezon, SWT.NONE);
		btnRequest.setBounds(468, 561, 105, 35);
		btnRequest.setText("REQUEST");

		
	}


	public Text getText() {
		return text;
	}


	public void setText(Text text) {
		this.text = text;
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
