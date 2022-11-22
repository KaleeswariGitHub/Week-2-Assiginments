package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
 */
public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver leadChromeDriver = new ChromeDriver();
		leadChromeDriver.get("http://leaftaps.com/opentaps/control/login");
		leadChromeDriver.manage().window().maximize();
		leadChromeDriver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		leadChromeDriver.findElement(By.id("password")).sendKeys("crmsfa");
		leadChromeDriver.findElement(By.className("decorativeSubmit")).click();
		leadChromeDriver.findElement(By.linkText("CRM/SFA")).click();
		leadChromeDriver.findElement(By.linkText("Leads")).click();
		
		leadChromeDriver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		leadChromeDriver.findElement(By.xpath("//span[text()='Email']")).click();
	    leadChromeDriver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kaleeswarisubbiah80@gmail.com");
	    leadChromeDriver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    WebElement idEle = leadChromeDriver.findElement(By.xpath("//div [contains(@class,'col-partyId')]/a"));
		String intext = idEle.getText();
		System.out.println(intext);
	    leadChromeDriver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        leadChromeDriver.findElement(By.xpath("//a[text()='Delete']")).click();
		leadChromeDriver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		leadChromeDriver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='id']")).sendKeys(intext);
		leadChromeDriver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String verifyText = leadChromeDriver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		if(verifyText.equals("No records to display"))
		{
			System.out.println("Record is deleted successfully");
		}
	    leadChromeDriver.close(); 
	 	
		
		

	}

}
