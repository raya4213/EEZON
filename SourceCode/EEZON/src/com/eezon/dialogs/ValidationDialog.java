package com.eezon.dialogs;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ValidationDialog extends Dialog {

	protected Object result;
	protected Shell shlUsersValidation;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ValidationDialog(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlUsersValidation.open();
		shlUsersValidation.layout();
		Display display = getParent().getDisplay();
		while (!shlUsersValidation.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlUsersValidation = new Shell(getParent(), getStyle());
		shlUsersValidation.setSize(385, 258);
		shlUsersValidation.setText("Users Validation");
		shlUsersValidation.setLocation(450,250);
		
		Label lblNewLabel = new Label(shlUsersValidation, SWT.NONE);
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel.setBounds(88, 75, 218, 15);
		lblNewLabel.setText("Email Id or Password does not match !!");
		
		Button btnOk = new Button(shlUsersValidation, SWT.NONE);
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				shlUsersValidation.dispose();
			}
		});
		btnOk.setBounds(152, 112, 75, 25);
		btnOk.setText(" OK");

	}
}
