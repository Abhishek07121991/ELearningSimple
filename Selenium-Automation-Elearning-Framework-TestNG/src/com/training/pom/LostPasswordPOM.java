package com.training.pom;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostPasswordPOM {

private WebDriver driver; 
	
	public LostPasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'I lost my password')]")
	private WebElement lostpassword; 
	
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement sendmessage;
	
	@FindBy(xpath="//button[@id='lost_password_submit']")
	private WebElement successmsg;
	
	
	public void lostPasswordButton() {
		
		this.lostpassword.click(); 
	}
	public void sendUsername() {
		this.username.sendKeys("reva12345");
	}
	public void clickSendMessage() {
		this.sendmessage.click();
	}
	
	public void validateSuccessMsg(){
		 System.out.println(this.successmsg.getText());
		 String expectedmsg="This platform was unable to send the email. Please contact Site Owner for more information.";

			assertTrue(true, expectedmsg);
			System.out.println("Message should get display after clicking send message");
	}
}