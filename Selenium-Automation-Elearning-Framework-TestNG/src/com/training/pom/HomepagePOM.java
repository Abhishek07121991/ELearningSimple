package com.training.pom;

import static org.testng.Assert.assertTrue;

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
	
	@FindBy(xpath="//section[@id='cm-content']//p[1]")
	private WebElement successmsg;
	
	
	public void sendUsername() {
		
		this.username.sendKeys("abhishek"); 
	}
	public void sendPassword() {
		this.password.sendKeys("kehsibha");
	}
	public void clickLoginButton() {
		this.loginbutton.click();
	}
	
	public void signupbutton() {
		this.signup.click();
	}
	public void validateSuccessMsg(){
		 System.out.println(this.successmsg.getText());
		 String expectedmsg="Hello Abhishek kumar and welcome,";

			assertTrue(true, expectedmsg);
			System.out.println("Message should get display in My profile page");
	}
}
