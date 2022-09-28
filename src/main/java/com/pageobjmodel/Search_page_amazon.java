package com.pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page_amazon {
	public WebDriver driver;

	public Search_page_amazon (WebDriver element) {
		this.driver=element;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@aria-describedby='searchDropdownDescription']")
	private WebElement  dropdown;
	

	@FindBy(xpath="//input[@type='text']")
	private WebElement  send;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement  search;
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")
	private WebElement  select;
	
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	private WebElement  addtocart;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement  send1;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement  search1;
	

	@FindBy(xpath="//span[@class='a-size-medium a-color-base']")
	private WebElement  get1;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getSend() {
		return send;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getSend1() {
		return send1;
	}

	public WebElement getSearch1() {
		return search1;
	}

	
	public WebElement getGet1() {
		return get1;
	}
	
	
}
