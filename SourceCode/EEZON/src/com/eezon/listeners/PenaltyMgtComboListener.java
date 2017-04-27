package com.eezon.listeners;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import com.eezon.views.PenaltyManagementView;

public class PenaltyMgtComboListener implements SelectionListener {
	

	PenaltyManagementView penaltyView;
	
	public PenaltyMgtComboListener(PenaltyManagementView _penaltyView) {
		// TODO Auto-generated constructor stub
		penaltyView = _penaltyView;
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Default option selected");
		
	}

	@Override
	public void widgetSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Other option selected");
		
	}
	
	

}
