package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.loginpage;

@Test
public class logginntest {

	public void classtest()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Offline%20Website/index.html");
	    loginpage lp=new loginpage(driver);
	    lp.loginToApplicastion();



	}
}
