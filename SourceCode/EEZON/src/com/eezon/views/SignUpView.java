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
	Combo combo;
	Display display;
	Shell shlSignUp;
	Button btnSignUp;
	Display display_1;
	Button btnDisplay;

	/**
	 * Launch the application.
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			SignUpView window = new SignUpView();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Open the window.
	 */
	public SignUpView() {
		display = Display.getDefault();
		shlSignUp = new Shell();
		shlSignUp.setSize(1214, 698);
		shlSignUp.setText("Sign Up");
		
		txtEnterEmailId = new Text(shlSignUp, SWT.BORDER);
		txtEnterEmailId.setText("Enter Email ID");
		txtEnterEmailId.setBounds(483, 62, 159, 31);
		
		txtEnterPassword = new Text(shlSignUp, SWT.BORDER);
		txtEnterPassword.setText("Enter Password");
		txtEnterPassword.setBounds(483, 142, 159, 31);
		
		combo = new Combo(shlSignUp, SWT.NONE);
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
		
		btnSignUp = new Button(shlSignUp, SWT.NONE);
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

	public Text getTxtEnterEmailId() {
		return txtEnterEmailId;
	}
 
	
	public void setTxtEnterEmailId(Text txtEnterEmailId) {
		this.txtEnterEmailId = txtEnterEmailId;
	}

	
	public Text getTxtEnterPassword() {
		return txtEnterPassword;
	}

	
	public void setTxtEnterPassword(Text txtEnterPassword) {
		this.txtEnterPassword = txtEnterPassword;
	}

	
	public Text getTxtAccessCodeMessage() {
		return txtAccessCodeMessage;
	}

	
	public void setTxtAccessCodeMessage(Text txtAccessCodeMessage) {
		this.txtAccessCodeMessage = txtAccessCodeMessage;
	}

	
	public Text getTxtEnterAccessCode() {
		return txtEnterAccessCode;
	}

	
	public void setTxtEnterAccessCode(Text txtEnterAccessCode) {
		this.txtEnterAccessCode = txtEnterAccessCode;
	}

	
	public Text getTxtEnterPassword_1() {
		return txtEnterPassword_1;
	}

	
	public void setTxtEnterPassword_1(Text txtEnterPassword_1) {
		this.txtEnterPassword_1 = txtEnterPassword_1;
	}

	
	public Text getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	
	public void setTxtConfirmPassword(Text txtConfirmPassword) {
		this.txtConfirmPassword = txtConfirmPassword;
	}

	
	public Combo getCombo() {
		return combo;
	}

	
	public void setCombo(Combo combo) {
		this.combo = combo;
	}

	
	public Display getDisplay() {
		return display;
	}

	
	public void setDisplay(Display display) {
		this.display = display;
	}

	
	public Shell getShlSignUp() {
		return shlSignUp;
	}

	
	public void setShlSignUp(Shell shlSignUp) {
		this.shlSignUp = shlSignUp;
	}

	
	public Button getBtnSignUp() {
		return btnSignUp;
	}

	
	public void setBtnSignUp(Button btnSignUp) {
		this.btnSignUp = btnSignUp;
	}

	
	public Display getDisplay_1() {
		return display_1;
	}

	
	public void setDisplay_1(Display display_1) {
		this.display_1 = display_1;
	}

	
	public Button getBtnDisplay() {
		return btnDisplay;
	}

	
	public void setBtnDisplay(Button btnDisplay) {
		this.btnDisplay = btnDisplay;
	}
	
	
	
}
