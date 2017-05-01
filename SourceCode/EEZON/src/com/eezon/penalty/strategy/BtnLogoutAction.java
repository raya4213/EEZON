package com.eezon.penalty.strategy;

import com.eezon.controllers.PenaltyManagementController;
import com.eezon.models.Kit;
import com.eezon.views.PenaltyManagementView;

public class BtnLogoutAction implements IPenaltyBtnAction{

	@Override
	public void doAction(PenaltyManagementController controller, PenaltyManagementView penaltyView, Kit kitModel) {
		// TODO Auto-generated method stub
		System.out.println("Logout Btn Pressed");
		controller.getPrevShell().dispose();
		penaltyView.getShlPenaltyManagement().dispose();
		controller.getLoginShell().setVisible(true);
	}

}
