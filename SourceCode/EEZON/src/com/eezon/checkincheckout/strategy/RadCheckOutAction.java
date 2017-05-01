package com.eezon.checkincheckout.strategy;

import com.eezon.controllers.UpdateCheckInCheckOutController;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;

public class RadCheckOutAction implements ICheckInCheckOutBtnAction{

	@Override
	public void doAction(UpdateCheckInCheckOutController cInCoutcontoller,
			UpdateCheckInCheckOutView updateCheckInCheckOutView, Kit kitModel) {
		// TODO Auto-generated method stub
		System.out.println("Inside radio button checkout");
		cInCoutcontoller.hideAllOptions();
		updateCheckInCheckOutView.getGrpByCheckOut().setVisible(true);
	}

}
