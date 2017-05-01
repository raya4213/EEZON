package com.eezon.requests.strategy;

import java.util.Date;

import com.eezon.models.CheckInExtensionRequest;
import com.eezon.models.CourseToEmbed;
import com.eezon.models.KitToEmbed;
import com.eezon.views.CheckInExtensionReqView;

public class CheckInExtensionReqBtnAction implements ICheckInExtensionBtnAction{

	@Override
	public void doAction(CheckInExtensionReqView checkInExtensionReqView,
			CheckInExtensionRequest checkInExtensionReqModel) {
		// TODO Auto-generated method stub
		
		CheckInExtensionRequest req = new CheckInExtensionRequest();
		req.setReqFrom("sharath.vontari@colorado.edu");
		req.setReqStatus("waiting for approval");
		req.setReqType("check in extension");
		req.setNumDays(Integer.parseInt(checkInExtensionReqView.getCmbSelectTimeFrame().getText()));
		
		KitToEmbed kit = new KitToEmbed();
		kit.setKitSerialNum(checkInExtensionReqView.getCmbSelectKit().getText().split("-")[0]);
		kit.setKitType(checkInExtensionReqView.getCmbSelectKit().getText().split("-")[1]);
		
		long longDate = Date.parse("Mon Apr 10 20:56:02 EDT 2017");
		
		Date checkInDate = new Date(longDate);
		kit.setKitCheckInDate(checkInDate);
		
		Date checkOutDate = new Date();
		kit.setKitCheckOutDate(checkOutDate);
							
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
