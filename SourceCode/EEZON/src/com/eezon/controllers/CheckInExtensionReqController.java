package com.eezon.controllers;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.eezon.models.CheckInExtensionRequest;
import com.eezon.models.Course;
import com.eezon.models.Kit;
import com.eezon.views.CheckInExtensionReqView;

public class CheckInExtensionReqController {
		private CheckInExtensionReqView checkInExtensionReqView;
		private Course courseModel;
		private Kit kitModel;
		private CheckInExtensionRequest checkInExtensionReqModel;
		
		public CheckInExtensionReqController(){
			this.checkInExtensionReqView= new CheckInExtensionReqView();
			this.courseModel= new Course();
			this.kitModel= new Kit();
			this.checkInExtensionReqModel= new CheckInExtensionRequest();
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
		

}

