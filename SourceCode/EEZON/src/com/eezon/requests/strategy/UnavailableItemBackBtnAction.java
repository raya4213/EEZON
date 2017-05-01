package com.eezon.requests.strategy;

import com.eezon.controllers.UnavailableItemReqController;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.views.UnavailableItemReqView;

public class UnavailableItemBackBtnAction implements IUnavailableItemBtnAction{

	@Override
	public void doAction(UnavailableItemReqController unavailableItemReqController,UnavailableItemReqView unavailableItemReqView,
			UnavailableItemRequest unavailableItemReqModel) {
		// TODO Auto-generated method stub
		unavailableItemReqController.getPrevShell().setVisible(true);
		unavailableItemReqView.getShlEezon().dispose();
		
	}

}
