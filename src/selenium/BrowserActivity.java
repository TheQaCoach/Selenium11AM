package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	public static void main(String arg[]) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "c://selenium//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "c:"+File.separator+"selenium"+File.separator+"chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.google.com");
		
		WebElement searchElement = driver.findElementByName("q");
		searchElement.sendKeys("theqacoach.co.in");
		searchElement.sendKeys(Keys.ENTER);
		
		WebElement linkText = driver.findElement(By.xpath(".//a[@href='https://theqacoach.co.in/']"));
		linkText.click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
}



/*
 * https://www.seleniumhq.org/download/

Selenium Standalone Server
Download version (Download the jar)
Create a folder in C drive > Name as "selenium"
paste the jar downloaded in previous steps 


Open Eclipse
Right click on project
Properties
Click on Java Build Path
Add External jar
Add the jar in C://selenium folder
Apply and close



Download chromedriver
extract chromedriver.exe
Copy the exe in C drive > Name as "selenium"
 */


