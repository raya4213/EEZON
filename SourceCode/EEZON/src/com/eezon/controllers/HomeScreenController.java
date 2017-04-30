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
	private Shell prevShell;
	
	public HomeScreenController(User userModel, Shell prevShell){
		this.homeScreenView = new HomeScreenView();
		this.userModel = userModel;
		this.prevShell = prevShell;
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
		this.prevShell.setVisible(false);
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

	public void initializeListeners(){
		homeScreenView.getBtnAddProfTA().addMouseListener(this);
		homeScreenView.getBtnCINCOUTUpdateView().addMouseListener(this);
		homeScreenView.getBtnInventory().addMouseListener(this);
		homeScreenView.getBtnMyCINCOUTView().addMouseListener(this);
		homeScreenView.getBtnPenaltyManagement().addMouseListener(this);
		homeScreenView.getBtnRequestsView().addMouseListener(this);
		homeScreenView.getBtnViewKitDetails().addMouseListener(this);
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
	
	public Shell getPrevShell() {
		return prevShell;
	}

	public void setPrevShell(Shell prevShell) {
		this.prevShell = prevShell;
	}

	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Button btnRequestsView;
		Button btnMyCINCOUTView;
		Button btnViewKitDetails;
		Button btnCINCOUTUpdateView;
		Button btnInventory;
		Button btnPenaltyManagement;
		//private Button btnAddProfTA;
		
		Button btnPressed = (Button)arg0.widget;
		System.out.println("mouseDown" + arg0);
		
		/*switch(btnPressed.getData().toString()){
			case "btnRequestsView":
				break;
			case "":
				break;
			case "":
				break;
			case "":
				break;
		}*/
		
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
