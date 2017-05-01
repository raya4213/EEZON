package com.eezon.penalty.strategy;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.controllers.PenaltyManagementController;
import com.eezon.models.Kit;
import com.eezon.views.PenaltyManagementView;

public class RadOverrideAction implements IPenaltyBtnAction {

	@Override
	public void doAction(PenaltyManagementController controller, PenaltyManagementView penaltyView, Kit kitModel) {
		// TODO Auto-generated method stub
		System.out.println("RadOverride pressed");

		controller.hideAllOptions();
		penaltyView.getTblViewPenalties().setVisible(true);
		penaltyView.getBtnOverride().setVisible(true);
		
		//Need to search email id of user 
		ArrayList<Kit> kitsFound = kitModel.getStudentSpecificKitDetailsWithPenalty("asd");
		
		penaltyView.getTblViewPenalties().removeAll();
		
		for(Kit kitFound : kitsFound){
			TableItem item = new TableItem(penaltyView.getTblViewPenalties(), SWT.NULL);
	        item.setText(0, kitFound.getKitSerialNum());
	        item.setText(1, kitFound.getKitCheckInDate().toString());
	        item.setText(2, kitFound.getKitCheckOutDate().toString());
	        item.setText(3, kitFound.getKitCourse().getCourseName());
	        item.setText(4, kitFound.getKitPenalty()+"");
	        item.setText(5, kitFound.getKitType());
	        item.setText(6, kitFound.getStudentEmailKit());
	        item.setText(7, kitFound.getStudentNameForKit());

		}
	}

}
