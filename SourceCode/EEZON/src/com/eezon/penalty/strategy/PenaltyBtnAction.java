package com.eezon.penalty.strategy;

import com.eezon.controllers.PenaltyManagementController;
import com.eezon.models.Kit;
import com.eezon.views.PenaltyManagementView;

public interface PenaltyBtnAction {
	public void doAction(PenaltyManagementController controller, PenaltyManagementView penaltyView, Kit kitModel);
}
