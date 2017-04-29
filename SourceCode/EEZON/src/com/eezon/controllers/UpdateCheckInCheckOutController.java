package com.eezon.controllers;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import com.eezon.models.Course;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;

public class UpdateCheckInCheckOutController implements MouseListener, SelectionListener{
	private UpdateCheckInCheckOutView updateCheckInCheckOutView;
	private Course courseModel;
	private Kit kitModel;
	
	public UpdateCheckInCheckOutController(){
		updateCheckInCheckOutView = new UpdateCheckInCheckOutView();
		courseModel = new Course();
		kitModel = new Kit();
		initializeListeners();
	}
	
	private void initializeListeners(){
		updateCheckInCheckOutView.getBtnBack().addMouseListener(this);
		updateCheckInCheckOutView.getBtnHome().addMouseListener(this);
	
		
		updateCheckInCheckOutView.getCmbSelectCourse().addSelectionListener(this);
		//updateCheckInCheckOutView.getCmbSelectStudent().addSelectionListener(this);
	}

	@Override
	public void widgetSelected(SelectionEvent paramSelectionEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent paramSelectionEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDoubleClick(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseUp(MouseEvent paramMouseEvent) {
		// TODO Auto-generated method stub
		
	}
	
}
