package selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameExample {

	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:"+File.separator+"selenium"+File.separator+"chromedriver.exe");
		
		//Launches a new browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximise
		driver.manage().window().maximize();
		
		//Hit a URL
		driver.get("https://www.railyatri.in/");
		
		List<WebElement> atags = driver.findElements(By.tagName("a"));
	
		System.out.println("Size of WebElement : "+atags.size());
		
		for(int x =0;x<atags.size();x++) {
			System.out.println(atags.get(x).getText());
		}
		
	}
	
}
