package com.invicta.qa.testcases.sbu;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.Loginpg;
import com.invicta.qa.pages.sbu.ReleventTestEditPage;
import com.invicta.qa.pages.sbu.SupplierCategorypage;

public class SupplierCategorypagination  extends DriverIntialization{
@Test
	public static void supplierCategory() throws InterruptedException,IOException{
		
		Loginpg.login();
		Thread.sleep(2000);
		SupplierCategorypage Supplier = new SupplierCategorypage();
	      PageFactory.initElements(driver, Supplier);
	      SupplierCategorypage.clickSupplier.click();
	      Thread.sleep(2000);
	      SupplierCategorypage.clickSupplierCategory.click();
	      pagination();
		
	}

public static void pagination() throws InterruptedException,IOException {
	
	SupplierCategorypage Supplierpagination = new SupplierCategorypage();
	
	
			PageFactory.initElements(driver, Supplierpagination);
			
//			Default Index Page
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
//			Refresh pagination into default page 
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

//			Page Redirect to the next page 
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
	//Total Text Visible
			boolean ActualVisibleTotalText = SupplierCategorypage.totalText.isDisplayed();
			boolean ExpectedVisibleTotalText = true;
			testCase = extent.createTest("PAGINATION_TOTAL_TEXT_VISIBLE");
			try {
				Assert.assertEquals(ActualVisibleTotalText, ExpectedVisibleTotalText);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleTotalText);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleTotalText);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleTotalText);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleTotalText);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}

//			Current Pagination Opction Visible
			boolean ActualVisibleCurrentPagination = SupplierCategorypage.CurrentPaginationOpction.isDisplayed();
			boolean ExpectedVisibleCurrentPagination = true;
			testCase = extent.createTest("CURRENT-PAGINATION_OPCTION_VISIBLE");
			try {
				Assert.assertEquals(ActualVisibleCurrentPagination, ExpectedVisibleCurrentPagination);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleCurrentPagination);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleCurrentPagination);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleCurrentPagination);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleCurrentPagination);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}

//			Previous Button Displayed
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

//			Next Button Displayed
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

//			Page Number Visible
			boolean ActualVisiblePage = SupplierCategorypage.PageNumber.isDisplayed();
			boolean ExpectedVisiblePage = true;
			testCase = extent.createTest("PAGINATION-PAGE-NUMBER-VISIBLE");
			try {
				Assert.assertEquals(ActualVisiblePage, ExpectedVisiblePage);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePage);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePage);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePage);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePage);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}

