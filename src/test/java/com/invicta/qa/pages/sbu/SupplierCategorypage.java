package com.invicta.qa.pages.sbu;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierCategorypage {
	@FindBy(xpath = "//a[@href='#/master/supplierlevel']")
	public static WebElement clickSupplier;
	@FindBy(xpath = "//div[@class='sc-gzVnrw flBzTM']")
	public static WebElement clickSupplierCategory;
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul")
	public static WebElement pagination;
	
	@FindBy(xpath = "//a[normalize-space()='2']")
	public static WebElement PaginationSecoundPage;
	@FindBy(xpath = "//span[@aria-label='right']//*[name()='svg']")
	public static WebElement NextPageBtn;
	
	@FindBy(xpath = "//li[@class='ant-pagination-total-text']")
	public static WebElement totalText;
	
	@FindBy(xpath ="//a[normalize-space()='1']")
	public static WebElement PageNumber;
	
	@FindBy(xpath = "//span[@aria-label='left']//*[name()='svg']")
	public static WebElement PreviousPageBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[6]/div")
	public static WebElement CurrentPaginationOpction;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> UnitColumn;
	
	@FindBy(xpath = "//div[@title='20 / page']")
	public static WebElement when20usernamecolumn;
	
	@FindBy(xpath = "//div[contains(text(),'30 / page')]")
	public static WebElement when30usernamecolumn;
	

}
