package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxLesson {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		//ChromeOptions checkChromeOptions = new ChromeOptions();
		//checkChromeOptions.addArguments("--disable-notifications");
		ChromeDriver checkBoxChromeDriver = new ChromeDriver();
		checkBoxChromeDriver.get("https://leafground.com/checkbox.xhtml");
		checkBoxChromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		checkBoxChromeDriver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();
		checkBoxChromeDriver.findElement(By.xpath("//span[text()='Ajax']")).click();
	    Thread.sleep(3000);
	    WebElement checkElement = checkBoxChromeDriver.findElement(By.xpath("//span[contains(text(),'hecked')]"));
	    String checkString = checkElement.getText();
	    if(checkString.equalsIgnoreCase("checked"))
	    	System.out.println("Ajax is checked");
	    else
	    	System.out.println("Ajax is unchecked");
		checkBoxChromeDriver.findElement(By.xpath("//label[text()='Java']")).click();
		checkBoxChromeDriver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		//Thread.sleep(3000);
	    WebElement stateGetElement = checkBoxChromeDriver.findElement(By.xpath("//div[@class='ui-growl-message']/p"));
	    //Thread.sleep(3000);
	    String getStateStatus = stateGetElement.getText();
	    System.out.println("Status is : "+getStateStatus);
	    switch (getStateStatus) {
		case "State = 0":
               System.out.println("State is 0");
           	break;
		case "State = 1":
		       System.out.println("State is 1");
     		break;
		case "State = 2":
			 System.out.println("State is 2");
           break;
           
           default:
              	   System.out.println("No state");
              	   
          }

	    checkBoxChromeDriver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	    WebElement verifyCheckBox = checkBoxChromeDriver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']"));
	    if (verifyCheckBox.isSelected() == true)
	    	System.out.println("Verify checkbox is enabled");
	    else 
			System.out.println("Verify checkbox is disabled");
		
	
	    checkBoxChromeDriver.findElement(By.xpath("//div[@id='j_idt87:multiple']/ul")).click();
	    checkBoxChromeDriver.findElement(By.xpath("//div[@class='ui-widget-header ui-corner-all ui-selectcheckboxmenu-header ui-helper-clearfix']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	    checkBoxChromeDriver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	}
	

}