//			Next Button Enable
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
//			Before move to 2nd page, previous button disable
			Thread.sleep(2000);
			boolean ActualPreviousBtnDisable = SupplierCategorypage.PreviousPageBtn.isEnabled();
			boolean ExpectedPreviousBtnDisable = false;
			testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-DISABLE-BEFORE MOVE THE 2ND PAGE");
			try {
				Assert.assertEquals(ActualPreviousBtnDisable, ExpectedPreviousBtnDisable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
				testCase.log(Status.PASS, "Enable element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
				testCase.log(Status.FAIL, "Not Enable Element");
			}

//			After move to 2nd page, previous button Enable
			SupplierCategorypage.NextPageBtn.click();
			Thread.sleep(2000);
			boolean ActualPreviousBtnEnable = SupplierCategorypage.PreviousPageBtn.isEnabled();
			boolean ExpectedPreviousBtnEnable = true;
			testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-ENABLE-AFTER MOVE THE 2ND PAGE");
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
//			****************************************************************************************************************
			driver.navigate().refresh();
			Thread.sleep(2000);
//			SupplierCategorypage.CurrentPaginationOpction.click();
//			Thread.sleep(2000);
//			SupplierCategorypage.Page_20.click();
//			SupplierCategorypage.Page_30.click();
//			SupplierCategorypage.Page_100.click();
//			Thread.sleep(2000); 
//			int ActualTotalPage = 1;
//			boolean Enablity = SupplierCategorypage.NextPageBtn.isEnabled();
//			while (Enablity) {
//				Thread.sleep(1000);
//				SupplierCategorypage.NextPageBtn.click();
//				ActualTotalPage = ActualTotalPage + 1;
//				Enablity = SupplierCategorypage.NextPageBtn.isEnabled();
//			}
//			System.out.println(ActualTotalPage);
//			Thread.sleep(2000);
////			Total Page 10/Page 
//			if (SupplierCategorypage.CurrentPaginationOpction.getText().contentEquals("10 / page")) {
//				int ExpectedTotalPage = 3;
//				testCase = extent.createTest("PAGINATION-TOTAL-PAGE-COUNT");
//				try {
//					Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.PASS, "Correct Page Count");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.FAIL, "Wrong Page Count");
//				}
//			} else if (SupplierCategorypage.CurrentPaginationOpction.getText().contentEquals("20 / page")) {
//				int ExpectedTotalPage = 2;
//				testCase = extent.createTest("PAGINATION-TOTAL-PAGE-COUNT");
//				try {
//					Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.PASS, "Correct Page Count");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.FAIL, "Wrong Page Count");
//				}
//			} else if (SupplierCategorypage.CurrentPaginationOpction.getText().contentEquals("30 / page")) {
//				int ExpectedTotalPage = 1;
//				testCase = extent.createTest("PAGINATION-TOTAL-PAGE-COUNT");
//				try {
//					Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.PASS, "Correct Page Count");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.FAIL, "Wrong Page Count");
//				}
//			} else if (SupplierCategorypage.CurrentPaginationOpction.getText().contentEquals("100 / page")) {
//				int ExpectedTotalPage = 1;
//				testCase = extent.createTest("PAGINATION-TOTAL-PAGE-COUNT");
//				try {
//					Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.PASS, "Correct Page Count");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
//					testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
//					testCase.log(Status.FAIL, "Wrong Page Count");
//				}
//			}
//			
//
//			Thread.sleep(1000);
//			driver.navigate().refresh();
//
////				 Position
//			Point ActualPositionPage = SupplierCategorypage.pagination.getLocation();
//			Point ExpectedPositionPage = new Point(177, 337);
//			testCase = extent.createTest("PAGINATION-PAGE-NUMBER-POSITION");
//			try {
//				Assert.assertEquals(ActualPositionPage, ExpectedPositionPage);
//				testCase.log(Status.INFO, "Actual Position :- " + ActualPositionPage);
//				testCase.log(Status.INFO, "Expected Position :- " + ExpectedPositionPage);
//				testCase.log(Status.PASS, "Correct Position");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Position :- " + ActualPositionPage);
//				testCase.log(Status.INFO, "Expected Position:- " + ExpectedPositionPage);
//				testCase.log(Status.FAIL, "Wrong Position");
//			}
//
//			// Total Text Width
//			int ActualWidthTotalText = SupplierCategorypage.totalText.getSize().width;
//			int ExpectedWidthTotalText =  63;
//			testCase = extent.createTest("PAGINATION_TOTAL_TEXT-WIDTH");
//			try {
//				Assert.assertEquals(ActualWidthTotalText, ExpectedWidthTotalText);
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthTotalText);
//				testCase.log(Status.INFO, "Expected Width :- " + ExpectedWidthTotalText);
//				testCase.log(Status.PASS, "Correct Width");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthTotalText);
//				testCase.log(Status.INFO, "Expected Width:- " + ExpectedWidthTotalText);
//				testCase.log(Status.FAIL, "Wrong Width");
//			}
//
////							Current Pagination Opction Width
//			int ActualWidthCurrentPagination = SupplierCategorypage.CurrentPaginationOpction.getSize().width;
//			int ExpectedWidthCurrentPagination = 96;
//			testCase = extent.createTest("CURRENT-PAGINATION_WIDTH");
//			try {
//				Assert.assertEquals(ActualWidthCurrentPagination, ExpectedWidthCurrentPagination);
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthCurrentPagination);
//				testCase.log(Status.INFO, "Expected Width :- " + ExpectedWidthCurrentPagination);
//				testCase.log(Status.PASS, "Correct Width");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthCurrentPagination);
//				testCase.log(Status.INFO, "Expected Width:- " + ExpectedWidthCurrentPagination);
//				testCase.log(Status.FAIL, "Wrong Width");
//			}
//
////							Previous Button Width
//			int ActualWidthPreviousButton = SupplierCategorypage.PreviousPageBtn.getSize().width;
//			int ExpectedWidthPreviousButton = 24;
//			testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-WIDTH");
//			try {
//				Assert.assertEquals(ActualWidthPreviousButton, ExpectedWidthPreviousButton);
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthPreviousButton);
//				testCase.log(Status.INFO, "Expected Width :- " + ExpectedWidthPreviousButton);
//				testCase.log(Status.PASS, "Correct Width");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthPreviousButton);
//				testCase.log(Status.INFO, "Expected Width:- " + ExpectedWidthPreviousButton);
//				testCase.log(Status.FAIL, "Wrong Width");
//			}
//
////							Next Button Width
//			int ActualWidthNextButton = SupplierCategorypage.NextPageBtn.getSize().width;
//			int ExpectedWidthNextButton = 24;
//			testCase = extent.createTest("PAGINATION-NEXT-BUTTON-WIDTH");
//			try {
//				Assert.assertEquals(ActualWidthNextButton, ExpectedWidthNextButton);
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthNextButton);
//				testCase.log(Status.INFO, "Expected Width :- " + ExpectedWidthNextButton);
//				testCase.log(Status.PASS, "Correct Width");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthNextButton);
//				testCase.log(Status.INFO, "Expected Width:- " + ExpectedWidthNextButton);
//				testCase.log(Status.FAIL, "Wrong Width");
//			}
//
////							Page Number Width
//			int ActualWidthPage = SupplierCategorypage.PageNumber.getSize().width;
//			int ExpectedWidthPage = 22;
//			testCase = extent.createTest("PAGINATION-PAGE-NUMBER-WIDTH");
//			try {
//				Assert.assertEquals(ActualWidthPage, ExpectedWidthPage);
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthPage);
//				testCase.log(Status.INFO, "Expected Width :- " + ExpectedWidthPage);
//				testCase.log(Status.PASS, "Correct Width");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Width :- " + ActualWidthPage);
//				testCase.log(Status.INFO, "Expected Width:- " + ExpectedWidthPage);
//				testCase.log(Status.FAIL, "Wrong Width");
//			}
////						
//			// Total Text Height
//			int ActualHeightTotalText = SupplierCategorypage.totalText.getSize().height;
//			int ExpectedHeightTotalText = 24;
//			testCase = extent.createTest("PAGINATION_TOTAL_TEXT-HEIGHT");
//			try {
//				Assert.assertEquals(ActualHeightTotalText, ExpectedHeightTotalText);
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightTotalText);
//				testCase.log(Status.INFO, "Expected Height :- " + ExpectedHeightTotalText);
//				testCase.log(Status.PASS, "Correct Height");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightTotalText);
//				testCase.log(Status.INFO, "Expected Height:- " + ExpectedHeightTotalText);
//				testCase.log(Status.FAIL, "Wrong Height");
//			}
//
////									Current Pagination Opction Height
//			int ActualHeightCurrentPagination = SupplierCategorypage.CurrentPaginationOpction.getSize().height;
//			int ExpectedHeightCurrentPagination = 24;
//			testCase = extent.createTest("CURRENT-PAGINATION_HEIGHT");
//			try {
//				Assert.assertEquals(ActualHeightCurrentPagination, ExpectedHeightCurrentPagination);
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightCurrentPagination);
//				testCase.log(Status.INFO, "Expected Height :- " + ExpectedHeightCurrentPagination);
//				testCase.log(Status.PASS, "Correct Height");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightCurrentPagination);
//				testCase.log(Status.INFO, "Expected Height:- " + ExpectedHeightCurrentPagination);
//				testCase.log(Status.FAIL, "Wrong Height");
//			}
//
////									Previous Button Height
//			int ActualHeightPreviousButton = SupplierCategorypage.PreviousPageBtn.getSize().height;
//			int ExpectedHeightPreviousButton = 24;
//			testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-HEIGHT");
//			try {
//				Assert.assertEquals(ActualHeightPreviousButton, ExpectedHeightPreviousButton);
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightPreviousButton);
//				testCase.log(Status.INFO, "Expected Height :- " + ExpectedHeightPreviousButton);
//				testCase.log(Status.PASS, "Correct Height");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightPreviousButton);
//				testCase.log(Status.INFO, "Expected Height:- " + ExpectedHeightPreviousButton);
//				testCase.log(Status.FAIL, "Wrong Height");
//			}
//
////									Next Button Height
//			int ActualHeightNextButton = SupplierCategorypage.NextPageBtn.getSize().height;
//			int ExpectedHeightNextButton = 24;
//			testCase = extent.createTest("PAGINATION-NEXT-BUTTON-HEIGHT");
//			try {
//				Assert.assertEquals(ActualHeightNextButton, ExpectedHeightNextButton);
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightNextButton);
//				testCase.log(Status.INFO, "Expected Height :- " + ExpectedHeightNextButton);
//				testCase.log(Status.PASS, "Correct Height");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightNextButton);
//				testCase.log(Status.INFO, "Expected Height:- " + ExpectedHeightNextButton);
//				testCase.log(Status.FAIL, "Wrong Height");
//			}
//
////									Page Number Height
//			int ActualHeightPage = SupplierCategorypage.PageNumber.getSize().height;
//			int ExpectedHeightPage = 22;
//			testCase = extent.createTest("PAGINATION-PAGE-NUMBER-HEIGHT");
//			try {
//				Assert.assertEquals(ActualHeightPage, ExpectedHeightPage);
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightPage);
//				testCase.log(Status.INFO, "Expected Height :- " + ExpectedHeightPage);
//				testCase.log(Status.PASS, "Correct Height");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Height :- " + ActualHeightPage);
//				testCase.log(Status.INFO, "Expected Height:- " + ExpectedHeightPage);
//				testCase.log(Status.FAIL, "Wrong Height");
//			}
////									
//
//			// Total Text FontColor
//			String aa = SupplierCategorypage.totalText.getCssValue("color");
//			String ActualFontColorTotalText = Color.fromString(aa).asHex();
//			String ExpectedFontColorTotalText = "#000000";
//			testCase = extent.createTest("PAGINATION_TOTAL_TEXT-FONT_COLOR");
//			try {
//				Assert.assertEquals(ActualFontColorTotalText, ExpectedFontColorTotalText);
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorTotalText);
//				testCase.log(Status.INFO, "Expected FontColor :- " + ExpectedFontColorTotalText);
//				testCase.log(Status.PASS, "Correct FontColor");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorTotalText);
//				testCase.log(Status.INFO, "Expected FontColor:- " + ExpectedFontColorTotalText);
//				testCase.log(Status.FAIL, "Wrong FontColor");
//			}
//
////											Current Pagination Opction FontColor
//			String ab = SupplierCategorypage.CurrentPaginationOpction.getCssValue("color");
//			String ActualFontColorCurrentPagination = Color.fromString(ab).asHex();
//			String ExpectedFontColorCurrentPagination = "#000000";
//			testCase = extent.createTest("CURRENT-PAGINATION_FONT_COLOR");
//			try {
//				Assert.assertEquals(ActualFontColorCurrentPagination, ExpectedFontColorCurrentPagination);
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorCurrentPagination);
//				testCase.log(Status.INFO, "Expected FontColor :- " + ExpectedFontColorCurrentPagination);
//				testCase.log(Status.PASS, "Correct FontColor");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorCurrentPagination);
//				testCase.log(Status.INFO, "Expected FontColor:- " + ExpectedFontColorCurrentPagination);
//				testCase.log(Status.FAIL, "Wrong FontColor");
//			}
//
////											Previous Button FontColor
//			String ac = SupplierCategorypage.PreviousPageBtn.getCssValue("color");
//			String ActualFontColorPreviousButton = Color.fromString(ac).asHex();
//			String ExpectedFontColorPreviousButton = "#000000";
//			testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-FONT_COLOR");
//			try {
//				Assert.assertEquals(ActualFontColorPreviousButton, ExpectedFontColorPreviousButton);
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorPreviousButton);
//				testCase.log(Status.INFO, "Expected FontColor :- " + ExpectedFontColorPreviousButton);
//				testCase.log(Status.PASS, "Correct FontColor");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorPreviousButton);
//				testCase.log(Status.INFO, "Expected FontColor:- " + ExpectedFontColorPreviousButton);
//				testCase.log(Status.FAIL, "Wrong FontColor");
//			}
//
////											Next Button FontColor
//			String ad = SupplierCategorypage.NextPageBtn.getCssValue("color");
//			String ActualFontColorNextButton = Color.fromString(ad).asHex();
//			String ExpectedFontColorNextButton = "#000000";
//			testCase = extent.createTest("PAGINATION-NEXT-BUTTON-FONT_COLOR");
//			try {
//				Assert.assertEquals(ActualFontColorNextButton, ExpectedFontColorNextButton);
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorNextButton);
//				testCase.log(Status.INFO, "Expected FontColor :- " + ExpectedFontColorNextButton);
//				testCase.log(Status.PASS, "Correct FontColor");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorNextButton);
//				testCase.log(Status.INFO, "Expected FontColor:- " + ExpectedFontColorNextButton);
//				testCase.log(Status.FAIL, "Wrong FontColor");
//			}
//
////											Page Number FontColor after selecting
//			
//			String ae = SupplierCategorypage.PageNumber.getCssValue("color");
//			String ActualFontColorPage = Color.fromString(ae).asHex();
//			String ExpectedFontColorPage = "#1890ff";
//			testCase = extent.createTest("PAGINATION-PAGE-NUMBER-FONT_COLOR-AFTER-SELECTION");
//			try {
//				Assert.assertEquals(ActualFontColorPage, ExpectedFontColorPage);
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorPage);
//				testCase.log(Status.INFO, "Expected FontColor :- " + ExpectedFontColorPage);
//				testCase.log(Status.PASS, "Correct FontColor");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorPage);
//				testCase.log(Status.INFO, "Expected FontColor:- " + ExpectedFontColorPage);
//				testCase.log(Status.FAIL, "Wrong FontColor");
//			}
//			
//			
////			Page Number FontColor before selecting
//			SupplierCategorypage.NextPageBtn.click();
//			Thread.sleep(2000);
//	String af = SupplierCategorypage.PageNumber.getCssValue("color");
//	String ActualFontColorPage1 = Color.fromString(af).asHex();
//	String ExpectedFontColorPage1 = "#000000";
//	testCase = extent.createTest("PAGINATION-PAGE-NUMBER-FONT_COLOR-BEFORE-SELECTION");
//	try {
//	Assert.assertEquals(ActualFontColorPage1, ExpectedFontColorPage1);
//	testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorPage1);
//	testCase.log(Status.INFO, "Expected FontColor :- " + ExpectedFontColorPage1);
//	testCase.log(Status.PASS, "Correct FontColor");
//	} catch (AssertionError e) {
//	testCase.log(Status.INFO, "Actual FontColor :- " + ActualFontColorPage1);
//	testCase.log(Status.INFO, "Expected FontColor:- " + ExpectedFontColorPage1);
//	testCase.log(Status.FAIL, "Wrong FontColor");
//	}
////											**********
//	driver.navigate().refresh();
//			// Total Text BcColor
//			String ba = SupplierCategorypage.totalText.getCssValue("background-color");
//			String ActualBcColorTotalText = Color.fromString(ba).asHex();
//			String ExpectedBcColorTotalText = "#000000";
//			testCase = extent.createTest("PAGINATION_TOTAL_TEXT-BACKGROUND_COLOR");
//			try {
//				Assert.assertEquals(ActualBcColorTotalText, ExpectedBcColorTotalText);
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorTotalText);
//				testCase.log(Status.INFO, "Expected Background Color :- " + ExpectedBcColorTotalText);
//				testCase.log(Status.PASS, "Correct Background Color");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorTotalText);
//				testCase.log(Status.INFO, "Expected Background Color:- " + ExpectedBcColorTotalText);
//				testCase.log(Status.FAIL, "Wrong Background Color");
//			}
//
////													Current Pagination Opction FontColor
//			String bb = SupplierCategorypage.CurrentPaginationOpction.getCssValue("background-color");
//			String ActualBcColorCurrentPagination = Color.fromString(bb).asHex();
//			String ExpectedBcColorCurrentPagination = "#000000";
//			testCase = extent.createTest("CURRENT-PAGINATION_BACKGROUND_COLOR");
//			try {
//				Assert.assertEquals(ActualBcColorCurrentPagination, ExpectedBcColorCurrentPagination);
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorCurrentPagination);
//				testCase.log(Status.INFO, "Expected Background Color :- " + ExpectedBcColorCurrentPagination);
//				testCase.log(Status.PASS, "Correct Background Color");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorCurrentPagination);
//				testCase.log(Status.INFO, "Expected Background Color:- " + ExpectedBcColorCurrentPagination);
//				testCase.log(Status.FAIL, "Wrong Background Color");
//			}
//
////													Previous Button FontColor
//			String bc = SupplierCategorypage.PreviousPageBtn.getCssValue("background-color");
//			String ActualBcColorPreviousButton = Color.fromString(bc).asHex();
//			String ExpectedBcColorPreviousButton = "#000000";
//			testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-BACKGROUND_COLOR");
//			try {
//				Assert.assertEquals(ActualBcColorPreviousButton, ExpectedBcColorPreviousButton);
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorPreviousButton);
//				testCase.log(Status.INFO, "Expected Background Color :- " + ExpectedBcColorPreviousButton);
//				testCase.log(Status.PASS, "Correct Background Color");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorPreviousButton);
//				testCase.log(Status.INFO, "Expected Background Color:- " + ExpectedBcColorPreviousButton);
//				testCase.log(Status.FAIL, "Wrong Background Color");
//			}
//
////													Next Button FontColor
//			String bd = SupplierCategorypage.NextPageBtn.getCssValue("background-color");
//			String ActualBcColorNextButton = Color.fromString(bd).asHex();
//			String ExpectedBcColorNextButton = "#000000";
//			testCase = extent.createTest("PAGINATION-NEXT-BUTTON-BACKGROUND_COLOR");
//			try {
//				Assert.assertEquals(ActualBcColorNextButton, ExpectedBcColorNextButton);
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorNextButton);
//				testCase.log(Status.INFO, "Expected Background Color :- " + ExpectedBcColorNextButton);
//				testCase.log(Status.PASS, "Correct Background Color");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorNextButton);
//				testCase.log(Status.INFO, "Expected Background Color:- " + ExpectedBcColorNextButton);
//				testCase.log(Status.FAIL, "Wrong Background Color");
//			}
//
////													Page Number FontColor
//			String be = SupplierCategorypage.PageNumber.getCssValue("background-color");
//			String ActualBcColorPage = Color.fromString(be).asHex();
//			String ExpectedBcColorPage = "#000000";
//			testCase = extent.createTest("PAGINATION-PAGE-NUMBER-BACKGROUND_COLOR");
//			try {
//				Assert.assertEquals(ActualBcColorPage, ExpectedBcColorPage);
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorPage);
//				testCase.log(Status.INFO, "Expected Background Color :- " + ExpectedBcColorPage);
//				testCase.log(Status.PASS, "Correct Background Color");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Background Color :- " + ActualBcColorPage);
//				testCase.log(Status.INFO, "Expected Background Color:- " + ExpectedBcColorPage);
//				testCase.log(Status.FAIL, "Wrong Background Color");
//			}
////													**************
//			driver.navigate().refresh();
//			Thread.sleep(2000);
////							 						Selected Page highlighting
//			SupplierCategorypage.NextPageBtn.click();
//			Thread.sleep(2000);
//			boolean ActualHighlight = SupplierCategorypage.PaginationSecoundPage.isDisplayed();
//			boolean ExpectedHighlight = true;
//			testCase = extent.createTest("PAGINATION-SELECTED-PAGE-HIGHLIGHTING");
//			try {
//				Assert.assertEquals(ActualHighlight, ExpectedHighlight);
//				testCase.log(Status.INFO, "Actual Element :- " + ActualHighlight);
//				testCase.log(Status.INFO, "Expected Element :- " + ExpectedHighlight);
//				testCase.log(Status.PASS, "Correct Element");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual Element :- " + ActualHighlight);
//				testCase.log(Status.INFO, "Expected Element:- " + ExpectedHighlight);
//				testCase.log(Status.FAIL, "Wrong Element");
//			}
//
////			int co = SupplierCategorypage.UnitColumn.size();
//////			System.out.println(SupplierCategorypage.totalText.getText());
////			System.out.println(SupplierCategorypage.CurrentPaginationOpction.getText());
////			String UnitColumnBefore = "//tbody[@class='ant-table-tbody']/tr[";
////			String UnitColumnAfter = "]/td[1]";
////			String BeforePage = "//li[@title='";
////			String AfterPage = "']/a";
//	//*******************************************************************************************************************************
//			driver.navigate().refresh();
////			SupplierCategorypage.CurrentPaginationOpction.click();
////			Thread.sleep(2000);
////			SupplierCategorypage.Page_20.click();
////			SupplierCategorypage.Page_30.click();
////			SupplierCategorypage.Page_100.click();
//			Thread.sleep(2000);
//			int ActualTotalData = 0;
//			for (int j = 1; j <= ActualTotalPage; j++) {
//				Thread.sleep(2000);
//				int PageIndex = SupplierCategorypage.UnitColumn.size();
//				ActualTotalData = ActualTotalData + (PageIndex - 1);
//				System.out.println(SupplierCategorypage.totalText.getText());
//				System.out.println("PageIndex :-" + (PageIndex - 1));
////				System.out.println("TotalData :- "+TotalData);
//				SupplierCategorypage.NextPageBtn.click();
//			}
//			System.out.println(ActualTotalData);
//			int ExpectedTotalData = 23;
//			testCase = extent.createTest("PAGINATION-TOTAL-DATA");
//			try {
//				Assert.assertEquals(ActualTotalData, ExpectedTotalData);
//				testCase.log(Status.INFO, "Actual TotalData :- " + ActualTotalData);
//				testCase.log(Status.INFO, "Expected TotalData :- " + ExpectedTotalData);
//				testCase.log(Status.PASS, "Correct TotalData");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual TotalData :- " + ActualTotalData);
//				testCase.log(Status.INFO, "Expected TotalData:- " + ExpectedTotalData);
//				testCase.log(Status.FAIL, "Wrong TotalData");
//			}
//			
////			*************************************************************************************************************************
//			driver.navigate().refresh();
//			Thread.sleep(2000);
////			SupplierCategorypage.CurrentPaginationOpction.click();
////			Thread.sleep(3000);
////			SupplierCategorypage.Page_20.click();
////			Thread.sleep(2000);
////			SupplierCategorypage.Page_30.click();
////			Thread.sleep(2000);
////			SupplierCategorypage.Page_100.click();
////			Thread.sleep(2000); 
////			System.out.println("****"+SupplierCategorypage.CurrentPaginationOpction.getText());
////			Total Count of the 10/page index
//			if (SupplierCategorypage.CurrentPaginationOpction.getText().contentEquals("10 / page")) {
//				int ActualPageIndex_10 = (SupplierCategorypage.UnitColumn.size() - 1);
//				testCase = extent.createTest("PAGINATION-TOTAL-DATA-OF-10/PAGE-INDEX");
//
//				if (0 <= ActualPageIndex_10) {
//					if (ActualPageIndex_10 <= 10) {
//						try {
//							Assert.assertEquals(ActualPageIndex_10, ActualPageIndex_10);
//							testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//							testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_10);
//							testCase.log(Status.PASS, "Correct TotalData");
//						} catch (AssertionError e) {
//							testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//							testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_10);
//							testCase.log(Status.FAIL, "Wrong TotalData");
//						}
//
//					} else {
//						testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//						testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_10);
//						testCase.log(Status.FAIL, "Wrong TotalData");
//					}
//				} else {
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_10);
//					testCase.log(Status.FAIL, "Wrong TotalData");
//				}
//
//			}
////			Total Count of the 20/page index
//			else if (SupplierCategorypage.CurrentPaginationOpction.getText().contentEquals("20 / page")) {
//				int ActualPageIndex_20 = (SupplierCategorypage.UnitColumn.size() - 1);
//				testCase = extent.createTest("PAGINATION-TOTAL-DATA-OF-20/PAGE-INDEX");
//
//				if (0 <= ActualPageIndex_20) {
//					if (ActualPageIndex_20 <= 20) {
//						try {
//							Assert.assertEquals(ActualPageIndex_20, ActualPageIndex_20);
//							testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//							testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_20);
//							testCase.log(Status.PASS, "Correct TotalData");
//						} catch (AssertionError e) {
//							testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//							testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_20);
//							testCase.log(Status.FAIL, "Wrong TotalData");
//						}
//					} else {
//						testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//						testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_20);
//						testCase.log(Status.FAIL, "Wrong TotalData");
//					}
//				} else {
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_20);
//					testCase.log(Status.FAIL, "Wrong TotalData");
//				}
//
//			}
////			Total Count of the 30/page index
//			else if (SupplierCategorypage.CurrentPaginationOpction.getText().contentEquals("30 / page")) {
//				int ActualPageIndex_30 = (SupplierCategorypage.UnitColumn.size() - 1);
//				testCase = extent.createTest("PAGINATION-TOTAL-DATA-OF-10/PAGE-INDEX");
//
//				if (0 <= ActualPageIndex_30) {
//					if (ActualPageIndex_30 <= 30) {
//						try {
//							Assert.assertEquals(ActualPageIndex_30, ActualPageIndex_30);
//							testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//							testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_30);
//							testCase.log(Status.PASS, "Correct TotalData");
//						} catch (AssertionError e) {
//							testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//							testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_30);
//							testCase.log(Status.FAIL, "Wrong TotalData");
//						}
//					} else {
//						testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//						testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_30);
//						testCase.log(Status.FAIL, "Wrong TotalData");
//					}
//				} else {
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_30);
//					testCase.log(Status.FAIL, "Wrong TotalData");
//				}
//
//			}
////			Total Count of the 100/page index
//			else if (SupplierCategorypage.CurrentPaginationOpction.getText().contentEquals("100 / page")) {
//				int ActualPageIndex_100 = (SupplierCategorypage.UnitColumn.size() - 1);
//				testCase = extent.createTest("PAGINATION-TOTAL-DATA-OF-100/PAGE-INDEX");
//
//				if (0 <= ActualPageIndex_100) {
//					if (ActualPageIndex_100 <= 100) {
//						try {
//							Assert.assertEquals(ActualPageIndex_100, ActualPageIndex_100);
//							testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//							testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_100);
//							testCase.log(Status.PASS, "Correct TotalData");
//						} catch (AssertionError e) {
//							testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//							testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_100);
//							testCase.log(Status.FAIL, "Wrong TotalData");
//						}
//					} else {
//						testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//						testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_100);
//						testCase.log(Status.FAIL, "Wrong TotalData");
//					}
//				} else {
//					testCase.log(Status.INFO, "Current Pagination Opction :- " + SupplierCategorypage.CurrentPaginationOpction.getText());
//					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_100);
//					testCase.log(Status.FAIL, "Wrong TotalData");
//				}
//
//			}
		}
}


