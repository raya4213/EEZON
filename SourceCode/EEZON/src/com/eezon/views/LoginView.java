package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;

public class LoginView {

	Display display;
	Shell shlEezonInventory;
	Label label;
	Text txtUserName;
	Text txtPasswd;
	Button btnLogin;
	Button btnForgotPasswd;
	Button btnSignUp;
	private Label lblEmailId;
	private Label lblPassword;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	/*public static void main(String[] args) {
		try {
			LoginView window = new LoginView();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/



	/**
	 * Open the window.
	 */
	public LoginView() {
		display = Display.getDefault();
		shlEezonInventory = new Shell();
		shlEezonInventory.setSize(604, 463);
		shlEezonInventory.setText("EEZON - Inventory Management System");
		shlEezonInventory.setLocation(350, 150);
		
		label = new Label(shlEezonInventory, SWT.NONE);
		label.setBounds(98, 31, 378, 166);
		
		Image img = new Image(display, "resources/leopardGecko.jpg");
		label.setImage(img);
		
		txtUserName = new Text(shlEezonInventory, SWT.BORDER);
		txtUserName.setToolTipText("Enter CU Boulder Email");
		txtUserName.setBounds(183, 211, 231, 21);
		
		txtPasswd = new Text(shlEezonInventory, SWT.BORDER);
		txtPasswd.setToolTipText("Enter Password");
		txtPasswd.setBounds(183, 254, 231, 21);
		txtPasswd.setEchoChar('*');
		
		btnLogin = new Button(shlEezonInventory, SWT.NONE);
		/*btnLogin.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseDown(MouseEvent e) {
				
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.getTransaction().commit();
				
				/*User getUser = session.get(com.eezon.models.User.class, txtUserName.getText());
				
				
				if(getUser != null){
					System.out.println("User's Password:"+ getUser.getPassword());
					if(txtPasswd.getText().equals(getUser.getPassword())){
						System.out.println("User Authentication successful");
						/*String [] params = new String[2];
						
						params[0] = txtUserName.getText();
						params[1] = getUser.getName();
						
						HomeScreen.updateIncomingShell(shell, params);
						HomeScreen homeScreen = new HomeScreen();
						homeScreen.open();///////////////////
					}else{
						//lblStatus.setText("Invalid Username/Password");
						System.out.println("Invalid Username/Password");
					}
				}else{
					System.out.println("Username not present");
				}///////////////////////////////
				
				session.close();
				sessionFactory.close();
			}
		});*/
		btnLogin.setBounds(210, 300, 75, 25);
		btnLogin.setText("Login");
		btnLogin.setData("btnLogin");
		
		btnForgotPasswd = new Button(shlEezonInventory, SWT.NONE);
		btnForgotPasswd.setBounds(221, 339, 156, 30);
		btnForgotPasswd.setText("Forgot Password");
		btnForgotPasswd.setData("btnForgotPasswd");

		btnSignUp = new Button(shlEezonInventory, SWT.NONE);
		btnSignUp.setBounds(314, 300, 75, 25);
		btnSignUp.setText("Sign Up");
		btnSignUp.setData("btnSignUp");
		
		lblEmailId = new Label(shlEezonInventory, SWT.NONE);
		lblEmailId.setBounds(82, 211, 55, 21);
		lblEmailId.setText("Email Id");
		
		lblPassword = new Label(shlEezonInventory, SWT.NONE);
		lblPassword.setText("Password");
		lblPassword.setBounds(82, 257, 75, 25);
	}
	
	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Shell getShell() {
		return shlEezonInventory;
	}

	public void setShell(Shell shell) {
		this.shlEezonInventory = shell;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Text getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(Text txtUserName) {
		this.txtUserName = txtUserName;
	}

	public Text getTxtPasswd() {
		return txtPasswd;
	}

	public void setTxtPasswd(Text txtPasswd) {
		this.txtPasswd = txtPasswd;
	}

	public Button getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(Button btnLogin) {
		this.btnLogin = btnLogin;
	}

	public Button getBtnForgotPasswd() {
		return btnForgotPasswd;
	}

	public void setBtnForgotPasswd(Button btnForgotPasswd) {
		this.btnForgotPasswd = btnForgotPasswd;
	}

	public Button getBtnSignUp() {
		return btnSignUp;
	}

	public void setBtnSignUp(Button btnSignUp) {
		this.btnSignUp = btnSignUp;
	}
}
