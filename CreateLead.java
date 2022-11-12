package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
	//Initializing Chrome Page
		WebDriverManager.chromedriver().setup();
		ChromeDriver leadChromeDriver = new ChromeDriver();
		leadChromeDriver.get("http://leaftaps.com/opentaps/control/login");
		leadChromeDriver.manage().window().maximize();
	//Entering in to login screen	
		leadChromeDriver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		leadChromeDriver.findElement(By.id("password")).sendKeys("crmsfa");
		leadChromeDriver.findElement(By.className("decorativeSubmit")).click();
	//entered into welcome screen
		leadChromeDriver.findElement(By.linkText("CRM/SFA")).click();
	//Entered into MyHome screen
		leadChromeDriver.findElement(By.linkText("Leads")).click();
	//Entered into MyLeads screen
		leadChromeDriver.findElement(By.linkText("Create Lead")).click();
	//Entered into CreateLead screen
		/*
		 * 7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Select State/Province as NewYork Using Visible Text
		 */
	//element selected using id attribute
		leadChromeDriver.findElement(By.id("createLeadForm_companyName")).sendKeys("SKI");
		leadChromeDriver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaleeswari");
		leadChromeDriver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subbiah");
		leadChromeDriver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ski");
		leadChromeDriver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		leadChromeDriver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium class");
		leadChromeDriver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaleeswarisubbiah80@gmail.com");
	//select dropdownbox
	    WebElement openStateElement = leadChromeDriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select initiateStateSelect = new Select(openStateElement);
        initiateStateSelect.selectByVisibleText("New York");
        
        leadChromeDriver.findElement(By.className("smallSubmit")).click();
   //Entered into View leads screen
        String titleScreen = leadChromeDriver.getTitle();
        System.out.println("TITLE: "+titleScreen);
        
	}

}
