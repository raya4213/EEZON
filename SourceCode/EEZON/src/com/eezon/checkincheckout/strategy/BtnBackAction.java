package com.eezon.checkincheckout.strategy;

import com.eezon.controllers.UpdateCheckInCheckOutController;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;

public class BtnBackAction implements ICheckInCheckOutBtnAction{

	@Override
	public void doAction(UpdateCheckInCheckOutController cInCoutcontoller,
			UpdateCheckInCheckOutView updateCheckInCheckOutView, Kit kitModel) {
			
			cInCoutcontoller.getPrevShell().setVisible(true);
			updateCheckInCheckOutView.getShlEezonCheck().dispose();
		
		
	}

}
