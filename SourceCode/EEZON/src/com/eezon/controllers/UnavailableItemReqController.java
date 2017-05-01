package com.eezon.controllers;


import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.models.Course;
import com.eezon.models.CourseToEmbed;
import com.eezon.models.Kit;
import com.eezon.models.UnavailableItem;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.models.User;
import com.eezon.requests.strategy.IUnavailableItemBtnAction;
import com.eezon.views.UnavailableItemReqView;

public class UnavailableItemReqController implements MouseListener {
	private UnavailableItemReqView unavailableItemReqView;
	private Course courseModel;
	private UnavailableItemRequest unavailableItemReqModel;
	private User userModel;
	private Shell prevShell;
	
	public UnavailableItemReqController(User userModel, Shell prevShell){
		this.unavailableItemReqView= new UnavailableItemReqView();
		this.courseModel=new Course();
		this.unavailableItemReqModel=new UnavailableItemRequest();
		initializeListeners();
		updateTblDetails("sharath.vontari@colorado.edu");
		unavailableItemReqModel.attach(unavailableItemReqView);
		this.userModel = userModel;
		this.prevShell = prevShell;
		
	}
	
	public void initializeListeners(){
		unavailableItemReqView.getBtnRequest().addMouseListener(this);
		unavailableItemReqView.getBtnHome().addMouseListener(this);
		unavailableItemReqView.getBtnBack().addMouseListener(this);
	}
	
	public void updateTblDetails(String email){
		//Need to search email id of user 
		ArrayList<UnavailableItemRequest> reqsFound = unavailableItemReqModel.getUnavailableItemRequests(email);
		
		unavailableItemReqView.getTblReqDetails().removeAll();
		
		for(UnavailableItemRequest reqFound : reqsFound){
			TableItem item = new TableItem(unavailableItemReqView.getTblReqDetails(), SWT.NULL);
	        item.setText(0, reqFound.getReqId()+"");
	        item.setText(1, reqFound.getReqStatus());
	        item.setText(2, reqFound.getUnavailableItem().getUnavailableItemType());
	        item.setText(3, reqFound.getUnavailableItem().getName());
	        item.setText(4, reqFound.getUnavailableItem().getNumComponents()+"");
	        item.setText(5, reqFound.getUnavailableItem().getCost()+"");
	        item.setText(6, reqFound.getUnavailableItem().getRequestForCourse().getCourseName());
		}
	}
	
	public void displayView(){
		this.prevShell.setVisible(false);
		Shell shell= unavailableItemReqView.getShlEezon();
		Display display= unavailableItemReqView.getDisplay();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public UnavailableItemReqView getUnavailableItemReqView() {
		return unavailableItemReqView;
	}
	public void setUnavailableItemReqView(UnavailableItemReqView unavailableItemReqView) {
		this.unavailableItemReqView = unavailableItemReqView;
	}
	public Course getCourseModel() {
		return courseModel;
	}
	public void setCourseModel(Course courseModel) {
		this.courseModel = courseModel;
	}
	public UnavailableItemRequest getUnavailableItemReqModel() {
		return unavailableItemReqModel;
	}
	public void setUnavailableItemReqModel(UnavailableItemRequest unavailableItemReqModel) {
		this.unavailableItemReqModel = unavailableItemReqModel;
	}

	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Button btnPressed = (Button)arg0.widget;
		
		IUnavailableItemBtnAction btnAction = (IUnavailableItemBtnAction)btnPressed.getData();
		btnAction.doAction(unavailableItemReqView, unavailableItemReqModel);
		
		/*switch(btnPressed.getData().toString()){
			case "btnRequest":
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
				
				break;
			case "btnHome":
				break;
			case "btnBack":
				break;
		}*/
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	 
}
