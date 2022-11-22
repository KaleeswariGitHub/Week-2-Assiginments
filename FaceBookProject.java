package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Assignment:1
FaceBook:
================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
 * 
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            ( A normal click will do for this step) 
 */

public class FaceBookProject {
	
	public static void main(String[] args)
	{
		//Intialize the webdriver
		WebDriverManager.chromedriver().setup();
		ChromeDriver faceBookDriver = new ChromeDriver();
		faceBookDriver.get("https://en-gb.facebook.com/");
		faceBookDriver.manage().window().maximize();
		Timeouts implicitlyWait = faceBookDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//clicking on the create new button
		faceBookDriver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//Sign up page gets opened
		String getCurrentTitle = faceBookDriver.getTitle();
		System.out.println(getCurrentTitle);
		//enter mandatory fields
		
		faceBookDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kaleeswari");
		faceBookDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		faceBookDriver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		faceBookDriver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Goodday@7");
	    WebElement getDay =	faceBookDriver.findElement(By.xpath("//select[@id='day']"));
	    Select daySelect = new Select(getDay);
	    daySelect.selectByVisibleText("26");
	    WebElement getMonth = faceBookDriver.findElement(By.xpath("//select[@id='month']"));
	    Select monthSelect = new Select(getMonth);
	    monthSelect.selectByVisibleText("Dec");
	    WebElement getYear = faceBookDriver.findElement(By.xpath("//select[@id='year']"));
	    Select yearSelect = new Select(getYear);
	    yearSelect.selectByVisibleText("1980");
	    faceBookDriver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
	    		
	 		
	}

}
