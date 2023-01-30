package Test_scripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generics_1.Base_class;
import generics_1.Utility_Methods1;
import pom.Pom_01;

public class TS2_fashion extends Base_class
{
	@Test(invocationCount = 1)
	public void Newest_Fastrack_watch() throws InterruptedException, IOException
	{
		Pom_01 pmc = new Pom_01(driver);
		
		pmc.FashionTab().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.WatchesTab())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.Fastrak_CBox())).click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.Sort_Button())).click();
		
		pmc.New_Arrivals().click();
		
		String act_option = wait.until(ExpectedConditions.visibilityOf(pmc.Sort_Button())).getText();
		
		String exp_option = Utility_Methods1.Title_Property("sort5");
		
		Assert.assertEquals(act_option, exp_option);
		
		pmc.First_Product().click();
		
		Utility_Methods1.window_handles(driver, 1);
		
		wait.until(ExpectedConditions.visibilityOf(pmc.Product_title()));
		
		Reporter.log("Newest arrival of fastrak watch is "+pmc.Product_title().getText());
		
		Reporter.log("Unit price of the particular product is ₹ "+pmc.Product_price().getText());
		
		Thread.sleep(2000);
	}
	
	@Test
	public void Random_FT() throws InterruptedException, IOException
	{
		//Random functional test(with title verification)
		Pom_01 pmc = new Pom_01(driver);
		
		pmc.FashionTab().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.FootwareTab()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("fashion"));
		
		pmc.FootwareTab().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.SportsShoeTab()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("footwear"));
		
		pmc.SportsShoeTab().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.Under1000_filter()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("sportsshoes"));
		
		Utility_Methods1.ScllIntoVi(driver, pmc.Under1000_filter());
		
		pmc.Under1000_filter().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.AnyPrice_filter()));
		
		Utility_Methods1.ScllIntoVi(driver, pmc.AnyPrice_filter());
		
		pmc.AnyPrice_filter().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.FashionTab())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.FootwareTab())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.KidsFootwareTab())).click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.Men_btn()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("kidsfootwear"));
		
		pmc.Men_btn().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.Women_btn()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("mensfashion"));
		
		pmc.Women_btn().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.kids_btn()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("womensfashion"));
		
		pmc.kids_btn().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.Bags_btn()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("kidsfashion"));
		
		pmc.Bags_btn().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.SportsWear_btn()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("bags"));
		
		pmc.SportsWear_btn().click();
				
		wait.until(ExpectedConditions.visibilityOf(pmc.kids_btn()));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("sportswear"));
		
		Utility_Methods1.soft_AssertAll();
		
		Thread.sleep(5000);
		
		Reporter.log("Test script is pass");
		
	}
}
