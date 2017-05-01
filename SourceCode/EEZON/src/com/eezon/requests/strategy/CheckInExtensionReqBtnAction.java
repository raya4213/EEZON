package com.eezon.requests.strategy;

import java.util.Date;

import org.eclipse.swt.SWT;

import com.eezon.controllers.CheckInExtensionReqController;
import com.eezon.dialogs.ConfirmationDialog;
import com.eezon.models.CheckInExtensionRequest;
import com.eezon.models.CourseToEmbed;
import com.eezon.models.KitToEmbed;
import com.eezon.views.CheckInExtensionReqView;

public class CheckInExtensionReqBtnAction implements ICheckInExtensionBtnAction{

	@Override
	public void doAction(CheckInExtensionReqController checkInExtensionReqController, CheckInExtensionReqView checkInExtensionReqView,
			CheckInExtensionRequest checkInExtensionReqModel) {
		// TODO Auto-generated method stub
		
		ConfirmationDialog confirmDialog = new ConfirmationDialog(checkInExtensionReqView.getShlEezon(), SWT.NULL);
		String result = (String)confirmDialog.open();
		
		if(result.equalsIgnoreCase("Yes")){
			CheckInExtensionRequest req = new CheckInExtensionRequest();
			req.setReqFrom("sharath.vontari@colorado.edu");
			req.setReqStatus("Pending Approval");
			req.setReqType("CheckInExtension");
			req.setNumDays(Integer.parseInt(checkInExtensionReqView.getCmbSelectTimeFrame().getText()));
			
			KitToEmbed kit = new KitToEmbed();
			kit.setKitSerialNum(checkInExtensionReqView.getCmbSelectKit().getText().split("-")[0]);
			kit.setKitType(checkInExtensionReqView.getCmbSelectKit().getText().split("-")[1]);
			
			long longDate = Date.parse("Mon Apr 10 20:56:02 EDT 2017");
			
			Date checkOutDate = new Date(longDate);
			kit.setKitCheckOutDate(checkOutDate);
			
			Date checkInDate = new Date();
			kit.setKitCheckInDate(checkInDate);
								
			CourseToEmbed kitCourse = new CourseToEmbed();
			kitCourse.setCourseName(checkInExtensionReqView.getCmbSelectCourse().getText());
			kitCourse.setDescription(checkInExtensionReqView.getCmbSelectCourse().getText());
			kitCourse.setSemester("Spring");
			kitCourse.setYear("2017");
			kit.setKitCourse(kitCourse);
			kit.setKitPenalty(0.0);
			kit.setStudentEmailKit("sharat.vontari@colorado.edu");
			kit.setStudentNameForKit("Sharat Vontari");
			
			req.setRequestKit(kit);
			checkInExtensionReqModel.addRequest(req);
		}
	}

}
