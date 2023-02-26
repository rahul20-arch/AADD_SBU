//***********************************************************************************
//* Description
//*------------
//* Relevant Edit plant test
//***********************************************************************************
//*
//* Author           : SIVABALAN RAHUL
//* Date Written     : 22/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Author        Comments
//* ================       ====         =====        ========
//*                        22/02/2023   RAHUL.S    Orginal Version
//*
//************************************************************************************
package com.invicta.qa.testcases.sbu;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.Loginpg;
import com.invicta.qa.pages.sbu.EditPlantPage;
import com.invicta.qa.pages.sbu.ReleventTestEditPage;

public class RelevantTestsEdited extends DriverIntialization {
	boolean expectselect;
	boolean Value1;
	boolean Value2 ;
//********************************************************************************************************
//                                  	 THE METHOD IS FOR GENERATING REPORT 
//********************************************************************************************************		
	public static void TestCasePrint(String TestCaseName, String expectedValue, String actualValue) {
		boolean position = true;
		ExtentTest testCase = extent.createTest(TestCaseName);
		try {
			AssertJUnit.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			position = false;
		}
		if (position) {
			testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
			testCase.log(Status.INFO, "Expectedvalue :- " + expectedValue);
			testCase.log(Status.INFO, "Correct value");
			testCase.log(Status.PASS, actualValue);
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
			testCase.log(Status.INFO, "ExpectedValue :- " + expectedValue);
			testCase.log(Status.INFO, "wrong value");
			testCase.log(Status.FAIL, actualValue);
		}

	}
//********************************************************************************************************
//	 						 THIS METHOD IS FOR SAVE BUTTON UI PROPERTIES
//********************************************************************************************************		
	
