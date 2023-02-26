//***********************************************************************************
//* Description
//*------------
//* Edit plant test
//***********************************************************************************
//*
//* Author           : SIVABALAN RAHUL
//* Date Written     : 25/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Author        Comments
//* ================       ====         =====        ========
//*                        25/02/2023   RAHUL.S    Orginal Version
//*
//************************************************************************************

package com.invicta.qa.testcases.sbu;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.Loginpg;
import com.invicta.qa.pages.sbu.EditPlantPage;

public class FinaleditPlant extends DriverIntialization{
	
//********************************************************************************************************
// 							 THE METHOD IS FOR GENERATING REPORT 
//********************************************************************************************************	
	public static void TestCasePrint(String TestCaseName, Object expectedValue, Object actualValue) {
        boolean position = true;
        
        ExtentTest testCase = extent.createTest(TestCaseName);
        try {
            AssertJUnit.assertEquals(actualValue, expectedValue);
        } catch (AssertionError e) {
            position = false;
        }
        if (position) {
            testCase.log(Status.INFO, "Actual value: " + actualValue.toString());
            testCase.log(Status.INFO, "Expected value: " + expectedValue.toString());
            testCase.log(Status.PASS, "TEST PASS ☑");
        } else {
            testCase.log(Status.INFO, "Actual value: " + actualValue.toString());
            testCase.log(Status.INFO, "Expected value: " + expectedValue.toString());
            testCase.log(Status.FAIL, "TEST FAIL ❎");
        }
    }
	@Test
	public static void login() throws InterruptedException,IOException{
//********************************************************************************************************		
// 					THIS METHOD IS FOR LOGIN AND CLICKING THE MASTER AND GO TO PLANT
//********************************************************************************************************		
				Loginpg.login();
				Thread.sleep(4000);
				EditPlantPage editplantpg = new EditPlantPage();
				PageFactory.initElements(driver, editplantpg);
				Thread.sleep(3000);
				try {
				EditPlantPage.clickplant.click();
				Thread.sleep(3000);
				
//STEP-01, STEP-02 THE NAME SEARCH			
				search();
//THE FIRST FIELD NEEDS TO BE DISABLED				
				EditPlant.checkfirstfield();
//EDIT THE PLANT NAME ONLY
				EditPlant.PlantNameEdit();
				
				
//CHECK THE UPDATE BUTTON UI PROPERTIES				
				EditPlant.checkUpdateButton();
//CLICK THE UPDATE BUTTON
				EditPlant.ClickUpdateButton();
				Thread.sleep(3000);
//AGAIN SEARCH THE NAME TO CONFIRM THE EDIT			
				search();	
// CONFIRM THE EDIT
				nameconfirm();
//CLICK THE CANCEL BUTTON
				EditPlantPage.cancelbutton.click();

//THIS METHOD IS FOR LOGOUT
				EditPlant.logout();
				}catch(Exception e){
					EditPlant.logout();
				}
				
				
//********************************************************************************************************	
	}
	
//********************************************************************************************************		
//								 THIS METHOD IS FOR SEARCH THE EXACT NAME WHAT WE GIVEN
//********************************************************************************************************	
	public static void search() throws InterruptedException,IOException{	
		String Name = "TR";
        String NameXpath_firstPart = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[";
        String NameXpath_lastPart = "]/td[1]";
        String EditXpath_firstPart = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[";
        String EditXpath_lastPart = "]/td[9]/span/a/span";
      //*[@id="root"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[6]/td[9]/span/a/span
        boolean clickNextPage = true;
        boolean sbuExist = false;
        while (clickNextPage) {
            for (int i = 2; i < 102; i++) {
                try {
                    String text = driver.findElement(By.xpath(NameXpath_firstPart + i + NameXpath_lastPart)).getText();
                    System.out.println(text);
                    if (text.equals(Name)) {
                        sbuExist = true;
                        if(driver.findElement(By.xpath(EditXpath_firstPart + i + EditXpath_lastPart)).isDisplayed()){
                        	
                        	testCase = extent.createTest("STEP-01-CHECKING EDIT ICON IS DISPLAYED");
                        	 testCase.log(Status.PASS, "TEST PASS ☑");
                        	
	                        if(driver.findElement(By.xpath(EditXpath_firstPart + i + EditXpath_lastPart)).isEnabled()){
	                        	
	                        	
	                        testCase = extent.createTest("STEP-02-CHECKING EDIT ICON IS ENABLED");
	                        testCase.log(Status.PASS, "TEST PASS ☑");
	                        driver.findElement(By.xpath(EditXpath_firstPart + i + EditXpath_lastPart)).click();
	                        Thread.sleep(2000);
	                        clickNextPage = false;
	                        break;
	                        		}
	                        else
	                        {
	                        	 testCase.log(Status.FAIL, "TEST FAIL ❎");
	                        	System.out.println("Button NOT Enabled");
	                        }
                        }
	                        else
	                        {
	                        	 testCase.log(Status.FAIL, "TEST FAIL ❎");
	                        	System.out.println("Button NOT Displayed");
	                        }
                        
                    }
                } catch (Exception e) {
                }
            }
            if (clickNextPage == true) {
                clickNextPage = driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']"))
                        .isEnabled();
                driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']")).click();
                Thread.sleep(2000);
            } else {
                break;
            }
        }
        if (sbuExist = false) {
            System.out.println("No such Element" + sbuExist);
        }
		
	
	
}
//**********************************************************************************************************************	
//                                     STEP-06-- CONFIRM THE EDIT
//**********************************************************************************************************************	
	public static void nameconfirm() throws InterruptedException,IOException{
//		String cofirmname = EditPlantPage.plantname.getText();
//		System.out.println("Confirm the Name " + cofirmname);
		try {
			String Value = EditPlantPage.plantname.getAttribute("value");
			//System.out.println("plant name *************** " + plantName);
			// Thread.sleep(2000);
			TestCasePrint("STEP-06--CONFIRM THE EDIT", "RMC Balangoda Plant", String.valueOf(Value));
		} catch (Exception e) {
			TestCasePrint("CONFIRM THE EDIT", "RMC Balangoda Plant", String.valueOf(e));
	}
	}
}
