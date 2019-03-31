package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeatAvailability {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"c:" + File.separator + "selenium" + File.separator + "chromedriver.exe");

		// Launches a new browser
		ChromeDriver driver = new ChromeDriver();

		// Maximise
		driver.manage().window().maximize();

		// Hit a URL
		driver.get("https://www.railyatri.in/");

		WebElement seatAvailabilityLink = driver.findElement(By.linkText("Seat Availability + Forecast"));
		seatAvailabilityLink.click();

		WebElement train_number = driver.findElement(By.name("train_number"));
		train_number.sendKeys("12296");

		Thread.sleep(1000);

		train_number.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(1000);

		train_number.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		WebElement journeyClass = driver.findElement(By.id("journey_class"));
		Select journeyDropDown = new Select(journeyClass);
		journeyDropDown.selectByVisibleText("Second AC");

		Thread.sleep(2000);
		WebElement quota = driver.findElement(By.id("quota"));
		Select quotaDropDown = new Select(quota);
		quotaDropDown.selectByIndex(0);

		WebElement date = driver.findElement(By.name("journey_date"));
		date.sendKeys("01-04-2019");

		WebElement goButton = driver.findElement(By.xpath("//input[@value='GO']"));
		goButton.click();

	}
}
