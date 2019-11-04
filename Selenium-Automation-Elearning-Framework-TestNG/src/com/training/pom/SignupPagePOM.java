package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPagePOM {
	private WebDriver driver; 
	
	public SignupPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @FindBy(xpath="//a[contains(text(),'Sign up!')]")
	 * 
	 * private WebElement signup;
	 */
	
	
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
	
	/*
	 * public void signupbutton() { this.signup.click(); }
	 */
	
		
		public void firstname() {
			this.enterfirstname.sendKeys("revaabhi");
		
	}
	
	public void lastname() {
		this.enterlastname.sendKeys("sharma");
	}
		
		public void email() {
			this.enteremail.sendKeys("revasharma11222233@gmail.com");
			
		
	}
	public void username()	{
		this.enterusername.sendKeys("reva11222211");
	}
	public void password() {
		this.enterpassword.sendKeys("reva112233");
	}
	public void confirmpassword() {
		this.enterconfirmpassword.sendKeys("reva112233");
	}
	
	public void phonenumber() {
		this.enterphonenumber.sendKeys("1122223344");
	}
	public void language() {
		this.selectlanguage.click();
	}

	
	 public void student() { 
		 this.selectstudent.click(); 
		 }
	 
	public void register() {
		this.clickonregisterbutton.click();
	}
}
