package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Test WorkSpace\\TakingScreenShotForFailedTestCaseUsingTestNGListener\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

	public void failed(String testMethodName) {
		// File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrfile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrfile, new File(
					"D:\\Test WorkSpace\\TakingScreenShotForFailedTestCaseUsingTestNGListener\\ScreenShot\\"+testMethodName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
