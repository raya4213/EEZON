package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eezon.models.user_details;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;

public class LoginScreen {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LoginScreen window = new LoginScreen();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(604, 463);
		shell.setText("SWT Application");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(98, 31, 378, 166);
		Image img = new Image(display, "resources/leopardGecko.jpg");
		label.setImage(img);
		
		Text txtUserName = new Text(shell, SWT.BORDER);
		txtUserName.setToolTipText("Enter CU Boulder Email");
		txtUserName.setBounds(183, 211, 231, 21);
		
		Text txtPasswd = new Text(shell, SWT.BORDER);
		txtPasswd.setToolTipText("Enter Password");
		txtPasswd.setBounds(183, 254, 231, 21);
		txtPasswd.setEchoChar('*');
		
		Button btnLogin = new Button(shell, SWT.NONE);
		btnLogin.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseDown(MouseEvent e) {
				
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.getTransaction().commit();
				
				user_details getUser = session.get(com.eezon.models.user_details.class, txtUserName.getText());
				
				if(getUser != null){
					System.out.println("User's Password:"+ getUser.getPassword());
					if(txtPasswd.getText().equals(getUser.getPassword())){
						System.out.println("User Authentication successful");
						/*String [] params = new String[2];
						
						params[0] = txtUserName.getText();
						params[1] = getUser.getName();
						
						HomeScreen.updateIncomingShell(shell, params);
						HomeScreen homeScreen = new HomeScreen();
						homeScreen.open();*/
					}else{
						//lblStatus.setText("Invalid Username/Password");
						System.out.println("Invalid Username/Password");
					}
				}else{
					System.out.println("Username not present");
				}
				
				session.close();
				sessionFactory.close();
			}
		});
		btnLogin.setBounds(210, 300, 75, 25);
		btnLogin.setText("Login");
		
		Button btnForgotPasswd = new Button(shell, SWT.NONE);
		btnForgotPasswd.setBounds(246, 337, 93, 25);
		btnForgotPasswd.setText("ForgotPasswd");

		Button btnSignUp = new Button(shell, SWT.NONE);
		btnSignUp.setBounds(291, 300, 75, 25);
		btnSignUp.setText("Sign Up");
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
