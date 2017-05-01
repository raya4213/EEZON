package com.eezon.controllers;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.eezon.models.User;
import com.eezon.views.HomeScreenView;

public class HomeScreenController implements MouseListener {
	private HomeScreenView homeScreenView;
	private User userModel;
	private Shell loginShell;
	
	public HomeScreenController(User userModel, Shell loginShell){
		this.homeScreenView = new HomeScreenView();
		this.userModel = userModel;
		this.loginShell = loginShell;
		hideAllButtons();
		initializeListeners();
	}
	
	public void hideAllButtons(){
		homeScreenView.getBtnRequestsView().setVisible(false);
		homeScreenView.getBtnMyCINCOUTView().setVisible(false);
		homeScreenView.getBtnViewKitDetails().setVisible(false);
		homeScreenView.getBtnCINCOUTUpdateView().setVisible(false);
		homeScreenView.getBtnInventory().setVisible(false);
		homeScreenView.getBtnPenaltyManagement().setVisible(false);
		homeScreenView.getBtnAddProfTA().setVisible(false);
	}
	
	public void displayView(){
		this.loginShell.setVisible(false);

		switch(userModel.getUserRole()){
			case "admin":
			case "professor":
				homeScreenView.getBtnRequestsView().setVisible(true);
				homeScreenView.getBtnViewKitDetails().setVisible(true);
				homeScreenView.getBtnCINCOUTUpdateView().setVisible(true);
				homeScreenView.getBtnInventory().setVisible(true);
				homeScreenView.getBtnPenaltyManagement().setVisible(true);
				homeScreenView.getBtnAddProfTA().setVisible(true);
				homeScreenView.getBtnAddProfTA().setBounds(30, 115, 188, 25);
				break;
			case "ta":
				homeScreenView.getBtnRequestsView().setVisible(true);
				homeScreenView.getBtnMyCINCOUTView().setVisible(true);
				homeScreenView.getBtnViewKitDetails().setVisible(true);
				homeScreenView.getBtnCINCOUTUpdateView().setVisible(true);
				homeScreenView.getBtnInventory().setVisible(true);
				homeScreenView.getBtnPenaltyManagement().setVisible(true);
				break;
			case "student":
				homeScreenView.getBtnRequestsView().setVisible(true);
				homeScreenView.getBtnRequestsView().setBounds(160, 70, 75, 25);
				homeScreenView.getBtnMyCINCOUTView().setVisible(true);
				homeScreenView.getBtnMyCINCOUTView().setBounds(103, 115, 188, 25);
				homeScreenView.getBtnPenaltyManagement().setVisible(true);
				homeScreenView.getBtnPenaltyManagement().setBounds(130, 166, 151, 25);
				break;
		}
		
		Display display = homeScreenView.getDisplay();
		Shell shell = homeScreenView.getShlHome();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public void initializeListeners(){
		homeScreenView.getBtnAddProfTA().addMouseListener(this);
		homeScreenView.getBtnCINCOUTUpdateView().addMouseListener(this);
		homeScreenView.getBtnInventory().addMouseListener(this);
		homeScreenView.getBtnMyCINCOUTView().addMouseListener(this);
		homeScreenView.getBtnPenaltyManagement().addMouseListener(this);
		homeScreenView.getBtnRequestsView().addMouseListener(this);
		homeScreenView.getBtnViewKitDetails().addMouseListener(this);
		homeScreenView.getBtnLogout().addMouseListener(this);
	}
	
	
	public Shell getLoginShell() {
		return loginShell;
	}

	public void setLoginShell(Shell loginShell) {
		this.loginShell = loginShell;
	}

	public HomeScreenView getHomeScreenView() {
		return homeScreenView;
	}

	public void setHomeScreenView(HomeScreenView homeScreenView) {
		this.homeScreenView = homeScreenView;
	}

	public User getUserModel() {
		return userModel;
	}

	public void setUserModel(User userModel) {
		this.userModel = userModel;
	}

	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		Button btnPressed = (Button)arg0.widget;
		System.out.println("mouseDown" + arg0);
		
		switch(btnPressed.getData().toString()){
			case "btnRequestsView":
				RequestsController requestsController = new RequestsController(userModel,homeScreenView.getShlHome(), loginShell);
				requestsController.displayView();
				
				break;
			case "btnMyCINCOUTView":
				ViewMyCheckInCheckOutController viewCheckInCheckOutController = new ViewMyCheckInCheckOutController(userModel,homeScreenView.getShlHome(), loginShell);
				viewCheckInCheckOutController.displayView();
				break;
			case "btnViewKitDetails":
				ViewKitDetailsCoursewiseController viewController = new ViewKitDetailsCoursewiseController(userModel, homeScreenView.getShlHome(), loginShell);
				viewController.displayView();
				
				break;
			case "btnCINCOUTUpdateView":
				UpdateCheckInCheckOutController updateCheckInCheckOutController = new UpdateCheckInCheckOutController(userModel,homeScreenView.getShlHome(), loginShell);
				updateCheckInCheckOutController.displayView();
				
				break;
			case "btnInventory":
				
				break;
			case "btnPenaltyManagement":
				PenaltyManagementController penaltyMgtController = new PenaltyManagementController(userModel, homeScreenView.getShlHome(),loginShell);
				penaltyMgtController.displayView();
				break;
			case "btnAddProfTA":
				
				break;
			case "btnLogout":
				this.loginShell.setVisible(true);
				homeScreenView.getShlHome().setVisible(false);
				homeScreenView.getShlHome().dispose();
				break;
		}		
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
