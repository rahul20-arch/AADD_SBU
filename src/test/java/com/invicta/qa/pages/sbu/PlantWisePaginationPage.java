package com.invicta.qa.pages.sbu;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlantWisePaginationPage {
//	@FindBy(xpath = "//a[@href='#/master/supplierlevel']")
//	public static WebElement clickSupplier;
//	@FindBy(xpath = "//div[@class='sc-gzVnrw flBzTM']")
//	public static WebElement clickSupplierCategory;
	@FindBy(xpath = "//ul[@class='ant-pagination mini ant-table-pagination ant-table-pagination-right']")
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
}
