package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class ForgotPassword {
	private Text txtEnterEmailId;
	private Text txtEnterAccessCode;
	private Text txtEnterPassword;
	private Text txtReEnterPassword;
	private Text txtPasswordMsg;
	Display display;
	Shell shlForgotPassword;
	Button btnSubmit;
	

	/**
	 * Launch the application.
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			ForgotPassword window = new ForgotPassword();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Open the window.
	 */
	public void open() {
		display = Display.getDefault();
		shlForgotPassword = new Shell();
		shlForgotPassword.setSize(1082, 642);
		shlForgotPassword.setText("Forgot password");
		
		txtEnterEmailId = new Text(shlForgotPassword, SWT.BORDER);
		txtEnterEmailId.setText("Enter Email ID");
		txtEnterEmailId.setBounds(473, 79, 80, 31);
		
		txtEnterAccessCode = new Text(shlForgotPassword, SWT.BORDER);
		txtEnterAccessCode.setText("Enter Access Code");
		txtEnterAccessCode.setBounds(473, 152, 80, 31);
		
		txtEnterPassword = new Text(shlForgotPassword, SWT.BORDER);
		txtEnterPassword.setText("Enter Password");
		txtEnterPassword.setBounds(473, 214, 80, 31);
		
		txtReEnterPassword = new Text(shlForgotPassword, SWT.BORDER);
		txtReEnterPassword.setText("Re Enter Password");
		txtReEnterPassword.setBounds(473, 295, 80, 31);
		
		btnSubmit = new Button(shlForgotPassword, SWT.NONE);
		btnSubmit.setBounds(453, 372, 105, 35);
		btnSubmit.setText("Submit");
		
		txtPasswordMsg = new Text(shlForgotPassword, SWT.BORDER);
		txtPasswordMsg.setText("Password Msg");
		txtPasswordMsg.setBounds(473, 453, 80, 31);

		shlForgotPassword.open();
		shlForgotPassword.layout();
		while (!shlForgotPassword.isDisposed()) {
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


	public Text getTxtEnterAccessCode() {
		return txtEnterAccessCode;
	}


	public void setTxtEnterAccessCode(Text txtEnterAccessCode) {
		this.txtEnterAccessCode = txtEnterAccessCode;
	}


	public Text getTxtEnterPassword() {
		return txtEnterPassword;
	}


	public void setTxtEnterPassword(Text txtEnterPassword) {
		this.txtEnterPassword = txtEnterPassword;
	}


	public Text getTxtReEnterPassword() {
		return txtReEnterPassword;
	}


	public void setTxtReEnterPassword(Text txtReEnterPassword) {
		this.txtReEnterPassword = txtReEnterPassword;
	}


	public Text getTxtPasswordMsg() {
		return txtPasswordMsg;
	}


	public void setTxtPasswordMsg(Text txtPasswordMsg) {
		this.txtPasswordMsg = txtPasswordMsg;
	}


	public Display getDisplay() {
		return display;
	}


	public void setDisplay(Display display) {
		this.display = display;
	}


	public Shell getShlForgotPassword() {
		return shlForgotPassword;
	}


	public void setShlForgotPassword(Shell shlForgotPassword) {
		this.shlForgotPassword = shlForgotPassword;
	}


	public Button getBtnSubmit() {
		return btnSubmit;
	}


	public void setBtnSubmit(Button btnSubmit) {
		this.btnSubmit = btnSubmit;
	}
	
	
	
	

}
