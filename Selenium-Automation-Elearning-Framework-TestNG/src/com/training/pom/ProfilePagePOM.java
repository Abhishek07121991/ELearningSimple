package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePagePOM {
	private WebDriver driver; 
	
	public ProfilePagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Edit profile')]")
	
	private WebElement editprofile; 
	
	@FindBy(id ="profile_password0")
	private WebElement password;
	
	@FindBy(id="password1")
	private WebElement newpassword;
	
	@FindBy(id="profile_password2")
	private WebElement confirmnewpassword;
	
	@FindBy(id="profile_apply_change")
	private WebElement savebuuton;
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement Createacourse;
	
	public void editprofile() {
		
		this.editprofile.click();
	}
	public void profilepassword() {
		this.password.sendKeys("reva112233");
	}
	public void newpassword() {
		this.newpassword.sendKeys("reva321");
	}
	public void confirmnewpassword() {
		this.confirmnewpassword.sendKeys("reva321");
	}
	public void save() {
		this.savebuuton.click();
	}
	public void createcoursebutton() {
		this.Createacourse.click();
	}
	
}
