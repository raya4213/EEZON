package com.eezon.requests.strategy;

import com.eezon.models.CourseToEmbed;
import com.eezon.models.UnavailableItem;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.views.UnavailableItemReqView;

public class UnavailableItemReqBtnAction implements IUnavailableItemBtnAction{

	@Override
	public void doAction(UnavailableItemReqView unavailableItemReqView,
			UnavailableItemRequest unavailableItemReqModel) {
		// TODO Auto-generated method stub
		
		UnavailableItemRequest req = new UnavailableItemRequest();
		req.setReqFrom("sharath.vontari@colorado.edu");
		req.setReqStatus("waiting for approval");
		req.setReqType("unavailable item");
		
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
