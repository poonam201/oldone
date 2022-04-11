package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	WebDriver lpdriver;
	

	



	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.lpdriver=driver;
	}


	public WebElement getUname()
	{
		return lpdriver.findElement(By.id("email"));
	}
	
	public WebElement getPassword()
	{
		return lpdriver.findElement(By.id("password"));
	}
	
	public WebElement getloginButton()
	{
		return lpdriver.findElement(By.xpath("//button"));
	}
	
	public void loginToApplicastion()
	{
		getUname().sendKeys("kiran@gmail.com");
		getPassword().sendKeys("123456");
		getloginButton().click();
	}

}
