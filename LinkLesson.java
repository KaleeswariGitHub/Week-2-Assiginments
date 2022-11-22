package week2.day2;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkLesson {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver linkChromeDriver = new ChromeDriver();
		linkChromeDriver.get("https://leafground.com/link.xhtml");
		linkChromeDriver.manage().window().maximize();
		//linkChromeDriver.manage().timeouts().implicitlyWait(5,TimeUnit:);
		
		linkChromeDriver.findElement(By.xpath("//h5[text()='Take me to dashboard']/following::a")).click();
		
	    //linkChromeDriver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).click();
		
		System.out.println(linkChromeDriver.getTitle());
		
		

	}

}
