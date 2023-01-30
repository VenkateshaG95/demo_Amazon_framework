package generics_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Utility_Methods1 
{
	public static SoftAssert sf;
	public static int select_qty(WebElement dd)
	{
		Select sel = new Select(dd);
		List<WebElement> options = sel.getAllSelectedOptions();
		String act_qty = options.get(0).getText();
		int qty = Integer.parseInt(act_qty);
		return qty;
	}
	public static void select_sort(WebElement dd, int a)
	{
		Select sel = new Select(dd);
		List<WebElement> options = sel.getOptions();
		options.get(a).click();
	}
	public static void ScllIntoVi(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
	public static void scllBy(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public static void window_handles(WebDriver driver, int index)
	{
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> alis = new ArrayList<String>(ids);
		String id = alis.get(index);
		driver.switchTo().window(id);
	}
	public static String Title_Property(String title) throws IOException
	{
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("./property/titles.properties");
		pro.load(fis);
		String tit = pro.getProperty(title);
		return tit;
	}
	
	public static void Soft_AssertEquals(String actual, String expected)
	{
		sf = new SoftAssert();
		sf.assertEquals(actual, expected);

	}
	public static void soft_AssertAll()
	{
		sf.assertAll();
	}
}
