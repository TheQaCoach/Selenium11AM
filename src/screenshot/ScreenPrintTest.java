package screenshot;

import org.openqa.selenium.WebDriver;

import excelhandling.UpdateSheet;
import railyatri.utilities.BrowserUtil;
import railyatri.utilities.ScreenshotUtil;

public class ScreenPrintTest {

	public static void main(String[] args) throws Exception {
		
		String sr = "TC_001";
		String summary = "Validate Login Page";
		String description = "Check that the page is loading";
		String status = "Fail";
		
		String steps = "Open Browser";
		
		BrowserUtil browser = new BrowserUtil();
		WebDriver driver = browser.openBrowser();
		
		
		steps = steps.concat("\n").concat("Enter URL");
		browser.get(driver, "https://www.railyatri.in/");
		
		steps = steps.concat("\n").concat("Validate Page");
		
		ScreenshotUtil ssu = new ScreenshotUtil(driver);
		String filePath = ssu.takeScreenshot("excelFolder","file1","png");
		
		status = "Pass";
		
		String remarks = "TC Passed";
		
		UpdateSheet us = new UpdateSheet();
		us.updateSheet(sr, summary, description, steps, status, filePath, remarks);
		
		System.out.println(filePath);

	}

}
