package com.eezon.requests.strategy;

import com.eezon.controllers.CheckInExtensionReqController;
import com.eezon.models.CheckInExtensionRequest;
import com.eezon.views.CheckInExtensionReqView;

public interface ICheckInExtensionBtnAction {
	public void doAction(CheckInExtensionReqController checkInExtensionReqController, CheckInExtensionReqView checkInExtensionReqView,
			CheckInExtensionRequest checkInExtensionReqModel);
}
