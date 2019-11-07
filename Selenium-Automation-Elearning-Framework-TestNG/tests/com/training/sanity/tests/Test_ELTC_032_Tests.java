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
import com.training.pom.CreateTestPOM;
import com.training.pom.HomepagePOM;
import com.training.pom.Login_TeacherpagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Test_ELTC_032_Tests {

	private WebDriver driver;
	private String baseUrl;
	private HomepagePOM homepagePOM;
	private AssesmentPOM assesmentPOM;
	private CreateTestPOM createtestPOM;
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
		createtestPOM =new CreateTestPOM(driver);
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
	public void validCreateNewTest() {
		
	
		loginTeacherpagePOM.sendUsername();
		loginTeacherpagePOM.sendPassword();
		loginTeacherpagePOM.clickLoginButton();
		createtestPOM.selectCourseName();
		createtestPOM.clickTestButton();
		createtestPOM.createNewTest();
		createtestPOM.enterTestName();
		createtestPOM.clickAdvanceSettingButton();
		createtestPOM.enterPassPercentage();
		createtestPOM.clickProceedToQuestions();
		createtestPOM.clickMCQ();
		createtestPOM.writeQuestions();
		createtestPOM.addQuestionButton();
		screenShot.captureScreenShot("First");
	}
}
