package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationFooter;
import utils.Utility;

public class VerifyTheFooterElement extends Browser
{

	private WebDriver driver ;
	private ApplicationFooter applicationFooter ;
	private int testID;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browser.equals("Chrome"))
		{
			driver =launcChromeBrowser();
		}
		
		if(browser.equals("FireFox"))
		{
			driver = launcFireFoxBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// For closing the pop for first time
		driver.get("https://andsons-v3.myshopify.com/");
		WebElement crossIcon = driver.findElement(By.xpath("(//div[@role='dialog']//button)[1]"));
		crossIcon.click();
		
	}
	
	@BeforeClass
	public void createPOMObjects() 
	{
		
		applicationFooter = new ApplicationFooter(driver);
		
		
	}
	
	@BeforeMethod
	public void openTheSiteUrl()
	{
		driver.get("https://andsons-v3.myshopify.com/");
		
		// Scrolling Uptp Footer
		WebElement paymentLink = driver.findElement(By.xpath("//div[@class='terms-wrapper']//a[4]")) ;
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].scrollIntoView(true);", paymentLink);
	}
	
	
	@Test (priority = 1)
	public void verifyChocolateBoxesLink()
	{
		testID = 9;
		
		String actualUrl = applicationFooter.getchocolateBoxesPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/chocolate-box" ;
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	
	@Test (priority = 2)
	public void verifyGiftCollectionsLink()
	{		
		testID = 10;

		String actualUrl = applicationFooter.getgiftColLectionsLPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/gift-collection" ;
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	
	@Test (priority = 3)
	public void verifyPartyFavourLink()
	{
		testID = 11;

		String actualUrl = applicationFooter.getpartyFavourPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/party-favors" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	@Test (priority = 4)
	public void verifyCorportePageLink()
	{
		testID = 12;

		String actualUrl = applicationFooter.getcorporatePageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/corporate-gifts" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	
	@Test (priority = 5)
	public void verifyAboutPageLink()
	{
		testID = 13;

		String actualUrl = applicationFooter.getaboutPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/about-us" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	

	@Test (priority = 6)
	public void verifyVisitUsPageLink()
	{
		testID = 14;

		String actualUrl = applicationFooter.getkvisitUsPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/visit-us" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	@Test (priority = 7)
	public void verifyOurChocolatePageLink()
	{
		testID = 15;

		String actualUrl = applicationFooter.cgetourChcolatesPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/our-chocolates" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	@Test (priority = 8)
	public void verifyBlogPageLink()
	{
		testID = 16;

		String actualUrl = applicationFooter.getOnblogPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/blogs/events" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	
	@Test (priority = 9)
	public void verifySignInPageLink()
	{
		testID = 17;

		String actualUrl = applicationFooter.getsignInPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/account/login" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	

	@Test (priority = 10)
	public void verifyContactUsPageLink()
	{
		testID = 18;

		String actualUrl = applicationFooter.getcontactUsPageLink() ;
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/contact-us" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	@Test (priority = 11)
	public void verifyJoinOurTeamPageLink()
	{
		testID = 19;

		String actualUrl = applicationFooter.getjoinOurTeamPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/join-our-team" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	@Test (priority = 12)
	public void verifyFaqPageLink()
	{
		testID = 20;

		String actualUrl = applicationFooter.getkfaqPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/faq" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	@Test (enabled = false)
	public void verifyInstagramPageLink()
	{
		testID = 21;

		String actualUrl = applicationFooter.getinstagramPageLink();
		String expectedUrl = "https://www.instagram.com/and.sons/" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	
	@Test (enabled = false)
	public void verifyyelpPageLink()
	{
		testID = 22;

		String actualUrl = applicationFooter.getyelpPageLink();
		String expectedUrl = "https://www.yelp.com/biz/andsons-chocolatiers-beverly-hills-2" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	@Test (priority = 13)
	public void verifyMobileNumber()
	{
		testID = 23;

		String actualText = applicationFooter.getMobileText();
		String expectedText = "1-310-276-2776" ;
		Assert.assertEquals(actualText, expectedText);

	}
	
	@Test (priority = 14)
	public void verifyemail()
	{
		testID = 24;

		String actualText = applicationFooter.getemailText();
		String expectedText = "help@and-sons.com" ;
		Assert.assertEquals(actualText, expectedText);

	}
	
	
	@Test (priority = 15)
	public void verifShippingAndReturnPageLink()
	{
		testID = 25;

		String actualUrl = applicationFooter.getrefundAndShippingPolicyPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/refund-shipping-policy" ;
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	
	@Test (priority = 16)
	public void veriTermsAndCinditionsPageLink()
	{
		testID = 26;

		String actualUrl = applicationFooter.gettermsAndConditionsPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/terms" ;
		Assert.assertEquals(actualUrl, expectedUrl);

	}
	
	@Test (priority = 17)
	public void veriPrivacyPolicyPageLink()
	{
		testID = 27;

		String actualUrl = applicationFooter.getprivacyPolciyLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/privacy-policy" ;
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test (priority = 18)
	public void veriPaymentPolicyPageLink()
	{
		testID = 28;

		String actualUrl = applicationFooter.getpaymentPolciyPageLink();
		String expectedUrl ="https://andsons-v3.myshopify.com/pages/payment-policy" ;
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.getScrrenshot(driver, testID);
		}
	}
	
	@AfterClass
	public void closingBrowser()
	{
		applicationFooter = null;

	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
		driver = null;
		System.gc();
	}
}
