package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumLocators {

	public WebElement getElement(WebDriver driver,String locatorType,String value) {
		
		switch (locatorType) {
		case "id":
			return driver.findElement(By.id(value));
		case "className":
			return driver.findElement(By.className(value));
		case "tagName":
			return driver.findElement(By.tagName(value));
		case "cssSelector":
			return driver.findElement(By.cssSelector(value));
		case "xpath":
			return driver.findElement(By.xpath(value));
		case "partialLinkText":
			return driver.findElement(By.partialLinkText(value));
		case "linkText":
			return driver.findElement(By.linkText(value));
		case "name":
			return driver.findElement(By.name(value));
		default:
			break;
		}
		return null;
	}
}
