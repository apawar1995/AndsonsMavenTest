package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{


	@FindBy (xpath= "//a[text()='Shop Now']")
	private WebElement shopNowLink ;
	
	@FindBy (xpath= "//a[text()='Learn More']")
	private WebElement learnMoreLink;
	
	@FindBy (xpath = "(//div[@class='box-common-wrapper']//a[1])[2]")
	private WebElement firstChocoBoxLink;
	
	@FindBy (xpath = "(//div[@class='box-common-wrapper']//a[1])[4]")
	private WebElement secondChocoBoxLink;
	
	@FindBy (xpath = "(//div[@class='box-common-wrapper']//a[1])[6]")
	private WebElement thirdChocoBoxLink;
	
	@FindBy (xpath = "(//div[@class='box-common-wrapper']//a[1])[8]")
	private WebElement fourthChocoBoxLink;
	
	
	@FindBy (xpath = "//a[text() ='Read More']")
	private WebElement readMoreLink;
	
	@FindBy (xpath = "(//input[@name='email'])[1]")
	private WebElement email;
	
	@FindBy (xpath = "(//button[@type='button'])[1]")
	private WebElement submitButton;
	
	private WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;

	}
	
	
	
	public void clickOnshopNowLink()
	{
		shopNowLink.click();
	}
	

	public String getshopNowPageLink()
	{
		shopNowLink.click();
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void clickOnlearnMoreLink()
	{
		learnMoreLink.click();
	}
	
	public String getlearnMorePageLink()
	{
		learnMoreLink.click();
		String url = driver.getCurrentUrl();
		return url;
	}
	
	
	public void clickOnfirstChocoBoxLink()
	{
		firstChocoBoxLink.click();
	}
	
	public String getfirstChocoBoxPageLink()
	{
		firstChocoBoxLink.click();
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void clickOnsecondChocoBoxLink()
	{
		secondChocoBoxLink.click();
	}
	
	public String getsecondChocoBoxPageLink()
	{
		secondChocoBoxLink.click();
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void clickOnthirdChocoBoxLink()
	{
		thirdChocoBoxLink.click();
	}
	
	public String getthirdChocoBoxPageLink()
	{
		thirdChocoBoxLink.click();
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void clickOnfourthChocoBoxLink()
	{
		fourthChocoBoxLink.click();
	}
	
	public String getfourthChocoBoxLink()
	{
		fourthChocoBoxLink.click();
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void clickOnreadMoreLink()
	{
		readMoreLink.click();
	}
	
	public String getreadMorePageLink()
	{
		readMoreLink.click();
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void enterTextOnemailField(String emailId)
	{
		email.sendKeys(emailId);
	}
	
	public void clickOnsubmitButton()
	{
		submitButton.click();
	}
	
}
