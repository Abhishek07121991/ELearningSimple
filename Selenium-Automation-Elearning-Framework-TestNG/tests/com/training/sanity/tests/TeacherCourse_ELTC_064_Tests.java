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
import com.training.pom.Login_TeacherpagePOM;
import com.training.pom.SignUpPageComplexPOM;
import com.training.pom.TeachercoursePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TeacherCourse_ELTC_064_Tests {

	private WebDriver driver;
	private String baseUrl;
	private HomepagePOM homepagePOM;
	private TeachercoursePOM teachercoursePOM;
	private Login_TeacherpagePOM loginteacherPOM;
	private SignUpPageComplexPOM signupPagecomplexPOM;
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
		loginteacherPOM =new Login_TeacherpagePOM(driver);
		teachercoursePOM =new TeachercoursePOM(driver);
		signupPagecomplexPOM = new SignUpPageComplexPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	  @AfterMethod 
	  public void tearDown() throws Exception { Thread.sleep(1000);
	  driver.quit(); }
	 
	@Test
	public void validSignUpStudentComplexTest() {
		
		loginteacherPOM.sendUsername();
		loginteacherPOM.sendPassword();
		loginteacherPOM.clickLoginButton();
		teachercoursePOM.validatePageTitle();
		teachercoursePOM.createCourseButton();
	    teachercoursePOM.validateAddCourseMessage();
		teachercoursePOM.enterCoursename();
		teachercoursePOM.clickAdvanceSettingButton();
		teachercoursePOM.enterCoursCode();
		teachercoursePOM.clickCreateCourse();
		teachercoursePOM.clickToggleButton();
		teachercoursePOM.clickLogoutBtn();
		teachercoursePOM.sendStudentUserName();
		teachercoursePOM.sendStudentPassword();
		teachercoursePOM.clickStudentLogin();
		teachercoursePOM.clickCourseCatalog();
		teachercoursePOM.validateCourseCatalogMessage();
		teachercoursePOM.sendcoursename();
		teachercoursePOM.clickSearchBtn();
		teachercoursePOM.clickSubscribeBtn();
		teachercoursePOM.validateSubscribeMessage();
		screenShot.captureScreenShot("First");
	}
}
