//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy(one test case)
//***********************************************************************************
//*
//* Author           : SIVABALAN RAHUL
//* Date Written     : 17/02/2023
//* Modified Date    : 20/02/2023
//*
//* 
//* Test Case Number       Date         Author        Comments
//* ================       ====         =====        ========
//*                        17/02/2023   RAHUL.S    Orginal Version
//*
//************************************************************************************
package com.invicta.qa.testcases.sbu;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.Loginpg;
import com.invicta.qa.pages.sbu.AddSbuFunPage;
import com.invicta.qa.testcases.login.LoginTest;

public class MethodCalling extends DriverIntialization{
@Test
	public static void FirstTestCase() throws InterruptedException, IOException {

		//THIS METHOD IS FOR LOGIN
		Loginpg.login();
	

		// STEP-1 ADD-SBU UI METHO,ADD-SBU-BUTTON-ENABLED,CHECK THE CLICKABILITY, ADD-SBU-VISIBLE,
		// ADD-SBU-FONT-COLOUR,ADD SBU-FONT- SIZE,Add SBU BUTTON FONT FAMILY,Add SBU BUTTON SPELLING
		// Add SBU BUTTON POSITION,Add SBU BUTTON PADDING,Add SBU BUTTON SHADOW,Add SBU BACKGROUND COLOR,Add SBU BORDER COLOR
		// Add SBU CURSER POINT,Add SBU OPACITY,Add SBU HEIGHT,Add SBU WIDTH,Add SBU FONT WEIGHT )
		AddSbuUITest.addsbubutton();
		//Thread.sleep(3000);
		
		// METHOD-2 -- ADD-SBU BUTTON CLICK METHOD(ADD-SBU CLICK)
		AddSbuUITest.addsbuclick();
		//Thread.sleep(3000);
		// STEP-3 THIS METHOD IS FOR POPUP WINDOW UI PROPERTIES(POPUP-Window-Visible,POPUP-WINDOW-POSITION,POPUP-WINDOW SIZE,POPUP-WINDOW-BORDER-COLOR
		//POPUP-WINDOW-OVERFLOW-TYPE,POPUP-WINDOW-MARGIN,POPUP-WINDOW-CURSOR-TYPE,POPUP-WINDOW-Z-INDEX-TYPE,)
		AddSbuUITest.addsbumodal();
		//Thread.sleep(3000);
		//  STEP-4 THIS METHOD IS FOR ADD-SBU TEXT(INSIDE  POPUP-WINDOW) UI PROPERTIES(ADD-SBU-TEXT-DISPLAYED,ADD-SBU-TEXT-FONT-COLOUR
		// ADD-SBU-TEXT-FONT-SIZE,ADD-SBU-TEXT-FONT-STYLE,ADD-SBU-TEXT-SPELLING,ADD-SBU-TEXT-FONT-FAMILY,ADD-SBU-TEXT-POSITION
		// ADD-SBU-TEXT-PADDING,ADD-SUB-TEXT-SHADOW,ADD-SBU-TEXT-LETTER-SPACING,ADD-SBU-TEXT-ALIGNMENT,ADD-SBU-TEXT-TRANSFORMATION
		// ADD-SBU-TEXT-LINE-HEIGHT,ADD-SBU-TEXT-DECORATION,ADD-SBU-TEXT-VERTICAL-ALIGNMENT,ADD-SBU-TEXT-INDENT,ADD-SBU-TEXT-ORIENTATION
		AddSbuUITest.sbutextbox();
		//Thread.sleep(3000);
		// //STEP-5 THIS METHOD IS FOR DESCRIPTION TEXT BOX UI PROPERTIES(DESCRIPTION-TEXTBOX-DISPLAYED,DESCRIPTION-TEXTBOX-ENABLED,DESCRIPTION-TEXTBOX-POSITION
		// DESCRIPTION-TEXTBOX-POSITION,DESCRIPTION-TEXTBOX-BACKGROUND-COLOUR,DESCRIPTION-TEXTBOX-FONT-COLOUR,DESCRIPTION-TEXTBOX-FONT-COLOUR
		//DESCRIPTION-TEXTBOX-FONT-SIZE,DESCRIPTION-TEXTBOX-FONT-STYLE,DESCRIPTION-TEXTBOX-SIZE,DESCRIPTION-TEXTBOX-FONT-STYLE,DESCRIPTION-TEXTBOX-SIZE)
		AddSbuUITest.descriptiontextbox();
		//Thread.sleep(3000);
		// // STEP-6 -- THIS METHOD IS FOR ADD DATA
		AddSbuUITest.sbudata("testing","testing");
		//Thread.sleep(3000);
		// STEP-7 THIS METHOD IS FOR ADD-SBU-TEXT UI PROPERTIES(SBU-TEXT-DISPLAYED,SBU-TEXT-FONT-COLOUR,SBU-TEXT-FONT-SIZE
		//SBU-TEXT-FONT-STYLE,SBU-TEXT-SPELLING,SBU-TEXT-FONT-FAMILY,SBU-TEXT-POSITION,SBU-TEXT-PADDING,SBU-TEXT-MARGIN
		// SBU-TEXT-SHADOW,SBU-TEXT-LETTER-SPACING,SBU-TEXT-ALIGNMENT,SBU-TEXT-TRANSFORMATION,SBU-TEXT-LINE-HEIGHT,SBU-TEXT-DECORATION
		//SBU-TEXT-VERTICAL-ALIGNMENT,SBU-TEXT-INDENT,SUB-TEXT-ORIENTATION)
		AddSbuUITest.addsbutext();
		//Thread.sleep(3000);
		// STEP-8 THIS METHOD IS FOR DESCRIPTION TEXT UI PROPERTIES((SBU-DESCRIPTION-DISPLAYED,SBU-DESCRIPTION-FONT-COLOUR,SBU-DESCRIPTION-FONT-SIZE
		//SBU-DESCRIPTION-FONT-STYLE,SBU-DESCRIPTION-SPELLING,SBU-DESCRIPTION-FONT-FAMILY,SBU-DESCRIPTION-POSITION,SBU-DESCRIPTION-PADDING,SBU-DESCRIPTION-MARGIN
		// SBU-DESCRIPTION-SHADOW,SBU-DESCRIPTION-LETTER-SPACING,SBU-DESCRIPTION-ALIGNMENT,SBU-DESCRIPTION-TRANSFORMATION,SBU-DESCRIPTION-LINE-HEIGHT,SBU-DESCRIPTION-DECORATION
		//SBU-DESCRIPTION-VERTICAL-ALIGNMENT,SBU-DESCRIPTION-INDENT,SUB-DESCRIPTION-ORIENTATION))
		AddSbuUITest.description();
		//Thread.sleep(3000);
		//STEP-9  THIS METHOD IS FOR SAVE BUTTON PROPERTIES(ELEMENT-VISIBILITY,BUTTON-POSITION,FONT-SIZE,BUTTON-SIZE
		// BUTTON-ENABLE,BUTTON-COLOR,BORDER-COLOR,FONT-TYPE,SAVE-BUTTON-FONT-COLOUR,BORDER-COLOR,FONT-TYPE
		// SAVE-BUTTON-FONT-COLOUR,SAVE-BUTTON-CURSOR,SAVE BUTTON SPELLING,SAVE-BUTTON-PADDING,SAVE-BUTTON-RADIUS
		// SAVE-BUTTON-OPACITY,SAVE-BUTTON-FONT-WEIGHT	
		AddSbuUITest.SaveButtonUI();
		
		String checkFirst = AddSbuFunPage.tableRow.getText();
		System.out.println(checkFirst);
		
		if(checkFirst.equals("testing")) {
			testCase = extent.createTest("Checking already exists");
			//testCase.log(Status.INFO, "Already exists");
			AddSbuUITest.clicksave();
		}
		else {
			//Thread.sleep(3000);
			//STEP-10 --THIS METHOD IS FOR SAVE BUTTON FUNCTION
			AddSbuUITest.clicksave();
			
			
			
			//STEP-11 -- CHECK THE LAST ADD SBU VALUE(LAST-ADDED-DATA)
			AddSbuUITest.checkLastAddvalue();
		}
		
	}

}