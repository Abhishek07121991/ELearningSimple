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
import com.training.pom.ProfilePagePOM;
import com.training.pom.SignupPagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Profile_ELTC_003_Tests {

	private WebDriver driver;
	private String baseUrl;
	private HomepagePOM homepagePOM;
	private SignupPagePOM signupPagePOM;
	private ProfilePagePOM profilePagePOM;
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
		signupPagePOM = new SignupPagePOM(driver); 
		profilePagePOM =new ProfilePagePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validEditProfileTest() {
		
       	homepagePOM.sendUsername();
       	homepagePOM.sendPassword();
       	homepagePOM.clickLoginButton();
       	profilePagePOM.editProfileButton();
       	profilePagePOM.sendProfilePassword();
       	profilePagePOM.sendNewPassword();
       	profilePagePOM.sendConfirmNewPassword();
       	profilePagePOM.save();
       	
		screenShot.captureScreenShot("First");
	}
}
