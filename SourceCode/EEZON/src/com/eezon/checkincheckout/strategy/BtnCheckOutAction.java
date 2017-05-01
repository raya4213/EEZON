package com.eezon.checkincheckout.strategy;
import java.util.Date;

import org.eclipse.swt.SWT;

import com.eezon.checkincheckout.strategy.ICheckInCheckOutBtnAction;
import com.eezon.controllers.UpdateCheckInCheckOutController;
import com.eezon.dialogs.ConfirmationDialog;
import com.eezon.models.CourseToEmbed;
import com.eezon.models.Kit;
import com.eezon.views.UpdateCheckInCheckOutView;

public class BtnCheckOutAction implements ICheckInCheckOutBtnAction{

	@Override
	public void doAction(UpdateCheckInCheckOutController cInCoutcontoller,
			UpdateCheckInCheckOutView updateCheckInCheckOutView, Kit kitModel) {
		// TODO Auto-generated method stub
		System.out.println("Inside btnView onClick");
		
		ConfirmationDialog confirmDialog = new ConfirmationDialog(updateCheckInCheckOutView.getShlEezonCheck(), SWT.NULL);
		String result = (String)confirmDialog.open();
		
		if(result.equalsIgnoreCase("Yes")){
			/*CourseToEmbed course = new CourseToEmbed();
			course.setCourseName(updateCheckInCheckOutView.getCmbSelectCourse().getText());
			course.setYear("2016");
			course.setSemester("Fall");*/
			
			Kit kitType = kitModel.getKitDetailsForSerialNum(updateCheckInCheckOutView.getCmbKitSerialNumber().getText());//new Kit();
			
			/*kitType.setKitType(updateCheckInCheckOutView.getCmbSelectKitType().getText());
			kitType.setKitSerialNum(updateCheckInCheckOutView.getCmbKitSerialNumber().getText());
			kitType.setStudentEmailKit(updateCheckInCheckOutView.getTxtEmail().getText());*/
			
			Date date = new Date();
			kitType.setKitCheckOutDate(date);
			
			/*kitType.setKitCourse(course);
			kitType.setStudentEmailKit("asd");*/
			
			kitModel.updateKitDetails(kitType);
		}
	}

}
