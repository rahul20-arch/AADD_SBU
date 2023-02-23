package com.invicta.qa.pages.sbu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReleventTestEditPage {

	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]/span/a")
	public static WebElement tabMaterial;
	
	@FindBy(xpath = "//div[@class='sc-dnqmqq hnktPT'][normalize-space()='Material']")
	public static WebElement navigationMaterial;
	
	@FindBy(xpath = "//tbody/tr[2]/td[12]/span[1]/a[1]/span[1]")
	public static WebElement clickReleventEditIcon;
	
	@FindBy(xpath = "//*[@id=\"status\"]")
	public static WebElement Checkbox;
	
	@FindBy(xpath = "//div[@class='ant-modal-footer']//button[2]")
	public static WebElement saveButton;
	
	
	@FindBy(xpath = "//div[@class='ant-modal-footer']//button[1]")
	public static WebElement cancelButton;
}
