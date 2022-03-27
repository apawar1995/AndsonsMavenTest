package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader 
{
	

	@FindBy ( xpath = "//a[text()='Shop']")
	private WebElement shopMenu;
	
	@FindBy (xpath = "(//a[text()='Our Chocolates'])[1]")
	private WebElement OurChocolateMenu;
	
	@FindBy (xpath = "(//a[text()='About'])[1]")
	private WebElement AboutMenu ;
	
	@FindBy (xpath = "//a[text()='Visit']")
	private WebElement VisitMenu;
	
	
	private WebDriver driver ;

	public ApplicationHeader(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver ;

	}
	
	public void clickOnShopMenu()
	{
		shopMenu.click();
	}
	
	public String getShopMenuPageLink()
	{
		shopMenu.click();
		String url = driver.getCurrentUrl() ;
		return url;
	}
	
	public void clickOnOurChocolateMenu()
	{
		OurChocolateMenu.click();
	}
	
	public String getOurChocolateMenuPageLink()
	{
		OurChocolateMenu.click();
		String url = driver.getCurrentUrl();
		return url ;
	}
	
	
	public void clickOnAboutMenu()
	{
		AboutMenu.click();
	}
	
	public String getAboutMenuPageLink()
	{
		AboutMenu.click();
		String url = driver.getCurrentUrl();
		return url ;
	}
	
	
	public void clickOnVisitMenu()
	{
		VisitMenu.click();
	}
	

	public String getVisitMenuPageLink()
	{
		VisitMenu.click();
		String url = driver.getCurrentUrl();
		return url ;
	}
	
	public String getFirstMenuText()
	{
		String menutext = shopMenu.getText();
		return menutext ;
	}
	
	public String getSecondMenuText()
	{
		String menutext = OurChocolateMenu.getText();
		return menutext ;

	}
	
	public String getThirdMenuText()
	{
		String menutext = AboutMenu.getText();
		return menutext ;
	}
	
	public String getFourthMenuText()
	{
		String menutext = VisitMenu.getText();
		return menutext ;
	}
	
}
