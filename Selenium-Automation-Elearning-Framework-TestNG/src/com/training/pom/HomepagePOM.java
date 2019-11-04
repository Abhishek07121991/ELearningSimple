package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOM {
	private WebDriver driver; 
	
	public HomepagePOM(WebDriver driver) {
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
	
	
	public void username() {
		
		this.username.sendKeys("reva11222211"); 
	}
	public void password() {
		this.password.sendKeys("reva112233");
	}
	public void loginbutton() {
		this.loginbutton.click();
	}
	
	public void signupbutton() {
		this.signup.click();
	}
}
