package ExerciseNowTestScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import BaseClasses.Login_BaseClass;
import Utility.Read_XLS;
import Utility.SuiteUtility;

public class MyEsopsLogin extends Login_BaseClass {
	Read_XLS FilePath = null;
	String SheetName = null;
	String TestCaseName = null;
	String ToRunColumnNameTestCase = null;
	String ToRunColumnNameTestData = null;
	String TestDataToRun[] = null;
	static int DataSet = -1;
	static boolean Testskip = false;
	static boolean Testfail;
	static boolean TestCasePass = true;
	SoftAssert s_assert = null;
	static ExtentTest test;
	static ExtentReports report;

	/*****************************************
	 * Function to checkCaseToRun **************************************************
	 * Annotation : @BeforeTest
	 * 
	 * DESCRIPTION : To run particular function before every test
	 * 
	 * FUNCTION NAME : checkCaseToRun()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To check which test case should be
	 * run from excel 2.Insert log In applog.log file. 3.To check test case's
	 * CaseToRun = Y or N In related excel sheet. If CaseToRun = N or blank, Test
	 * case will skip execution. Else It will be executed. 4.To report result as
	 * skip for test cases In TestCasesList sheet. 5.To throw skip exception for
	 * this test case. 6.To retrieve DataToRun flags of all data set lines from
	 * related test data sheet.
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 * 
	 * @throws Exception
	 **************************************************/

	@BeforeTest
	public void checkCaseToRun() throws Exception {
		init();

		FilePath = TestCaseListExcelOne;

		TestCaseName = this.getClass().getSimpleName();

		SheetName = "TestCasesList";

		ToRunColumnNameTestCase = "CaseToRun";

		ToRunColumnNameTestData = "DataToRun";

		Add_Log.info(TestCaseName + " : Execution started.");

		if (!SuiteUtility.checkToRunUtility(FilePath, SheetName, ToRunColumnNameTestCase, TestCaseName)) {
			Add_Log.info(TestCaseName + " : CaseToRun = N for So Skipping Execution.");

			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "SKIP");

			throw new SkipException(
					TestCaseName + "'s CaseToRun Flag Is 'N' Or Blank. So Skipping Execution Of " + TestCaseName);
		}

