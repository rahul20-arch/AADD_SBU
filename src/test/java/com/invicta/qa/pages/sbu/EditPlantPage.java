package com.invicta.qa.pages.sbu;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.implementation.bind.annotation.Default;

public class EditPlantPage {
	
//	@FindBy(xpath = "//th[2]//div[1]//span[2]")
//	public static WebElement search;
	@FindBy(xpath = "//span[@class='ant-dropdown-trigger ant-table-filter-trigger ant-dropdown-open']")
	public static WebElement search;
 
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[1]/div/div[2]")
	public static WebElement clickplant;
	
//	@FindBy(xpath = "//tbody/tr[2]/td[9]/span[1]/a[1]/span[1]")
//	public static WebElement EditPlantIcon;
//	@FindBy(xpath = "//tbody/tr[5]/td[9]/span[1]/a[1]/span[1]")
//	public static WebElement EditPlantIcon;
	
	@FindBy(xpath = "//tbody/tr[5]/td[9]/span[1]")
	public static WebElement EditPlantIcon;
	
	
	@FindBy(xpath = "//input[@id='plant_code']")
	public static WebElement mandatory;
//	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/input")
//	public static WebElement mandatory;
	
	@FindBy(xpath = "//*[@id=\"plant_name\"]")
	public static WebElement plantname;
	@FindBy(xpath = "//*[@id=\"plant_address\"]")
	public static WebElement Address;
	@FindBy(xpath = "//*[@id=\"plant_contactno\"]")
	public static WebElement ContactNo;
	@FindBy(xpath = "//*[@id=\"fax\"]")
	public static WebElement fax;
	@FindBy(xpath = "//div[contains(@name,'sub_business_unit')]//div[contains(@class,'ant-select-selector')]")
	public static WebElement ClickSubBusinessUnitDropDown;
	
	@FindBy(xpath = "(//div[contains(@class,'ant-select-item-option-content')])[6]")
	public static WebElement SelectSubBusiness;
	
	@FindBy(xpath = "//div[@name='employeeIds']")
	public static WebElement PlantManagerDropDown;
	
	@FindBy(xpath = "(//div[contains(text(),'Sarath')])[1]")
	public static WebElement SelectPlantManager;
	
	@FindBy(xpath = "//*[@id=\"plant_description\"]")
	public static WebElement Description;
	
	@FindBy(xpath = "//body//div//button[2]")
	public static WebElement UpdateButton;
	
	@FindBy(xpath = "//tbody/tr[2]")
	public static WebElement confirmUpdate;

	@FindBy(xpath = "//div[@class='ant-modal-body']")
	public static WebElement modal;
	
//	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/div")
//	public static WebElement admin;
//	@FindBy(xpath = "//ul[@class='ant-menu-overflow ant-menu ant-menu-root ant-menu-horizontal ant-menu-dark']/div/div[2]/div/div/span[@class='ant-tag ant-tag-has-color']")
//	public static WebElement admin ;
	
	@FindBy(xpath = "//ul[@role='menu']//div//span[@class='ant-tag ant-tag-has-color']")
	public static WebElement admin;
	@FindBy(xpath = "//tbody/tr[8]/td[5]")
	public static WebElement logout;
	
	@FindBy(xpath = "//button[@class='ant-btn']")
	public static WebElement cancelbutton;
	

}
