package com.eezon.penalty.strategy;

import com.eezon.controllers.PenaltyManagementController;
import com.eezon.models.Kit;
import com.eezon.views.PenaltyManagementView;

public class PenaltyBtnOverrideAction implements PenaltyBtnAction {

	@Override
	public void doAction(PenaltyManagementController controller, PenaltyManagementView penaltyView, Kit kitModel) {
		// TODO Auto-generated method stub
		System.out.println("Override Btn pressed");
		System.out.println("NumSelected"+penaltyView.getTblViewPenalties().getSelectionCount());
		int selectedKitIndices [] = penaltyView.getTblViewPenalties().getSelectionIndices();
		for(int selectedKitIndex : selectedKitIndices){
			System.out.println("SerialNum"+penaltyView.getTblViewPenalties().getItem(selectedKitIndex));
			String serialNum = penaltyView.getTblViewPenalties().getItem(selectedKitIndex).getText();
			System.out.println(serialNum);
			Kit kitSelected = kitModel.getKitDetailsForSerialNum(serialNum);
			kitSelected.setKitPenalty(0.0);
			kitModel.updateKitDetails(kitSelected);
			
		}
		
	}

}
