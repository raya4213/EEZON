package com.eezon.viewkitdetails.stratergy;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.controllers.ViewKitDetailsCoursewiseController;
import com.eezon.models.Course;
import com.eezon.models.Kit;
import com.eezon.views.ViewKitDetailsCoursewiseView;

public class BtnBackAction implements IViewKitDetailsBtnAction{
	
	@Override
	public void doAction(ViewKitDetailsCoursewiseController viewKitDetailsCoursewiseController,ViewKitDetailsCoursewiseView viewKitDetailsCoursewiseView, Kit kitModel) {
		// TODO Auto-generated method stub
		viewKitDetailsCoursewiseController.getPrevShell().setVisible(true);
		viewKitDetailsCoursewiseView.getShlEezonView().dispose();
		
	}
}
