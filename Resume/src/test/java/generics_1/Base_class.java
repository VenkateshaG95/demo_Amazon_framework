package generics_1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements framework_constants
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	@BeforeMethod
	public void launch_browser()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver = new FirefoxDriver();
		
		driver.get(URL);
		wait=new WebDriverWait(driver, 10);	
	}
	@AfterMethod
	public static void closeapp(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Generic_ScreenShot.get_photo(driver);
			ITestNGMethod failed = result.getMethod();
			System.out.println("The Failed Test Script is: " +failed);
		}
		driver.quit();
	}
}
