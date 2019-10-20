package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTest {

	public static void main(String[] args) throws InterruptedException {
		
		RailyatriSetUp ry = new RailyatriSetUp();
		
		ChromeDriver driver = ry.launchRailYatri();
		
		WebElement liveTrainPartialLink = driver.findElement(By.partialLinkText("Live Train"));

		liveTrainPartialLink.click();
		
	}

}
