package com.eezon.checkincheckout.strategy;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.controllers.UpdateCheckInCheckOutController;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;

public class RadCheckInAction implements ICheckInCheckOutBtnAction{

	@Override
	public void doAction(UpdateCheckInCheckOutController cInCoutcontoller, UpdateCheckInCheckOutView updateCheckInCheckOutView, Kit kitModel) {
		// TODO Auto-generated method stub
		cInCoutcontoller.hideAllOptions();
		ArrayList<Kit> kitsFound = kitModel.getStudentSpecificCheckedOutKitDetails(updateCheckInCheckOutView.getTxtEmail().getText());
		
		updateCheckInCheckOutView.getTblCinCoutDetails().removeAll();
		updateCheckInCheckOutView.getGrpByCheckIn().setVisible(true);

		for(Kit kitFound: kitsFound){
			TableItem item = new TableItem(updateCheckInCheckOutView.getTblCinCoutDetails(), SWT.NULL);
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
