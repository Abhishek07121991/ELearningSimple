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
import com.training.pom.SignupPagePOM;
import com.training.pom.SignupPageTeacherPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SignupPage_Teacher_ELTC_005_Tests {

	private WebDriver driver;
	private String baseUrl;
	private HomepagePOM signupPOM;
	private SignupPageTeacherPOM signupPageTeacherPOM;
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
		signupPOM =new HomepagePOM(driver);
		signupPageTeacherPOM = new SignupPageTeacherPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	 @AfterMethod public void tearDown() throws Exception { Thread.sleep(1000);
	  driver.quit(); }
	 
	 
	@Test
	public void validSignUpTeacherTest() {
		
	
		signupPOM.signupbutton();
		signupPageTeacherPOM.validatePageTitle();
		signupPageTeacherPOM.sendFirstname();
		signupPageTeacherPOM.sendLastname();
		signupPageTeacherPOM.sendEmail();
		signupPageTeacherPOM.sendUsername();
		signupPageTeacherPOM.sendPassword();
		signupPageTeacherPOM.sendConfirmPassword();
		signupPageTeacherPOM.sendPhoneNumber();
		signupPageTeacherPOM.clickTeacherButton();
		signupPageTeacherPOM.clickRegisterButton();
		signupPageTeacherPOM.validateSuccessMsg();
		
		screenShot.captureScreenShot("First");
	}
}
