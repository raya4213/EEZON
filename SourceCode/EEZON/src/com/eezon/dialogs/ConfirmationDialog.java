package com.eezon.dialogs;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ConfirmationDialog extends Dialog {

	protected Object result;
	protected Shell shlConfirmation;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ConfirmationDialog(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlConfirmation.open();
		shlConfirmation.layout();
		Display display = getParent().getDisplay();
		while (!shlConfirmation.isDisposed()) {
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
		shlConfirmation = new Shell(getParent(), getStyle());
		shlConfirmation.setSize(334, 187);
		shlConfirmation.setText("Confirmation");
		shlConfirmation.setLocation(500, 300);
		
		Label lblConfirmationHdr = new Label(shlConfirmation, SWT.NONE);
		lblConfirmationHdr.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblConfirmationHdr.setBounds(78, 29, 187, 21);
		lblConfirmationHdr.setText("Do you want to Continue ?");
		
		Button btnYes = new Button(shlConfirmation, SWT.NONE);
		btnYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				result = "Yes";
				shlConfirmation.dispose();
			}
		});
		btnYes.setBounds(60, 83, 75, 25);
		btnYes.setText("Yes");
		
		Button btnNo = new Button(shlConfirmation, SWT.NONE);
		btnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				result = "No";
				shlConfirmation.dispose();
			}
		});
		btnNo.setBounds(200, 83, 75, 25);
		btnNo.setText("No");

	}
}
