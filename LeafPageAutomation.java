package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafPageAutomation {

	public static void main(String[] args) {

  //Chrome Intialization
		WebDriverManager.chromedriver().setup();
		ChromeDriver leafChromeDriver = new ChromeDriver();
		leafChromeDriver.get(" https://leafground.com/select.xhtml;jsessionid=node01726s9tfcenpf1bsn9pis5zxhx417425.node0");
		leafChromeDriver.manage().window().maximize();
		
  //select tool dropdownbox
	    WebElement firstSel = leafChromeDriver.findElement(By.className("ui-selectonemenu"));
	    Select toolSelect = new Select(firstSel);
	    toolSelect.selectByVisibleText("Puppeteer");
	    firstSel.sendKeys(Keys.TAB);
  //select country
	    WebElement secondSel = leafChromeDriver.findElement(By.id("j_idt87:country_input"));
	    
	    /*secondSel.getAttribute("India");
	    System.out.println(secondSel.isEnabled();
	    */
	    Select countrySelect = new Select(secondSel);
	    countrySelect.selectByValue("India");
	    	    
  //Select city
	    WebElement thirdSel = leafChromeDriver.findElement(By.id("j_idt87:city_input"));
	    Select citySelect = new Select(thirdSel);
	    citySelect.selectByVisibleText("Chennai");
	    
   //Select course
	    WebElement fourthSel = leafChromeDriver.findElement(By.className("j_idt87:auto-complete_hinput"));
	    Select courseSelect = new Select(fourthSel);
	    courseSelect.selectByVisibleText("Selenium WebDriver");

    //Select language
	    WebElement fifthSel = leafChromeDriver.findElement(By.className("j_idt87:lang_input"));
	    Select langSelect = new Select(fifthSel);
	    langSelect.selectByVisibleText("English");
	    
	  //Select 2
	    WebElement sixthSel = leafChromeDriver.findElement(By.className("j_idt87:value_input"));
	    Select langNumSelect = new Select(sixthSel);
	    langNumSelect.selectByVisibleText("Two");
	    
	    
	    
      
	}

}
