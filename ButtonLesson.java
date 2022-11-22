package week2.day2;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.Color;

public class ButtonLesson {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver buttonChromeDriver = new ChromeDriver();
		buttonChromeDriver.get("https://leafground.com/button.xhtml");
		buttonChromeDriver.manage().window().maximize();
		
		//buttonChromeDriver.findElement(By.xpath("//span[text()='Click']")).click();
        //System.out.println("Title: " + buttonChromeDriver.getTitle());
        //buttonChromeDriver.close();
        //buttonChromeDriver.get("https://leafground.com/button.xhtml");
        //WebElement eleMenuClick= buttonChromeDriver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']/parent::a']"));
        //buttonChromeDriver.executeScript("arguments[0].Click();", eleMenuClick);
		
		WebElement checkButtonStatus = buttonChromeDriver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
	    boolean checkButton = checkButtonStatus.isEnabled();
	    if(checkButton == true)
	    	System.out.println("Confirm if the button is disabled----Button is enabled");
	    else 
		   System.out.println("Confirm if the button is disabled-----Button is disabled");
	   System.out.println(buttonChromeDriver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
	  WebElement colorButtonElement = buttonChromeDriver.findElement(By.xpath("//span[text()='Save']"));
	 String conrgbaString = colorButtonElement.getCssValue("color");
		System.out.println(conrgbaString);
	 String conHexString = Color.fromString(conrgbaString).asHex();
		System.out.println("Button color is: "+conHexString);
	 	
	  WebElement buttonSizElement =buttonChromeDriver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
      Dimension sizeValueString = buttonSizElement.getSize();
      System.out.println("Dimension in widthxheight of the button: " +sizeValueString);
      
      buttonChromeDriver.findElement(By.xpath("//span[text()='Image']")).click();
      buttonChromeDriver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']")).click();
     
      buttonChromeDriver.findElement(By.xpath("//h5[text()='How many rounded buttons are there?']/parent::div"));
      
      
      /*
       * Select oSelect = new Select(driver.findElement(By.name("Select")));
    List<WebElement> elem = oSelect.getOptions();
    int iSize = elem.size();
System.out.println("Count of select button " +iSize);
       */
	}

}
