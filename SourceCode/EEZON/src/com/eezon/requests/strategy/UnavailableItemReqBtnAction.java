package com.eezon.requests.strategy;

import org.eclipse.swt.SWT;

import com.eezon.controllers.UnavailableItemReqController;
import com.eezon.dialogs.ConfirmationDialog;
import com.eezon.models.CourseToEmbed;
import com.eezon.models.UnavailableItem;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.views.UnavailableItemReqView;

public class UnavailableItemReqBtnAction implements IUnavailableItemBtnAction{

	@Override
	public void doAction(UnavailableItemReqController	unavailableItemReqController,UnavailableItemReqView unavailableItemReqView,
			UnavailableItemRequest unavailableItemReqModel) {
		// TODO Auto-generated method stub
		
		ConfirmationDialog confirmDialog = new ConfirmationDialog(unavailableItemReqView.getShlEezon(), SWT.NULL);
		String result = (String)confirmDialog.open();
		
		if(result.equalsIgnoreCase("Yes")){
			UnavailableItemRequest req = new UnavailableItemRequest();
			req.setReqFrom("sharath.vontari@colorado.edu");
			req.setReqStatus("Pending Approval");
			req.setReqType("UnavailableItem");
			
			UnavailableItem unavailableItem = new UnavailableItem();
			unavailableItem.setCost(Double.parseDouble(unavailableItemReqView.getEnterCost().getText()));
			unavailableItem.setName(unavailableItemReqView.getEnterName().getText());
			unavailableItem.setLink(unavailableItemReqView.getEnterLink().getText());
			unavailableItem.setNumComponents(Integer.parseInt(unavailableItemReqView.getComNumOfItems().getText()));
			
			CourseToEmbed course = new CourseToEmbed();
			course.setCourseName(unavailableItemReqView.getCmbSelectCourse().getText());
			course.setYear("2017");
			course.setSemester("Spring");
			
			unavailableItem.setRequestForCourse(course);
			unavailableItem.setUnavailableItemType(unavailableItemReqView.getCmbSelectItemType().getText());
			
			req.setUnavailableItem(unavailableItem);
			
			unavailableItemReqModel.addRequest(req);
		}
	}

}
