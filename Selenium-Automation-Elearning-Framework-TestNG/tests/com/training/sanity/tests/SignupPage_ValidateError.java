package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomepagePOM;
import com.training.pom.SignupPageErrorPOM;
import com.training.pom.SignupPagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SignupPage_ValidateError {

	private WebDriver driver;
	private String baseUrl;
	private HomepagePOM homepagePOM;
	private SignupPageErrorPOM signuppageerrorPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		homepagePOM =new HomepagePOM(driver);
		signuppageerrorPOM = new SignupPageErrorPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	  @AfterMethod 
	  public void tearDown() throws Exception { Thread.sleep(1000);
	  driver.quit(); }
	 
	@Test
	public void validSignUpStudentTest() {
		
	
		homepagePOM.signupbutton();
		signuppageerrorPOM.validatePageTitle();
		
		signuppageerrorPOM.sendFirstName();
		signuppageerrorPOM.sendLastName();
		signuppageerrorPOM.sendEmail();
		signuppageerrorPOM.sendUsername();
		signuppageerrorPOM.sendPassword();
		signuppageerrorPOM.sendConfirmPassword();
		signuppageerrorPOM.sendPhoneNumber();
		signuppageerrorPOM.clickStudent();
		signuppageerrorPOM.clickRegisterBtn();
		signuppageerrorPOM.validateErrorMsg();
		screenShot.captureScreenShot("First");
	}
}
