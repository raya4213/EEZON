package com.eezon.listeners;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import com.eezon.models.Course;
import com.eezon.models.Kit;
import com.eezon.views.PenaltyManagementView;

public class PenaltyMgtBtnListener implements MouseListener {

	PenaltyManagementView penaltyView;
	Kit kitModel;
	
	public PenaltyMgtBtnListener(PenaltyManagementView _penaltyView, Kit _kitModel) {
		// TODO Auto-generated constructor stub
		penaltyView = _penaltyView;
		kitModel = _kitModel;
	}
	
	@Override
	public void mouseDoubleClick(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Button btnPressed = (Button)arg0.widget;
		System.out.println("mouseDown" + arg0);


		switch(btnPressed.getData().toString()){
			
			case "radView":
				System.out.println("RadView pressed");
				hideAllOptions();
				penaltyView.getGrpByCourseEmail().setVisible(true);
				
				break;
			
			case "radOverride":
				System.out.println("RadOverride pressed");
				hideAllOptions();
				
				penaltyView.getTblViewPenalties().setVisible(true);
				penaltyView.getBtnOverride().setVisible(true);
				
				//Need to search email id of user 
				ArrayList<Kit> kitsFound = kitModel.getStudentSpecificKitDetailsWithPenalty("asd");
				
				penaltyView.getTblViewPenalties().removeAll();
				
				for(Kit kitFound : kitsFound){
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
				break;
			
			case "btnByCourse":
				System.out.println("By Course pressed");
				hideCourseEmailOptions();
				
				penaltyView.getGrpByCourse().setVisible(true);
				penaltyView.getBtnView().setVisible(true);
				break;
				
			
			case "btnByEmail":
				System.out.println("By Email pressed");
				hideCourseEmailOptions();
				
				penaltyView.getGrpByEmail().setVisible(true);
				penaltyView.getBtnView().setVisible(true);
				break;
				
			case "btnView":
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
				
				break;
				
			case "btnOverride":
				System.out.println("Override Btn pressed");
				System.out.println("NumSelected"+penaltyView.getTblViewPenalties().getSelectionCount());
				int selectedKitIndices [] = penaltyView.getTblViewPenalties().getSelectionIndices();
				for(int selectedKitIndex : selectedKitIndices){
					System.out.println("SerialNum"+penaltyView.getTblViewPenalties().getItem(selectedKitIndex));
					String serialNum = penaltyView.getTblViewPenalties().getItem(selectedKitIndex).getText();
					System.out.println(serialNum);
					Kit kitSelected = kitModel.getKitDetailsForSerialNum(serialNum);
					kitSelected.setKitPenalty(0.0);
					kitModel.updateKitDetails(kitSelected);
					
				}
				
				break;
				
			case "btnHome":
				System.out.println("Home pressed");
				
				break;
				
			case "btnBack":
				System.out.println("Back pressed");
				
				break;
		}
	}

	@Override
	public void mouseUp(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void hideAllOptions(){
		penaltyView.getGrpByCourseEmail().setVisible(false);
		penaltyView.getGrpByCourse().setVisible(false);
		penaltyView.getGrpByEmail().setVisible(false);
		penaltyView.getBtnView().setVisible(false);
		penaltyView.getTblViewPenalties().setVisible(true);
		penaltyView.getBtnOverride().setVisible(false);
		
		penaltyView.getBtnByCourse().setSelection(false);
		penaltyView.getBtnByEmail().setSelection(false);
	}
	
	public void hideCourseEmailOptions(){
		penaltyView.getGrpByCourse().setVisible(false);
		penaltyView.getGrpByEmail().setVisible(false);
		penaltyView.getBtnView().setVisible(false);
	}

}
