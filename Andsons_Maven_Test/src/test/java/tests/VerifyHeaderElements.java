package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationFooter;
import pom.ApplicationHeader;
import utils.Utility;

public class VerifyHeaderElements extends Browser
{

	private WebDriver driver ;
	private ApplicationHeader applicationHeader ;
	private int testID ;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters ("browser")
	public void launchBrowser (String browser)
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = launcChromeBrowser() ;
		}
		
		if(browser.equalsIgnoreCase("FireFox"))
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
	public void createPOMObjcts()
	{
		applicationHeader = new ApplicationHeader(driver) ;
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://andsons-v3.myshopify.com/");
	}
	
	@Test (priority = 1)
	public void verifyTheShopMenuLink()
	{
		testID = 1 ;
		
		SoftAssert softAssert = new SoftAssert();
		String actualUrl = applicationHeader.getShopMenuPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/all" ;
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
	}
	
	
	@Test (priority = 2 )
	public void verifyOurChcolateLink()
	{
		testID = 2;
		
		SoftAssert softAssert = new SoftAssert();
		String actualUrl = applicationHeader.getOurChocolateMenuPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/our-chocolates" ;
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();

	}
	
	
	@Test (priority = 3)
	public void verifyAboutPageLink() throws InterruptedException
	{
		testID = 3 ;
		
		SoftAssert softAssert = new SoftAssert();
		String actualUrl = applicationHeader.getAboutMenuPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/about-us" ;
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
		Thread.sleep(5000);
		
	}
	
	@Test (priority = 4)
	public void verifyVisitPageLink()
	{
		testID = 04 ;

		SoftAssert softAssert = new SoftAssert();
		String actualUrl = applicationHeader.getVisitMenuPageLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/pages/visit-us" ;
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertAll();
		
	}
	
	@Test (priority = 5)
	public void verifyShopMenuText()
	{
		testID = 5 ;

		SoftAssert softAssert = new SoftAssert();
		String actualText = applicationHeader.getFirstMenuText();
		String expectedText = "Shop" ;
		softAssert.assertEquals(actualText, expectedText);
		softAssert.assertAll();
	
	}
	
	@Test (priority = 6)
	public void verifyOurChocolateMenuText()
	{
		testID = 6 ;

		SoftAssert softAssert = new SoftAssert();
		String actualText = applicationHeader.getSecondMenuText();
		String expectedText = "Our Chocolates" ;
		softAssert.assertEquals(actualText, expectedText);
		softAssert.assertAll();	
	}
	

	@Test (priority = 7)
	public void verifyAboutMenuText()
	{
		testID = 7 ;

		SoftAssert softAssert = new SoftAssert();
		String actualText = applicationHeader.getThirdMenuText();
		String expectedText = "About" ;
		softAssert.assertEquals(actualText, expectedText);
		softAssert.assertAll();
		
		
	}
	
	@Test (priority = 8)
	public void verifyVisitText()
	{
		testID = 8 ;

		SoftAssert softAssert = new SoftAssert();
		String actualText = applicationHeader.getFourthMenuText();
		String expectedText = "Visit" ;
		softAssert.assertEquals(actualText, expectedText);
		softAssert.assertAll();
	
	}
	@AfterMethod
	public void endoftestCase(ITestResult result) throws IOException
	{
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.getScrrenshot(driver, testID);
		}
	}
	
	@AfterClass
	public void clearPOMObject()
	{
		applicationHeader = null;
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
		driver = null;
		System.gc();
	}
	
	
}
