package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:"+File.separator+"selenium"+File.separator+"chromedriver.exe");
		
		//Launches a new browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximise
		driver.manage().window().maximize();
		
		//Hit a URL
		driver.get("https://www.railyatri.in/");
		
		WebElement liveTrainStatus = driver.findElement(By.linkText("Live Train Status"));
		liveTrainStatus.click();
			
		WebElement train_running_status = driver.findElement(By.id("train_running_status"));
		train_running_status.sendKeys("12380 - AMRITSAR - KOLKATA SEALDAH Jallianwalabagh SF Exp");
		
		Thread.sleep(2000);
		WebElement startDate = driver.findElement(By.xpath(".//label[@class='ry-cntrl ry-cntrl-radio'][1]/div"));
		//startDate.click();
		
		WebElement checkStatus = driver.findElement(By.xpath("//button[.='CHECK STATUS']"));
		checkStatus.click();
		
		//Get the source of the html page
		String source = driver.getPageSource();
		//System.out.println(source);
		
		//getText return the text in element
		String textOnPage = driver.findElement(By.xpath(".//body")).getText();
		
		System.out.println(textOnPage);
		
		if(textOnPage.contains("Incorrect Start Day")) {
			System.out.println("Incorrect Start Day");
		}else {
			System.out.println("Valid details should be found");
		}
		
		Thread.sleep(5000);
		
		//driver.quit();
	}
}
