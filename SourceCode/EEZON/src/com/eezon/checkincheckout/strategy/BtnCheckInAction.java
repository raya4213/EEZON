package com.eezon.checkincheckout.strategy;

import java.util.Date;

import org.eclipse.swt.SWT;

import com.eezon.controllers.UpdateCheckInCheckOutController;
import com.eezon.dialogs.ConfirmationDialog;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;

public class BtnCheckInAction implements ICheckInCheckOutBtnAction{

	@Override
	public void doAction(UpdateCheckInCheckOutController cInCoutcontoller,
			UpdateCheckInCheckOutView updateCheckInCheckOutView, Kit kitModel) {
		// TODO Auto-generated method stub
		System.out.println("CheckIn Btn pressed");
		System.out.println("NumSelected"+updateCheckInCheckOutView.getTblCinCoutDetails().getSelectionCount());
		
		ConfirmationDialog confirmDialog = new ConfirmationDialog(updateCheckInCheckOutView.getShlEezonCheck(), SWT.NULL);
		String result = (String)confirmDialog.open();
		
		if(result.equalsIgnoreCase("Yes")){
			int selectedKitIndices [] = updateCheckInCheckOutView.getTblCinCoutDetails().getSelectionIndices();
			for(int selectedKitIndex : selectedKitIndices){
				System.out.println("SerialNum"+updateCheckInCheckOutView.getTblCinCoutDetails().getItem(selectedKitIndex));
				String serialNum = updateCheckInCheckOutView.getTblCinCoutDetails().getItem(selectedKitIndex).getText();
				System.out.println(serialNum);
				Kit kitSelected = kitModel.getKitDetailsForSerialNum(serialNum);
				Date currDate = new Date();
				kitSelected.setKitCheckInDate(currDate);
				kitModel.updateKitDetails(kitSelected);
				
			}
		}
		
	}

}
