package com.pageobjmodel;

import org.openqa.selenium.WebDriver;
public class Singleton_ikigaibook {
public WebDriver driver;
	
	public Singleton_ikigaibook(WebDriver driver1) {
		this.driver=driver1;
		
	}
	private Login p;
	public Login p() {
		if(p==null) {
			p=new Login(driver);
		}
		return p;
	}
	private Search_page_amazon r;
	public Search_page_amazon r() {
		if(r==null) {
			r=new Search_page_amazon(driver);
		}
		return r;
	}
	
	private Unavailabiltymessage_amazon U;
	public Unavailabiltymessage_amazon U() {
		if(U==null) {
			U=new Unavailabiltymessage_amazon(driver);
		}
		return U;
	}
}
