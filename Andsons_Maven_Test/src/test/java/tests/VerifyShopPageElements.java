package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
import pom.ApplicationHeader;
import pom.ShopPage;
import utils.Utility;

public class VerifyShopPageElements extends Browser
{
	
	private WebDriver driver ;
	private ShopPage shopPage ;
	private int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters ("browser")
	public void launchBrowser(String browser)
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = launcChromeBrowser();
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
	public void createPOMObjects()
	{
			
		shopPage = new ShopPage(driver);
		
	}
	
	@BeforeMethod
	public void goToTheShopPage()
	{
		
		driver.get("https://andsons-v3.myshopify.com/");
		ApplicationHeader applicationHeader = new ApplicationHeader(driver);
		applicationHeader.clickOnShopMenu();	
	}
	
	
	@Test (priority = 1)
	public void verifyChocolateBoxesTabLink()
	{
		testID = 29;
		
		String actualUrl = shopPage.clickOnchocolateBoxesLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/chocolate-box";
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	@Test (priority = 2)
	public void verifyConfectionsTabLink()
	{
		testID = 30;

		String actualUrl = shopPage.clickOnconfectionsLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/confections";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test  (priority = 3)
	public void verifyGiftCollectionsLink()
	{
		testID = 31;

		String actualUrl = shopPage.clickOngiftCollectionsLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/gift-collection";
		Assert.assertEquals(actualUrl, expectedUrl);

	 }
	
	@Test (priority = 4)
	public void verifyPartyFavoursLink()
	{
		testID = 32;

		String actualUrl = shopPage.clickOnpartyFavoursLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/party-favors";
		Assert.assertEquals(actualUrl, expectedUrl);

	  }
	
	@Test (priority = 5)
	public void verifyCorPorateTabLink()
	{
		testID = 33;

		String actualUrl = shopPage.clickOncorporateGiftsLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/collections/corporate-gifts";
		Assert.assertEquals(actualUrl, expectedUrl);
	
	  }
	

	@Test (priority = 6)
	public void verifProdutPageLink()
	{
		testID = 34;

		String actualUrl = shopPage.clickOnproductLink();
		String expectedUrl = "https://andsons-v3.myshopify.com/products/signature-box";
		Assert.assertEquals(actualUrl, expectedUrl);

	  }
	
	
	@AfterMethod()
	public void aftermethod(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE== result.getStatus())
		{
			
			Utility.getScrrenshot(driver, testID);
		}
	}
	
	@AfterClass()
	public void clearPOMObjects()
	{
		shopPage = null;
	}
	
	@AfterTest
	public void closingTheBrowser()
	{
		driver.quit();
		driver = null;
		System.gc();
	}

	
}
