package railyatri.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	WebDriver driver;
	String location;
	String fileName;
	String extension;

	public ScreenshotUtil(WebDriver driver) {
		this.driver = driver;
	}

	public String takeScreenshot(String location, String fileName, String extension) throws IOException {
		TakesScreenshot scr = (TakesScreenshot) driver;
		File SrcFile = scr.getScreenshotAs(OutputType.FILE);

		String filePath = location + File.separator + fileName + "." + extension;
		File DestFile = new File(filePath);
		FileUtils.copyFile(SrcFile, DestFile);

		return DestFile.getAbsolutePath();
	}

}
