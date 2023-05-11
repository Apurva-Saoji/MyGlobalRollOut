package ExerciseNowTestScripts;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import Locators.Login_Locator;
import bsh.commands.dir;

public class Mobileapp extends MyEsopsLogin {
    
	@Test
	public void Mobileapp_Method() throws Exception {
		
		test = report.startTest("Try our mobile app report");
		
		
		// To create folder with current date and generate excel file in that
		
		Calendar calendar1 = Calendar.getInstance();
		DateFormat dateFormat1 = new SimpleDateFormat("MM_dd_yyyy");
		calendar1.add(Calendar.DAY_OF_YEAR, 0);
		Date today1 = calendar1.getTime();
		String date1= dateFormat1.format(today1);
		
		File dir1 = new File(System.getProperty("user.dir") + "\\src\\CalculationData");
		System.out.println(dir1);
		dir1.mkdir();

		File dir3 = new File(dir1 + "\\" + date1);
		System.out.println(dir3);
		dir3.mkdir();

		Thread.sleep(5000);
		
		//To create excel file
	
   	    File destination = new File(
	    System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\Mymobapp.xls");
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("My Mobapp");
		
		//To click the element of try our mobile app

		WebElement Mobileap = driver.findElement(By.xpath("//*[text()='Try our mobile app']"));	
	    Mobileap.click();
        Boolean SelectTrymobapp = Mobileap.isDisplayed();
		System.out.println(" Select Try our mobile app =" + SelectTrymobapp );
		if (SelectTrymobapp==true) 
		{
			
			Thread.sleep(2000);
			System.out.println("Click on the Try our mobile app Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS,"Click on the Try our mobile app Button");
         }
		else
		{
 			test.log(LogStatus.FAIL, "Failed to Click on the Try our mobile app Button");
			System.out.println("Try our mobile app button is not clicked");

         }
		
		
		// To print simple pop up message 
		
		String alertText;
	    
		for (int i=1; i<=5; i++)
		{
	    HSSFRow rowhead = sheet.createRow(1+i);
		

        WebElement Mobileap1 = driver.findElement(By.xpath("//*[@id='kt_header']/kt-topbar/div[6]/div/div/div/ul/li["+i+"]/p"));  
		alertText = Mobileap1.getText();
		Boolean checktext=alertText.length()!=0;
		rowhead.createCell(1).setCellValue(alertText);

          if(checktext==true)
           {
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "POP text message is displayed"+checktext);
	        }
          
       	else{
 			test.log(LogStatus.FAIL, "Failed to print the text of pop up message");
			System.out.println("POP UP message is not printed");
			}
          
		System.out.println( "Testing- " +alertText);
		rowhead.createCell(1).setCellValue(alertText);
		
		Thread.sleep(100);

		}
		
		Thread.sleep(5000);
		
		// To close the try our mobile app button
		
		WebElement closebtn= driver.findElement(By.xpath("//*[@id='kt_header']/kt-topbar/div[6]/div/div/button"));
		closebtn.click();
		System.out.println(" Click on the closetry our mobile app window");
		test.log(LogStatus.PASS, " Click on the Try our mob app close window");

		Thread.sleep(5000);

		
		// To close the sheet
		
		FileOutputStream fileOut = new FileOutputStream(destination);
		workbook.write(fileOut);
		workbook.close();
		
		report.endTest(test);
		report.flush();
	}
	
}