		TestDataToRun = SuiteUtility.checkToRunUtilityOfData(FilePath, TestCaseName, ToRunColumnNameTestData);

	}

	/*****************************************
	 * Function to checkCaseToRun **************************************************
	 * Annotation : @Test(dataProvider="LoginData",priority=1)
	 * 
	 * DESCRIPTION : 1.To run particular function for test with priority 2.To
	 * provide data from dataset
	 * 
	 * 
	 * FUNCTION NAME : Login()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To pass test data from data provider
	 * 2.If found DataToRun = "N" for data set then execution will be skipped for
	 * that data set.
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 * 
	 * @throws Exception
	 **************************************************/

	@Test(dataProvider = "LoginData", priority = 1)
	public void AdminLogin(String User, String Password, String CompanyID,String Product, String Ans1, String Ans2,
			String InstrumentName, String Online, String WireTransfer, String Cheque, String SellAll,
			String SellPartial, String DD, String RTGS, String DirectDebit) throws Exception {

		DataSet++;
		// Created object of testng SoftAssert class.
		s_assert = new SoftAssert();
		// If found DataToRun = "N" for data set then execution will be skipped
		// for that data set.
		if (!TestDataToRun[DataSet].equalsIgnoreCase("Y")) {
			Add_Log.info(TestCaseName + " : DataToRun = N for data set line " + (DataSet + 1)
					+ " So skipping Its execution.");
			// If DataToRun = "N", Set Testskip=true.
			Testskip = true;
			throw new SkipException(
					"DataToRun for row number " + DataSet + " Is No Or Blank. So Skipping Its Execution.");
		}
		System.out.println("Value Of DataSet in UserData = " + DataSet);
		Add_Log.info("Value Of DataSet in UserData = " + DataSet);
		// If found DataToRun = "N" for data set then execution will be skipped
		// for that data set.
		if (!TestDataToRun[DataSet].equalsIgnoreCase("Y")) {
			// If DataToRun = "N", Set Testskip=true.
			Testskip = true;
			throw new SkipException(
					"DataToRun for row number " + DataSet + " Is No Or Blank. So Skipping Its Execution.");
		}
		


		// ========== Calendar Date ===============//
		Calendar calendar1 = Calendar.getInstance();

		DateFormat dateFormat1 = new SimpleDateFormat("MM_dd_yyyy");
		calendar1.add(Calendar.DAY_OF_YEAR, 0);
		Date today1 = calendar1.getTime();
		String date1 = dateFormat1.format(today1);

		File dir1 = new File(System.getProperty("user.dir") + "\\Report");
		System.out.println(dir1);
		dir1.mkdir();

		File dir3 = new File(dir1 + "\\" + date1);
		System.out.println(dir3);
		dir3.mkdir();

		if (Online.equals("Y")) {

			report = new ExtentReports(
					System.getProperty("user.dir") + "\\Report\\" + date1 + "\\Online_ReportResults.html");

		} else if (WireTransfer.equals("Y")) {

			report = new ExtentReports(
					System.getProperty("user.dir") + "\\Report\\" + date1 + "\\WireTransfer_ReportResults.html");

		} else if (Cheque.equals("Y")) {

			report = new ExtentReports(
					System.getProperty("user.dir") + "\\Report\\" + date1 + "\\Cheque_ReportResults.html");

		} else if (SellAll.equals("Y")) {

			report = new ExtentReports(
					System.getProperty("user.dir") + "\\Report\\" + date1 + "\\SellAll_ReportResults.html");

		} else if (SellPartial.equals("Y")) {

			report = new ExtentReports(
					System.getProperty("user.dir") + "\\Report\\" + date1 + "\\SellPartial_ReportResults.html");

		} else if (DD.equals("Y")) {

			report = new ExtentReports(
					System.getProperty("user.dir") + "\\Report\\" + date1 + "\\DD_ReportResults.html");

		} else if (RTGS.equals("Y")) {

			report = new ExtentReports(
					System.getProperty("user.dir") + "\\Report\\" + date1 + "\\RTGS_ReportResults.html");

		} else if (DirectDebit.equals("Y")) {

			report = new ExtentReports(
					System.getProperty("user.dir") + "\\Report\\" + date1 + "\\DirectDebit_ReportResults.html");

		}
		
		

		// ===========Open browser==============
		fn_browserinit();
	   /* System.out.println("Product 1");
		System.out.println("Product " + Product);
		String Productwithoutspace = Product.replaceAll("\\s", "");
		driver.manage().window().maximize();
		System.out.println("Product 2");
		if (Productwithoutspace.equals("MyESOPs")) {

		driver.get("https://myesops.esopdirect.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else if (Productwithoutspace.equals("ESOPsProd")) {

		driver.get("http://myesopspreprod.azurewebsites.net/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		System.out.println("Product 3");*/
		
	
		// =============Login==================
		Login LoginData = new Login();
		LoginData.LoginIN(User, Password, CompanyID,Ans1, Ans2);

		/*// ============= Mobileapp=================
		 Mobileapp  Mobileapp = new  Mobileapp();
	      Mobileapp. Mobileapp_Method();*/
	
	
		// =============MyWealth==================
		MyWealth MyWealthData = new MyWealth();
		MyWealthData.MyWealth_Method();
		

		/*if (InstrumentName.equals("StockOptions")) {

			// =============ExerciseNow==================
			ExerciseNow ExerciseData = new ExerciseNow();
			ExerciseData.Exercise_Now(CompanyID, User, Online, WireTransfer, Cheque, SellAll, SellPartial, DD, RTGS,
					DirectDebit);

			// ===========close browser=============
			Log_out LogoutData = new Log_out();
			LogoutData.LogOut();

			// =========== Excel ExcelFormate1 =============
			/*ExcelFormate ExcelFormate = new ExcelFormate();
			ExcelFormate.ExcelFormateData();

		} else if (InstrumentName.equals("CashSettledSARs")) {

			// ============= CashSettled_SARs ==================
			CashSettled_SARs CashSettled_SARs1 = new CashSettled_SARs();
			CashSettled_SARs1.CashSettled_SARs_Method();

			// ===========close browser=============
			Log_out LogoutData = new Log_out();
			LogoutData.LogOut();

			// =========== Excel ExcelFormate2 =============
			ExcelFormate2 ExcelFormate2 = new ExcelFormate2();
			ExcelFormate2.ExcelFormateData2();

		} else if (InstrumentName.equals("VerifyInProcess_Card")) {

			// ============= VerifyvaluesIn_ProcessCard ==================
			VerifyvaluesIn_ProcessCard VerifyvaluesIn_ProcessCard1 = new VerifyvaluesIn_ProcessCard();
			VerifyvaluesIn_ProcessCard1.VerifyvaluesIn_ProcessCard_Method(InstrumentName, CompanyID, User);

			// ===========close browser=============
			Log_out LogoutData = new Log_out();
			LogoutData.LogOut();

			// =========== Excel ExcelFormate2 =============
			ExcelFormate3 ExcelFormate3 = new ExcelFormate3();
			ExcelFormate3.ExcelFormateData3();

		} else if (InstrumentName.equals("Phantom_Units")) {

			// ============= Phantom Units ==================
			Phantom_Units Phantom_Units1 = new Phantom_Units();
			Phantom_Units1.Phantom_Units_Method();

			// ===========close browser=============
			Log_out LogoutData = new Log_out();
			LogoutData.LogOut();
			// ============= Phantom Units ==================
			ExcelFormate4 ExcelFormate4 = new ExcelFormate4();
			ExcelFormate4.ExcelFormateData4();

		} else {

			// ===========close browser=============
			Log_out LogoutData = new Log_out();
			LogoutData.LogOut();
		}*/
		

		// ===========close browser=============
		Log_out LogoutData = new Log_out();
		LogoutData.LogOut();
    				
		report.endTest(test);
		report.flush();
		
	    
	}


	/*****************************************
	 * Function to checkCaseToRun **************************************************
	 * Annotation : @DataProvider
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.This data provider method will return 4 column's data one by one In every
	 * Iteration.
	 * 
	 * 
	 * FUNCTION NAME : LoginData()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To retrieve data from Data 1
	 * Column,Data 2 Column,Data 3 Column and Expected Result column of
	 * SuiteOneCaseOne data Sheet. Last two columns (DataToRun and Pass/Fail/Skip)
	 * are Ignored programatically when reading test data.
	 * 
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	@DataProvider
	public Object[][] LoginData() {

		return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);

	}

	/*****************************************
	 * Function to checkCaseToRun **************************************************
	 * Annotation : @AfterMethod
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.@AfterMethod method will be executed after execution of @Test method every
	 * time.
	 * 
	 * 
	 * FUNCTION NAME : reporterDataResults()
	 * 
	 * 
	 * DESCRIPTION : This function is used to
	 * 
	 * 1.It writes Pass/Fail/Skip in excel sheet
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	@AfterMethod
	public void reporterDataResults() {
		if (Testskip) {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as SKIP In excel.");
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "SKIP");
		} else if (Testfail == true) {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as FAIL In excel.");

			TestCasePass = false;

			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "FAIL");
		} else {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as PASS In excel.");

			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "PASS");
		}

		Testskip = false;
		Testfail = false;

	}

	/*****************************************
	 * Function to checkCaseToRun **************************************************
	 * Annotation : @AfterTest
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.@AfterTest method will be executed after execution of all tests
	 * 
	 * 
	 * FUNCTION NAME : closeBrowser()
	 * 
	 * 
	 * DESCRIPTION : This function is used to
	 * 
	 * 1.To close browser
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	@AfterTest
	public void closeBrowser() {
		if (TestCasePass) {
			Add_Log.info(TestCaseName + " : Reporting test case as PASS In excel.");
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "PASS");
		} else {
			Add_Log.info(TestCaseName + " : Reporting test case as FAIL In excel.");
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "FAIL");

		}

	}

}
