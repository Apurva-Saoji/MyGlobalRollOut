package TestSuiteBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.FileUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;



import Utility.Read_XLS;
import org.testng.annotations.Test;
public class SuiteBase {
	public static Read_XLS TestSuiteListExcel = null;
	public static Read_XLS TestCaseListExcelOne = null;
	public static Read_XLS TestCaseListExcelTwo = null;

	
	public static WebDriver driver;
	public static Logger Add_Log = null;
	public static String ExcelVestingDateMonthText;
	static ExtentTest test;
	static ExtentReports report;

	/*****************************************
	 * Function to init **************************************************
	 * FUNCTION NAME : init()
	 * 
	 * DESCRIPTION : This function is used to 1. To initialise excel path
	 * 2.Dynamically it select excel file location of the drive
	 * 
	 * 
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to init
	 **************************************************/


	public void init() throws IOException {
		Add_Log = Logger.getLogger("rootLogger");
		TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir") + "\\src\\Excels\\TestSuiteList.xls");
		TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir") + "\\src\\Excels\\MyEsopsLogin.xls");
		TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir") + "\\src\\Excels\\MyEsopsLogin.xls");
	}

	/*****************************************
	 * Function to fn_browserinit
	 * ************************************************** FUNCTION NAME :
	 * fn_browserinit()
	 * 
	 * DESCRIPTION : This function is used to 1.To select URL path before
	 * running testcase 2.init() function to Initialize .xls Files
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-March-2018 1.0
	 *
	 ***************************************** Function to fn_browserinit
	 * 
	 * @throws Exception
	 **************************************************/
	public void fn_browserinit() throws Exception {
	
		String exePath = "D:\\Testing Team Automation\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		String downloadFilepath = "D:\\Testing Team Automation\\MyGlobalRollOut\\DownloadFile";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.get("https://myesops.esopdirect.com/login");
		driver.get("https://myesops.esopdirect.com/login");
		//driver.get("https://myesopspreprodapp.azurewebsites.net/login");
		//https://myesopspreprodapp.azurewebsites.net/login
		Thread.sleep(3000);
	
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
	  // driver.findElement(By.tagName("Body")).sendKeys(Keys.CONTROL,"t");
		//driver.findElement(By.cssSelector(“body”)).sendKeys(Keys.CONTROL+ “t”);

		//driver.get("http://myesopspreprod.azurewebsites.net/login");
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL+"t"); 
		//driver.findElement(By.tagName("body")).sendKeys(selectLinkOpeninNewTab);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://myesopspreprod.azurewebsites.net/login");
		// driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
	   //  driver.findElement( By.xpath( "//*[@id='cdk-overlay-0']")).sendKeys( Keys.CONTROL+ "t" ) ;
		//driver.switchTo();
		System.out.println("Site open");
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("http://myesopspreprod.azurewebsites.net/login");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	 public  String threeDaysBefore()
	    {
	     String threeDaysBefore = "";
	        Date date = new Date();
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);

	        cal.add(Calendar.DAY_OF_YEAR,-5);
	        Date before = cal.getTime();
	        SimpleDateFormat formatter = new SimpleDateFormat("dd");
	        threeDaysBefore = formatter.format(before);
	     
	      
	        String threeDaysBefore1 = null;
	       
	        switch (threeDaysBefore)
	        {
	       
			case"01":threeDaysBefore1="1";break;
			case"02":threeDaysBefore1="2";break;
			case"03":threeDaysBefore1="3";break;
			case"04":threeDaysBefore1="4";break;
			case"05":threeDaysBefore1="5";break;
			case"06":threeDaysBefore1="6";break;
			case"07":threeDaysBefore1="7";break;
			case"08":threeDaysBefore1="8";break;
			case"09":threeDaysBefore1="9";break;
			case"10":threeDaysBefore1="10";break;
			case"11":threeDaysBefore1="11";break;
			case"12":threeDaysBefore1="12";break;
			case"13":threeDaysBefore1="13";break;
			case"14":threeDaysBefore1="14";break;
			case"15":threeDaysBefore1="15";break;
			case"16":threeDaysBefore1="16";break;
			case"17":threeDaysBefore1="17";break;
			case"18":threeDaysBefore1="18";break;
			case"19":threeDaysBefore1="19";break;
			case"20":threeDaysBefore1="20";break;
			case"21":threeDaysBefore1="21";break;
			case"22":threeDaysBefore1="22";break;
			case"23":threeDaysBefore1="23";break;
			case"24":threeDaysBefore1="24";break;
			case"25":threeDaysBefore1="25";break;
			case"26":threeDaysBefore1="26";break;
			case"27":threeDaysBefore1="27";break;
			case"28":threeDaysBefore1="28";break;
			case"29":threeDaysBefore1="29";break;
			case"30":threeDaysBefore1="30";break;
			case"31":threeDaysBefore1="31";break;

			
			default:
				 
				break;
	        }
	
			return threeDaysBefore1;
	        
	    
	    }
	 
		public static void calendar(WebDriver driver,String value)
		{ String monthinString = null;
			
		try
			{
		
			
			String[] individual=value.split("/");
			String date=individual[0];
			String month=individual[1];
			
			String year=individual[2];

			
			
			switch (month) {
			case "01":
	monthinString="Jan";
	 
	break;
	case "02":
	monthinString="Feb";
	 
	break;
	case "03":
	monthinString="Mar";
	 
	break;
	case "04":
	monthinString="Apr";
	 
	break;
	case "05":
	monthinString="May";
	 
	break;
	case "06":
	monthinString="Jun";
	 
	break;
	case "07":
	monthinString="Jul";
	 
	break;
	case "08":
	monthinString="Aug";
	 
	break;
	case "09":
	monthinString="Sep";
	 
	break;
	case "10":
	monthinString="Oct";
	 
	break;
	case "11":
	monthinString="Nov";
	 
	break;
	case "12":
	monthinString="Dec";
	 
	break;
	default:
	 
	break;
	 
	}

		
			ExcelVestingDateMonthText=date+"-"+monthinString+"-"+year;
		
		}
			
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
			
		}
		
	/******************************************************************************************
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 *******************************************************************************************/
		public static void takeSnapShot(WebDriver driver,String TestCaseName) throws Exception
		{
			Calendar calendar1 = Calendar.getInstance();
			DateFormat dateFormat1 = new SimpleDateFormat("MM_dd_yyyy");
			calendar1.add(Calendar.DAY_OF_YEAR, 0);
			Date today1 = calendar1.getTime();
			String date1= dateFormat1.format(today1);
			
			 File dir=new File("D:\\Automation For PM\\PaymentGateway\\Downloads");
			 dir.mkdir();
			
			 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File screenshotName=new File(dir+"\\"+System.currentTimeMillis()+".jpg");
			 
			
			 
		}
}
