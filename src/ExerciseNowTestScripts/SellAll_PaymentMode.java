package ExerciseNowTestScripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locator;
import jxl.Sheet;
import jxl.Workbook;

public class SellAll_PaymentMode extends ExerciseNow {

	public void Exercise_Now(HSSFSheet sheet4, HSSFSheet sheet5, HSSFSheet sheet6, HSSFSheet sheet7, HSSFSheet sheet8,
			HSSFRow rowhead500, HSSFRow rowhead600, HSSFRow rowhead700, HSSFRow rowhead800, String GetAmount_Titile11,
			String GetAmount_Titile11A, String GetAmount_Titile12, String GetAmount_Titile12A,
			String GetAmount_Titile13, String GetAmount_Titile13A, String GetAmount_Titile14,
			String GetAmount_Titile14A, String InstrumentName, String CompanyID, String User, String GetInstrumnetValue)
			throws Exception {

		test = report.startTest("Exerciese SellAll Payment Mode");

		String filepath = System.getProperty("user.dir") + "\\src\\Excels\\ExercieseOptions.xls";
		FileInputStream Exfile = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(Exfile);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Sheet sh3 = wb.getSheet("SellAll");
		int totalNoOfRows3 = sh3.getRows();

		System.out.println("Total number of rows are : " + totalNoOfRows3);
		Add_Log.info("Total number of rows are : " + totalNoOfRows3);
		// To get the number of columns present in sheet

		System.out.println("Total number of columns are : " + totalNoOfRows3);
		Add_Log.info("Total number of columns are : " + totalNoOfRows3);

		Boolean SelectPaymentModeSellAll = driver.findElements(By.className("kt-portlet-table-adj")).size() != 0;
		System.out.println(" Select Payment Mode SellAll  =" + SelectPaymentModeSellAll);
		if (SelectPaymentModeSellAll == true) {

			Thread.sleep(2000);

			ExerciseNow_Locator.selectPaymentMode_SellAll(driver).click();
			System.out.println("Click on the SellAll_radio Button Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the SellAll_radio Button Button " + SelectPaymentModeSellAll);


			ExerciseNow_Locator.selectPaymentModeSellAll_popUpClose(driver).click();
			System.out.println("Click on the select PaymentMode SellAll Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the select PaymentMode SellAll Button " + SelectPaymentModeSellAll);

           //********* Select Payment Mode TaxAmount Tax Amount *********//

			ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
			System.out.println(" Click on the Tax_Amount Button");
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Click on the Tax_Amount Button " + SelectPaymentModeSellAll);

			int getCountSelect_PaymentModeTaxAmount = driver.findElements(By.className("has-table")).size();
			System.err.println("= " + getCountSelect_PaymentModeTaxAmount);
			Thread.sleep(1000);

			int getCountSelect_PaymentModeTaxAmount2 = driver
					.findElements(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr")).size();
			System.err.println("= " + getCountSelect_PaymentModeTaxAmount2);

			String GetAmount_TitileSelect_PaymentModeTaxAmount = driver
					.findElement(By.xpath("//*[@id='heading0']/a/h4")).getText();
			sheet5.createRow(0).createCell(1).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount);

			for (int i = 1; i <= 4; i++) {

				String GetAmount_TitileSelect_PaymentModeTaxAmount1 = driver
						.findElement(By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]")).getText();
				rowhead500.createCell(i).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount1);
				Thread.sleep(100);

			}
			for (int j = 1; j < 4; j++) {

				String GetAmount_TitileSelect_PaymentModeTaxAmount2 = driver
						.findElement(
								By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th[" + j + "]"))
						.getText();
				rowhead500.createCell(4 + j).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount2);
				Thread.sleep(100);

			}

			if (getCountSelect_PaymentModeTaxAmount2 >= 2) {

				for (int m = 1; m <= getCountSelect_PaymentModeTaxAmount; m++) {

					HSSFRow rowhead503 = sheet5.createRow(m * getCountSelect_PaymentModeTaxAmount2);
					// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

					for (int k = 1; k <= 4; k++) {

						String GetAmount_TitileSelect_PaymentModeTaxAmount3 = driver
								.findElement(
										By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
								.getText();
						rowhead503.createCell(k).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount3);
						Thread.sleep(100);

					}

					for (int l = 1; l < 4; l++) {

						String GetAmount_TitileSelect_PaymentModeTaxAmount4 = driver
								.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
										+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
								.getText();
						rowhead503.createCell(4 + l).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount4);
					}

				}
			} else {

				for (int m = 1; m <= getCountSelect_PaymentModeTaxAmount; m++) {

					HSSFRow rowhead503 = sheet4.createRow(m * 2);
					// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

					for (int k = 1; k <= 4; k++) {

						String GetAmount_TitileSelect_PaymentModeTaxAmount3 = driver
								.findElement(
										By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
								.getText();
						rowhead503.createCell(k).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount3);
						Thread.sleep(100);

					}

					for (int l = 1; l < 4; l++) {

						String GetAmount_TitileSelect_PaymentModeTaxAmount4 = driver
								.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
										+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
								.getText();
						rowhead503.createCell(4 + l).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount4);
					}

				}
			}

			for (int m = 1; m <= getCountSelect_PaymentModeTaxAmount; m++) {

				for (int p = 2; p <= getCountSelect_PaymentModeTaxAmount2; p++) {

					HSSFRow rowhead505 = sheet5.createRow((m * getCountSelect_PaymentModeTaxAmount2) + p - 1);

					for (int l = 1; l < 4; l++) {

						String GetAmount_TitileSelect_PaymentModeTaxAmount4 = driver
								.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
										+ "]/td[5]/table/tbody/tr[" + p + "]/td[" + l + "]"))
								.getText();
						rowhead505.createCell(4 + l).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount4);

					}
				}

			}

			HSSFRow rowhead506 = sheet5
					.createRow((getCountSelect_PaymentModeTaxAmount * getCountSelect_PaymentModeTaxAmount2) + 3);

			for (int n = 1; n < 4; n++) {

				String GetAmount_TitileSelect_PaymentModeTaxAmount6 = driver
						.findElement(By.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]")).getText();
				rowhead506.createCell(n * 2).setCellValue(GetAmount_TitileSelect_PaymentModeTaxAmount6);
				Thread.sleep(100);
			}
			ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
			System.out.println(" Click on the Tax_Amount Button close");

			Thread.sleep(2000);
			// ****** Verify Tax Amount Value SellAll*******//

			// Quantity
			String GetAmount_TitileSellAll22 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
					.getText();
			if (GetAmount_Titile11.equals(GetAmount_TitileSellAll22)) {

				System.out.println(GetAmount_TitileSellAll22 + ":- PASS");
				test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileSellAll22);

			} else {
				System.err.println(GetAmount_TitileSellAll22 + ":- FAIL");
				test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileSellAll22);

			}

			String GetAmount_TitileSellAll22A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']")).getText();
			if (GetAmount_Titile11A.equals(GetAmount_TitileSellAll22A)) {

				System.out.println(GetAmount_TitileSellAll22A + ":- PASS");
				test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileSellAll22A);

			} else {
				System.err.println(GetAmount_TitileSellAll22A + ":- FAIL");
				test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileSellAll22A);

			}
			Thread.sleep(100);

			// Exercise Amount
			String GetAmount_TitileSellAll23 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
					.getText();
			if (GetAmount_Titile12.equals(GetAmount_TitileSellAll23)) {

				System.out.println(GetAmount_TitileSellAll23 + ":- PASS");
				test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll23);

			} else {
				System.err.println(GetAmount_TitileSellAll23 + ":- FAIL");
				test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll23);

			}

			String GetAmount_TitileSellAll23A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseAmount']")).getText();

			if (GetAmount_Titile12A.equals(GetAmount_TitileSellAll23A)) {

				System.out.println(GetAmount_TitileSellAll23A + ":- PASS");
				test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll23A);

			} else {
				System.err.println(GetAmount_TitileSellAll23A + ":- FAIL");
				test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll23A);

			}
			Thread.sleep(100);

			// Tax Amount
			String GetAmount_TitileSellAll24 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
					.getText();
			String stringSellAll1 = new String(GetAmount_Titile13);
			String stringSellAll2 = new String(GetAmount_TitileSellAll24);

			if (stringSellAll1.equals(stringSellAll2)) {

				System.out.println(GetAmount_TitileSellAll24 + ":- PASS");
				test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileSellAll24);

			} else {
				System.err.println(GetAmount_TitileSellAll24 + ":- FAIL");
				test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileSellAll24);

			}

			String GetAmount_TitileSellAll24A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
					.getText();
			String stringSellAll3 = new String(GetAmount_Titile13A);
			String stringSellAll4 = new String(GetAmount_TitileSellAll24A);
			System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileSellAll24A);

			if (stringSellAll3.equals(stringSellAll4)) {

				System.out.println(GetAmount_TitileSellAll24A + ":- PASS");
				test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileSellAll24A);

			} else {
				System.err.println(GetAmount_TitileSellAll24A + ":- FAIL");
				test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileSellAll24A);

			}
			Thread.sleep(100);

			// Total Amount Payable
			String GetAmount_TitileSellAll25 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[2]/tr/td[1]/span/span"))
					.getText();
			if (GetAmount_Titile14.equals(GetAmount_TitileSellAll25)) {

				System.out.println(GetAmount_TitileSellAll25 + ":- PASS");
				test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileSellAll25);

			} else {
				System.err.println(GetAmount_TitileSellAll25 + ":- FAIL");
				test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileSellAll25);

			}
			String GetAmount_TitileSellAll25A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']")).getText();
			if (GetAmount_Titile14A.equals(GetAmount_TitileSellAll25A)) {

				System.out.println(GetAmount_TitileSellAll25A + ":- PASS");
				test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileSellAll25A);

			} else {
				System.err.println(GetAmount_TitileSellAll25A + ":- FAIL");
				test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileSellAll25A);

			}
			Thread.sleep(100);

			// ****************************************************************************//
			Boolean selectPaymentMode_SavePaymentMode = driver.findElements(By.id("selectPaymentMode_SavePaymentMode"))
					.size() != 0;
			System.out.println(" selectPaymentMode_SavePaymentMode =" + selectPaymentMode_SavePaymentMode);
			if (selectPaymentMode_SavePaymentMode == true) {

				ExerciseNow_Locator.selectPaymentMode_SavePaymentMode(driver).click();
				System.out.println("Click on the Continue Button");
				Thread.sleep(2000);
				test.log(LogStatus.PASS, " Click on the Continue Button:-" + selectPaymentMode_SavePaymentMode);

			} else {

				System.err.println("Not Click on the Continue");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Continue:-" + selectPaymentMode_SavePaymentMode);

			}

			for (int row3 = 1; row3 < totalNoOfRows3; row3++) {

				String Broker_Account_Enter = sh3.getCell(0, row3).getContents();
				System.out.println("Broker_Account_Enter " + Broker_Account_Enter);
				Add_Log.info("Broker_Account_Enter" + Broker_Account_Enter);

				String PANNumber_Enter = sh3.getCell(1, row3).getContents();
				System.out.println("PANNumber_Enter " + PANNumber_Enter);
				Add_Log.info("PANNumber_Enter" + PANNumber_Enter);

				String Residential_Enter = sh3.getCell(2, row3).getContents();
				System.out.println("Residential_Enter " + Residential_Enter);
				Add_Log.info("Residential_Enter" + Residential_Enter);

				String Location_Enter = sh3.getCell(3, row3).getContents();
				System.out.println("Location_Enter " + Location_Enter);
				Add_Log.info("Location_Enter" + Location_Enter);

				String Nationality_Enter = sh3.getCell(4, row3).getContents();
				System.out.println("Nationality_Enter" + Nationality_Enter);
				Add_Log.info("Nationality_Enter" + Nationality_Enter);

				String Country_Name_Enter = sh3.getCell(5, row3).getContents();
				System.out.println("Country_Name_Enter " + Country_Name_Enter);
				Add_Log.info("Country_Name_Enter" + Country_Name_Enter);

				String Contact_Number_Enter = sh3.getCell(6, row3).getContents();
				System.out.println("Contact_Number_Enter " + Contact_Number_Enter);
				Add_Log.info("Contact_Number_Enter" + Contact_Number_Enter);

				// ************************* Update Details Tax Amount ***********************//

				ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
				System.out.println(" Click on the Tax_Amount Button");
				Thread.sleep(1000);
				test.log(LogStatus.PASS, " Click on the Tax_Amount Button:- " +selectPaymentMode_SavePaymentMode);
				

				int getCountUpdate_Details = driver.findElements(By.className("has-table")).size();
				System.err.println("= " + getCountUpdate_Details);
				Thread.sleep(1000);

				int getCountUpdate_Details2 = driver
						.findElements(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
						.size();
				System.err.println("= " + getCountUpdate_Details2);

				String GetAmount_TitileUpdate_Details = driver.findElement(By.xpath("//*[@id='heading0']/a/h4"))
						.getText();
				sheet6.createRow(0).createCell(1).setCellValue(GetAmount_TitileUpdate_Details);

				for (int i = 1; i <= 4; i++) {

					String GetAmount_TitileUpdate_Details1 = driver
							.findElement(By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]")).getText();
					rowhead600.createCell(i).setCellValue(GetAmount_TitileUpdate_Details1);
					Thread.sleep(100);

				}
				for (int j = 1; j < 4; j++) {

					String GetAmount_TitileUpdate_Details2 = driver
							.findElement(By.xpath(
									"//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th[" + j + "]"))
							.getText();
					rowhead600.createCell(4 + j).setCellValue(GetAmount_TitileUpdate_Details2);
					Thread.sleep(100);

				}

				if (getCountUpdate_Details2 >= 2) {

					for (int m = 1; m <= getCountUpdate_Details; m++) {

						HSSFRow rowhead603 = sheet6.createRow(m * getCountUpdate_Details2);
						// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

						for (int k = 1; k <= 4; k++) {

							String GetAmount_TitileUpdate_Details3 = driver
									.findElement(By
											.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
									.getText();
							rowhead603.createCell(k).setCellValue(GetAmount_TitileUpdate_Details3);
							Thread.sleep(100);

						}

						for (int l = 1; l < 4; l++) {

							String GetAmount_TitileUpdate_Details4 = driver
									.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
											+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
									.getText();
							rowhead603.createCell(4 + l).setCellValue(GetAmount_TitileUpdate_Details4);
						}

					}
				} else {

					for (int m = 1; m <= getCountUpdate_Details; m++) {

						HSSFRow rowhead603 = sheet6.createRow(m * 2);
						// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

						for (int k = 1; k <= 4; k++) {

							String GetAmount_TitileUpdate_Details3 = driver
									.findElement(By
											.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
									.getText();
							rowhead603.createCell(k).setCellValue(GetAmount_TitileUpdate_Details3);
							Thread.sleep(100);

						}

						for (int l = 1; l < 4; l++) {

							String GetAmount_TitileUpdate_Details4 = driver
									.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
											+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
									.getText();
							rowhead603.createCell(4 + l).setCellValue(GetAmount_TitileUpdate_Details4);
						}

					}
				}

				for (int m = 1; m <= getCountUpdate_Details; m++) {

					for (int p = 2; p <= getCountUpdate_Details2; p++) {

						HSSFRow rowhead605 = sheet6.createRow((m * getCountUpdate_Details2) + p - 1);

						for (int l = 1; l < 4; l++) {

							String GetAmount_TitileUpdate_Details4 = driver
									.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
											+ "]/td[5]/table/tbody/tr[" + p + "]/td[" + l + "]"))
									.getText();
							rowhead605.createCell(4 + l).setCellValue(GetAmount_TitileUpdate_Details4);

						}
					}

				}

				HSSFRow rowhead606 = sheet6.createRow((getCountUpdate_Details * getCountUpdate_Details2) + 3);

				for (int n = 1; n < 4; n++) {

					String GetAmount_TitileUpdate_Details6 = driver
							.findElement(By.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]")).getText();
					rowhead606.createCell(n * 2).setCellValue(GetAmount_TitileUpdate_Details6);
					Thread.sleep(100);
				}
				ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
				System.out.println(" Click on the Tax_Amount Button close");

				Thread.sleep(2000);
				// *********** Verify Tax Amount Value SellAll**********//

				// Quantity
				String GetAmount_TitileSellAll32 = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
						.getText();
				if (GetAmount_Titile11.equals(GetAmount_TitileSellAll32)) {

					System.out.println(GetAmount_TitileSellAll32 + ":- PASS");
					test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileSellAll32);

				} else {
					System.err.println(GetAmount_TitileSellAll32 + ":- FAIL");
					test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileSellAll32);

				}

				String GetAmount_TitileSellAll32A = driver.findElement(By.xpath("//*[@id='ID_UpdateDetails_Quantity']"))
						.getText();
				if (GetAmount_Titile11A.equals(GetAmount_TitileSellAll32A)) {

					System.out.println(GetAmount_TitileSellAll32A + ":- PASS");
					test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileSellAll32A);

				} else {
					System.err.println(GetAmount_TitileSellAll32A + ":- FAIL");
					test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileSellAll32A);

				}
				Thread.sleep(100);

				// Exercise Amount
				String GetAmount_TitileSellAll33 = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/p"))
						.getText();
				if (GetAmount_Titile12.equals(GetAmount_TitileSellAll33)) {

					System.out.println(GetAmount_TitileSellAll33 + ":- PASS");
					test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll33);

				} else {
					System.err.println(GetAmount_TitileSellAll33 + ":- FAIL");
					test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll33);

				}

				String GetAmount_TitileSellAll33A = driver
						.findElement(By.xpath("//*[@id='ID_UpdateDetails_ExerciseAmount']")).getText();

				if (GetAmount_Titile12A.equals(GetAmount_TitileSellAll33A)) {

					System.out.println(GetAmount_TitileSellAll33A + ":- PASS");
					test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll33A);

				} else {
					System.err.println(GetAmount_TitileSellAll33A + ":- FAIL");
					test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll33A);

				}
				Thread.sleep(100);

				// Tax Amount
				String GetAmount_TitileSellAll34 = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
						.getText();
				String stringSellAll5 = new String(GetAmount_Titile13);
				String stringSellAll6 = new String(GetAmount_TitileSellAll34);

				if (stringSellAll5.equals(stringSellAll6)) {

					System.out.println(GetAmount_TitileSellAll34 + ":- PASS");
					test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileSellAll34);

				} else {
					System.err.println(GetAmount_TitileSellAll34 + ":- FAIL");
					test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileSellAll34);

				}

				String GetAmount_TitileSellAll34A = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[2]/ul/li/p"))
						.getText();
				String stringSellAll7 = new String(GetAmount_Titile13A);
				String stringSellAll8 = new String(GetAmount_TitileSellAll34A);
				System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileSellAll34A);

				if (stringSellAll7.equals(stringSellAll8)) {

					System.out.println(GetAmount_TitileSellAll34A + ":- PASS");
					test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileSellAll34A);

				} else {
					System.err.println(GetAmount_TitileSellAll34A + ":- FAIL");
					test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileSellAll34A);

				}
				Thread.sleep(100);

				// Total Amount Payable
				String GetAmount_TitileSellAll35 = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[2]/tr/td[1]/h4"))
						.getText();
				if (GetAmount_Titile14.equals(GetAmount_TitileSellAll35)) {

					System.out.println(GetAmount_TitileSellAll35 + ":- PASS");
					test.log(LogStatus.PASS, "  Total Amount Payable:- " + GetAmount_TitileSellAll35);

				} else {
					System.err.println(GetAmount_TitileSellAll35 + ":- FAIL");
					test.log(LogStatus.FAIL, "  Total Amount Payable:- " + GetAmount_TitileSellAll35);

				}
				String GetAmount_TitileSellAll35A = driver
						.findElement(By.xpath("//*[@id='ID_UpdateDetails_TotalAmountPayable']")).getText();
				if (GetAmount_Titile14A.equals(GetAmount_TitileSellAll35A)) {

					System.out.println(GetAmount_TitileSellAll35A + ":- PASS");
					test.log(LogStatus.PASS, "  Total Amount Payable:- " + GetAmount_TitileSellAll35A);

				} else {
					System.err.println(GetAmount_TitileSellAll35A + ":- FAIL");
					test.log(LogStatus.FAIL, "  Total Amount Payable:- " + GetAmount_TitileSellAll35A);

				}
				Thread.sleep(100);

				// ****************************************************************************//

				Boolean Broker_AccountSellAll = driver.findElements(By.id("ID_UpdateDetails_BrokerAccount"))
						.size() != 0;
				System.out.println("Broker_AccountSellAll =" + Broker_AccountSellAll);
				if (Broker_AccountSellAll == true) {

					WebElement Broker_AccountSellAll1 = driver.findElement(By.id("ID_UpdateDetails_BrokerAccount"));
					if (Broker_AccountSellAll1.isEnabled()) {

						String BrokerAccount_Enter1 = driver.findElement(By.id("ID_UpdateDetails_BrokerAccount"))
								.getText();
						System.out.println("= " + BrokerAccount_Enter1);
						Thread.sleep(2000);

						driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")).click();
						Thread.sleep(1000);

						Select BrokerAccount = new Select(driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")));
						BrokerAccount.selectByVisibleText(BrokerAccount_Enter1);
						Thread.sleep(2000);

						test.log(LogStatus.PASS, " Broker_Account Enable:-" + Broker_AccountSellAll1);

					} else {

						System.err.println("Broker_Account Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Broker_Account Disable:- " + Broker_AccountSellAll1);

					}
				} else {

					System.err.println("Not Present Broker_Account");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Not Present Broker_Account:- " + Broker_AccountSellAll);

				}

				Boolean DematAccount_Enter2 = driver.findElements(By.id("ID_UpdateDetails_Demat")).size() != 0;
				System.out.println(" DematAccount_Enter =" + DematAccount_Enter2);
				if (DematAccount_Enter2 == true) {

					String DematAccount_Enter1 = driver.findElement(By.id("ID_UpdateDetails_Demat")).getText();
					System.out.println("= " + DematAccount_Enter1);
					Thread.sleep(2000);

					driver.findElement(By.id("ID_UpdateDetails_Demat")).click();
					Thread.sleep(1000);

					Select DematAccount = new Select(driver.findElement(By.id("ID_UpdateDetails_Demat")));
					DematAccount.selectByVisibleText(DematAccount_Enter1);
					
					test.log(LogStatus.PASS, " Demat Account Available:-" + DematAccount_Enter2);

				} else {

					System.err.println("Demat Account Not Available  ");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Demat Account Not Available:- " + DematAccount_Enter2);

				}

				WebElement PANNumber_SellAll = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
				if (PANNumber_SellAll.isEnabled()) {

					ExerciseNow_Locator.PANNumber_SellAll1(driver).clear();
					ExerciseNow_Locator.PANNumber_SellAll1(driver).sendKeys(PANNumber_Enter);
					System.out.println("Enter PAN Number");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, " Enter PAN Number:- " + PANNumber_SellAll);


				} else {

					System.err.println("PAN Number Disable");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " PAN Number Disable :-" + PANNumber_SellAll);

				}

				WebElement Residential_StatusSellAll = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
				if (Residential_StatusSellAll.isEnabled()) {

					ExerciseNow_Locator.Residential_StatusSellAll1(driver).clear();
					ExerciseNow_Locator.Residential_StatusSellAll1(driver).sendKeys(Residential_Enter);
					System.out.println("Enter Residential_Status");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, " Enter Residential_Status:-" + Residential_StatusSellAll);

				} else {

					System.err.println("Residential Status Disable");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Residential Status Disable:- " + Residential_StatusSellAll);

				}

				WebElement LocationSellAll = driver.findElement(By.id("ID_UpdateDetails_Location"));
				if (LocationSellAll.isEnabled()) {

					ExerciseNow_Locator.LocationSellAll1(driver).clear();
					ExerciseNow_Locator.LocationSellAll1(driver).sendKeys(Location_Enter);
					System.out.println("Enter Location");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, " Enter Location:- " + LocationSellAll);

				} else {

					System.err.println("Location Disable");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Location Disable:- " + LocationSellAll);

				}

				WebElement NationalitySellAll = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
				if (NationalitySellAll.isEnabled()) {

					ExerciseNow_Locator.NationalitySellAll1(driver).clear();
					ExerciseNow_Locator.NationalitySellAll1(driver).sendKeys(Nationality_Enter);
					System.out.println("Enter Nationality");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, " Enter Nationality:- " + NationalitySellAll);


				} else {

					System.err.println("Nationality Disable");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Nationality Disable:-" + NationalitySellAll);

				}

				WebElement Country_NameSell = driver.findElement(By.id("ID_MyProfile_Country"));
				if (Country_NameSell.isEnabled()) {

					driver.findElement(By.id("ID_MyProfile_Country")).click();
					Select Country_Name_Sell1 = new Select(driver.findElement(By.id("ID_MyProfile_Country")));
					Country_Name_Sell1.selectByVisibleText(Country_Name_Enter);
					System.out.println("Enter Country_Name");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "Enter Country_Name:- " +Country_NameSell);

				} else {

					System.err.println("Country_Name Disable");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, "Country_Name Disable:- " +Country_NameSell);

				}

				WebElement Contact_NumberSellAll = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
				if (Contact_NumberSellAll.isEnabled()) {

					ExerciseNow_Locator.Contact_NumberSellAll1(driver).clear();
					ExerciseNow_Locator.Contact_NumberSellAll1(driver).sendKeys(Contact_Number_Enter);
					System.out.println("Enter Contact_Number");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, " Enter Contact_Number:- " + Contact_NumberSellAll);

				} else {

					System.err.println("Contact_Number Disable");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Contact_Number Disable:- " + Contact_NumberSellAll);
				}

				jse.executeScript("window.scrollBy(0,-1050)");
				Boolean Check_box = driver.findElements(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[2]/div/div/table/tbody[1]/tr/td/div/label/span"))
						.size() != 0;
				System.out.println(" Ckeck box " + Check_box);
				if (Check_box == true) {

					ExerciseNow_Locator.Check_box(driver).click();

					System.out.println("Click on the Check_box");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, " Click on the Check_box:- " + Check_box);

					WebElement UpdateDetails_Confirm = driver.findElement(By.id("ID_UpdateDetails_Confirm"));
					if (UpdateDetails_Confirm.isEnabled()) {

						ExerciseNow_Locator.Wire_TransferUpdateDetails_Confirm(driver).click();
						System.out.println("Wire_TransferUpdateDetails_Confirm Enabled");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Wire_TransferUpdateDetails_Confirm Enabled:- " + UpdateDetails_Confirm);

						ExerciseNow_Locator.UpdateDetails_ConfirmPopUp(driver).sendKeys(Keys.ENTER);
						System.out.println("Click on the UpdateDetails Confirm PopUp Button");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Click on the UpdateDetails Confirm PopUp Button:- " + UpdateDetails_Confirm);

						
						if (InstrumentName.equals("VerifyInProcess_Card")) {

							Boolean Exerciese_Options2 = driver.findElements(By.linkText("Exercise Options"))
									.size() != 0;
							System.out.println(" Exerciese_Options2 =" + Exerciese_Options2);
							if (Exerciese_Options2 == true) {

								ExerciseNow_Locator.Exerciese_Options(driver).click();
								System.out.println("Click on the Exerciese Options ");
								Thread.sleep(500);
								test.log(LogStatus.PASS, " Click on the Exerciese Options:- " + Exerciese_Options2);


							} else {

								System.err.println("Not Click on the Exerciese_Options ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, " Not Click on the Exerciese_Options:- " + Exerciese_Options2);

							}
							Thread.sleep(5000);

							int Get_Status = driver.findElements(By.className("btn-link2")).size();
							System.out.println(Get_Status + "");
							for (int Index = 1; Index <= Get_Status; Index++) {

								Boolean Get_Status4 = driver
										.findElements(By.xpath("//div[" + Index + "]//div/div[2]/div/div/button/span"))
										.size() != 0;
								if (Get_Status4 == true) {

									String Get_Status2 = driver
											.findElement(
													By.xpath("//div[" + Index + "]/div/div[2]/div/div/button/span"))
											.getText();
									Thread.sleep(500);
									if (Get_Status2.equals("Exercise Declaration")) {

										driver.findElement(
												By.xpath("//div[" + Index + "]/div/div[2]/div/div/button/span"))
												.click();
										Thread.sleep(8000);
										break;
									}

								}
							}
						}
						// *************** Verify Tax Amount Value SellAll***********//

						// Quantity
						String GetAmount_TitileSellAll42 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
								.getText();
						if (GetAmount_Titile11.equals(GetAmount_TitileSellAll42)) {

							System.out.println(GetAmount_TitileSellAll42 + ":- PASS");
							test.log(LogStatus.PASS, "  Quantity:- " + GetAmount_TitileSellAll42);

						} else {
							System.err.println(GetAmount_TitileSellAll42 + ":- FAIL");
							test.log(LogStatus.FAIL, "  Quantity:- " + GetAmount_TitileSellAll42);

						}

						String GetAmount_TitileSellAll42A = driver
								.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedQuantity']")).getText();
						System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileSellAll42A);

						if (GetAmount_Titile11A.equals(GetAmount_TitileSellAll42A)) {

							System.out.println(GetAmount_TitileSellAll42A + ":- PASS");
							test.log(LogStatus.PASS, "  Quantity:- " + GetAmount_TitileSellAll42A);

						} else {
							System.err.println(GetAmount_TitileSellAll42A + ":- FAIL");
							test.log(LogStatus.FAIL, "  Quantity:- " + GetAmount_TitileSellAll42A);

						}
						Thread.sleep(100);

						// Exercise Amount
						String GetAmount_TitileSellAll43 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
								.getText();
						if (GetAmount_Titile12.equals(GetAmount_TitileSellAll43)) {

							System.out.println(GetAmount_TitileSellAll43 + ":- PASS");
							test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll43);

						} else {
							System.err.println(GetAmount_TitileSellAll43 + ":- FAIL");
							test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll43);

						}

						String GetAmount_TitileSellAll43A = driver
								.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']")).getText();

						if (GetAmount_Titile12A.equals(GetAmount_TitileSellAll43A)) {

							System.out.println(GetAmount_TitileSellAll43A + ":- PASS");
							test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll43A);

						} else {
							System.err.println(GetAmount_TitileSellAll43A + ":- FAIL");
							test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll43A);

						}
						Thread.sleep(100);

						// Tax Amount
						String GetAmount_TitileSellAll44 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
								.getText();
						String stringSellAll9 = new String(GetAmount_Titile13);
						String stringSellAll10 = new String(GetAmount_TitileSellAll44);

						if (stringSellAll9.equals(stringSellAll10)) {

							System.out.println(GetAmount_TitileSellAll44 + ":- PASS");
							test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll44);

						} else {
							System.err.println(GetAmount_TitileSellAll44 + ":- FAIL");
							test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll44);

						}

						String GetAmount_TitileSellAll44A = driver
								.findElement(By.xpath("//*[@id='ID_DeclarationForm_TaxAmount']")).getText();
						String stringSellAll11 = new String(GetAmount_Titile13A);
						String stringSellAll12 = new String(GetAmount_TitileSellAll44A);
						System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileSellAll44A);

						if (stringSellAll11.equals(stringSellAll12)) {

							System.out.println(GetAmount_TitileSellAll44A + ":- PASS");
							test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll44A);

						} else {
							System.err.println(GetAmount_TitileSellAll44A + ":- FAIL");
							test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll44A);

						}
						Thread.sleep(100);

						// Total Amount Payable
						String GetAmount_TitileSellAll45 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
								.getText();
						if (GetAmount_Titile14.equals(GetAmount_TitileSellAll45)) {

							System.out.println(GetAmount_TitileSellAll45 + ":- PASS");
							test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileSellAll45);

						} else {
							System.err.println(GetAmount_TitileSellAll45 + ":- FAIL");
							test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileSellAll45);

						}
						String GetAmount_TitileSellAll45A = driver
								.findElement(By.xpath("//*[@id='ID_DeclarationForm_TotalAmntPayable']")).getText();
						if (GetAmount_Titile14A.equals(GetAmount_TitileSellAll45A)) {

							System.out.println(GetAmount_TitileSellAll45A + ":- PASS");
							test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileSellAll45A);

						} else {
							System.err.println(GetAmount_TitileSellAll45A + ":- FAIL");
							test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileSellAll45A);

						}
						Thread.sleep(100);

						// ****************************************************************************//

						Boolean Acknowledgment_Payment = driver.findElements(By.id("ID_Acknowledgment_Payment"))
								.size() != 0;
						System.out.println("Acknowledgment_Payment  =" + Acknowledgment_Payment);
						if (Acknowledgment_Payment == true) {

							Thread.sleep(2000);
							Boolean Payment_checkbox = driver.findElements(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[2]/div/div/table/tbody[1]/tr/td/div/label/span"))
									.size() != 0;
							System.out.println("Payment_checkbox = " + Payment_checkbox);
							if (Payment_checkbox == true) {

								WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions
										.elementToBeClickable(ExerciseNow_Locator.Payment_checkbox(driver)));
								JavascriptExecutor executor = (JavascriptExecutor) driver;
								executor.executeScript("arguments[0].click();", element);
								System.out.println("Click on the Payment checkbox Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, " Click on the Payment checkbox Button:- " + Payment_checkbox);


								Boolean ExercisedSubmitDownload1 = driver
										.findElements(By.id("ID_DeclarationForm_ExercisedSubmitDownload")).size() != 0;
								System.out.println("ExercisedSubmitDownload = " + ExercisedSubmitDownload1);
								test.log(LogStatus.PASS, " ExercisedSubmitDownload :- " +  ExercisedSubmitDownload1);

								if (ExercisedSubmitDownload1 == true) {

									ExerciseNow_Locator.ExercisedSubmitDownload(driver).click();
									System.out.println("Click on the Exercise Declaration");
									test.log(LogStatus.PASS, " Click on the Exercise Declaration:- " +ExercisedSubmitDownload1);

									Boolean Upload_Form = driver.findElements(By.id("pr-custom-file-input"))
											.size() != 0;
									System.out.println("Upload_Form" + Upload_Form);
									if (Upload_Form == true) {

										Thread.sleep(5000);
										// driver.navigate().refresh();
										// Thread.sleep(5000);
										if (InstrumentName.equals("VerifyInProcess_Card")) {
											Boolean Exerciese_Options3 = driver
													.findElements(By.linkText("Exercise Options")).size() != 0;
											System.out.println(" Exerciese_Options2 =" + Exerciese_Options3);
											if (Exerciese_Options3 == true) {

												ExerciseNow_Locator.Exerciese_Options(driver).click();
												System.out.println("Click on the Exerciese Options ");
												Thread.sleep(500);
												test.log(LogStatus.PASS, " Click on the Exerciese Options:-" + Exerciese_Options3);

											} else {

												System.err.println("Not Click on the Exerciese_Options ");
												Thread.sleep(500);
												test.log(LogStatus.FAIL, " Not Click on the Exerciese_Options:- " + Exerciese_Options3);

											}
											Thread.sleep(5000);

											int Get_Status12 = driver.findElements(By.className("btn-link2")).size();
											System.out.println(Get_Status12 + "");
											for (int Index1 = 1; Index1 <= Get_Status12; Index1++) {

												Boolean Get_Status14 = driver.findElements(By
														.xpath("//div[" + Index1 + "]//div/div[2]/div/div/button/span"))
														.size() != 0;
												if (Get_Status14 == true) {

													String Get_Status13 = driver.findElement(By.xpath(
															"//div[" + Index1 + "]/div/div[2]/div/div/button/span"))
															.getText();
													Thread.sleep(500);
													if (Get_Status13.equals("Upload Form")) {

														driver.findElement(By.xpath(
																"//div[" + Index1 + "]/div/div[2]/div/div/button/span"))
																.click();
														Thread.sleep(8000);
														break;
													}

												}
											}
										}
										// ************ Acknowledgement Tax Amount *************//

										WebElement Tax_Amount_Button = (new WebDriverWait(driver, 10))
												.until(ExpectedConditions.elementToBeClickable(
														ExerciseNow_Locator.Tax_Amount_Button(driver)));
										JavascriptExecutor executor_Tax_Amount_Button = (JavascriptExecutor) driver;
										executor_Tax_Amount_Button.executeScript("arguments[0].click();",
												Tax_Amount_Button);

										// ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
										System.out.println(" Click on the Tax_Amount Button");
										Thread.sleep(1000);
										test.log(LogStatus.PASS, " Click on the Tax_Amount Button:- " + SelectPaymentModeSellAll);


										int getCountAcknowledgement = driver.findElements(By.className("has-table"))
												.size();
										System.err.println("= " + getCountAcknowledgement);
										Thread.sleep(1000);

										int getCountAcknowledgement2 = driver.findElements(By.xpath(
												"//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
												.size();
										System.err.println("= " + getCountAcknowledgement2);

										String GetAmount_TitileAcknowledgement = driver
												.findElement(By.xpath("//*[@id='heading0']/a/h4")).getText();
										sheet8.createRow(0).createCell(1).setCellValue(GetAmount_TitileAcknowledgement);

										for (int i = 1; i <= 4; i++) {

											String GetAmount_TitileAcknowledgement1 = driver
													.findElement(By.xpath(
															"//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]"))
													.getText();
											rowhead800.createCell(i).setCellValue(GetAmount_TitileAcknowledgement1);
											Thread.sleep(100);

										}
										for (int j = 1; j < 4; j++) {

											String GetAmount_TitileAcknowledgement2 = driver.findElement(By.xpath(
													"//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th["
															+ j + "]"))
													.getText();
											rowhead800.createCell(4 + j).setCellValue(GetAmount_TitileAcknowledgement2);
											Thread.sleep(100);

										}

										if (getCountAcknowledgement2 >= 2) {

											for (int m = 1; m <= getCountAcknowledgement; m++) {

												HSSFRow rowhead803 = sheet8.createRow(m * getCountAcknowledgement2);
												// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

												for (int k = 1; k <= 4; k++) {

													String GetAmount_TitileAcknowledgement3 = driver.findElement(
															By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
																	+ "]/td[" + k + "]"))
															.getText();
													rowhead803.createCell(k)
															.setCellValue(GetAmount_TitileAcknowledgement3);
													Thread.sleep(100);

												}

												for (int l = 1; l < 4; l++) {

													String GetAmount_TitileAcknowledgement4 = driver.findElement(
															By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
																	+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
															.getText();
													rowhead803.createCell(4 + l)
															.setCellValue(GetAmount_TitileAcknowledgement4);
												}

											}
										} else {

											for (int m = 1; m <= getCountAcknowledgement; m++) {

												HSSFRow rowhead803 = sheet8.createRow(m * 2);
												// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

												for (int k = 1; k <= 4; k++) {

													String GetAmount_TitileAcknowledgement3 = driver.findElement(
															By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
																	+ "]/td[" + k + "]"))
															.getText();
													rowhead803.createCell(k)
															.setCellValue(GetAmount_TitileAcknowledgement3);
													Thread.sleep(100);

												}

												for (int l = 1; l < 4; l++) {

													String GetAmount_TitileAcknowledgement4 = driver.findElement(
															By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
																	+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
															.getText();
													rowhead803.createCell(4 + l)
															.setCellValue(GetAmount_TitileAcknowledgement4);
												}

											}
										}

										for (int m = 1; m <= getCountAcknowledgement; m++) {

											for (int p = 2; p <= getCountAcknowledgement2; p++) {

												HSSFRow rowhead805 = sheet8
														.createRow((m * getCountAcknowledgement2) + p - 1);

												for (int l = 1; l < 4; l++) {

													String GetAmount_TitileAcknowledgement4 = driver.findElement(
															By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
																	+ "]/td[5]/table/tbody/tr[" + p + "]/td[" + l
																	+ "]"))
															.getText();
													rowhead805.createCell(4 + l)
															.setCellValue(GetAmount_TitileAcknowledgement4);

												}
											}

										}

										HSSFRow rowhead806 = sheet8
												.createRow((getCountAcknowledgement * getCountAcknowledgement2) + 3);

										for (int n = 1; n < 4; n++) {

											String GetAmount_TitileAcknowledgement6 = driver
													.findElement(By.xpath(
															"//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]"))
													.getText();
											rowhead806.createCell(n * 2).setCellValue(GetAmount_TitileAcknowledgement6);
											Thread.sleep(100);
										}
										ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
										System.out.println(" Click on the Tax_Amount Button close");

										test.log(LogStatus.PASS, " Click on the Tax_Amount Button close:- " + Upload_Form);
										Thread.sleep(3000);
										// ****** Verify Tax Amount Value SellAll *******//
										// Quantity

										String GetAmount_TitileSellAll52 = driver.findElement(By.xpath(
												"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
												.getText();
										if (GetAmount_Titile11.equals(GetAmount_TitileSellAll52)) {

											System.out.println(GetAmount_TitileSellAll52 + ":- PASS");
											test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileSellAll52);

										} else {
											System.err.println(GetAmount_TitileSellAll52 + ":- FAIL");
											test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileSellAll52);

										}

										String GetAmount_TitileSellAll52A = driver
												.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']"))
												.getText();
										System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileSellAll52A);

										if (GetAmount_Titile11A.equals(GetAmount_TitileSellAll52A)) {

											System.out.println(GetAmount_TitileSellAll52A + ":- PASS");
											test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileSellAll52A);

										} else {
											System.err.println(GetAmount_TitileSellAll52A + ":- FAIL");
											test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileSellAll52A);

										}
										Thread.sleep(100);

										// Exercise Amount
										String GetAmount_TitileSellAll53 = driver.findElement(By.xpath(
												"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
												.getText();
										if (GetAmount_Titile12.equals(GetAmount_TitileSellAll53)) {

											System.out.println(GetAmount_TitileSellAll53 + ":- PASS");
											test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll53);

										} else {
											System.err.println(GetAmount_TitileSellAll53 + ":- FAIL");
											test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll53);

										}

										String GetAmount_TitileSellAll53A = driver
												.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']"))
												.getText();

										if (GetAmount_Titile12A.equals(GetAmount_TitileSellAll53A)) {

											System.out.println(GetAmount_TitileSellAll53A + ":- PASS");
											test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileSellAll53A);

										} else {
											System.err.println(GetAmount_TitileSellAll53A + ":- FAIL");
											test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileSellAll53A);

										}
										Thread.sleep(100);

										// Tax Amount
										String GetAmount_TitileSellAll54 = driver.findElement(By.xpath(
												"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
												.getText();
										String stringSellAll13 = new String(GetAmount_Titile13);
										String stringSellAll14 = new String(GetAmount_TitileSellAll54);

										if (stringSellAll13.equals(stringSellAll14)) {

											System.out.println(GetAmount_TitileSellAll54 + ":- PASS");
											test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileSellAll54);

										} else {
											System.err.println(GetAmount_TitileSellAll54 + ":- FAIL");
											test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileSellAll54);

										}

										String GetAmount_TitileSellAll54A = driver
												.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
												.getText();
										String stringSellAll15 = new String(GetAmount_Titile13A);
										String stringSellAll16 = new String(GetAmount_TitileSellAll54A);
										System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileSellAll54A);

										if (stringSellAll15.equals(stringSellAll16)) {

											System.out.println(GetAmount_TitileSellAll54A + ":- PASS");
											test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileSellAll54A);

										} else {
											System.err.println(GetAmount_TitileSellAll54A + ":- FAIL");
											test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileSellAll54A);

										}
										Thread.sleep(100);

										// Total Amount Payable
										String GetAmount_TitileSellAll56 = driver.findElement(By.xpath(
												"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
												.getText();
										if (GetAmount_Titile14.equals(GetAmount_TitileSellAll56)) {

											System.out.println(GetAmount_TitileSellAll56 + ":- PASS");
											test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileSellAll56);

										} else {
											System.err.println(GetAmount_TitileSellAll56 + ":- FAIL");
											test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileSellAll56);

										}
										String GetAmount_TitileSellAll56A = driver
												.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']"))
												.getText();
										if (GetAmount_Titile14A.equals(GetAmount_TitileSellAll56A)) {

											System.out.println(GetAmount_TitileSellAll56A + ":- PASS");
											test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileSellAll56A);

										} else {
											System.err.println(GetAmount_TitileSellAll56A + ":- FAIL");
											test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileSellAll56A);

										}
										Thread.sleep(1000);

										Boolean ViewExercise_Form = driver
												.findElements(By.className("download-form-wrap")).size() != 0;
										System.out.println("ExercisedSubmitDownload = " + ExercisedSubmitDownload1);

										if (ViewExercise_Form == true) {

											ExerciseNow_Locator.ViewExercise_Form_Click(driver).click();
											System.out.println("Click on the View Exercise Form");
											test.log(LogStatus.PASS, " Click on the View Exercise Form:- " + ViewExercise_Form);

											Thread.sleep(5000);

											Boolean Download_Button_ExerciseForm = driver
													.findElements(By.className("download-form-wrap")).size() != 0;
											System.out.println(
													"Download_Button_ExerciseForm = " + Download_Button_ExerciseForm);
											test.log(LogStatus.PASS, " Download_Button_ExerciseForm:-" +Download_Button_ExerciseForm);

											if (Download_Button_ExerciseForm == true) {

												ExerciseNow_Locator.Download_ButtonClick_ExerciseForm(driver).click();
												System.out.println("Click on the Download_Button_ExerciseForm");
												Thread.sleep(5000);
												test.log(LogStatus.PASS, " Click on the Download_Button_ExerciseForm:-" + Download_Button_ExerciseForm);

												Boolean Click_toBrowse = driver
														.findElements(By.className("download-form-wrap")).size() != 0;
												System.out.println("Click to Browse = " + Click_toBrowse);

												if (Click_toBrowse == true) {

													ExerciseNow_Locator.Click_toBrowse(driver).click();
													System.out.println("Click_to Browse");
													test.log(LogStatus.PASS, " Click_to Browse:- " + Click_toBrowse);
													Thread.sleep(5000);
													StringSelection str = new StringSelection(
															"D:\\Testing Team Automation\\MyGlobalRollOut\\DownloadFile\\"
																	+ CompanyID + "_" + User + "_" + GetInstrumnetValue
																	+ ".pdf");
													Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,
															null);

													Robot robot = new Robot();
													robot.keyPress(KeyEvent.VK_CONTROL);
													robot.keyPress(KeyEvent.VK_V);
													robot.keyRelease(KeyEvent.VK_V);
													robot.keyRelease(KeyEvent.VK_CONTROL);
													robot.keyPress(KeyEvent.VK_ENTER);
													robot.keyRelease(KeyEvent.VK_ENTER);

													Thread.sleep(5000);

													ExerciseNow_Locator.Clickto_Ok_Button(driver).click();
													System.out.println("Click_to Button");
													test.log(LogStatus.PASS, " Click_to Button:-" + Click_toBrowse);

													Boolean selectPaymentMode_SavePaymentMode1 = driver
															.findElements(By.id("selectPaymentMode_SavePaymentMode"))
															.size() != 0;
													System.out.println("selectPaymentMode_SavePaymentMode = "
															+ selectPaymentMode_SavePaymentMode1);

													if (selectPaymentMode_SavePaymentMode1 == true) {

														ExerciseNow_Locator.selectPaymentMode_SavePaymentMode(driver)
																.click();
														System.out
																.println("Click_to selectPaymentMode_SavePaymentMode");
														Thread.sleep(5000);
														test.log(LogStatus.PASS, " Click_to selectPaymentMode_SavePaymentMode:- " + selectPaymentMode_SavePaymentMode1);

														
														Boolean selectPaymentMode_alert1 = driver.findElements(By.xpath(
																"//*[@id='alert-exercise-success-modal']/div/div"))
																.size() != 0;
														System.out.println(
																"selectPaymentMode_alert= " + selectPaymentMode_alert1);
														test.log(LogStatus.PASS, " selectPaymentMode_alert:-" +selectPaymentMode_SavePaymentMode1);

														if (selectPaymentMode_alert1 == true) {

															WebDriverWait wait = new WebDriverWait(driver, 30);
															wait.until(ExpectedConditions
																	.textToBePresentInElementLocated(By.xpath(
																			"//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"),
																			"OK"));

															Thread.sleep(1000);
															String GetText = ExerciseNow_Locator
																	.selectPaymentMode_alert(driver).getText();
															System.err.println("" + GetText);
															test.log(LogStatus.FAIL, "selectPaymentMode_alert1:-" + selectPaymentMode_alert1);

															if (GetText.equals("File is not Successfully upload")) {

																driver.findElement(By.xpath(
																		"//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"))
																		.click();
																System.err.println(".....Fail");
																test.log(LogStatus.FAIL, ".....Fail :-" + GetText);

																break;
															} else {

																System.out.println("File is Successfully upload");
																Thread.sleep(5000);
																test.log(LogStatus.PASS, " File is Successfully upload:- " + GetText);

																Boolean Acknowledgement_IntiateExercise1 = driver
																		.findElements(By.id(
																				"ID_Acknowledgement_IntiateExercise"))
																		.size() != 0;
																System.out.println("Acknowledgement_IntiateExercise = "
																		+ Acknowledgement_IntiateExercise1);

																if (Acknowledgement_IntiateExercise1 == true) {

																	ExerciseNow_Locator
																			.Acknowledgement_IntiateExercise(driver)
																			.click();
																	System.out.println(
																			"Click_to Acknowledgement_IntiateExercise");
																	test.log(LogStatus.PASS, " Click_to Acknowledgement_IntiateExercise :-" + Acknowledgement_IntiateExercise1);

																	Thread.sleep(5000);

																} else {

																	System.err.println(
																			"No Click to Acknowledgement_IntiateExercise");
																	test.log(LogStatus.FAIL, "No Click to Acknowledgement_IntiateExercise:-" + Acknowledgement_IntiateExercise1);

																}

															}

															System.out.println("Select Payment Alert");
															test.log(LogStatus.PASS, " Select Payment Alert:- " +selectPaymentMode_SavePaymentMode1 );

														}
													} else {

														System.err.println(
																"No Click to selectPaymentMode_SavePaymentMode");
														test.log(LogStatus.FAIL, " No Click to selectPaymentMode_SavePaymentMode:- " + SelectPaymentModeSellAll);

													}

												} else {

													System.err.println("No Click to Ok Button");
													test.log(LogStatus.FAIL, " No Click to Ok Button :-" + Click_toBrowse);

												}
											}

										} else {

											System.err.println("Not click on the View Exercise Form");
											test.log(LogStatus.FAIL, " Not click on the View Exercise Form:- " + Upload_Form);

										}
									} else {

										System.err.println("ExercisedSubmitDownload Disable");
										test.log(LogStatus.FAIL, " ExercisedSubmitDownload Disable:- " + ExercisedSubmitDownload1);

									}

								}
							}

							Thread.sleep(1000);

						}

					} else {

						System.err.println("Wire_TransferUpdateDetails_Confirm Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Wire_TransferUpdateDetails_Confirm Disable:- " + UpdateDetails_Confirm);

					}
				} else {

					System.err.println("Not Click on the Check_box ");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Not Click on the Check_box:- " +Check_box);

				}

			}

		} else {

			System.err.println("Not Click on SelectPaymentMode");
			Thread.sleep(500);
			test.log(LogStatus.FAIL, " Not Click on SelectPaymentMode:-" + SelectPaymentModeSellAll );

		}

	}
}