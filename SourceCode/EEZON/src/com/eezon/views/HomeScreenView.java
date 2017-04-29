package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;

public class HomeScreenView {

	Display display;
	Shell shlHome;
	Button btnRequestsView;
	Button btnMyCINCOUTView;
	Button btnViewKitDetails;
	Button btnCINCOUTUpdateView;
	Button btnInventory;
	Button btnPenaltyManagement;
	private Button btnAddProfTA;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	/*public static void main(String[] args) {
		try {
			HomeScreenView window = new HomeScreenView();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Open the window.
	 */
	public HomeScreenView(){
	    display = Display.getDefault();
		shlHome = new Shell();
		shlHome.setSize(450, 300);
		shlHome.setText("EEZON - HomeScreen");
		
		btnRequestsView = new Button(shlHome, SWT.NONE);
		btnRequestsView.setBounds(59, 70, 75, 25);
		btnRequestsView.setText("Requests");
		
		btnMyCINCOUTView = new Button(shlHome, SWT.NONE);
		btnMyCINCOUTView.setText("View my Check IN / Check OUT");
		btnMyCINCOUTView.setBounds(10, 115, 188, 25);
		
		btnViewKitDetails = new Button(shlHome, SWT.NONE);
		btnViewKitDetails.setText("View Kit Details");
		btnViewKitDetails.setBounds(42, 166, 108, 25);
		
		btnCINCOUTUpdateView = new Button(shlHome, SWT.NONE);
		btnCINCOUTUpdateView.setText("Check IN / Check OUT");
		btnCINCOUTUpdateView.setBounds(239, 70, 151, 25);
		
		btnInventory = new Button(shlHome, SWT.NONE);
		btnInventory.setText("Inventory");
		btnInventory.setBounds(239, 115, 151, 25);
		
		btnPenaltyManagement = new Button(shlHome, SWT.NONE);
		btnPenaltyManagement.setText("Penalty Management");
		btnPenaltyManagement.setBounds(239, 166, 151, 25);
		
		btnAddProfTA = new Button(shlHome, SWT.NONE);
		btnAddProfTA.setBounds(163, 211, 75, 25);
		btnAddProfTA.setText("AddProfTA");

	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Shell getShlHome() {
		return shlHome;
	}

	public void setShlHome(Shell shlHome) {
		this.shlHome = shlHome;
	}

	public Button getBtnRequestsView() {
		return btnRequestsView;
	}

	public void setBtnRequestsView(Button btnRequestsView) {
		this.btnRequestsView = btnRequestsView;
	}

	public Button getBtnMyCINCOUTView() {
		return btnMyCINCOUTView;
	}

	public void setBtnMyCINCOUTView(Button btnCINCOUTView) {
		this.btnMyCINCOUTView = btnCINCOUTView;
	}

	public Button getBtnViewKitDetails() {
		return btnViewKitDetails;
	}

	public void setBtnViewKitDetails(Button btnViewKitDetails) {
		this.btnViewKitDetails = btnViewKitDetails;
	}

	public Button getBtnCINCOUTUpdateView() {
		return btnCINCOUTUpdateView;
	}

	public void setBtnCINCOUTUpdateView(Button btnCINCOUTUpdateView) {
		this.btnCINCOUTUpdateView = btnCINCOUTUpdateView;
	}

	public Button getBtnInventory() {
		return btnInventory;
	}

	public void setBtnInventory(Button btnInventory) {
		this.btnInventory = btnInventory;
	}

	public Button getBtnPenaltyManagement() {
		return btnPenaltyManagement;
	}

	public void setBtnPenaltyManagement(Button btnPenaltyManagement) {
		this.btnPenaltyManagement = btnPenaltyManagement;
	}

	public Button getBtnAddProfTA() {
		return btnAddProfTA;
	}

	public void setBtnAddProfTA(Button btnAddProfTA) {
		this.btnAddProfTA = btnAddProfTA;
	}
	
	
}
