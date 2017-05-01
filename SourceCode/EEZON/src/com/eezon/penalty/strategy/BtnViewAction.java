package com.eezon.penalty.strategy;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.controllers.PenaltyManagementController;
import com.eezon.models.Course;
import com.eezon.models.Kit;
import com.eezon.views.PenaltyManagementView;

public class BtnViewAction implements IPenaltyBtnAction{

	@Override
	public void doAction(PenaltyManagementController controller, PenaltyManagementView penaltyView, Kit kitModel) {
		// TODO Auto-generated method stub
		System.out.println("View Btn pressed");
		
		//changing for testing purpose ** requires change in logic as "Email Id" is always the text when visible
		if(penaltyView.getGrpByEmail().getVisible()){
		//if(penaltyView.getTxtEmailId().getVisible()){ 
			// If By Email flow is selected
			System.out.println("Select by Email");
			penaltyView.getTblViewPenalties().removeAll();
			ArrayList<Kit> kitsFoundView = kitModel.getStudentSpecificKitDetails(penaltyView.getTxtEmailId().getText());
			
			for(Kit kitFound : kitsFoundView){
				TableItem item = new TableItem(penaltyView.getTblViewPenalties(), SWT.NULL);
		        item.setText(0, kitFound.getKitSerialNum());
		        item.setText(1, kitFound.getKitCheckInDate().toString());
		        item.setText(2, kitFound.getKitCheckOutDate().toString());
		        item.setText(3, kitFound.getKitCourse().getCourseName());
		        item.setText(4, kitFound.getKitPenalty()+"");
		        item.setText(5, kitFound.getKitType());
		        item.setText(6, kitFound.getStudentEmailKit());
		        item.setText(7, kitFound.getStudentNameForKit());

			}
			
			
		}else{
			// If By Course flow is selected
			System.out.println("Select by Course");
			Course course= new Course();
			course.setCourseName(penaltyView.getCmbSelectCourse().getText());
			course.setSemester(penaltyView.getCmbSelectSem().getText());
			course.setYear(penaltyView.getCmbSelectYear().getText());			
			penaltyView.getTblViewPenalties().removeAll();
			
			ArrayList<Kit> kitsFoundView = kitModel.getCourseSpecificKitDetails(course);
			
			for(Kit kitFound : kitsFoundView){
				TableItem item = new TableItem(penaltyView.getTblViewPenalties(), SWT.NULL);
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

}
