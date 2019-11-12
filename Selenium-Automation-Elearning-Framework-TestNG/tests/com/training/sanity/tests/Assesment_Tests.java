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
import com.training.pom.AssesmentPOM;
import com.training.pom.HomepagePOM;
import com.training.pom.Login_TeacherpagePOM;
import com.training.pom.NewcoursePOM;
import com.training.pom.ProfilePagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Assesment_Tests {

	private WebDriver driver;
	private String baseUrl;
	private HomepagePOM homepagePOM;
	private AssesmentPOM assesmentPOM;
	
	private Login_TeacherpagePOM loginTeacherpagePOM;
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
		homepagePOM = new HomepagePOM(driver);
		assesmentPOM =new AssesmentPOM(driver);
		
		loginTeacherpagePOM=new Login_TeacherpagePOM(driver); 
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
	public void validAssesmentTest() {
		
	
		loginTeacherpagePOM.sendUsername();
		loginTeacherpagePOM.sendPassword();
		loginTeacherpagePOM.clickLoginButton();
		assesmentPOM.clickCourseName();
		assesmentPOM.clickAssesmentButton();
		assesmentPOM.clickAddOnlineButton();
		assesmentPOM.clickTypeSelectionButton();
		assesmentPOM.clickSelectActivity();
		assesmentPOM.inputWeight();
		assesmentPOM.verifyCheckbox();
		assesmentPOM.addLearningButton();
		assesmentPOM.editBoxButton();
		assesmentPOM.clickGenerateCertificate();
		
		screenShot.captureScreenShot("First");
	}
}
