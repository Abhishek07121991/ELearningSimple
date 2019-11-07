package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewcoursePOM {

private WebDriver driver; 
	
	public NewcoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='title']")
	
	private WebElement coursename; 
	
	@FindBy(id ="advanced_params")
	private WebElement advancesetting;
	
	@FindBy(xpath="//div[contains(text(),'none')]")
	private WebElement categorycode;
	@FindBy(xpath="//span[contains(text(),'Automation04 (NL102904)')]")
	private WebElement selectcategorycode;
	
	@FindBy(xpath="//input[@id='add_course_wanted_code']")
	private WebElement coursecode;
	@FindBy(id="add_course_submit")
	private WebElement createthiscourse;
	

	@FindBy(xpath="//div[@class='help-course']//em[@class='fa fa-file-text']")
	private WebElement addintroduction;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement Frame;


	
	public void enterCourseName() {
		
		this.coursename.sendKeys("Automation");
	}
	public void advanceSettingButton() {
		this.advancesetting.click();
	}
	public void categoryCourseButton() {
		this.categorycode.click();
	}
	public void categoryButton() {
		this.selectcategorycode.click();
	}
	public void enterCourseCode() {
		this.coursecode.sendKeys("seeelennniumcoursejk1SSssss");
	}
	public void createCourseButton() {
		this.createthiscourse.click();
	}
	public void addIntroductionButton() {
		this.addintroduction.click();
	}
	
}