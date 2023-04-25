package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_01 
{
	@FindBy(xpath="//a[@class='nav-a  ' and .='Mobiles']")
	private WebElement mob_tab;
	
	@FindBy(xpath="//a[@href='/b?node=22424253031']")
	private WebElement phone5G_bar;
	
	@FindBy(xpath="//span[.='See all results']")
	private WebElement see_all;
	
	@FindBy(xpath="(//span[.='Apple iPhone 14 (128 GB) - Midnight'])[2]")
	private WebElement Iphone14;
	
	@FindBy(xpath="//input[@value='Add to Cart']")
	private WebElement addTo_cart;
	
	@FindBy(xpath="//a[@href='/cart?ref_=sw_gtc']")
	private WebElement goTOcart;
	
	@FindBy(xpath="//span[@class='a-list-item']/a/span/span")
	private WebElement product;
	
	@FindBy(xpath="//select[@name='quantity']")
	private WebElement qty_dd;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search_tbx;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//a[@href='/gp/browse.html?node=6648217031&ref_=nav_cs_fashion']")
	private WebElement fashion_tab;
	
	@FindBy(xpath="//span[.='Fastrack']/../div[1]//i")
	private WebElement fastrak_cbx;
	
	@FindBy(xpath="//span[.='Watches	']")
	private WebElement watch_tab;
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	private WebElement Sort;
	
	@FindBy(xpath="//a[@id='s-result-sort-select_4']")
	private WebElement newestArr;
	
	@FindBy(xpath="//div[@cel_widget_id='MAIN-SEARCH_RESULTS-1']//h2/a")
	private WebElement first_prod;
	
	@FindBy(xpath="//span[@id='productTitle']")
	private WebElement pro_title;
	
	@FindBy(xpath="//span[@id='productTitle']/../../../../../..//span[.='₹']/following-sibling::span")
	private WebElement pro_price;
	
	@FindBy(xpath="//span[.='Footwear	']")
	private WebElement Footware_Tab;
	
	@FindBy(xpath="//span[.='Sports Shoes']")
	private WebElement SportShoe;
	
	@FindBy(xpath="//span[.='Under ₹1,000']")
	private WebElement under1000;
	
	@FindBy(xpath="//span[.='Any Price']")
	private WebElement AnyPrice;
		
	@FindBy(xpath="//span[.='Kids footwear']")
	private WebElement kidsFootware;
	
	@FindBy(xpath="//a[@aria-label='Men']")
	private WebElement Menbtn;
	
	@FindBy(xpath="//a[@aria-label='Women']")
	private WebElement womenbtn;
	
	@FindBy(xpath="//a[@aria-label='Kids']")
	private WebElement kidsbtn;
	
	@FindBy(xpath="//a[@aria-label='Bags & Luggage']")
	private WebElement Bagsbtn;
	
	@FindBy(xpath="//a[@aria-label='Sportswear']")
	private WebElement sportswearbtn;
		
	public Pom_01(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement mobile_tab()
	{
		return mob_tab;
	}
	
	public WebElement phone5G_tab()
	{
		return phone5G_bar;
	}
	
	public WebElement seeAll_button()
	{
		return see_all;
	}
	public WebElement Apple_iphone14()
	{
		return Iphone14;
	}
	public WebElement AddToCart_btn()
	{
		return addTo_cart;
	}
	public WebElement Go_to_cart()
	{
		return goTOcart;
	}
	public WebElement cart_product()
	{
		return product;
	}
	public WebElement QtyDropdown()
	{
		return qty_dd;
	}
	public WebElement SearchPro_text()
	{
		return search_tbx; 
	}
	public WebElement Search_btn()
	{
		return searchBtn;
	}
	public WebElement FashionTab()
	{
		return fashion_tab;
	}
	public WebElement Fastrak_CBox()
	{
		return fastrak_cbx;
	}
	public WebElement WatchesTab()
	{
		return watch_tab;
	}
	public WebElement Sort_Button()
	{
		return Sort;
	}
	public WebElement New_Arrivals()
	{
		return newestArr;
	}
	public WebElement First_Product()
	{
		return first_prod;
	}
	public WebElement Product_title()
	{
		return pro_title;
	}
	public WebElement Product_price() 
	{
		return pro_price;
	}
	public WebElement FootwareTab()
	{
		return Footware_Tab;
	}
	public WebElement SportsShoeTab()
	{
		return SportShoe;
	}
	public WebElement Under1000_filter()
	{
		return under1000;
	}
	public WebElement AnyPrice_filter()
	{
		return AnyPrice;
	}	
	public WebElement KidsFootwareTab()
	{
		return kidsFootware;
	}
	public WebElement Men_btn()
	{
		return Menbtn;
	}
	public WebElement Women_btn()
	{
		return womenbtn;
	}
	public WebElement kids_btn()
	{
		return kidsbtn;
	}
	public WebElement Bags_btn()
	{
		return Bagsbtn;
	}
	public WebElement SportsWear_btn()
	{
		return sportswearbtn;
	}
}
