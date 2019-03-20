package selenium;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver", "c:"+File.separator+"selenium"+File.separator+"chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//quitDriver(driver);
	}
	
	public static void quitDriver() {
		//driver.quit();		
	}
	
	
	
	
}
