package com.pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;

	public Login (WebDriver element) {
		this.driver=element;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@type='email']")
	private WebElement  invalidemail;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement  continue1;
	
	@FindBy(xpath="//h4[@class='a-alert-heading']")
	private WebElement  get;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement  clr;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement  validemail;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement  continue2;
	
	@FindBy(xpath="//input[@type='password'][@id='ap_password']")
	private WebElement  invalidpswd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement  login;
	
	@FindBy(id="nav-hamburger-menu")
	private WebElement  logout;
	
	public WebElement getLogout() {
		return logout;
	}

	public WebElement getSignout() {
		return signout;
	}
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement  signout;
	
	@FindBy(xpath="//span[@class='a-list-item']")
	private WebElement  get1;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement  clr1;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement  validpswd;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement  login1;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getInvalidemail() {
		return invalidemail;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	public WebElement getGet() {
		return get;
	}

	public WebElement getClr() {
		return clr;
	}

	public WebElement getValidemail() {
		return validemail;
	}

	public WebElement getContinue2() {
		return continue2;
	}

	public WebElement getInvalidpswd() {
		return invalidpswd;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getGet1() {
		return get1;
	}

	public WebElement getClr1() {
		return clr1;
	}

	public WebElement getValidpswd() {
		return validpswd;
	}

	public WebElement getLogin1() {
		return login1;
	}
	

	




}
