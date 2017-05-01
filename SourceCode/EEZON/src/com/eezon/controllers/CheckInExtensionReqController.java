package com.eezon.controllers;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.models.CheckInExtensionRequest;
import com.eezon.models.Course;
import com.eezon.models.CourseToEmbed;
import com.eezon.models.Kit;
import com.eezon.models.KitToEmbed;
import com.eezon.models.UnavailableItem;
import com.eezon.models.UnavailableItemRequest;
import com.eezon.requests.strategy.ICheckInExtensionBtnAction;
import com.eezon.views.CheckInExtensionReqView;

import java.util.ArrayList;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseEvent;

public class CheckInExtensionReqController implements MouseListener {
		private CheckInExtensionReqView checkInExtensionReqView;
		private Course courseModel;
		private Kit kitModel;
		private CheckInExtensionRequest checkInExtensionReqModel;
		
		public CheckInExtensionReqController(){
			this.checkInExtensionReqView= new CheckInExtensionReqView();
			this.courseModel= new Course();
			this.kitModel= new Kit();
			this.checkInExtensionReqModel= new CheckInExtensionRequest();
			initializeListeners();
			updateTblDetails("sharath.vontari@colorado.edu");
			checkInExtensionReqModel.attach(checkInExtensionReqView);
		}
		
		public void initializeListeners(){
			checkInExtensionReqView.getBtnRequest().addMouseListener(this);
			checkInExtensionReqView.getBtnHome().addMouseListener(this);
			checkInExtensionReqView.getBtnBack().addMouseListener(this);
		}
		
		public void updateTblDetails(String email){
			//Need to search email id of user 
			ArrayList<CheckInExtensionRequest> reqsFound = checkInExtensionReqModel.getCheckInExtensionRequests(email);
			
			checkInExtensionReqView.getTblReqDetails().removeAll();
			
			for(CheckInExtensionRequest reqFound : reqsFound){
				TableItem item = new TableItem(checkInExtensionReqView.getTblReqDetails(), SWT.NULL);
		        item.setText(0, reqFound.getReqId()+"");
		        item.setText(1, reqFound.getReqStatus());
		        item.setText(2, reqFound.getRequestKit().getKitSerialNum());
		        item.setText(3, reqFound.getRequestKit().getKitType());
		        item.setText(4, reqFound.getNumDays()+"");
		        item.setText(5, reqFound.getRequestKit().getKitCheckOutDate()+"");
		        item.setText(6, reqFound.getRequestKit().getKitCourse().getCourseName());
			}
		}
		
		public void displayView(){
			Shell shell= checkInExtensionReqView.getShlEezon();
			Display display= checkInExtensionReqView.getDisplay();
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}

		public CheckInExtensionReqView getCheckInExtensionReqView() {
			return checkInExtensionReqView;
		}

		public void setCheckInExtensionReqView(CheckInExtensionReqView checkInExtensionReqView) {
			this.checkInExtensionReqView = checkInExtensionReqView;
		}

		public Course getCourseModel() {
			return courseModel;
		}

		public void setCourseModel(Course courseModel) {
			this.courseModel = courseModel;
		}

		public Kit getKitModel() {
			return kitModel;
		}

		public void setKitModel(Kit kitModel) {
			this.kitModel = kitModel;
		}

		public CheckInExtensionRequest getCheckInExtensionReqModel() {
			return checkInExtensionReqModel;
		}

		public void setCheckInExtensionReqModel(CheckInExtensionRequest checkInExtensionReqModel) {
			this.checkInExtensionReqModel = checkInExtensionReqModel;
		}


		@Override
		public void mouseDoubleClick(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDown(MouseEvent arg0) {
			// TODO Auto-generated method stub
			Button btnPressed = (Button)arg0.widget;
			
			ICheckInExtensionBtnAction btnAction = (ICheckInExtensionBtnAction)btnPressed.getData();
			btnAction.doAction(checkInExtensionReqView, checkInExtensionReqModel);
			
			/*switch(btnPressed.getData().toString()){
				case "btnRequest":
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

