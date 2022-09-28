package com.runner_ik;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass_ikiga;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/ik.feature",glue="com.stepdefination_ik",monochrome=true,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:Reports","pretty","html:Report/HTMLReport.html" })
public class Ikigai_runnercls {
public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() {
		driver=Baseclass_ikiga.getBrowser("chrome");
	}
	@AfterClass
	public static void tear_down() {
		driver.close();
	}

}
