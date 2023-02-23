package com.invicta.qa.pages.sbu;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.implementation.bind.annotation.Default;

public class EditPlantPage {
 
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[1]/div/div[2]")
	public static WebElement clickplant;
	
	@FindBy(xpath = "//tbody/tr[2]/td[9]/span[1]/a[1]/span[1]")
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
	
}
