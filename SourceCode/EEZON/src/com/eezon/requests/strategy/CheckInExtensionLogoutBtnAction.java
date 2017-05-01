package com.eezon.requests.strategy;

import com.eezon.controllers.CheckInExtensionReqController;
import com.eezon.models.CheckInExtensionRequest;
import com.eezon.views.CheckInExtensionReqView;

public class CheckInExtensionLogoutBtnAction implements ICheckInExtensionBtnAction{

	@Override
	public void doAction(CheckInExtensionReqController checkInExtensionReqController, CheckInExtensionReqView checkInExtensionReqView,
		CheckInExtensionRequest checkInExtensionReqModel) {
		
		checkInExtensionReqController.getPrevShell().dispose();
		checkInExtensionReqView.getShlEezon().dispose();
		checkInExtensionReqController.getLoginShell().setVisible(true);
			
	}

}
