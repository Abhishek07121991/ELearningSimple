package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTestPOM {

private WebDriver driver; 
	
	public CreateTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'selenium')]")
	private WebElement coursename; 
	
	@FindBy(xpath="//img[@id='toolimage_6623']")
	private WebElement test; 
	
	@FindBy(css="main.section-mycourses:nth-child(1) div.container div.row div.col-xs-12.col-md-12 div.actions:nth-child(1) div.row div.col-sm-6:nth-child(1) a:nth-child(2) > img:nth-child(1)")
	private WebElement addonlineactivity;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[3]/a[1]/img[1]")
	private WebElement createnewtest;
	
	@FindBy(xpath="//input[@id='exercise_title']")
	private WebElement entertestname;
	
	@FindBy(xpath="//button[@id='exercise_admin_submitExercise']")
	private WebElement proceedtoquestions;
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advancesetting;
	
	@FindBy(xpath="//input[@id='pass_percentage']")
	private WebElement passpercentage;
	
	@FindBy(xpath="//section[@id='cm-content']//li[1]//div[1]//a[1]//img[1]")
	private WebElement mcqs;
	
	 @FindBy(xpath="//input[@id='question_admin_form_questionName']")
	 private WebElement question;
	 
	 @FindBy(xpath="//button[@id='submit-question']")
	 private WebElement addthisquestion;
	public void selectCourseName() {
		this.coursename.click();
	}
	public void clickTestButton() {
		this.test.click();
	}
	public void createNewTest() {
		this.createnewtest.click();
	}
	public void enterTestName() {
		this.entertestname.sendKeys("online quiz");
	}
	public void clickProceedToQuestions() {
		this.proceedtoquestions.click();
	}
	public void clickAdvanceSettingButton() {
		this.advancesetting.click();
	}
	public void enterPassPercentage() {
		this.passpercentage.sendKeys("60");
	}
	public void clickMCQ() {
		this.mcqs.click();
	}
	public void writeQuestions() {
		this.question.sendKeys("Which course you are learning");
	}
	public void addQuestionButton() {
		this.addthisquestion.click();
	}
	
}

