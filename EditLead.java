package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
	    //Initializing chrome page   
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
	   //Click Edit
	        leadChromeDriver.findElement(By.linkText("Edit")).click();
	   //Entered into Edit lead screen
	        leadChromeDriver.findElement(By.id("updateLeadForm_description")).clear();
	        leadChromeDriver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updating the description field");
	        leadChromeDriver.findElement(By.className("smallSubmit")).click();
	   //Entered into View Lead screen
	        String getCurrentTitle = leadChromeDriver.getTitle();
	        System.out.println("EDIT SCREEN TITLE: "+getCurrentTitle);

	}

}