	public void saveButtonUi() throws InterruptedException,IOException{
	
		

			testCase = extent.createTest("STEP - 04 CHECKING UI OF SAVE BUTTON");
	//		boolean Value1 = ReleventTestEditPage.saveButton.isDisplayed();

			if (Value1 = ReleventTestEditPage.saveButton.isDisplayed()) {

				try {
					boolean Value = ReleventTestEditPage.saveButton.isDisplayed();
					// Thread.sleep(2000);
					TestCasePrint("1)SAVE BUTTON IS DISPLAYED", "true", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("1)SAVE BUTTON IS DISPLAYED", "true", String.valueOf(e));
				}

				try {
					boolean Value = ReleventTestEditPage.saveButton.isEnabled();
					// Thread.sleep(2000);
					TestCasePrint("2)SAVE BUTTON IS ENABLED", "true", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("2)SAVE BUTTON IS ENABLED", "true", String.valueOf(e));
				}

				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("background-color");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("3)SAVE BUTTON background-color", "rgba(0, 19, 40, 1)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("3)SAVE BUTTON background-color", "rgba(0, 19, 40, 1)", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("padding");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("4)SAVE BUTTON UI - padding", "4px 15px", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("4)SAVE BUTTON UI - padding", "4px 15px", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("font-family");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("5)SAVE BUTTON UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("5)SAVE BUTTON UI - font-family", "Roboto, sans-serif", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("color");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("6)SAVE BUTTON UI - color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("6)SAVE BUTTON UI - color", "rgba(255, 255, 255, 1)", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("font-size");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("7)SAVE BUTTON  UI - font-size", "14px", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("7)SAVE BUTTON  UI - font-size", "14px", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("border-radius");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("8)SAVE BUTTON UI -border-radius", "2px", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("8)SAVE BUTTON UI -border-radius", "2px", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("border-color");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("9)SAVE BUTTON  UI -border-color", "rgb(255, 255, 255)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("9)SAVE BUTTON  UI -border-color", "rgb(255, 255, 255)", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("box-shadow");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("10)SAVE BUTTON UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("10)SAVE BUTTON UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("font-weight");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("11)SAVE BUTTON  UI -font-weight", "400", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("11)SAVE BUTTON  UI -font-weight", "400", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("cursor");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("12)SAVE BUTTON UI -cursor", "pointer", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("12)SAVE BUTTON UI -cursor", "pointer", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("opacity");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("13)SAVE BUTTON UI -opacity", "1", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("13)SAVE BUTTON UI -opacity", "1", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getText();
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("14)SAVE BUTTON UI -text spelling", "Save", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("14)SAVE BUTTON UI -text spelling", "Save", String.valueOf(e));
				}
				try {
					Dimension Value = ReleventTestEditPage.saveButton.getSize();
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("15)SAVE BUTTON UI -Size", "(60, 32)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("15)SAVE BUTTON UI -Size", "(60, 32)", String.valueOf(e));
				}

//				try {
//					Point Value = ReleventTestEditPage.saveButton.getLocation();
//					System.out.println(Value);
//					// Thread.sleep(2000);
//					TestCasePrint("16)SAVE BUTTON  UI -position", "(948, 368)", String.valueOf(Value));
//				} catch (Exception e) {
//					TestCasePrint("16)SAVE BUTTON  UI -position", "(948, 368)", String.valueOf(e));
//				}

			} else {
				TestCasePrint("ELEMENT IS NOT DIPLAYED", "true", String.valueOf(Value1));
			}
	}
//**********************************************************************************************************	
//						CALLING THE ALL METHOD FOR RELEVANT EDIT PLANT WISE
//**********************************************************************************************************	
	@Test
	public static void clickeditplant() throws InterruptedException, IOException {
		//THIS IS FOR NON STATIC
		RelevantTestsEdited checkingTheFun = new RelevantTestsEdited();
//********************************************************************************************************		
//			THIS METHOD IS FOR LOGIN AND CLICKING THE MASTER AND GO TO PLANT
//********************************************************************************************************	
		Loginpg.login();
      Thread.sleep(2000);
      //THIS IS FOR STATIC
      ReleventTestEditPage releventTestEditpg = new ReleventTestEditPage();
      PageFactory.initElements(driver, releventTestEditpg);
//*********************************************************************************************************      
//                         CLICK THE MATERIAL IN TAB SECTIION
//*********************************************************************************************************      
		ReleventTestEditPage.tabMaterial.click();
		Thread.sleep(2000);
//*********************************************************************************************************		
//							CLICK THE MATERIAL IN NAVIGATION 
//*********************************************************************************************************		
		ReleventTestEditPage.navigationMaterial.click();
		Thread.sleep(2000);
//*********************************************************************************************************		
//							CLICK THE RELEVENT EDIT ICON
//*********************************************************************************************************
		try {
		paticularplant();

		
//		Thread.sleep(2000);
//		ReleventTestEditPage.Checkbox.click();
		Thread.sleep(3000);
		
		checkingTheFun.CheckboxClicking();
		Thread.sleep(2000);
		checkingTheFun.saveButtonUi();
		Thread.sleep(2000);
		checkingTheFun.clickSaveButton();
		Thread.sleep(2000);
		checkingTheFun.checking();
		Thread.sleep(2000);
		checkingTheFun.cancelButtonUI();
		Thread.sleep(2000);
		checkingTheFun.clickCancelButton();
		Thread.sleep(2000);
		driver.quit();
		}catch (Exception e) {
			driver.quit();
		}
	}
	
	
//**********************************************************************************************************************	
//									STEP-03 -- THE EDIT FUNCTIONALITY
//***********************************************************************************************************************	

	
	public  void CheckboxClicking() throws InterruptedException, IOException {
		
		        boolean value = ReleventTestEditPage.Checkbox.isSelected();
		        System.out.println("actual:" + value);
		        Thread.sleep(2000);
		        ReleventTestEditPage.Checkbox.click();
		        Thread.sleep(4000);
		        expectselect = ReleventTestEditPage.Checkbox.isSelected();
		        System.out.println("actual:" + value);
		        System.out.println("Expected:" + expectselect);
		        // testCase = extent.createTest("functionality");
		        if (value) {
		            if (!expectselect) {
		                TestCasePrint("STEP-03 -- THE EDIT FUNCTIONALITY", "false", String.valueOf(expectselect));
		            } else {
		                TestCasePrint("STEP-03 -- THE EDIT FUNCTIONALITY", "false", String.valueOf(expectselect));
		            }
		        } else if (!value) {
		            if (expectselect) {
		                TestCasePrint("STEP-03 -- THE EDIT FUNCTIONALITY", "true", String.valueOf(expectselect));
		            } else {
		                TestCasePrint("STEP-03 -- THE EDIT FUNCTIONALITY", "true", String.valueOf(expectselect));
		            }
	}
		        
	}
//**********************************************************************************************************************	
//									STEP-05 --CLICK THE SAVE BUTTON
//***********************************************************************************************************************
	public  void clickSaveButton() throws InterruptedException, IOException {
		Thread.sleep(2000);
		if(ReleventTestEditPage.saveButton.isDisplayed()) {
		ReleventTestEditPage.saveButton.click();
		}else {
			TestCasePrint("Element not displayed", "true", String.valueOf(Value1));
		}
	}
//***********************************************************************************************************************	
// 								STEP-06	-- CHECKING THE SAVED FUNCTIONALLTY
//***********************************************************************************************************************	
	public void checking() throws InterruptedException {
		ReleventTestEditPage.relevantIcon.click();
        Thread.sleep(2000);
        boolean current = ReleventTestEditPage.Checkbox.isSelected();
        if (current == expectselect) {
            TestCasePrint("STEP-06--SAVED SUCESSFULLY", String.valueOf(expectselect), String.valueOf(current));
        } else {
            TestCasePrint("SAVED SUCESSFULLY", String.valueOf(expectselect), String.valueOf(current));
        }
	}
//***********************************************************************************************************************	
//							STEP-07	CHECKING THE CANCEL BUTTON UI PROPERTIES
//***********************************************************************************************************************	
	public  void cancelButtonUI() throws InterruptedException,IOException  {


		testCase = extent.createTest("STEP- 07 -- CHECKING UI OF CANCEL BUTTON");
	//	boolean Value2 = ReleventTestEditPage.cancelButton.isDisplayed();

		if (Value2= ReleventTestEditPage.cancelButton.isDisplayed()) {

			try {
				boolean Value = ReleventTestEditPage.cancelButton.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1)CANCEL BUTTON IS DISPLAYED", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1)CANCEL BUTTON IS DISPLAYED", "true", String.valueOf(e));
			}

			try {
				boolean Value = ReleventTestEditPage.cancelButton.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2)CANCEL BUTTON IS ENABLED", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2)CANCEL BUTTON IS ENABLED", "true", String.valueOf(e));
			}

			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3)CANCEL BUTTON background-color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3)CANCEL BUTTON background-color3.UI - background-color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4)CANCEL BUTTON UI - padding", "4px 15px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4)CANCEL BUTTON UI - padding", "4px 15px", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5)CANCEL BUTTON UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5)CANCEL BUTTON UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6)CANCEL BUTTON UI - color", "rgba(0, 0, 0, 0.85)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6)CANCEL BUTTON UI - color", "rgba(0, 0, 0, 0.85)", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7)CANCEL BUTTON UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7)CANCEL BUTTON UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8)CANCEL BUTTON UI -border-radius", "2px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8)CANCEL BUTTON UI - border-radius", "2px", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9)CANCEL BUTTON UI -border-color", "rgb(217, 217, 217)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9)CANCEL BUTTON UI -border-color", "rgb(217, 217, 217)", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10)CANCEL BUTTON UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10)CANCEL BUTTON UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11)CANCEL BUTTON UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11)CANCEL BUTTON UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12)CANCEL BUTTON UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12)CANCEL BUTTON UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13)CANCEL BUTTON UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13)CANCEL BUTTON UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14)CANCEL BUTTON UI -text spelling", "Cancel", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14)CANCEL BUTTON UI -text spelling", "Cancel", String.valueOf(e));
			}
			try {
				Dimension Value = ReleventTestEditPage.cancelButton.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15)CANCEL BUTTON UI -Size", "(75, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15)CANCEL BUTTON UI -Size", "(75, 32)", String.valueOf(e));
			}

