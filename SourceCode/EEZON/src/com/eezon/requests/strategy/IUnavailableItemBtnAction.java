package com.eezon.requests.strategy;

import com.eezon.controllers.UnavailableItemReqController;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.views.UnavailableItemReqView;

public interface IUnavailableItemBtnAction {
	public void doAction(UnavailableItemReqController	unavailableItemReqController,UnavailableItemReqView unavailableItemReqView,
			UnavailableItemRequest unavailableItemReqModel);
}
