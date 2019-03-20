package selenium;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class URLProvider {
	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver", "c:"+File.separator+"selenium"+File.separator+"chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
}
