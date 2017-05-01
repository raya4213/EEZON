package com.eezon.requests.strategy;

import com.eezon.models.CheckInExtensionRequest;
import com.eezon.views.CheckInExtensionReqView;

public interface ICheckInExtensionBtnAction {
	public void doAction(CheckInExtensionReqView checkInExtensionReqView, CheckInExtensionRequest checkInExtensionReqModel);
}
