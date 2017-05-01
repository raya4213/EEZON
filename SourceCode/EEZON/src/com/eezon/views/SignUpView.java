package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SignUpView {
	private Text txtEnterEmailId;
	private Text txtEnterPassword;
	private Text txtAccessCodeMessage;
	private Text txtEnterAccessCode;
	private Text txtEnterPassword_1;
	private Text txtConfirmPassword;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SignUpView window = new SignUpView();
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
		Shell shlSignUp = new Shell();
		shlSignUp.setSize(1214, 698);
		shlSignUp.setText("Sign Up");
		
		txtEnterEmailId = new Text(shlSignUp, SWT.BORDER);
		txtEnterEmailId.setText("Enter Email ID");
		txtEnterEmailId.setBounds(483, 62, 159, 31);
		
		txtEnterPassword = new Text(shlSignUp, SWT.BORDER);
		txtEnterPassword.setText("Enter Password");
		txtEnterPassword.setBounds(483, 142, 159, 31);
		
		Combo combo = new Combo(shlSignUp, SWT.NONE);
		combo.setItems(new String[] {"Professor", "Student"});
		combo.setBounds(517, 243, 104, 33);
		combo.setText("Role");
		
		txtAccessCodeMessage = new Text(shlSignUp, SWT.BORDER);
		txtAccessCodeMessage.setText("Access Code Message");
		txtAccessCodeMessage.setBounds(259, 329, 554, 31);
		
		txtEnterAccessCode = new Text(shlSignUp, SWT.BORDER);
		txtEnterAccessCode.setText("Enter Access Code");
		txtEnterAccessCode.setBounds(527, 389, 159, 31);
		
		txtEnterPassword_1 = new Text(shlSignUp, SWT.BORDER);
		txtEnterPassword_1.setText("Enter Password");
		txtEnterPassword_1.setBounds(527, 455, 173, 31);
		
		txtConfirmPassword = new Text(shlSignUp, SWT.BORDER);
		txtConfirmPassword.setText("Confirm Password");
		txtConfirmPassword.setBounds(527, 502, 173, 31);
		
		Button btnSignUp = new Button(shlSignUp, SWT.NONE);
		btnSignUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSignUp.setBounds(527, 561, 105, 35);
		btnSignUp.setText("Sign UP");

		shlSignUp.open();
		shlSignUp.layout();
		while (!shlSignUp.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
