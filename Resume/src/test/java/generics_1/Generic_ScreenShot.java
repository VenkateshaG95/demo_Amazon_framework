package generics_1;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_ScreenShot 
{
	public static void get_photo(WebDriver driver) throws IOException
	{
		String photo = "photo";
		Date d = new Date();
		String d1 = d.toString();
		String date = d1.replaceAll(":", "-").replace(" ", "_");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./photos/"+photo+date+".png");
		FileHandler.copy(scr, dst);
	}
}
