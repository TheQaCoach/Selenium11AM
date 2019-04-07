package railyatri.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {

	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		maximize(driver);
		
		return driver;
	}
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void get(WebDriver driver,String URL) {
		driver.get(URL);
	}
	
	public void quit(WebDriver driver) {
		driver.quit();
	}
	
}
