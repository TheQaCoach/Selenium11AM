package selenium;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHOVER_TC {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Map<String,String> dataset = KeywordDrivenReadTestData.getDataSet("TC_001");
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.tagName("html")).sendKeys(Keys.ESCAPE);
		
		WebElement mensection = driver.findElement(By.xpath("//div[@class='zi6sUf']//*[.='Men']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mensection).build().perform();

		WebElement kurtasLink = driver.findElementByLinkText("Kurtas");
		kurtasLink.sendKeys(Keys.CONTROL,Keys.ENTER);
		
	}
}
