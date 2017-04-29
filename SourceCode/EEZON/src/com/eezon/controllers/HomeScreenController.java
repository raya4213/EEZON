package com.eezon.controllers;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.eezon.models.User;
import com.eezon.views.HomeScreenView;

public class HomeScreenController {
	private HomeScreenView homeScreenView;
	private User userModel;
	
	public HomeScreenController(User userModel){
		this.homeScreenView = new HomeScreenView();
		this.userModel = userModel;
		hideAllButtons();
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
		switch(userModel.getUserRole()){
			case "admin":
			case "professor":
				homeScreenView.getBtnRequestsView().setVisible(true);
				homeScreenView.getBtnViewKitDetails().setVisible(true);
				homeScreenView.getBtnCINCOUTUpdateView().setVisible(true);
				homeScreenView.getBtnInventory().setVisible(true);
				homeScreenView.getBtnPenaltyManagement().setVisible(true);
				homeScreenView.getBtnAddProfTA().setVisible(true);
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
				homeScreenView.getBtnMyCINCOUTView().setVisible(true);
				homeScreenView.getBtnPenaltyManagement().setVisible(true);
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
	
	
}
