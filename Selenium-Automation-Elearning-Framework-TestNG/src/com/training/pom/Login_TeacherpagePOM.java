package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_TeacherpagePOM {

private WebDriver driver; 
	
	public Login_TeacherpagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign up!')]")
	
	private WebElement signup; 
	
	
	
	
	
	@FindBy(id="login")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password; 
	
	@FindBy(id ="form-login_submitAuth")
	private WebElement loginbutton;
	
	
	public void sendUsername() {
		
		this.username.sendKeys("tutor"); 
	}
	public void sendPassword() {
		this.password.sendKeys("rotut");
	}
	public void clickLoginButton() {
		this.loginbutton.click();
	}
	
	
}