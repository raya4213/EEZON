package com.eezon.controllers;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.eezon.models.User;
import com.eezon.views.LoginView;

public class LoginController implements MouseListener {
	private LoginView loginView;
	private User userModel;
	
	public LoginController() {
		// TODO Auto-generated constructor stub
		loginView = new LoginView();
		initializeListeners();
	}
	
	public void initializeListeners(){
		loginView.getBtnLogin().addMouseListener(this);
		loginView.getBtnSignUp().addMouseListener(this);
		loginView.getBtnForgotPasswd().addMouseListener(this);
	}
	
	public void displayView(){
		Display display = loginView.getDisplay();
		Shell shell = loginView.getShell();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
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
			case "btnLogin":
				System.out.println("Login button Pressed");
				System.out.println("Username:"+loginView.getTxtUserName().getText());
				System.out.println("Password:"+loginView.getTxtPasswd().getText());
				String userRole = User.getUserRole(loginView.getTxtUserName().getText());
				if(!userRole.isEmpty()){
					userModel = User.getUserDetails(loginView.getTxtUserName().getText(),userRole);
					if(userModel != null){
						System.out.println("User's Role:"+userModel.getUserRole());
					}
				}else{
					System.out.println("User email id is not present");
				}
				
				break;
			case "btnForgotPasswd":
				break;
			case "btnSignUp":
				break;
		}
		
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
