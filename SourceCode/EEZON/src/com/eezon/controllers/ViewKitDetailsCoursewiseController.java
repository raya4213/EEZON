package com.eezon.controllers;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.models.Course;
import com.eezon.models.Kit;
import com.eezon.viewkitdetails.stratergy.IViewKitDetailsBtnAction;
import com.eezon.views.ViewKitDetailsCoursewiseView;

public class ViewKitDetailsCoursewiseController implements MouseListener, SelectionListener {
	ViewKitDetailsCoursewiseView viewKitDetailsCoursewiseView;
	Course courseModel;
	Kit kitModel;
	
	
	public ViewKitDetailsCoursewiseController (){
		viewKitDetailsCoursewiseView = new ViewKitDetailsCoursewiseView();
		courseModel = new Course(); 
		kitModel = new Kit();
		initializeListeners();
	}
	
	private void initializeListeners(){
		System.out.println("Inside this function");
		viewKitDetailsCoursewiseView.getBtnView().addMouseListener(this);
	
	}
	
	public void displayView(){
		Display display = viewKitDetailsCoursewiseView.getDisplay();
		Shell shell = viewKitDetailsCoursewiseView.getShlEezonView();
		shell.open();
		shell.layout();
		while (!display.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void widgetSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		
		Button btnPressed = (Button)arg0.widget;
		System.out.println("mouseDown" + arg0);
		
		IViewKitDetailsBtnAction IViewBtnAction = (IViewKitDetailsBtnAction)btnPressed.getData();
		IViewBtnAction.doAction(viewKitDetailsCoursewiseView, kitModel);
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}



