package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationFooter 
{


	@FindBy (xpath = "(//a[text()='Chocolate Boxes'])[4]")
	private WebElement chocolateBoxesLink ;
	
	@FindBy (xpath = "(//a[text()='Gift Collections'])[4]")
	private WebElement giftColLectionsLink ;
	
	@FindBy (xpath = "(//a[text()='Party Favors'])[4]")
	private WebElement partyFavourLink ;
	
	@FindBy (xpath = "(//a[text()='Corporate'])[1]")
	private WebElement corporateLink ;
	
	@FindBy (xpath = "(//a[text()='About'])[3]")
	private WebElement aboutLink ;
	
	@FindBy (xpath = "(//a[text()='Visit Us'])[2]")
	private WebElement visitUsLink ;
	
	@FindBy (xpath = "(//a[text()='Our Chocolates'])[3]")
	private WebElement ourChcolatesLink ;
	
	@FindBy (xpath = "(//a[text()='Blog'])[2]")
	private WebElement blogLink;
	
	@FindBy (xpath = "(//a[text()='Sign In'])[2]")
	private WebElement signInLink;
	
	@FindBy (xpath = "(//a[text()='Contact Us'])[2]")
	private WebElement contactUsLink;
	
	@FindBy (xpath = "(//a[text()='Join Our Team'])[2]")
	private WebElement joinOurTeamLink;
	
	@FindBy (xpath = "(//a[text()='FAQ'])[2]")
	private WebElement faqLink;
	
	@FindBy (xpath = "(//a[text()='Instagram'])[2]")
	private WebElement instagramLink;
	
	@FindBy (xpath = "(//a[text()='Yelp'])[2]")
	private WebElement yelpLink;
	
	@FindBy (xpath = "//div[@class='terms-privacy']//a[1]")
	private WebElement refundAndShippingPolicyLink;
	
	@FindBy (xpath = "//div[@class='terms-privacy']//a[2]")
	private WebElement termsAndConditionsLink;
	
	@FindBy (xpath = "//div[@class='terms-privacy']//a[3]")
	private WebElement privacyPolciyLink;
	
	@FindBy (xpath = "//div[@class='terms-privacy']//a[4]")
	private WebElement paymentPolciyLink;
	
	@FindBy (xpath = "//address[@class='m-0 p-0']//li[1]//a")
	private WebElement mobileNumberLink;
	
	@FindBy (xpath = "//address[@class='m-0 p-0']//li[2]//a")
	private WebElement emailLink;
	
	private WebDriver driver ;
			
	    public ApplicationFooter(WebDriver driver)
			{
	    		PageFactory.initElements(driver, this);
	    		this.driver = driver;
			}
	
	
	
	    public void clickOnchocolateBoxesLink()
	    {
	    	chocolateBoxesLink.click();
	    }
	
	    public String getchocolateBoxesPageLink()
	    {
	    	chocolateBoxesLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;	
	    }
	    
	    public void clickOngiftColeectionsLink()
	    {
	    	giftColLectionsLink.click();
	    }
	    
	    public String getgiftColLectionsLPageLink()
	    {
	    	giftColLectionsLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }

	    public void clickOnpartyFavourLink()
	    {
	    	partyFavourLink.click();
	    }
	    
	    public String getpartyFavourPageLink()
	    {
	    	partyFavourLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }

	    public void clickOncorporateLink()
	    {
	    	corporateLink.click();
	    }
	
	    public String getcorporatePageLink()
	    {
	    	corporateLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOnaboutLink()
	    {
	    	aboutLink.click();
	    }
	
	    public String getaboutPageLink()
	    {
	    	aboutLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOnvisitUsLink()
	    {
	    	visitUsLink.click();
	    }
	    
	    public String getkvisitUsPageLink()
	    {
	    	visitUsLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOnourChcolatesLink()
	    {
	    	ourChcolatesLink.click();
	    }
	    
	    public String cgetourChcolatesPageLink()
	    {
	    	ourChcolatesLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOnblogLink()
	    {
	    	blogLink.click();
	    }
	    
	    public String getOnblogPageLink()
	    {
	    	blogLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOnsignInLink()
	    {
	    	signInLink.click();
	    }
	    
	    public String getsignInPageLink()
	    {
	    	signInLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOncontactUsLink()
	    {
	    	contactUsLink.click();
	    }
	    
	    public String getcontactUsPageLink()
	    {
	    	contactUsLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOnjoinOurTeamLink()
	    {
	    	joinOurTeamLink.click();
	    }
	    
	    public String getjoinOurTeamPageLink()
	    {
	    	joinOurTeamLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOnfaqLink()
	    {
	    	faqLink.click();
	    }
	    
	    public String getkfaqPageLink()
	    {
	    	faqLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	 
	 
	    public void clickOninstagramLink()
	    {
	    	instagramLink.click();
	    }
	 
	    public String getinstagramPageLink()
	    {
	    	instagramLink.click();
	    	ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
	    	String Child = address.get(1);
	    	driver.switchTo().window(Child);
	    	String url = driver.getCurrentUrl();
	    	String parent = address.get(0);
	    	driver.switchTo().window(parent);
	    	return url ;
	    }
	    
	    public void clickOnyelpLink()
	    {
	    	yelpLink.click();
	    }
	    
	    public String getyelpPageLink()
	    {
	    	yelpLink.click();
	    	ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
	    	String Child = address.get(1);
	    	driver.switchTo().window(Child);
	    	String url = driver.getCurrentUrl();
	    	String parent = address.get(0);
	    	driver.switchTo().window(parent);
	    	
	    	return url ;
	    }
	    
	    public void clickOnrefundAndShippingPolicyLink()
	    {
	    	refundAndShippingPolicyLink.click();
	    }
	    
	    public String getrefundAndShippingPolicyPageLink()
	    {
	    	refundAndShippingPolicyLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOntermsAndConditionsLink()
	    {
	    	termsAndConditionsLink.click();
	    }
	    
	    public String gettermsAndConditionsPageLink()
	    {
	    	termsAndConditionsLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public void clickOnprivacyPolciyLink()
	    {
	    	privacyPolciyLink.click();
	    }
	    
	    public String getprivacyPolciyLink()
	    {
	    	privacyPolciyLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	     
	    public void clickOnpaymentPolciyLink()
	    {
	    	paymentPolciyLink.click();
	    }
	    
	    public String getpaymentPolciyPageLink()
	    {
	    	paymentPolciyLink.click();
	    	String url = driver.getCurrentUrl();
	    	return url ;
	    }
	    
	    public String getMobileText()
	    {
	    	String mobiletext = mobileNumberLink.getText();
	    	return mobiletext ;
	    }
	      
	    public String getemailText()
	    {
	    	String emailtext = emailLink.getText();
	    	return emailtext ;
	    }
	   
}
