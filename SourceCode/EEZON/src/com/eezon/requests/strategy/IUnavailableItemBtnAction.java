package com.eezon.requests.strategy;

import com.eezon.models.UnavailableItemRequest;
import com.eezon.views.UnavailableItemReqView;

public interface IUnavailableItemBtnAction {
	public void doAction(UnavailableItemReqView unavailableItemReqView, UnavailableItemRequest unavailableItemReqModel);
}
