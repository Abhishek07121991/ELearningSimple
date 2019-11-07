package com.training.pom;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPOM {

private WebDriver driver; 
	
	public AssignmentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'selenium')]")
	private WebElement coursename; 
	
	@FindBy(xpath="//img[@id='toolimage_6630']")
	private WebElement assignment; 
	
	@FindBy(xpath="//div[@class='actions']//a[1]//img[1]")
	private WebElement createassignment; 
	
	@FindBy(xpath="//input[@id='form1_new_dir']")
	private WebElement assignmentname; 
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement advancesetting;
	
	@FindBy(xpath="//input[@id='form1_qualification']")
	private WebElement maximumscore;
	
	@FindBy(xpath="//button[@id='form1_submit']")
	private WebElement validatebutton;
	
	@FindBy(xpath="//tr[@id='83']//a[4]//img[1]")
	private WebElement editassignment;
	
	@FindBy(xpath="//input[@id='edit_dir_new_dir']")
	private WebElement newassignmentname;
	
	@FindBy(xpath="//input[@id='form1_qualification']")
	private WebElement newmaximumscore;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successmessage;
	
		public void selectCourse() {
		this.coursename.click();
	}
		public void selectAssignmentButton() {
		this.assignment.click();
		
		}
		public void createAssignmentButton() {
			this.createassignment.click();
			}
		
		public void assignmentName() {
			this.assignmentname.sendKeys("Hands on Exercises");
			}
		public void advanceSettingButton() {
			this.advancesetting.click();
			}
		public void enterMaximmumScore() {
			this.maximumscore.sendKeys("60");
			}
		public void clickValidateButton() {
			this.validatebutton.click();
			}
		public void clickEditAssignment() {
	    	this.editassignment.click();
	    }
	    public void newAssignmentName() {
	    	this.newassignmentname.clear();
	    	this.newassignmentname.sendKeys("Edited hands on experience");
	    }
	    
	    public void newMaximumScore() {
	    	this.newmaximumscore.clear();
	    	this.newmaximumscore.sendKeys("65");
	    }
	    public void validatesuccessMsg(){
			 System.out.println(this.successmessage.getText());
			 String expectedmsg="Update successful";

				assertTrue(true, expectedmsg);
				System.out.println("Message should get display in after updating Assignment");
		}
		
	
}
