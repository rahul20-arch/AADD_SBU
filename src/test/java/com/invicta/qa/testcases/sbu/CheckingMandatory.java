package com.invicta.qa.testcases.sbu;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentReports;

//import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.Loginpg;


public class CheckingMandatory  extends DriverIntialization {
	

	

	

	//	



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

		@Test(priority = 0)
		public static void testBasicItems() throws InterruptedException {
			Loginpg.login();
			AddSbuUITest.addsbuclick();
					

			// Click Add Equipment

//			Thread.sleep(3000);
			
//			testSpaceValidation();
//			testMinCharValidations();
//			testEmptyValid();
//			testInvNum();
//			testInvSym();
//			EmptySave();
//			SpaceSve();
//			NumberSave();
//			SymbolSave();
//			MinCharSave();
//			
//			
//			
//		}
//
////		@Test(priority = 1)
//		public static void testSpaceValidation() throws InterruptedException {
//
//			// Click Add Sbu
//			try {
//				driver.findElement(By.xpath(
//						"//div[@class='sc-bxivhb hiMnNy']//div//button[@type='button']"))
//						.click();
//				Thread.sleep(2000);
//			} catch (Exception e) {
//
//			} 
//
//	////--------------------------------------------------------------------------------------------
//
//			// Test space Value Validation
//
//			try {
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys("     ");
//				Thread.sleep(2000);
//
//				// Validation message
//				String validMsg = driver
//						.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]")).getText();
//				Thread.sleep(2000);
//
//				// Print check
//				boolean testvalidation = validMsg.contains("Sub Business Unit can't be empty");
//
//				if (testvalidation == true) {
//					validMsg = "Sub Business Unit can't be empty";
//				}
//
//				TestCasePrint("TEST SPACE VALIDATION", "Sub Business Unit can't be empty",
//						String.valueOf(validMsg));
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).clear();
//			} catch (Exception e) {
//				TestCasePrint("TEST SPACE VALIDATION", "Sub Business Unit can't be empty", String.valueOf(e));
//
//			}
//
//	////---------------------------------------------------------------------------------------------
//
////			Click Cancel
//			driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
//
//		}
//
////		@Test(priority = 2)
//		public static void testMinCharValidations() throws InterruptedException {
//		
//			// Click Add SBU
//			try {
//				driver.findElement(By.xpath(
//						"//div[@class='sc-bxivhb hiMnNy']//div//button[@type='button']"))
//						.click();
//				Thread.sleep(2000);
//			} catch (Exception e) {
//
//			}
//
//	////---------------------------------------------------------------------------------------------
//
//			//// MIMIMUM CHARECTORS Validation
//			try {
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys("eq");
//				Thread.sleep(2000);
//
//				// Validation message
//				String validMsg = driver
//						.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]")).getText();
//				Thread.sleep(2000);
//
//				boolean testvalidation = validMsg.contains("Only 3 characters long!");
//
//				if (testvalidation == true) {
//					validMsg = "Only 3 characters long!";
//				}
//				TestCasePrint("TEST MINIMUM CHARECTORS VALIDATION", "Only 3 characters long!",
//						String.valueOf(validMsg));
//
//			} catch (Exception e) {
//				TestCasePrint("TEST MINIMUM CHARECTORS VALIDATION", "Only 3 characters long!", String.valueOf(e));
//
//			}
//	////----------------------------------------------------------------------------------------------
////			Click Cancel
//			driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
//
//		}
//
////		@Test(priority = 3)
//		public static void testEmptyValid() throws InterruptedException {
//		
//			// Click Add Equipment
//			try {
//				driver.findElement(By.xpath(
//						"//div[@class='sc-bxivhb hiMnNy']//div//button[@type='button']"))
//						.click();
//				Thread.sleep(2000);
//			} catch (Exception e) {
//
//			}
//
//	////---------------------------------------------------------------------------------------------
//			try {
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys("eq");
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys(Keys.BACK_SPACE);
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys(Keys.BACK_SPACE);
//				Thread.sleep(2000);
//
//				String validMsg = driver
//						.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]")).getText();
//				Thread.sleep(2000);
//
//				boolean testvalidation = validMsg.contains("Sub Business Unit can't be empty");
//
//				if (testvalidation == true) {
//					validMsg = "Sub Business Unit can't be empty";
//				}
//				TestCasePrint("TEST EMPTY VALIDATION", "Sub Business Unit can't be empty", String.valueOf(validMsg));
//
//			} catch (Exception e) {
//				TestCasePrint("TEST EMPTY VALIDATION", "Sub Business Unit can't be empty", String.valueOf(e));
//
//			}
//
//	////----------------------------------------------------------------------------------------------
////			Click Cancel
//			driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
//
//		}
//
////		@Test(priority = 4)
//		public static void testInvNum() throws InterruptedException {
//
//			// Click Add Equipment
//			try {
//				driver.findElement(By.xpath(
//						"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
//						.click();
//				Thread.sleep(2000);
//			} catch (Exception e) {
//
//			}
//
//	////---------------------------------------------------------------------------------------------
//			try {
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys("123");
//				Thread.sleep(2000);
//
//				String validMsg = driver
//						.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]")).getText();
//				Thread.sleep(2000);
//
//				boolean testvalidation = validMsg.contains("Sub Business Unit allow only letters");
//
//				if (testvalidation == true) {
//					validMsg = "Sub Business Unit allow only letters";
//				}
//				TestCasePrint("TEST INVALID VALIDATION-NUMBER", "Sub Business Unit allow only letters", String.valueOf(validMsg));
//
//			} catch (Exception e) {
//				TestCasePrint("TEST INVALID VALIDATION-NUMBER", "Sub Business Unit allow only letters", String.valueOf(e));
//
//			}
//
//	////----------------------------------------------------------------------------------------------
////			Click Cancel
//			driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
//
//		}
//
////		@Test(priority = 5)
//		public static void testInvSym() throws InterruptedException {
//
//			// Click Add SBU
//			try {
//				driver.findElement(By.xpath(
//						"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
//						.click();
//				Thread.sleep(2000);
//			} catch (Exception e) {
//
//			}
//
//	////---------------------------------------------------------------------------------------------
//			try {
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys("@@@");
//				Thread.sleep(2000);
//
//				String validMsg = driver
//						.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
//				Thread.sleep(2000);
//
//				boolean testvalidation = validMsg.contains("Sub Business Unit allow only letters");
//
//				if (testvalidation == true) {
//					validMsg = "Sub Business Unit allow only letters";
//				}
//				TestCasePrint("TEST INVALID VALIDATION-SYMBOLS", "Sub Business Unit allow only letters",
//						String.valueOf(validMsg));
//
//			} catch (Exception e) {
//				TestCasePrint("TEST INVALID VALIDATION-SYMBOLS", "Sub Business Unit allow only letters",
//						String.valueOf(e));
//
//			}
//
//	////----------------------------------------------------------------------------------------------
////			Click Cancel
//			driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
//
//		}
//
//		public static void TestNegativeSave(String NegativeTestCaseName, String inputValue) throws InterruptedException {
//
//			// Click Add SBU
//			try {
//				driver.findElement(By.xpath(
//						"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button"))
//						.click();
//				Thread.sleep(2000);
//
//				driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div/label")).sendKeys("Sample Comment");
//				Thread.sleep(2000);
//
////				Click EQ type button
//				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
//				Thread.sleep(2000);
//
////				Select EQ type
//				driver.findElement(By
//						.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='PRODUCTION_EQUIPMENT']"))
//						.click();
//				Thread.sleep(2000);
//
//			} catch (Exception e) {
//
//			}
//
//	////---------------------------------------------------------------------------------------------
////		test space Save
//			try {
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).sendKeys(inputValue);
//				Thread.sleep(2000);
//
//				driver.findElement(By.xpath("//*[@id=\"sub_business_unit\"]")).click();
//				Thread.sleep(2000);
//
//				boolean saveButtonPresent = driver
//						.findElement(By.xpath("//body//div//button[2]")).isDisplayed();
//
//				TestCasePrint(NegativeTestCaseName, "true", String.valueOf(saveButtonPresent));
//
//			} catch (Exception e) {
//				TestCasePrint(NegativeTestCaseName, "true", String.valueOf(e));
//
//			}
//
//	////----------------------------------------------------------------------------------------------
////			Click Cancel
//			driver.findElement(By.xpath("//button[@class='ant-btn']")).click();
//
//		}
//
////		@Test(priority = 6)
//		public static void EmptySave() throws InterruptedException { 
//			TestNegativeSave("TEST EMPTY SAVE", "");
//		}
//
////		@Test(priority = 7)
//		public static void SpaceSve() throws InterruptedException {
//			TestNegativeSave("TEST SPACE SAVE", "   ");
//		}
//
////		@Test(priority = 8)
//		public static void NumberSave() throws InterruptedException {
//			TestNegativeSave("TEST NUMBER SAVE", "");
//		}
//
////		@Test(priority = 9)
//		public static void SymbolSave() throws InterruptedException {
//			TestNegativeSave("TEST SYMBOL SAVE", "");
//		}
//
////		@Test(priority = 10)
//		public static void MinCharSave() throws InterruptedException {
//			TestNegativeSave("TEST MINIMUM CHARECTORS SAVE", "eq");
//		}

	}
}

