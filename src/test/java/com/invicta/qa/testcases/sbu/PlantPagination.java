//***********************************************************************************
//* Description
//*------------
//* Plant Pagination 
//***********************************************************************************
//*
//* Author           : SIVABALAN RAHUL
//* Date Written     : 23/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Author        Comments
//* ================       ====         =====        ========
//*                        23/02/2023   RAHUL.S    Orginal Version
//*
//************************************************************************************
package com.invicta.qa.testcases.sbu;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.Loginpg;
import com.invicta.qa.pages.sbu.EditPlantPage;
import com.invicta.qa.pages.sbu.PlantWisePaginationPage;

public class PlantPagination extends DriverIntialization {
@Test
	public static void UnitPagination() throws InterruptedException {

		// THIS METHOD IS FOR LOGIN
		Loginpg.login();
      Thread.sleep(2000);
      EditPlantPage editplantpg = new EditPlantPage();
		PageFactory.initElements(driver, editplantpg);
		Thread.sleep(3000);
		EditPlantPage.clickplant.click();
	}

@Test(priority = 1)
public static void DefaultIndexPage() throws InterruptedException {
	PlantWisePaginationPage PlantpgPage = new PlantWisePaginationPage();
	PageFactory.initElements(driver, PlantpgPage);
	// Default Index Page
	Thread.sleep(2000);
	boolean ActualDefaultPageIndex = PlantWisePaginationPage.pagination.isDisplayed();
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
	PlantWisePaginationPage UnitPage = new PlantWisePaginationPage();

	PlantWisePaginationPage.NextPageBtn.click();
	Thread.sleep(20000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	boolean ActualDefaultPageIndex1 = PlantWisePaginationPage.pagination.isDisplayed();
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

//	Page Redirect to the next page 

@Test(priority = 3)
public static void PageRedrict() throws InterruptedException {

	PlantWisePaginationPage UnitPage = new PlantWisePaginationPage();
	PlantWisePaginationPage.NextPageBtn.click();
	Thread.sleep(2000);
	boolean ActualSecoundPageIndex = PlantWisePaginationPage.PaginationSecoundPage.isDisplayed();
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

//	Previous Button Displayed
@Test(priority = 4)
public static void PreButtonDispaly() throws InterruptedException {

	PlantWisePaginationPage UnitPage = new PlantWisePaginationPage();
	boolean ActualVisiblePreviousButton = PlantWisePaginationPage.PreviousPageBtn.isDisplayed();
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

//	Next Button Displayed
@Test(priority = 5)
public static void NextButtonDispaly() throws InterruptedException {

	PlantWisePaginationPage UnitPage = new PlantWisePaginationPage();
	boolean ActualVisibleNextButton = PlantWisePaginationPage.NextPageBtn.isDisplayed();
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

//Next Button Enable
@Test(priority = 6)
public static void NextButtonEanble() throws InterruptedException {

	boolean ActualNextBtnEnable = PlantWisePaginationPage.NextPageBtn.isEnabled();
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

////Before move to 2nd page, previous button disable
//@Test(priority = 7)
//public static void SecPagepreButDisable() throws InterruptedException {
//	Thread.sleep(2000);
//	boolean ActualPreviousBtnDisable = PlantWisePaginationPage.PreviousPageBtn.isEnabled();
//	boolean ExpectedPreviousBtnDisable = false;
//	testCase = extent.createTest("PAGINATION-PREVIOUS-BUTTON-DISABLE-BEFORE MOVE THE 2ND PAGE");
//	try {
//		Assert.assertEquals(ActualPreviousBtnDisable, ExpectedPreviousBtnDisable);
//		testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
//		testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
//		testCase.log(Status.PASS, "Enable element");
//	} catch (AssertionError e) {
//		testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
//		testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
//		testCase.log(Status.FAIL, "Not Enable Element");
//	}
//
//}

//	After move to 2nd page, previous button Enable
@Test(priority = 8)
public static void AfterMovetoSecPagepreButEnable() throws InterruptedException {

PlantWisePaginationPage.NextPageBtn.click();
Thread.sleep(2000);
boolean ActualPreviousBtnEnable = PlantWisePaginationPage.PreviousPageBtn.isEnabled();
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
boolean Enablity = PlantWisePaginationPage.NextPageBtn.isEnabled();
while (Enablity) {
	Thread.sleep(1000);
	PlantWisePaginationPage.NextPageBtn.click();
	ActualTotalPage = ActualTotalPage + 1;
	Enablity = PlantWisePaginationPage.NextPageBtn.isEnabled();
}
//System.out.println(ActualTotalPage);
//Thread.sleep(2000);
//driver.quit();

}


}
