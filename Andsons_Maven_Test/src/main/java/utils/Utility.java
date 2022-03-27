package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{

	public static String getDataFromExel(String sheet , int row , int col) throws EncryptedDocumentException, IOException
	{
		
		String path = "C:\\Users\\ankuk\\Desktop\\andsonsTestData.xlsx" ;
		FileInputStream file = new FileInputStream(path);
		Cell cell = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(col);
		
		String data = "";
		
		try
		{
			
		 data = cell.getStringCellValue();
		
		}
		catch (IllegalStateException e)
		
		{
			
		 double value = cell.getNumericCellValue();
		 data = String.valueOf(value);  

		}
		
		catch(NullPointerException e)
		{
			System.out.println("Cell does not have any value");
		}
		
		return data;
		
	}
	
	
	
	public static void getScrrenshot(WebDriver driver , int testID) throws IOException
	{
		
		   DateFormat df = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
	       Date dateobj = new Date();
	       String datetime =  df.format(dateobj);
		
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       File dest = new File("D:\\Andsons- Screenhsots\\testID-" + testID + " "+ datetime +".jpg");
	       FileHandler.copy(src, dest);
	}
	
	
}