//			try {
//				Point Value = ReleventTestEditPage.cancelButton.getLocation();
//				System.out.println(Value);
//				// Thread.sleep(2000);
//				TestCasePrint("16)CANCEL BUTTON UI -position", "(865, 368)", String.valueOf(Value));
//			} catch (Exception e) {
//				TestCasePrint("16)CANCEL BUTTON UI -position", "(865, 368)", String.valueOf(e));
//			}

		} else {
			TestCasePrint("CANCEL BUTTON IN NOT VISIBLE", "true", String.valueOf(Value2));
		}
	}
//*************************************************************************************************************	
//							STEP-08 -- CLICKING THE CANCEL BUTTON
//*************************************************************************************************************
	public  void clickCancelButton() throws InterruptedException,IOException{
		if(ReleventTestEditPage.cancelButton.isDisplayed()) {
		ReleventTestEditPage.cancelButton.click();
		}else {
			TestCasePrint("ELEMENT IS NOT DISPLAYED", "true", String.valueOf(Value2));
		}
	}
	
//*************************************************************************************************************
//                STEP-01 and STEP-02 -- CLICK THE SPECIFIC PLANT RELEVANT EDIT (TEST NEW IN FIRST PAGE)
//*************************************************************************************************************	
	public static void paticularplant() throws InterruptedException,IOException{
	if(ReleventTestEditPage.plantName.isDisplayed()) {
		testCase = extent.createTest("STEP-01 --THE PLANT WISE RELEVANT TEST NAME IS VISIBLE");
		testCase.log(Status.PASS,"");
		if(ReleventTestEditPage.relevantIcon.isDisplayed() && ReleventTestEditPage.relevantIcon.isEnabled()) {
			testCase = extent.createTest("STEP-02 --THE PLANT WISE RELEVANT TEST EDIT ICON IS VISIBLE AND ENABLED");
			testCase.log(Status.PASS,"");
			ReleventTestEditPage.relevantIcon.click();
		//	search();
			
		}else {
			testCase = extent.createTest("THE ICON IS NOT WORKING");
			testCase.log(Status.FAIL,"STEP-02 --THE PLANT WISE RELEVANT TEST EDIT ICON IS NOT VISIBLE OR ENABLED");
		}
	}else {
		testCase = extent.createTest("THE SEARCH DOES NOT MATCH");
		testCase.log(Status.FAIL,"STEP-01 --THE PLANT WISE RELEVANT TEST NAME IS NOT VISIBLE");
	}
		
	}
	
	
