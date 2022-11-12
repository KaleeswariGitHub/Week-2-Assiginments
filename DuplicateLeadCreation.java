package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadCreation {

	public static void main(String[] args) {
		
	//Initializing Chrome
		WebDriverManager.chromedriver().setup();
		ChromeDriver leadChromeDriver = new ChromeDriver();
		leadChromeDriver.get("http://leaftaps.com/opentaps/control/login");
		leadChromeDriver.manage().window().maximize();
		
	//Entering the login details
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
		leadChromeDriver.findElement(By.id("createLeadForm_companyName")).sendKeys("SKI");
		leadChromeDriver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaleeswari");
		leadChromeDriver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subbiah");
		leadChromeDriver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ski");
		leadChromeDriver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		leadChromeDriver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium class");
		leadChromeDriver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaleeswarisubbiah80@gmail.com");
	//select dropdownbox
		WebElement getDropElement = leadChromeDriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selDropEle = new Select(getDropElement);
		selDropEle.selectByVisibleText("New York");

        leadChromeDriver.findElement(By.className("smallSubmit")).click();
        leadChromeDriver.getTitle();
        leadChromeDriver.findElement(By.linkText("Duplicate Lead")).click();
    //Duplicate Lead screen is opened
    //Entering new name for company by clearing the old name
        WebElement oldNameElement= leadChromeDriver.findElement(By.id("createLeadForm_companyName"));
        oldNameElement.clear();
        oldNameElement.sendKeys("New SKI");
    //Entering new first name by clearing the old first name
        WebElement oldFirstNameElement = leadChromeDriver.findElement(By.id("createLeadForm_firstName"));
        oldFirstNameElement.clear();
        oldFirstNameElement.sendKeys("Chandrasekar");
        
        leadChromeDriver.findElement(By.className("smallSubmit")).click();
    //Entering into view lead screen
        String viewTitle = leadChromeDriver.getTitle();
        System.out.println("TITLE: " +viewTitle);
		
	}

}
