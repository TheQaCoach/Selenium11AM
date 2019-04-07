package railyatri.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import railyatri.utilities.BrowserUtil;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		LoginPageTest lpt = new LoginPageTest();
		lpt.validateHomePage();
		
		//lpt.validateTitle();
		
		//lpt.validateAlert();
		
		//lpt.mouseHover();
	}
	
	
	public void validateHomePage() {
		//Validate search_status is present on the page
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.openBrowser();
		browser.get(driver, "https://www.railyatri.in/");
		
		
		boolean isAvailable = false;
		try {
			isAvailable = driver.findElement(By.id("search_status")).isDisplayed();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", driver.findElement(By.id("search_status")));
			
		}catch(NoSuchElementException e)
		{
			System.out.println("Element not found");
		}
		
		
		//boolean isAvailable = driver.findElement(By.id("search_status1")).isDisplayed();
		
		if(isAvailable==false) {
			System.out.println("Home Page Not Found");
		}else {
			System.out.println("Home Page Found");
		}
		
		//browser.quit(driver);
		
	}
	

	public void validateTitle() throws InterruptedException {
		//Validate Title is present on the page
		
		String expectedTitle = "Indian Railways Train Enquiry, Insights & IRCTC eTicket booking - RailYatri";
		
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.openBrowser();
		browser.get(driver, "https://www.railyatri.in/");
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		
		browser.quit(driver);
	}
	
	public void validateAlert() {
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.openBrowser();
		browser.get(driver, "https://qa.franconnectqa.net/fc/extforms/feedback.jsp?");
		
		driver.findElement(By.id("submitButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		
		System.out.println(alertMessage);
		
		alert.dismiss();
			
	}
	
	
	public void mouseHover() throws InterruptedException {
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.openBrowser();
		browser.get(driver, "https://www.railyatri.in/");
		
		
		WebElement element = driver.findElement(By.linkText("Cancellations"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		
		
		
		for(int x=0;x<200;x++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		
		
	}
	
	
}