//	public static void search() throws InterruptedException,IOException{	
//		String Name = "Slump Test - At Plant";
//        String NameXpath_firstPart = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[";
//        String NameXpath_lastPart = "]/td[1]";
//        String EditXpath_firstPart = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[";
//        String EditXpath_lastPart = "]/td[3]/label/span";
//      //*[@id="root"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[6]/td[9]/span/a/span
//        boolean clickNextPage = true;
//        boolean sbuExist = false;
//        while (clickNextPage) {
//            for (int i = 2; i < 102; i++) {
//                try {
//                    String text = driver.findElement(By.xpath(NameXpath_firstPart + i + NameXpath_lastPart)).getText();
//                    System.out.println(text);
//                    if (text.equals(Name)) {
//                        sbuExist = true;
//                        if(driver.findElement(By.xpath(EditXpath_firstPart + i + EditXpath_lastPart)).isDisplayed()){
//                        	
//                        	testCase = extent.createTest("STEP-01-CHECKING EDIT ICON IS DISPLAYED");
//                        	 testCase.log(Status.PASS, "TEST PASS ☑");
//                        	
//	                        if(driver.findElement(By.xpath(EditXpath_firstPart + i + EditXpath_lastPart)).isEnabled()){
//	                        	
//	                        	
//	                        testCase = extent.createTest("STEP-02-CHECKING EDIT ICON IS ENABLED");
//	                        testCase.log(Status.PASS, "TEST PASS ☑");
//	                        driver.findElement(By.xpath(EditXpath_firstPart + i + EditXpath_lastPart)).click();
//	                        Thread.sleep(2000);
//	                        clickNextPage = false;
//	                        break;
//	                        		}
//	                        else
//	                        {
//	                        	 testCase.log(Status.FAIL, "TEST FAIL ❎");
//	                        	System.out.println("Button NOT Enabled");
//	                        }
//                        }
//	                        else
//	                        {
//	                        	 testCase.log(Status.FAIL, "TEST FAIL ❎");
//	                        	System.out.println("Button NOT Displayed");
//	                        }
//                        
//                    }
//                } catch (Exception e) {
//                }
//            }
//            if (clickNextPage == true) {
//                clickNextPage = driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']"))
//                        .isEnabled();
//                driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']")).click();
//                Thread.sleep(2000);
//            } else {
//                break;
//            }
//        }
//        if (sbuExist = false) {
//            System.out.println("No such Element" + sbuExist);
//        }
//		
	
	
//}
}
	




