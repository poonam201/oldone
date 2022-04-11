package com.jbk;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.loginpagemadam;
@Test
public class trytest {
	
	

	
		public void classistest()
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("file:///C:/Offline%20Website/index.html");
		    loginpagemadam lp=new loginpagemadam(driver);
		    lp.validlogin();
		    System.out.println("hello it is working");
	 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");


		}


	}



