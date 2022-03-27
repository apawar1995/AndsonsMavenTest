package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	
		public static WebDriver launcChromeBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver ;
		}
		
		
		public static WebDriver launcFireFoxBrowser()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			return driver ;
		}
		

}
