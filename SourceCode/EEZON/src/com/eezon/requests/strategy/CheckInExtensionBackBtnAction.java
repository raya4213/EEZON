package com.eezon.requests.strategy;

import com.eezon.controllers.CheckInExtensionReqController;
import com.eezon.models.CheckInExtensionRequest;
import com.eezon.views.CheckInExtensionReqView;

public class CheckInExtensionBackBtnAction implements ICheckInExtensionBtnAction{

	@Override
	public void doAction(CheckInExtensionReqController checkInExtensionReqController, CheckInExtensionReqView checkInExtensionReqView,
			CheckInExtensionRequest checkInExtensionReqModel) {
	
		// TODO Auto-generated method stub
		checkInExtensionReqController.getPrevShell().setVisible(true);
		checkInExtensionReqView.getShlEezon().dispose();
	}

}
