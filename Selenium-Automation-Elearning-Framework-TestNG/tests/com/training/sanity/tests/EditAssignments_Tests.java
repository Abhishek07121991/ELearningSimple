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
import com.training.pom.AssignmentPOM;
import com.training.pom.HomepagePOM;
import com.training.pom.Login_TeacherpagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class EditAssignments_Tests {
	private WebDriver driver;
	private String baseUrl;
	private HomepagePOM homepagePOM;
	private AssignmentPOM assignmentPOM;
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
		assignmentPOM =new AssignmentPOM(driver);
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
	public void validEditAssignmentTest() {
		
	
		loginTeacherpagePOM.sendUsername();
		loginTeacherpagePOM.sendPassword();
		loginTeacherpagePOM.clickLoginButton();
		assignmentPOM.selectCourse();
		assignmentPOM.selectAssignmentButton();
		assignmentPOM.clickEditAssignment();
		assignmentPOM.newAssignmentName();
		assesmentPOM.clickValidateButton();
		assignmentPOM.validatesuccessMsg();
		
		screenShot.captureScreenShot("First");
	}
}