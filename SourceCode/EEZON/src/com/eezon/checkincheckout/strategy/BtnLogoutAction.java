package com.eezon.checkincheckout.strategy;

import com.eezon.controllers.UpdateCheckInCheckOutController;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;

public class BtnLogoutAction implements ICheckInCheckOutBtnAction{

	@Override
	public void doAction(UpdateCheckInCheckOutController cInCoutcontoller,
		UpdateCheckInCheckOutView updateCheckInCheckOutView, Kit kitModel) {
		
		cInCoutcontoller.getPrevShell().dispose();
		updateCheckInCheckOutView.getShlEezonCheck().dispose();
		cInCoutcontoller.getLoginShell().setVisible(true);
		
		
	}

}
