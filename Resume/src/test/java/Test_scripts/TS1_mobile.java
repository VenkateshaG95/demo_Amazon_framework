package Test_scripts;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generics_1.Base_class;
import generics_1.Utility_Methods1;
import pom.Pom_01;

public class TS1_mobile extends Base_class
{
	
	@Test(invocationCount = 1)
	public void Iphone13_AddToCart() throws IOException, InterruptedException
	{
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(),Utility_Methods1.Title_Property("home"));
		
		Pom_01 pmc = new Pom_01(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.mobile_tab())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.phone5G_tab())).click();
		
		Utility_Methods1.ScllIntoVi(driver, pmc.seeAll_button());
		
		Utility_Methods1.scllBy(driver,0,-200);
		
		pmc.seeAll_button().click();
		
		wait.until(ExpectedConditions.visibilityOf(pmc.Apple_iphone13())).click();
		
		Utility_Methods1.window_handles(driver, 1);
		
		String exp_title2 = Utility_Methods1.Title_Property("title");
		
		wait.until(ExpectedConditions.titleContains(exp_title2));
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(),exp_title2);
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.AddToCart_btn())).submit();
		
		wait.until(ExpectedConditions.elementToBeClickable(pmc.Go_to_cart())).click();
		
		Thread.sleep(2000);
		
		Utility_Methods1.Soft_AssertEquals(driver.getTitle(), Utility_Methods1.Title_Property("cart"));
		
		String pro_text = pmc.cart_product().getText();
			
		Utility_Methods1.Soft_AssertEquals(pro_text,  Utility_Methods1.Title_Property("iphone"));
		
		int act_qty = Utility_Methods1.select_qty(pmc.QtyDropdown());
		
		Assert.assertEquals(act_qty, 1);
			
		System.out.println(pro_text);
		
		Reporter.log(pro_text+" is added to cart with quantity "+act_qty);
		
		Utility_Methods1.soft_AssertAll();
		
	}
	
	@Test(invocationCount = 1)
	public void Oneplus_mobiles_prices() throws InterruptedException
	{
		Pom_01 pmc = new Pom_01(driver);
		
		wait.until(ExpectedConditions.visibilityOf(pmc.SearchPro_text())).sendKeys("oneplus mobile phones");
		
		pmc.Search_btn().click();
		
		Thread.sleep(4000);
		
		List<WebElement> prices= driver.findElements(By.xpath("//span[contains(.,'OnePlus')]/../../../../div[3]//span[.='₹']/following-sibling::span[1]"));
		
		List<WebElement> mobiles = driver.findElements(By.xpath("//span[@data-component-type='s-search-results']/div[1]//h2/a/span[contains(.,'OnePlus')]"));
		
		for(int i=0;i< prices.size();i++)
		{
			String mobile = mobiles.get(i).getText();
			String price = prices.get(i).getText();
			
			System.out.println(mobile+"    mobile price in amazon.in is ₹"+price);
			Reporter.log(mobile+"    mobile price in amazon.in is ₹"+price);
		}
	}
	
}
