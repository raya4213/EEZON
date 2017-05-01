package com.eezon.viewkitdetails.stratergy;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.controllers.ViewKitDetailsCoursewiseController;
import com.eezon.models.Course;
import com.eezon.models.Kit;
import com.eezon.views.ViewKitDetailsCoursewiseView;

public class BtnViewAction implements IViewKitDetailsBtnAction{

	@Override
	public void doAction(ViewKitDetailsCoursewiseView viewKitDetailsCoursewiseView,Kit kitModel) {
		// TODO Auto-generated method stub
		
			
			Course courseView = new Course();
			courseView.setCourseName(viewKitDetailsCoursewiseView.getCmbSelectCourse().getText());
			courseView.setSemester(viewKitDetailsCoursewiseView.getCmbSelectSem().getText());
			courseView.setYear(viewKitDetailsCoursewiseView.getCmbSelectYear().getText());
			//courseView. (viewKitDetailsCoursewiseView.getCmbSelectYear().getText());
			viewKitDetailsCoursewiseView.getTblViewDetails().removeAll();
			ArrayList<Kit> kitsFoundView = kitModel.getKitSerialNums(viewKitDetailsCoursewiseView.getCmbSelectKitType().getText(),courseView);			
			   
			
			//viewKitDetailsCoursewiseView.getTblViewDetails().removeAll();
			
			for(Kit kitFound : kitsFoundView){
				//TableItem item = new TableItem(penaltyView.getTblViewPenalties(), SWT.NULL);
				TableItem item = new TableItem(viewKitDetailsCoursewiseView.getTblViewDetails(), SWT.NULL);
		        item.setText(0, kitFound.getKitSerialNum());
		        item.setText(1, kitFound.getKitCheckInDate().toString());
		        item.setText(2, kitFound.getKitCheckOutDate().toString());
		        item.setText(3, kitFound.getKitCourse().getCourseName());
		        item.setText(4, kitFound.getKitPenalty()+"");
		        item.setText(5, kitFound.getKitType());
		        item.setText(6, kitFound.getStudentEmailKit());
		        item.setText(7, kitFound.getStudentNameForKit());

			}

		
		
		
	}

}
