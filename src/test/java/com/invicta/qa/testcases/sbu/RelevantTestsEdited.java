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
	// This method is for Update button UI
	public void saveButtonUi() throws InterruptedException,IOException{
	
		

			testCase = extent.createTest("CHECKING UI OF SAVE BUTTON");
	//		boolean Value1 = ReleventTestEditPage.saveButton.isDisplayed();

			if (Value1 = ReleventTestEditPage.saveButton.isDisplayed()) {

				try {
					boolean Value = ReleventTestEditPage.saveButton.isDisplayed();
					// Thread.sleep(2000);
					TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
				}

				try {
					boolean Value = ReleventTestEditPage.saveButton.isEnabled();
					// Thread.sleep(2000);
					TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
				}

				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("background-color");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("3. UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("3.UI - background-color", "rgba(0, 19, 40, 1)", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("padding");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("font-family");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("color");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("6. UI - color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("6.UI - color", "rgba(255, 255, 255, 1)", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("font-size");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("border-radius");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("border-color");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("9. UI -border-color", "rgb(255, 255, 255)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("9.UI -border-color", "rgb(255, 255, 255)", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("box-shadow");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("font-weight");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("cursor");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getCssValue("opacity");
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
				}
				try {
					String Value = ReleventTestEditPage.saveButton.getText();
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("14. UI -text spelling", "Save", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("14.UI -text spelling", "Save", String.valueOf(e));
				}
				try {
					Dimension Value = ReleventTestEditPage.saveButton.getSize();
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("15. UI -Size", "(60, 32)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("15.UI -Size", "(60, 32)", String.valueOf(e));
				}

				try {
					Point Value = ReleventTestEditPage.saveButton.getLocation();
					System.out.println(Value);
					// Thread.sleep(2000);
					TestCasePrint("16. UI -position", "(948, 368)", String.valueOf(Value));
				} catch (Exception e) {
					TestCasePrint("16.UI -position", "(948, 368)", String.valueOf(e));
				}

			} else {
				TestCasePrint("Element not displayed", "true", String.valueOf(Value1));
			}
	}
	
	@Test
	public static void clickeditplant() throws InterruptedException, IOException {
		//THIS IS FOR NON STATIC
		RelevantTestsEdited checkingTheFun = new RelevantTestsEdited();
		// THIS METHOD IS FOR LOGIN
		Loginpg.login();
      Thread.sleep(2000);
      //THIS IS FOR STATIC
      ReleventTestEditPage releventTestEditpg = new ReleventTestEditPage();
      PageFactory.initElements(driver, releventTestEditpg);
      //CLICK THE MATERIAL IN TAB SECTIION
		ReleventTestEditPage.tabMaterial.click();
		Thread.sleep(2000);
		//CLICK THE MATERIAL IN NAVIGATION 
		ReleventTestEditPage.navigationMaterial.click();
		Thread.sleep(2000);
		//CLICK THE RELEVENT EDIT ICON
		
		releventEditIcon();
//		ReleventTestEditPage.clickReleventEditIcon.click();
//		Thread.sleep(2000);
//		ReleventTestEditPage.Checkbox.click();
		Thread.sleep(3000);
		
		checkingTheFun.CheckboxClicking();
		checkingTheFun.saveButtonUi();
		checkingTheFun.clickSaveButton();
		checkingTheFun.checking();
		checkingTheFun.cancelButtonUI();
		checkingTheFun.clickCancelButton();
	}
	
	public static void releventEditIcon() throws InterruptedException,IOException{
		//CLICKING THE RELEVENT EDIT ICON
		testCase = extent.createTest("CHECKING THE RELEVENT TEST");
		boolean Value1 = ReleventTestEditPage.clickReleventEditIcon.isDisplayed();

		if (Value1) {

			try {
				boolean Value = ReleventTestEditPage.clickReleventEditIcon.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("THE RELEVENT EDIT ICON- visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("THE RELEVENT EDIT ICON- visibility", "true", String.valueOf(e));
			}


		}
		
				ReleventTestEditPage.clickReleventEditIcon.click();
	}
	
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
		                TestCasePrint("CHECK BOX FUNCTIONALITY", "false", String.valueOf(expectselect));
		            } else {
		                TestCasePrint("CHECK BOX FUNCTIONALITY", "false", String.valueOf(expectselect));
		            }
		        } else if (!value) {
		            if (expectselect) {
		                TestCasePrint("CHECK BOX FUNCTIONALITY", "true", String.valueOf(expectselect));
		            } else {
		                TestCasePrint("CHECK BOX FUNCTIONALITY", "true", String.valueOf(expectselect));
		            }
	}
		        
	}
//	click the save button
	public  void clickSaveButton() throws InterruptedException, IOException {
		Thread.sleep(2000);
		if(ReleventTestEditPage.saveButton.isDisplayed()) {
		ReleventTestEditPage.saveButton.click();
		}else {
			TestCasePrint("Element not displayed", "true", String.valueOf(Value1));
		}
	}
	
	public void checking() throws InterruptedException {
		ReleventTestEditPage.clickReleventEditIcon.click();
        Thread.sleep(2000);
        boolean current = ReleventTestEditPage.Checkbox.isSelected();
        if (current == expectselect) {
            TestCasePrint("SAVED SUCESSFULLY", String.valueOf(expectselect), String.valueOf(current));
        } else {
            TestCasePrint("SAVED SUCESSFULLY", String.valueOf(expectselect), String.valueOf(current));
        }
	}
	public  void cancelButtonUI() throws InterruptedException,IOException  {

		testCase = extent.createTest("CHECKING UI OF CANCEL BUTTON");
	//	boolean Value2 = ReleventTestEditPage.cancelButton.isDisplayed();

		if (Value2= ReleventTestEditPage.cancelButton.isDisplayed()) {

			try {
				boolean Value = ReleventTestEditPage.cancelButton.isDisplayed();
				// Thread.sleep(2000);
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("1. FUNCTIONALITY - visibility", "true", String.valueOf(e));
			}

			try {
				boolean Value = ReleventTestEditPage.cancelButton.isEnabled();
				// Thread.sleep(2000);
				TestCasePrint("2. FUNCTIONALITY - enability", "true", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("2.FUNTIONALITY - enability", "true", String.valueOf(e));
			}

			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("background-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("3. UI - background-color", "rgba(255, 255, 255, 1)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("3.UI - background-color", "rgba(255, 255, 255, 1)", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("padding");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("4. UI - padding", "4px 15px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("4.UI - padding", "4px 15px", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("font-family");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("5. UI - font-family", "Roboto, sans-serif", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("5.UI - font-family", "Roboto, sans-serif", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("6. UI - color", "rgba(0, 0, 0, 0.85)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("6.UI - color", "rgba(0, 0, 0, 0.85)", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("font-size");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("7. UI - font-size", "14px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("7.UI - font-size", "14px", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("border-radius");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("8. UI -border-radius", "2px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("8.UI - border-radius", "2px", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("border-color");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("9. UI -border-color", "rgb(217, 217, 217)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("9.UI -border-color", "rgb(217, 217, 217)", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("box-shadow");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("10. UI -box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("10.UI - box-shadow", "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("font-weight");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("11. UI -font-weight", "400", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("11.UI - font-weight", "400", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("cursor");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("12. UI -cursor", "pointer", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("12.UI - cursor", "pointer", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getCssValue("opacity");
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("13. UI -opacity", "1", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("13.UI -opacity", "1", String.valueOf(e));
			}
			try {
				String Value = ReleventTestEditPage.cancelButton.getText();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("14. UI -text spelling", "Cancel", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("14.UI -text spelling", "Cancel", String.valueOf(e));
			}
			try {
				Dimension Value = ReleventTestEditPage.cancelButton.getSize();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("15. UI -Size", "(75, 32)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("15.UI -Size", "(75, 32)", String.valueOf(e));
			}

			try {
				Point Value = ReleventTestEditPage.cancelButton.getLocation();
				System.out.println(Value);
				// Thread.sleep(2000);
				TestCasePrint("16. UI -position", "(865, 368)", String.valueOf(Value));
			} catch (Exception e) {
				TestCasePrint("16.UI -position", "(865, 368)", String.valueOf(e));
			}

		} else {
			TestCasePrint("Element not displayed", "true", String.valueOf(Value2));
		}
	}
	public  void clickCancelButton() throws InterruptedException,IOException{
		if(ReleventTestEditPage.cancelButton.isDisplayed()) {
		ReleventTestEditPage.cancelButton.click();
		}else {
			TestCasePrint("Element not displayed", "true", String.valueOf(Value2));
		}
	}
	}


