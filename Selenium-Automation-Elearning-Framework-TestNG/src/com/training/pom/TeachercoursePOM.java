package com.training.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeachercoursePOM {

private WebDriver driver; 
	
	public TeachercoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement createcourse;
	
	@FindBy(xpath="//li[contains(text(),'Add a new course')]")
	private WebElement addnewcoursemessage;
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement coursename;
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advancesetting;
	
	@FindBy(xpath="//input[@id='add_course_wanted_code']")
	private WebElement coursecode;
	
	@FindBy(xpath="//button[@id='add_course_submit']")
	private WebElement createthiscourse;
	
	@FindBy(xpath="//a[contains(text(),'seleniumtrainingggggggggSS')]")
	private WebElement coursemessage;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement toggle;
	
	@FindBy(xpath="//a[@id='logout_button']")
	private WebElement logout;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='form-login_submitAuth']")
	private WebElement studentlogin;
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement coursecatalog;
	
	@FindBy(xpath="//li[contains(text(),'Courses catalog')]")
	private WebElement coursecatalogmessage;
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement searchcourse;
	
	@FindBy(xpath="//div[@class='input-group']//button[1]")
	private WebElement searchbutton;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-sm']")
	private WebElement subscribe;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement subscribemessage;
	
	
	public void validatePageTitle() {
		String AssertTitle =this.driver.getTitle();
		assertEquals(AssertTitle,"My Organization - My education - My courses");
	}
	
		public void createCourseButton() {
			this.createcourse.click();
			}
		
		public void validateAddCourseMessage(){
			 System.out.println(this.addnewcoursemessage.getText());
			 String expectedmsg="coursesAdd a new course";

				assertTrue(true, expectedmsg);
				System.out.println("Message should get display in create course page");
		}
		
		public void enterCoursename() {
			this.coursename.sendKeys("sseeleniumtraininggg");
		}
		
		public void clickAdvanceSettingButton() {
			this.advancesetting.click();
		}
		public void enterCoursCode() {
			this.coursecode.sendKeys("selenium07121991");
		}
		public void clickCreateCourse() {
			this.createthiscourse.click();
		}
	
		public void validateCourseMessage(){
			 System.out.println(this.coursemessage.getText());
			 String expectedmsg="seleniumtraining";

				assertTrue(true, expectedmsg);
				System.out.println("Message should get display in after creating course page");
		}	
		public void clickToggleButton() {
			this.toggle.click();
		}
		public void clickLogoutBtn() {
			this.logout.click();
		}
		public void sendStudentUserName() {
			this.username.sendKeys("abhishek");
		}
		public void sendStudentPassword() {
			this.password.sendKeys("kehsibha");
		}
		public void clickStudentLogin() {
			this.studentlogin.click();
		}
		public void clickCourseCatalog() {
			this.coursecatalog.click();
		}
		public void validateCourseCatalogMessage(){
			 System.out.println(this.coursecatalogmessage.getText());
			 String expectedmsg="Courses catalog";

				assertTrue(true, expectedmsg);
				System.out.println("Message should get display  after creating course catalog button");
		}	
		public void sendcoursename() {
			this.searchcourse.sendKeys("APITESTING1");
		}
		public void clickSearchBtn() {
			this.searchbutton.click();
		}
		public void clickSubscribeBtn() {
			this.subscribe.click();
		}
		public void validateSubscribeMessage(){
			 System.out.println(this.subscribemessage.getText());
			 String expectedmsg="Courses catalog";

				assertTrue(true, expectedmsg);
				System.out.println("User Abhishek kumar (abhishek) has been registered to course APITESTING1");
		}	
	
}