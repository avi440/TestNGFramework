package com.education.runnersAction;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.education.testCases.Getpage;
import org.apache.log4j.Logger;

public class OrangehrmLoginPageAction extends Getpage{
	
	
	WebDriver driver ;
	Logger logger;
	public OrangehrmLoginPageAction(WebDriver driver,Logger logger) {
		super(driver, "loginPage");
    	this.driver = driver; 
    	this.logger = logger;
	}
	
	public void  pageElementDisplayedOrNot() throws NoSuchElementException, TimeoutException {
	isElementDisplayed("PlatformElement");
	isElementDisplayed("WhyOrangeHRMElement");
	isElementDisplayed("ResourcesElement");
	isElementDisplayed("CompanyElement");
	isElementDisplayed("bookFreeDemoElement");
	isElementDisplayed("contactSalesElement");
//	isElementDisplayed("tryItFreeElement");
//	isElementDisplayed("PeopleManagementElement");
//	isElementDisplayed("cultureElement");
//	isElementDisplayed("talentManagementElement");
	}
	
	public void  verifyBookFreeDemoTitle() throws NoSuchElementException, TimeoutException, IOException {
		String bookFreeDemoTitle = "Book Your Free Demo | OrangeHRM";
		element("bookFreeDemoElement").click();
		
	    
		if (driver.getTitle().equalsIgnoreCase(bookFreeDemoTitle)) {
			Assert.assertTrue(true);
			captureScreenshot(driver,"bookFreeDemo");

		} else {
			captureScreenshot(driver,"logTest01");
			Assert.assertTrue(false);
		}
		
		}
	
	public void  bookFreeDemoElementDisplayedOrNot() throws NoSuchElementException, TimeoutException {
		isElementDisplayed("yourFullName");
		isElementDisplayed("businessEmail");
		isElementDisplayed("Country");
		isElementDisplayed("phoneNumber");
		isElementDisplayed("submitButton");
//		System.out.println(element("notRobot").isSelected());
		}
	
	public void  bookFreeDemoElementAction() throws NoSuchElementException, TimeoutException {
		scrollDown(element("yourFullName")); 
		element("yourFullName").sendKeys("Avinash");
		scrollDown(element("businessEmail")); 
		element("businessEmail").sendKeys("bandariavinash009@gmail.com");
		WebElement coun =  element("Country");
		selectProvidedTextFromDropDown(coun, "India");
		scrollDown(element("phoneNumber")); 
		element("phoneNumber").sendKeys("9493974391");
		element("notRobot").click();
		element("submitButton").click();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA");
		System.out.println("EEEEEEEEEEEEEE");
		}
	
}
