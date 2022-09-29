package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass_ikiga {
public static WebDriver driver;
	
	public static WebDriver getBrowser(String method)  {
		if(method.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(method.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		return driver;
		
	}
	public static void geturl(String Url) {
		driver.get(Url);	
		}
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	public static void ClickOnElement(WebElement element) {
		element.click();
	}
	public static void Clear(WebElement element4) {
		element4.clear();
	}
	public static void inputvalue(WebElement element,String value ) {
		element.sendKeys(value);
		}
	public static void wait(WebElement ele) {
	    WebDriverWait ref=new WebDriverWait(driver,Duration.ofSeconds(10));
	     ref.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void windowhandle() {
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String title:windowHandles) {
			if(!title.equals(windowHandle)) {
				driver.switchTo().window(title);
			}}
	}
	public static void screenshot () throws IOException {
		TakesScreenshot s=(TakesScreenshot)driver;
		File f=s.getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\TZ167UZ\\eclipse-workspace\\Ikigai_book\\screenshot\\amazonpg.png");
		FileHandler.copy(f, f1);
		
	}
	public static void javascript(WebElement element) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();", element);
	       
	}
	

	public static void implicit () {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public static void ass(WebElement as,String value) {
		String text = as.getText();

		Assert.assertEquals(value,text);
		System.out.println("Elements  has been verified :" +text);
		
	}
	public static void dropdown(WebElement element,String value,String type) {
			Select a=new Select(element);
			if(type.equalsIgnoreCase("byvalue")) {
				a.selectByValue(value);
			}
			else if(type.equalsIgnoreCase("byvisibletext")) {
				a.selectByVisibleText(value);
			}
			else if(type.equalsIgnoreCase("byindex")) {
				int index=Integer.parseInt(value);
				a.selectByIndex(index);
			}
			
	
}



}
