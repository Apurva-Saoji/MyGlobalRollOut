package ExerciseNowTestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelFormate extends MyEsopsLogin {

	public void ExcelFormateData() throws Exception {

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

		String filepath = System.getProperty("user.dir") + "\\src\\Excels\\MyEsopsLogin.xls";
		FileInputStream Exfile = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(Exfile);

		Sheet sh = wb.getSheet("MyEsopsLogin");
		int totalNoOfRows = sh.getRows();
		System.out.println("Total number of rows are : " + totalNoOfRows);
		Add_Log.info("Total number of rows are : " + totalNoOfRows);
		// To get the number of columns present in sheet

		System.out.println("Total number of columns are : " + totalNoOfRows);
		Add_Log.info("Total number of columns are : " + totalNoOfRows);
		for (int row = 1; row < totalNoOfRows; row++) {

			String Online = sh.getCell(6, row).getContents();
			System.out.println("Online= " + Online);
			Add_Log.info("Online" + Online);

			String WireTransfer = sh.getCell(7, row).getContents();
			System.out.println("WireTransfer= " + WireTransfer);
			Add_Log.info("WireTransfer" + WireTransfer);

			String Cheque = sh.getCell(8, row).getContents();
			System.out.println("Cheque= " + Cheque);
			Add_Log.info("Cheque" + Cheque);

			String SellAll = sh.getCell(9, row).getContents();
			System.out.println("SellAll= " + SellAll);
			Add_Log.info("SellAll" + SellAll);

			String SellPartial = sh.getCell(10, row).getContents();
			System.out.println("SellPartial= " + SellPartial);
			Add_Log.info("SellPartial" + SellPartial);

			String DD = sh.getCell(11, row).getContents();
			System.out.println("DD= " + DD);
			Add_Log.info("DD" + DD);

			String RTGS = sh.getCell(12, row).getContents();
			System.out.println("RTGS= " + RTGS);
			Add_Log.info("RTGS" + RTGS);

			String DirectDebit = sh.getCell(13, row).getContents();
			System.out.println("DirectDebit= " + DirectDebit);
			Add_Log.info("DirectDebit" + DirectDebit);

			File source = new File(System.getProperty("user.dir") + "\\src\\CalculationData\\MyWealth.xls");
			

			File oldfile = new File(System.getProperty("user.dir") + "\\src\\CalculationData\\MyReport.xls");

			if (Online.equals("Y")) {
				
				File destination = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\Online_Dashboard.xls");
				
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
				
				Thread.sleep(1000);

				File Newfile = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\Online.xls");
				Thread.sleep(500);
				if (oldfile.renameTo(Newfile)) {

					System.out.println("Online Report Get ");
				}

			} else if (WireTransfer.equals("Y")) {

				File destination = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\WireTransfer_Dashboard.xls");
				
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
				
				Thread.sleep(1000);
				
				File Newfile = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\WireTransfer.xls");
				Thread.sleep(500);
				if (oldfile.renameTo(Newfile)) {

					System.out.println("WireTransafer Report Get ");

				}

			} else if (Cheque.equals("Y")) {

				File destination = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\Cheque_Dashboard.xls");
				
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
				
				Thread.sleep(1000);
				
				File Newfile = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\Cheque.xls");
				Thread.sleep(500);
				if (oldfile.renameTo(Newfile)) {

					System.out.println("Cheque Report Get ");

				}
				Thread.sleep(500);

			} else if (SellAll.equals("Y")) {

				File destination = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\SellAll_Dashboard.xls");
				
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
				
				Thread.sleep(1000);
				
				File Newfile = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\SellAll.xls");
				Thread.sleep(500);
				if (oldfile.renameTo(Newfile)) {

					System.out.println("SellAll Report Get ");

				}

			} else if (SellPartial.equals("Y")) {

				File destination = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\SellPartial_Dashboard.xls");
				
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
				
				Thread.sleep(1000);
				
				File Newfile = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\SellPartial.xls");
				Thread.sleep(500);
				if (oldfile.renameTo(Newfile)) {

					System.out.println("SellPartial Report Get ");

				}

			} else if (DD.equals("Y")) {

				File destination = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\DD_Dashboard.xls");
				
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
				
				Thread.sleep(1000);
				File Newfile = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\DD.xls");
				Thread.sleep(500);
				if (oldfile.renameTo(Newfile)) {

					System.out.println("DD Report Get ");

				}

			} else if (RTGS.equals("Y")) {

				File destination = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\RTGS_Dashboard.xls");
				
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
				
				Thread.sleep(1000);
				File Newfile = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\RTGS.xls");
				Thread.sleep(500);
				if (oldfile.renameTo(Newfile)) {

					System.out.println("RTGS Report Get ");

				}

			} else if (DirectDebit.equals("Y")) {

				File destination = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\DirectDebit_Dashboard.xls");
				
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
				
				Thread.sleep(1000);
				File Newfile = new File(
						System.getProperty("user.dir") + "\\src\\CalculationData\\" + date1 + "\\DirectDebit.xls");
				Thread.sleep(500);
				if (oldfile.renameTo(Newfile)) {

					System.out.println("Direct Debit Report Get ");

				}
			}
		}
	}
}