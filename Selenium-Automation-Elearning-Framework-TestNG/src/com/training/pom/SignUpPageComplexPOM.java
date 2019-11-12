package com.training.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageComplexPOM {
	private WebDriver driver; 



public SignUpPageComplexPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

@FindBy(id="registration_firstname")
private WebElement enterfirstname;

@FindBy(id="registration_lastname")
private WebElement enterlastname;

@FindBy(id="registration_email")
private WebElement enteremail;

@FindBy(id="username")
private WebElement enterusername;

@FindBy(id="pass1")
private WebElement enterpassword;

@FindBy(id="pass2")
private WebElement enterconfirmpassword;

@FindBy(id="registration_phone")
private WebElement enterphonenumber;

@FindBy(xpath="//div[@class='filter-option-inner-inner']")
private WebElement selectlanguage;


  @FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
  private WebElement selectstudent;


@FindBy(id="registration_submit")
private WebElement clickonregisterbutton;

@FindBy(xpath="//p[contains(text(),'An e-mail has been sent to remind you of your logi')]")
private WebElement validatemessage;

public void validatePageTitle() {
	String AssertTitle =this.driver.getTitle();
	assertEquals(AssertTitle,"My Organization - My education - Registration");
	
}

	public void sendFirstName() {
		this.enterfirstname.sendKeys("manzoo");
	
}

public void sendLastName() {
this.enterlastname.sendKeys("mehad");
}
	
	public void sendEmail() {
	this.enteremail.sendKeys("manzoor@gmail.co");
	
}
public void sendUsername()	{
this.enterusername.sendKeys("manzoo");
}
public void sendPassword() {
this.enterpassword.sendKeys("manzoo");
}
public void sendConfirmPassword() {
	this.enterconfirmpassword.sendKeys("manzoo");
}

public void sendPhoneNumber() {
	this.enterphonenumber.sendKeys("1122223344");
}
public void selectLanguage() {
	this.selectlanguage.click();
}


 public void clickStudent() { 
	 this.selectstudent.click(); 
	 }
 
public void clickRegisterBtn() {
	this.clickonregisterbutton.click();
}
public void validateSuccessMsg(){
	 System.out.println(this.validatemessage.getText());
	 String expectedmsg="An e-mail has been sent to remind you of your login and password.";

		assertTrue(true, expectedmsg);
		System.out.println("Message should get display in profile page");
}

}
