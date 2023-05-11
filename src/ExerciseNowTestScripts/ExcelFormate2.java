package ExerciseNowTestScripts;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Locators.ExerciseNow_Locator;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelFormate2 extends MyEsopsLogin {

	public void ExcelFormateData2() throws Exception {

		Calendar calendar1 = Calendar.getInstance();

		DateFormat dateFormat1 = new SimpleDateFormat("MM_dd_yyyy");
		calendar1.add(Calendar.DAY_OF_YEAR, 0);
		Date today1 = calendar1.getTime();
		String date1 = dateFormat1.format(today1);

		File dir1 = new File(System.getProperty("user.dir") + "\\src\\CalculationData");
		System.out.println(dir1);
		dir1.mkdir();

		File dir3 = new File(dir1 + "\\" + date1);
		System.out.println(dir3);
		dir3.mkdir();

		Thread.sleep(5000);

		String filepath = System.getProperty("user.dir") + "\\src\\Excels\\ExercieseOptions.xls";
		FileInputStream Exfile = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(Exfile);

		Sheet sh = wb.getSheet("SelectPaymentMode");
		int totalNoOfRows = sh.getRows();
		System.out.println("Total number of rows are : " + totalNoOfRows);
		Add_Log.info("Total number of rows are : " + totalNoOfRows);
		// To get the number of columns present in sheet

		System.out.println("Total number of columns are : " + totalNoOfRows);
		Add_Log.info("Total number of columns are : " + totalNoOfRows);
		for (int row = 1; row < totalNoOfRows; row++) {

			String Online = sh.getCell(0, row).getContents();
			System.out.println("Online= " + Online);
			Add_Log.info("Online" + Online);

			String WireTransfer = sh.getCell(1, row).getContents();
			System.out.println("WireTransfer= " + WireTransfer);
			Add_Log.info("WireTransfer" + WireTransfer);

			String Cheque = sh.getCell(2, row).getContents();
			System.out.println("Cheque= " + Cheque);
			Add_Log.info("Cheque" + Cheque);

			String SellAll = sh.getCell(3, row).getContents();
			System.out.println("SellAll= " + SellAll);
			Add_Log.info("SellAll" + SellAll);

			String SellPartial = sh.getCell(4, row).getContents();
			System.out.println("SellPartial= " + SellPartial);
			Add_Log.info("SellPartial" + SellPartial);

			String DD = sh.getCell(5, row).getContents();
			System.out.println("DD= " + DD);
			Add_Log.info("DD" + DD);

			String RTGS = sh.getCell(6, row).getContents();
			System.out.println("RTGS= " + RTGS);
			Add_Log.info("RTGS" + RTGS);

			String DirectDebit = sh.getCell(7, row).getContents();
			System.out.println("DirectDebit= " + DirectDebit);
			Add_Log.info("DirectDebit" + DirectDebit);

			
			File source = new File(System.getProperty("user.dir") + "\\src\\CalculationData\\MyWealth.xls");
			File destination = new File(System.getProperty("user.dir") + "\\src\\CalculationData\\"+date1+"\\Dashboard.xls");

			if (!destination.exists()) {
				if (source.exists()) {
					boolean isSuccesful = source.renameTo(destination);
					System.out.println("Is successfully renamed - " + isSuccesful);
				} else {
					System.out.println("Source file not exists");
				}
			} else {
				System.out.println("Destination file exists");
			}
			
			File source1 = new File(System.getProperty("user.dir") + "\\src\\CalculationData\\Report.xls");
			File destination1 = new File(System.getProperty("user.dir") + "\\src\\CalculationData\\"+date1+"\\CashSettledSARs.xls");

			if (!destination1.exists()) {
				if (source1.exists()) {
					boolean isSuccesful1 = source1.renameTo(destination1);
					System.out.println("Is successfully renamed - " + isSuccesful1);
				} else {
					System.out.println("Source file not exists");
				}
			} else {
				System.out.println("Destination file exists");
			}

			Thread.sleep(5000);
		}
	}
}