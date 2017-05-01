package com.eezon.viewkitdetails.stratergy;

import com.eezon.controllers.ViewKitDetailsCoursewiseController;
import com.eezon.models.Kit;
import com.eezon.views.ViewKitDetailsCoursewiseView;

public interface IViewKitDetailsBtnAction {
	
	public void doAction(ViewKitDetailsCoursewiseView viewKitDetailsCoursewiseView,Kit kitModel);
}
