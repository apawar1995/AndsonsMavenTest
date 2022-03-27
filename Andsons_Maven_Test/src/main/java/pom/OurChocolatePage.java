package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurChocolatePage
{

	@FindBy (xpath = "//p[@class='sc-htpNat hytByw']")
	private WebElement headerText ;
	
	
	
	
	WebDriver driver;
	
	public OurChocolatePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public String getHeaderText() 
	{	
		String text = headerText.getText();
		return text ;
	}
	
	
	
	

}
