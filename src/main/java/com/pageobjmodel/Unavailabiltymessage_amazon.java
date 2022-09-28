package com.pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Unavailabiltymessage_amazon {
	
	public WebDriver driver;

	public Unavailabiltymessage_amazon (WebDriver element) {
		this.driver=element;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement  send1;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement  search1;
	

	@FindBy(xpath="//span[@class='a-size-medium a-color-base']")
	private WebElement  get1;
	
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
