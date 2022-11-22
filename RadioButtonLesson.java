package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonLesson {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver radioChromeDriver = new ChromeDriver();
		radioChromeDriver.get("https://leafground.com/radio.xhtml");
		radioChromeDriver.manage().window().maximize();
		
		radioChromeDriver.findElement(By.xpath("//input[@id='j_idt87:console1:0']/following::span")).click();
		radioChromeDriver.findElement(By.xpath("//input[@id='j_idt87:city2:2']/following::span")).click();
		WebElement browserSelected = radioChromeDriver.findElement(By.xpath("//input[@id='j_idt87:console1:2']/following::span"));
		System.out.println(browserSelected.isEnabled());
		if (browserSelected.isEnabled() == true)
		{
		  WebElement selectedLabel = radioChromeDriver.findElement(By.xpath("//label[@for='j_idt87:console1:2']"));
		  String label1 =  selectedLabel.getText();
		  System.out.println("The default selected browser is: "+ label1);
		}
		else
           System.out.println("This is not the default selected value");	
		
		radioChromeDriver.findElement(By.xpath("//input[@id='j_idt87:age:2']/following::span")).click();
	
	}

}
