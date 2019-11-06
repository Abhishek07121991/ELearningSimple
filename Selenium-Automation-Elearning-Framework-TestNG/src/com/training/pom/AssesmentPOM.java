package com.training.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssesmentPOM {

private WebDriver driver; 
	
	public AssesmentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'selenium')]")
	private WebElement coursename; 
	
	@FindBy(xpath="//img[@id='toolimage_6633']")
	private WebElement assesment; 
	////div[@class='col-sm-6']//a[2]//img[1]
	
	@FindBy(css="main.section-mycourses:nth-child(1) div.container div.row div.col-xs-12.col-md-12 div.actions:nth-child(1) div.row div.col-sm-6:nth-child(1) a:nth-child(2) > img:nth-child(1)")
	private WebElement addonlineactivity;
	
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	private WebElement choosetype;
	
	@FindBy(xpath="//span[contains(text(),'Tests')]")
	private WebElement selectactivity;
	
	@FindBy(id="weight_mask")
	private WebElement weight;
	
	@FindBy(id="add_link_submit")
	private WebElement addlearningactivity;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/form[2]/fieldset[1]/div[3]/div[1]/div[1]/label[1]/input[1]")
	private WebElement checkbox;
	
	@FindBy(css="main.section-mycourses:nth-child(1) div.container div.row div.col-xs-12.col-md-12 div.actions:nth-child(1) div.row div.col-sm-6.text-right:nth-child(2) a:nth-child(1) > img:nth-child(1)")
	private WebElement Editbox;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/div[5]/div[1]/div[1]/label[1]/input[1]")
	private WebElement generateCertificate;
	public void coursename() {
		this.coursename.click();
	}
	public void assesmentbutton() {
		this.assesment.click();
	}
	public void addonline() {
		this.addonlineactivity.click();
	}
	public void typeselection() {
		this.choosetype.click();
	}
	public void selectactivity() {
		this.selectactivity.click();
	}
	public void inputweight() {
		this.weight.clear();
		this.weight.sendKeys("1");
	}
	public void addlearningbutton() {
		this.addlearningactivity.click();
	}
	public void verifycheckbox() {
		Boolean b =this.checkbox.isSelected();
		System.out.println(b);
		//assertEquals(b,"true");
		
		
	}
    public void editboxbutton() {
    	this.Editbox.click();
    }
    public void generatecertificate() {
    	this.generateCertificate.click();
    }
	
}
