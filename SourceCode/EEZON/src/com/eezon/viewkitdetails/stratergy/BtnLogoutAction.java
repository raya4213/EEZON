package com.eezon.viewkitdetails.stratergy;

import com.eezon.controllers.ViewKitDetailsCoursewiseController;
import com.eezon.models.Kit;
import com.eezon.views.ViewKitDetailsCoursewiseView;

public class BtnLogoutAction implements IViewKitDetailsBtnAction{

	@Override
	public void doAction(ViewKitDetailsCoursewiseController viewKitDetailsCoursewiseController,ViewKitDetailsCoursewiseView viewKitDetailsCoursewiseView, Kit kitModel) {
		// TODO Auto-generated method stub
		viewKitDetailsCoursewiseController.getPrevShell().dispose();
		viewKitDetailsCoursewiseView.getShlEezonView().dispose();
		viewKitDetailsCoursewiseController.getLoginShell().setVisible(true);
	}

}
