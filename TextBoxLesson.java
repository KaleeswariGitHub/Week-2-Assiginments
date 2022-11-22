package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxLesson {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions textChromeOptions = new ChromeOptions();
		ChromeDriver textChromeDriver = new ChromeDriver(textChromeOptions);
		textChromeDriver.get("https://leafground.com/input.xhtml;jsessionid=node01j540a7o52can13p945ps0fry4418339.node0");
		textChromeDriver.manage().window().maximize();
		textChromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement namElement = textChromeDriver.findElement(By.xpath("//input[@id='j_idt88:name']"));
		String nameString = namElement.getAttribute("value");
		System.out.println("Typed name: "+nameString);
		namElement.sendKeys("Kaleeswari");
		
		WebElement cityElement = textChromeDriver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']"));
		String city1 = cityElement.getAttribute("value");
		System.out.println("Typed City: " +city1);
		cityElement.clear();
	    cityElement.sendKeys(city1 + " Madurai");
	    boolean disTextBox = textChromeDriver.findElement(By.id("j_idt88:j_idt95")).isEnabled();
	    System.out.println("Is the textbox enabled: "+disTextBox);
		
		
	    String retTextString = textChromeDriver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
	    System.out.println("Retrive the Text: "+retTextString);
	    
	    textChromeDriver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("abc@gmail.com",Keys.TAB);
	    textChromeDriver.findElement(By.xpath("//textarea")).sendKeys("Good Day today");
	    textChromeDriver.findElement(By.xpath("//button[@class='ql-bold']")).click();
	    textChromeDriver.findElement(By.xpath("//span[@class='ql-size ql-picker']")).click();
	    textChromeDriver.findElement(By.xpath("//span[@data-value='huge']")).click();
	    textChromeDriver.findElement(By.xpath("//p/parent::div")).sendKeys("Test Message");
	    textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
        String getErrorMessageString = textChromeDriver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
        System.out.println("Error message: " +getErrorMessageString);
        WebElement getLocationElement = textChromeDriver.findElement(By.xpath("//label[text()='Username']"));
        System.out.println("Old Location: "+getLocationElement.getLocation());
        textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
        System.out.println("New Location: "+getLocationElement.getLocation());
        textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']")).sendKeys("Kaleeswari");
        textChromeDriver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']/ul/li[contains(text(),'2')]")).click();
        textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("26/12/1980");
        Thread.sleep(3000);
        textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("100");
        Thread.sleep(3000);
        textChromeDriver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a[1]/span[@class='ui-button-text']")).click();
        Thread.sleep(3000);
        String incNum = textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).getAttribute("value");
        System.out.println("Upward click: "+ incNum);
        textChromeDriver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a[2]/span[@class='ui-button-text']")).click();
        Thread.sleep(3000);
        String decNum = textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).getAttribute("value");
        System.out.println("Downward click: "+decNum);
        System.out.println("old location of slide: "+ textChromeDriver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/span")).getLocation());
        textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("50");
        Thread.sleep(3000);
        textChromeDriver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/span")).getLocation();
        System.out.println("new location of slide: "+ textChromeDriver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/span")).getLocation());
        textChromeDriver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
        Thread.sleep(3000);
        textChromeDriver.findElement(By.xpath("//button[text()='Close']")).click();
        textChromeDriver.findElement(By.xpath("//div[@id='j_idt106:j_idt124']/div//button[3]")).click();
        Thread.sleep(3000);
        textChromeDriver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']/div")).sendKeys("This is sunday.");
        
        
        
        
        
	    
	    
	    
	    
	    
	}

}
