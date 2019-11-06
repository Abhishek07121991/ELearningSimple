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


	
	public void coursename() {
		
		this.coursename.sendKeys("Automation");
	}
	public void Advancesettingbutton() {
		this.advancesetting.click();
	}
	public void categorycoursebutton() {
		this.categorycode.click();
	}
	public void categorybutton() {
		this.selectcategorycode.click();
	}
	public void coursecode() {
		this.coursecode.sendKeys("seeeleniumcourse1SSssss");
	}
	public void createcoursebutton() {
		this.createthiscourse.click();
	}
	public void addintroductionbutton() {
		this.addintroduction.click();
	}
	public void frame() {
		//this.Frame.sendKeys("This is a selenium course");
		//this.driver.switchTo().frame(0);
		this.Frame.sendKeys("selenium");
		
		
		
		
	}
}