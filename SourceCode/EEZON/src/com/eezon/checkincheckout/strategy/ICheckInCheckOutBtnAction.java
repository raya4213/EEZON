package com.eezon.checkincheckout.strategy;

import com.eezon.controllers.UpdateCheckInCheckOutController;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;

public interface ICheckInCheckOutBtnAction {
	public void doAction(UpdateCheckInCheckOutController cInCoutcontoller, UpdateCheckInCheckOutView updateCheckInCheckOutView, Kit kitModel);	
}
