//***********************************************************************************
//* Description
//*------------
//* SINGLE SEARCH IN PLANT WISE IN MATERIAL
//***********************************************************************************
//*
//* Author           : SIVABALAN RAHUL
//* Date Written     : 26/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Author        Comments
//* ================       ====         =====        ========
//*                        26/02/2023   RAHUL.S    Orginal Version
//*
//************************************************************************************
package com.invicta.qa.testcases.sbu;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.Loginpg;
import com.invicta.qa.pages.sbu.ReleventTestEditPage;
import com.invicta.qa.pages.sbu.SingleSearch;
import org.openqa.selenium.interactions.Actions;

public class SingleSearchInPlantWise extends DriverIntialization  {
	
	@Test
	public static void login() throws InterruptedException,IOException{
		SingleSearch ssPlantWise = new SingleSearch();
//********************************************************************************************************		
//		 					THIS METHOD IS FOR LOGIN AND CLICKING THE MASTER AND GO TO PLANT
//********************************************************************************************************		
						Loginpg.login();
						ReleventTestEditPage releventTestEditpg = new ReleventTestEditPage();
					      PageFactory.initElements(driver, releventTestEditpg);
//*********************************************************************************************************      
//					                         CLICK THE MATERIAL IN TAB SECTIION
//*********************************************************************************************************      
							ReleventTestEditPage.tabMaterial.click();
							Thread.sleep(2000);
//*********************************************************************************************************		
//												CLICK THE MATERIAL IN NAVIGATION 
//*********************************************************************************************************		
							ReleventTestEditPage.navigationMaterial.click();	
							Thread.sleep(2000);
//*********************************************************************************************************		
//							CLICK THE 	SIXTH PAGE 
//*********************************************************************************************************	
							

							SingleSearch.fourth.click();
	
	}
}
