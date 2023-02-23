//***********************************************************************************
	//* Description
	//*------------
	//* Unit Pagination Functionality 
	//***********************************************************************************
	//*
	//* Author           : Sivabalan Rahul
	//* Date Written     : 22/02/2023
	//* 
	//*
	//* 
	//* Test Case Number       Date         Intis        Comments
	//* ================       ====         =====        ========
	//*                        22/02/2023   Priyanka     Orginal Version
	//*
	//************************************************************************************
package com.invicta.qa.testcases.sbu;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.Loginpg;
import com.invicta.qa.pages.sbu.SupplierCategorypage;


public class Supplierpage extends DriverIntialization {
	

	
	
	

	SupplierCategorypage UnitPage = new SupplierCategorypage();

		@Test(priority = 0)
		public static void UnitPagination() throws InterruptedException {

			Loginpg.login();
			Thread.sleep(2000);
			SupplierCategorypage Supplier = new SupplierCategorypage();
		      PageFactory.initElements(driver, Supplier);
		      SupplierCategorypage.clickSupplier.click();
		      Thread.sleep(2000);
		      SupplierCategorypage.clickSupplierCategory.click();
		     

		}

		@Test(priority = 1)
		public static void DefaultIndexPage() throws InterruptedException {
			SupplierCategorypage UnitPage = new SupplierCategorypage();
			// Default Index Page
			Thread.sleep(2000);
			boolean ActualDefaultPageIndex = SupplierCategorypage.pagination.isDisplayed();
			boolean ExpectedDefaultPageIndex = true;
			testCase = extent.createTest("PAGINATION-DEFAULT-PAGE-INDEX");
			try {
				Assert.assertEquals(ActualDefaultPageIndex, ExpectedDefaultPageIndex);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex);
				testCase.log(Status.FAIL, "Wrong Default Index Page");

			}
		}

		@Test(priority = 2)
		public static void RefreshDefaultPage() throws InterruptedException {
			SupplierCategorypage UnitPage = new SupplierCategorypage();

			SupplierCategorypage.NextPageBtn.click();
			Thread.sleep(20000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			boolean ActualDefaultPageIndex1 = SupplierCategorypage.pagination.isDisplayed();
			boolean ExpectedDefaultPageIndex1 = true;
			testCase = extent.createTest("PAGINATION-REFERESH-INTO-DEFAULT-PAGE");
			try {
				Assert.assertEquals(ActualDefaultPageIndex1, ExpectedDefaultPageIndex1);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex1);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex1);
				testCase.log(Status.FAIL, "Wrong Default Index Page");
			}
		}

//			Page Redirect to the next page 

		@Test(priority = 3)
		public static void PageRedrict() throws InterruptedException {

			SupplierCategorypage UnitPage = new SupplierCategorypage();
			SupplierCategorypage.NextPageBtn.click();
			Thread.sleep(2000);
			boolean ActualSecoundPageIndex = SupplierCategorypage.PaginationSecoundPage.isDisplayed();
			boolean ExpectedSecoundPageIndex = true;
			testCase = extent.createTest("PAGINATION-PAGE-REDIRECT-TO-NEXT-PAGE");
			try {
				Assert.assertEquals(ActualSecoundPageIndex, ExpectedSecoundPageIndex);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedSecoundPageIndex);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedSecoundPageIndex);
				testCase.log(Status.FAIL, "Wrong Default Index Page");
			}
		}

//			Previous Button Displayed
		@Test(priority = 4)
		public static void PreButtonDispaly() throws InterruptedException {

			SupplierCategorypage UnitPage = new SupplierCategorypage();
			boolean ActualVisiblePreviousButton = SupplierCategorypage.PreviousPageBtn.isDisplayed();
			boolean ExpectedVisiblePreviousButton = true;
			testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-VISIBLE");
			try {
				Assert.assertEquals(ActualVisiblePreviousButton, ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}
		}

//			Next Button Displayed
		@Test(priority = 5)
		public static void NextButtonDispaly() throws InterruptedException {

			SupplierCategorypage UnitPage = new SupplierCategorypage();
			boolean ActualVisibleNextButton = SupplierCategorypage.NextPageBtn.isDisplayed();
			boolean ExpectedVisibleNextButton = true;
			testCase = extent.createTest("PAGINATION-NEXT-BUTTON-VISIBLE");
			try {
				Assert.assertEquals(ActualVisibleNextButton, ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}
		}

//		Next Button Enable
		@Test(priority = 6)
		public static void NextButtonEanble() throws InterruptedException {

			boolean ActualNextBtnEnable = SupplierCategorypage.NextPageBtn.isEnabled();
			boolean ExpectedNextBtnEnable = true;
			testCase = extent.createTest("PAGINATION-NEXT-BUTTON-ENABLE");
			try {
				Assert.assertEquals(ActualNextBtnEnable, ExpectedNextBtnEnable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
				testCase.log(Status.PASS, "Enable element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
				testCase.log(Status.FAIL, "Not Enable Element");
			}
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);

		}

////		Before move to 2nd page, previous button disable
//		@Test(priority = 7)
//		public static void SecPagepreButDisable() throws InterruptedException {
//			Thread.sleep(2000);
//			boolean ActualPreviousBtnDisable = SupplierCategorypage.PreviousPageBtn.isEnabled();
//			boolean ExpectedPreviousBtnDisable = false;
//			testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-DISABLE-BEFORE MOVE THE 2ND PAGE");
//			try {
//				Assert.assertEquals(ActualPreviousBtnDisable, ExpectedPreviousBtnDisable);
//				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
//				testCase.log(Status.PASS, "Enable element");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
//				testCase.log(Status.FAIL, "Not Enable Element");
//			}
//
//		}
		
//			After move to 2nd page, previous button Enable
		@Test(priority = 8)
		public static void AfterMovetoSecPagepreButEnable() throws InterruptedException {
		
		SupplierCategorypage.NextPageBtn.click();
		Thread.sleep(2000);
		boolean ActualPreviousBtnEnable = SupplierCategorypage.PreviousPageBtn.isEnabled();
		boolean ExpectedPreviousBtnEnable = true;
		testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-DISABLE-AFTER MOVE THE 2ND PAGE");
		try {
			Assert.assertEquals(ActualPreviousBtnEnable, ExpectedPreviousBtnEnable);
			testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
			testCase.log(Status.PASS, "Enable element");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
			testCase.log(Status.FAIL, "Not Enable Element");
		}
		
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		}
		
		@Test(priority = 9)
		public static void TotalPage() throws InterruptedException {
		
		int ActualTotalPage = 1;
		boolean Enablity = SupplierCategorypage.NextPageBtn.isEnabled();
		while (Enablity) {
			Thread.sleep(1000);
			SupplierCategorypage.NextPageBtn.click();
			ActualTotalPage = ActualTotalPage + 1;
			Enablity = SupplierCategorypage.NextPageBtn.isEnabled();
		}
		System.out.println(ActualTotalPage);
		Thread.sleep(2000);

		
		}
		
		
		
		
		
		
	}


