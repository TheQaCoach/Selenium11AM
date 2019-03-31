package selenium;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class RailyatriSetUp {

	public ChromeDriver launchRailYatri() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"c:" + File.separator + "selenium" + File.separator + "chromedriver.exe");

		// Launches a new browser
		ChromeDriver driver = new ChromeDriver();

		// Maximise
		driver.manage().window().maximize();

		// Hit a URL
		driver.get("https://www.railyatri.in/");
		
		return driver;
		
	}

}
