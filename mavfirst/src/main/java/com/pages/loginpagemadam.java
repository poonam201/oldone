package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagemadam {
	
	WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	@FindBy(xpath ="//button")
	private WebElement button;
	
	
	
	public loginpagemadam(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public void validlogin()
	{
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		//driver.findElement(By.xpath("//button")).click();
		button.click();
	}

}
