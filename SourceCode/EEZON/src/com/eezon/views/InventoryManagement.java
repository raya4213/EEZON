package com.eezon.views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class InventoryManagement {

	Display display ;
	Shell shlInventoryManagement;
	Button btnHome;
	Button btnBack;
	Button btnAddKit;
	Button btnRemoveKit;
	Combo combo;
	Combo combo_1;
	Combo combo_2;
	Combo combo_3;
	Combo combo_5;
	Combo combo_6;
	Button btnAdd;
	Button btnRemoveSerialNumber;
	Combo combo_7;
	Combo combo_8;
	Combo combo_9;
	Button btnAdd_1;
	Button btnRemove;
	
	
	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Shell getShlInventoryManagement() {
		return shlInventoryManagement;
	}

	public void setShlInventoryManagement(Shell shlInventoryManagement) {
		this.shlInventoryManagement = shlInventoryManagement;
	}

	public Button getBtnHome() {
		return btnHome;
	}

	public void setBtnHome(Button btnHome) {
		this.btnHome = btnHome;
	}

	public Button getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(Button btnBack) {
		this.btnBack = btnBack;
	}

	public Button getBtnAddKit() {
		return btnAddKit;
	}

	public void setBtnAddKit(Button btnAddKit) {
		this.btnAddKit = btnAddKit;
	}

	public Button getBtnRemoveKit() {
		return btnRemoveKit;
	}

	public void setBtnRemoveKit(Button btnRemoveKit) {
		this.btnRemoveKit = btnRemoveKit;
	}

	public Combo getCombo() {
		return combo;
	}

	public void setCombo(Combo combo) {
		this.combo = combo;
	}

	public Combo getCombo_1() {
		return combo_1;
	}

	public void setCombo_1(Combo combo_1) {
		this.combo_1 = combo_1;
	}

	public Combo getCombo_2() {
		return combo_2;
	}

	public void setCombo_2(Combo combo_2) {
		this.combo_2 = combo_2;
	}

	public Combo getCombo_3() {
		return combo_3;
	}

	public void setCombo_3(Combo combo_3) {
		this.combo_3 = combo_3;
	}

	public Combo getCombo_5() {
		return combo_5;
	}

	public void setCombo_5(Combo combo_5) {
		this.combo_5 = combo_5;
	}

	public Combo getCombo_6() {
		return combo_6;
	}

	public void setCombo_6(Combo combo_6) {
		this.combo_6 = combo_6;
	}

	public Button getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(Button btnAdd) {
		this.btnAdd = btnAdd;
	}

	public Button getBtnRemoveSerialNumber() {
		return btnRemoveSerialNumber;
	}

	public void setBtnRemoveSerialNumber(Button btnRemoveSerialNumber) {
		this.btnRemoveSerialNumber = btnRemoveSerialNumber;
	}

	public Combo getCombo_7() {
		return combo_7;
	}

	public void setCombo_7(Combo combo_7) {
		this.combo_7 = combo_7;
	}

	public Combo getCombo_8() {
		return combo_8;
	}

	public void setCombo_8(Combo combo_8) {
		this.combo_8 = combo_8;
	}

	public Combo getCombo_9() {
		return combo_9;
	}

	public void setCombo_9(Combo combo_9) {
		this.combo_9 = combo_9;
	}

	public Button getBtnAdd_1() {
		return btnAdd_1;
	}

	public void setBtnAdd_1(Button btnAdd_1) {
		this.btnAdd_1 = btnAdd_1;
	}

	public Button getBtnRemove() {
		return btnRemove;
	}

	public void setBtnRemove(Button btnRemove) {
		this.btnRemove = btnRemove;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InventoryManagement window = new InventoryManagement();
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
		Shell shlInventoryManagement = new Shell();
		shlInventoryManagement.setSize(1238, 706);
		shlInventoryManagement.setText("Inventory Management");
		
		Button btnHome = new Button(shlInventoryManagement, SWT.NONE);
		btnHome.setBounds(62, 33, 105, 35);
		btnHome.setText("Home");
		
		Button btnBack = new Button(shlInventoryManagement, SWT.NONE);
		btnBack.setBounds(1019, 33, 105, 35);
		btnBack.setText("Back");
		
		Button btnAddKit = new Button(shlInventoryManagement, SWT.NONE);
		btnAddKit.setBounds(211, 132, 105, 35);
		btnAddKit.setText("Add Kit");
		
		Button btnRemoveKit = new Button(shlInventoryManagement, SWT.NONE);
		btnRemoveKit.setBounds(766, 132, 105, 35);
		btnRemoveKit.setText("Remove Kit");
		
		Combo combo = new Combo(shlInventoryManagement, SWT.NONE);
		combo.setBounds(212, 192, 104, 33);
		combo.setText("Selct Course");
		
		Combo combo_1 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_1.setBounds(212, 264, 104, 33);
		combo_1.setText("Select Kit Type");
		
		Combo combo_2 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_2.setBounds(212, 192, 104, 33);
		combo_2.setText("Selct Course");
		
		Combo combo_3 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_3.setBounds(766, 209, 104, 33);
		combo_3.setText("Selct Course");
		
		Combo combo_4 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_4.setBounds(212, 357, 104, 33);
		combo_4.setText("Select Kit Type");
		
		Combo combo_5 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_5.setBounds(767, 274, 104, 33);
		combo_5.setText("Select Kit Type");
		
		Button btnAdd = new Button(shlInventoryManagement, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAdd.setBounds(211, 412, 105, 35);
		btnAdd.setText("Add ");
		
		Button btnRemoveSerialNumber = new Button(shlInventoryManagement, SWT.NONE);
		btnRemoveSerialNumber.setBounds(766, 412, 105, 35);
		btnRemoveSerialNumber.setText("Remove Serial Number");
		
		Combo combo_6 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_6.setBounds(211, 462, 104, 33);
		combo_6.setText("Select Course");
		
		Combo combo_7 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_7.setBounds(211, 514, 104, 33);
		combo_7.setText("Select Kit Type");
		
		Combo combo_8 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_8.setBounds(766, 474, 104, 33);
		combo_8.setText("Select Course");
		
		Combo combo_9 = new Combo(shlInventoryManagement, SWT.NONE);
		combo_9.setBounds(766, 530, 104, 33);
		combo_9.setText("Select Kit Type");
		
		Button btnAdd_1 = new Button(shlInventoryManagement, SWT.NONE);
		btnAdd_1.setBounds(211, 585, 105, 35);
		btnAdd_1.setText("Add");
		
		Button btnRemove = new Button(shlInventoryManagement, SWT.NONE);
		btnRemove.setBounds(766, 585, 105, 35);
		btnRemove.setText("Remove");

		shlInventoryManagement.open();
		shlInventoryManagement.layout();
		while (!shlInventoryManagement.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
