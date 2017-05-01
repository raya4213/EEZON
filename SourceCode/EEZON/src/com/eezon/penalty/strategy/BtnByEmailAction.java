package com.eezon.penalty.strategy;

import com.eezon.controllers.PenaltyManagementController;
import com.eezon.models.Kit;
import com.eezon.views.PenaltyManagementView;

public class BtnByEmailAction implements IPenaltyBtnAction{

	@Override
	public void doAction(PenaltyManagementController controller, PenaltyManagementView penaltyView, Kit kitModel) {
		// TODO Auto-generated method stub
		System.out.println("By Email pressed");

		controller.hideCourseEmailOptions();
		penaltyView.getGrpByEmail().setVisible(true);
		penaltyView.getBtnView().setVisible(true);
	}
}
