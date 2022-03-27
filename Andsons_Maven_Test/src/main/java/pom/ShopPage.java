package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage 
{
	@FindBy (xpath="(//a[text()='Chocolate Boxes'])[2]")
	private WebElement chocolateBoxes;
	
	@FindBy (xpath="(//a[text()='Confections'])[2]")
	private WebElement confections;
	
	@FindBy (xpath="(//a[text()='Gift Collections'])[2]")
	private WebElement giftCollections;
	
	@FindBy (xpath="(//a[text()='Party Favors'])[2]")
	private WebElement partyFavours;
	
	@FindBy (xpath="(//a[text()='Corporate Gifts'])[2]")
	private WebElement corporateGifts;
	
	@FindBy (xpath="(//div[@class='collection-body-wrapper']//a)[1]")
	private WebElement product;
	
	WebDriver driver ;
	
	public ShopPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	
	public String clickOnchocolateBoxesLink()
	{
		chocolateBoxes.click();
		String url = driver.getCurrentUrl();
		return url;	
	}
	

	public String getTextOfchocolateBoxesLink()
	{
		String text = chocolateBoxes.getText();
		return text;	
	}
	
	public String clickOnconfectionsLink()
	{
		confections.click();
		String url = driver.getCurrentUrl();
		return url;	
	}
	
	public String getTextOfconfectionsLink()
	{
		String text =confections.getText();
		return text ;
	}
	
	public String clickOngiftCollectionsLink()
	{
		giftCollections.click();
		String url = driver.getCurrentUrl();
		return url;	
	}
	
	public String getTextOfgiftCollectionsLink()
	{
		String text =giftCollections.getText();
		return text ;
	}
	
	public String clickOnpartyFavoursLink()
	{
		partyFavours.click();
		String url = driver.getCurrentUrl();
		return url;	
	}
	
	public String getTextOfpartyFavoursLink()
	{
		String text =partyFavours.getText();
		return text ;
	}
	
	public String clickOncorporateGiftsLink()
	{
		corporateGifts.click();
		String url = driver.getCurrentUrl();
		return url;	
	}
	
	public String getTextOfcorporateGiftsLink()
	{
		String text =corporateGifts.getText();
		return text ;
	}
	
	public String clickOnproductLink()
	{
		product.click();
		String url = driver.getCurrentUrl();
		return url;	
	}
}
