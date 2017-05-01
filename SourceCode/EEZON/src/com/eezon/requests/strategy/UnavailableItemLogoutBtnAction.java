package com.eezon.requests.strategy;

import com.eezon.controllers.UnavailableItemReqController;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.views.UnavailableItemReqView;

public class UnavailableItemLogoutBtnAction implements IUnavailableItemBtnAction{

	@Override
	public void doAction(UnavailableItemReqController	unavailableItemReqController,UnavailableItemReqView unavailableItemReqView,
			UnavailableItemRequest unavailableItemReqModel) {
		// TODO Auto-generated method stub
		unavailableItemReqController.getPrevShell().dispose();
		unavailableItemReqView.getShlEezon().dispose();
		unavailableItemReqController.getLoginShell().setVisible(true);
		
	}

}
