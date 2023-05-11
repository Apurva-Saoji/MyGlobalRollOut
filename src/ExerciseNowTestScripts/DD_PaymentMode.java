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

public class DD_PaymentMode extends ExerciseNow {

	public void Exercise_Now(HSSFSheet sheet4, HSSFSheet sheet5, HSSFSheet sheet6, HSSFSheet sheet7, HSSFSheet sheet8,
			HSSFRow rowhead500, HSSFRow rowhead600, HSSFRow rowhead700, HSSFRow rowhead800, String GetAmount_Titile11,
			String GetAmount_Titile11A, String GetAmount_Titile12, String GetAmount_Titile12A,
			String GetAmount_Titile13, String GetAmount_Titile13A, String GetAmount_Titile14,
			String GetAmount_Titile14A, String InstrumentName, String CompanyID, String User, String GetInstrumnetValue)
			throws Exception {

		test = report.startTest("Exerciese DD Payment Mode");

		String filepath = System.getProperty("user.dir") + "\\src\\Excels\\ExercieseOptions.xls";
		FileInputStream Exfile = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(Exfile);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Sheet sh5 = wb.getSheet("DD");
		int totalNoOfRows5 = sh5.getRows();

		System.out.println("Total number of rows are : " + totalNoOfRows5);
		Add_Log.info("Total number of rows are : " + totalNoOfRows5);
		// To get the number of columns present in sheet

		System.out.println("Total number of columns are : " + totalNoOfRows5);
		Add_Log.info("Total number of columns are : " + totalNoOfRows5);

		Boolean SelectPaymentModeDD = driver.findElements(By.className("kt-portlet-table-adj")).size() != 0;
		System.out.println(" Select Payment Mode DD =" + SelectPaymentModeDD);
		if (SelectPaymentModeDD == true) {

			Thread.sleep(2000);

			ExerciseNow_Locator.selectPaymentMode_DD(driver).click();
			System.out.println("Click on the DD radio Button Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the DD radio Button Button " + SelectPaymentModeDD);

			ExerciseNow_Locator.selectPaymentModeDD_popUpClose(driver).click();
			System.out.println("Click on the select PaymentMode DD Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the select PaymentMode DD Button " + SelectPaymentModeDD);

			// ********** Select Payment Mode TaxAmount Tax Amount************//

			ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
			System.out.println(" Click on the Tax_Amount Button");
			Thread.sleep(1000);
			test.log(LogStatus.PASS, " Click on the Tax_Amount Button " + SelectPaymentModeDD);

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
			test.log(LogStatus.PASS, " Click on the Tax_Amount Button close" + SelectPaymentModeDD);

			Thread.sleep(2000);
			// ******* Verify Tax Amount Value DD************//

			// Quantity
			String GetAmount_TitileDD22 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
					.getText();
			if (GetAmount_Titile11.equals(GetAmount_TitileDD22)) {

				System.out.println(GetAmount_TitileDD22 + ":- PASS");
				test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileDD22);
				
			} else {
				System.err.println(GetAmount_TitileDD22 + ":- FAIL");
				test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileDD22);
			}

			String GetAmount_TitileDD22A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']"))
					.getText();
			if (GetAmount_Titile11A.equals(GetAmount_TitileDD22A)) {

				System.out.println(GetAmount_TitileDD22A + ":- PASS");
				test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileDD22A);
			} else {
				System.err.println(GetAmount_TitileDD22A + ":- FAIL");
				test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileDD22A);
			}
			Thread.sleep(100);

			// Exercise Amount
			String GetAmount_TitileDD23 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
					.getText();
			if (GetAmount_Titile12.equals(GetAmount_TitileDD23)) {

				System.out.println(GetAmount_TitileDD23 + ":- PASS");
				test.log(LogStatus.PASS," Exercise Amount:- " + GetAmount_TitileDD23);
			} else {
				System.err.println(GetAmount_TitileDD23 + ":- FAIL");
				test.log(LogStatus.FAIL," Exercise Amount:- " + GetAmount_TitileDD23);

			}

			String GetAmount_TitileDD23A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseAmount']"))
					.getText();

			if (GetAmount_Titile12A.equals(GetAmount_TitileDD23A)) {

				System.out.println(GetAmount_TitileDD23A + ":- PASS");
				test.log(LogStatus.PASS," Exercise Amount:- " + GetAmount_TitileDD23A);

			} else {
				System.err.println(GetAmount_TitileDD23A + ":- FAIL");
				test.log(LogStatus.FAIL," Exercise Amount:- " + GetAmount_TitileDD23A);

			}
			Thread.sleep(100);

			// Tax Amount
			String GetAmount_TitileDD24 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
					.getText();
			String stringDD1 = new String(GetAmount_Titile13);
			String stringDD2 = new String(GetAmount_TitileDD24);

			if (stringDD1.equals(stringDD2)) {

				System.out.println(GetAmount_TitileDD24 + ":- PASS");
				test.log(LogStatus.PASS," Tax Amount:- " + GetAmount_TitileDD24);

			} else {
				System.err.println(GetAmount_TitileDD24 + ":- FAIL");
				test.log(LogStatus.FAIL," Tax Amount:- " + GetAmount_TitileDD24);

			}

			String GetAmount_TitileDD24A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
					.getText();
			String stringDD3 = new String(GetAmount_Titile13A);
			String stringDD4 = new String(GetAmount_TitileDD24A);
			System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileDD24A);

			if (stringDD3.equals(stringDD4)) {

				System.out.println(GetAmount_TitileDD24A + ":- PASS");
				test.log(LogStatus.PASS," Tax Amount:- " + GetAmount_TitileDD24A);

			} else {
				System.err.println(GetAmount_TitileDD24A + ":- FAIL");
				test.log(LogStatus.FAIL," Tax Amount:- " + GetAmount_TitileDD24A);

			}
			Thread.sleep(100);

			// Total Amount Payable
			String GetAmount_TitileDD25 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[2]/tr/td[1]/span/span"))
					.getText();
			if (GetAmount_Titile14.equals(GetAmount_TitileDD25)) {

				System.out.println(GetAmount_TitileDD25 + ":- PASS");
				test.log(LogStatus.PASS," Total Amount Payable:- " + GetAmount_TitileDD25);

			} else {
				System.err.println(GetAmount_TitileDD25 + ":- FAIL");
				test.log(LogStatus.FAIL," Total Amount Payable:- " + GetAmount_TitileDD25);

			}
			String GetAmount_TitileDD25A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']"))
					.getText();
			if (GetAmount_Titile14A.equals(GetAmount_TitileDD25A)) {

				System.out.println(GetAmount_TitileDD25A + ":- PASS");
				test.log(LogStatus.PASS," Total Amount Payable:- " + GetAmount_TitileDD25A);

			} else {
				System.err.println(GetAmount_TitileDD25A + ":- FAIL");
				test.log(LogStatus.FAIL," Total Amount Payable:- " + GetAmount_TitileDD25A);

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
				test.log(LogStatus.PASS, " Click on the Continue Button" + selectPaymentMode_SavePaymentMode);

			} else {

				System.err.println("Not Click on the Continue");
				Thread.sleep(500);
				test.log(LogStatus.FAIL,
						" Test Case Failed-Click on the Continue Button" + selectPaymentMode_SavePaymentMode);

			}

			for (int row5 = 1; row5 < totalNoOfRows5; row5++) {

				String DemandDraft_Number_Enter = sh5.getCell(0, row5).getContents();
				System.out.println("DemandDraft_Number_Enter " + DemandDraft_Number_Enter);
				Add_Log.info("DemandDraft_Number_Enter" + DemandDraft_Number_Enter);

				String DDDate_Enter = sh5.getCell(1, row5).getContents();
				System.out.println("DDDate_Enter " + DDDate_Enter);
				Add_Log.info("DDDate_Enter" + DDDate_Enter);

				String BankName_DD_Enter = sh5.getCell(2, row5).getContents();
				System.out.println("BankName_DD_Enter" + BankName_DD_Enter);
				Add_Log.info("BankName_DD_Enter" + BankName_DD_Enter);

				String DemandDraft_Number2_Enter = sh5.getCell(3, row5).getContents();
				System.out.println("DemandDraft_Number2_Enter " + DemandDraft_Number2_Enter);
				Add_Log.info("DemandDraft_Number2_Enter" + DemandDraft_Number2_Enter);

				String DDDate2_Enter = sh5.getCell(4, row5).getContents();
				System.out.println("DDDate2_Enter " + DDDate2_Enter);
				Add_Log.info("DDDate2_Enter" + DDDate2_Enter);

				String BankName_DD2_Enter = sh5.getCell(5, row5).getContents();
				System.out.println("BankName_DD2_Enter " + BankName_DD2_Enter);
				Add_Log.info("BankName_DD2_Enter" + BankName_DD2_Enter);
				String Broker_Account_Enter = sh5.getCell(6, row5).getContents();
				System.out.println("Broker_Account_Enter " + Broker_Account_Enter);
				Add_Log.info("Broker_Account_Enter" + Broker_Account_Enter);

				String PANNumber_Enter = sh5.getCell(7, row5).getContents();
				System.out.println("PANNumber_Enter " + PANNumber_Enter);
				Add_Log.info("PANNumber_Enter" + PANNumber_Enter);

				String Residential_Enter = sh5.getCell(8, row5).getContents();
				System.out.println("Residential_Enter " + Residential_Enter);
				Add_Log.info("Residential_Enter" + Residential_Enter);

				String Location_Enter = sh5.getCell(9, row5).getContents();
				System.out.println("Location_Enter " + Location_Enter);
				Add_Log.info("Location_Enter" + Location_Enter);

				String Nationality_Enter = sh5.getCell(10, row5).getContents();
				System.out.println("Nationality_Enter" + Nationality_Enter);
				Add_Log.info("Nationality_Enter" + Nationality_Enter);

				String Country_Name_Enter = sh5.getCell(11, row5).getContents();
				System.out.println("Country_Name_Enter " + Country_Name_Enter);
				Add_Log.info("Country_Name_Enter" + Country_Name_Enter);

				String Contact_Number_Enter = sh5.getCell(12, row5).getContents();
				System.out.println("Contact_Number_Enter " + Contact_Number_Enter);
				Add_Log.info("Contact_Number_Enter" + Contact_Number_Enter);

				// ************************* Update Details Tax Amount ***********************//

				ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
				System.out.println(" Click on the Tax_Amount Button");
				Thread.sleep(1000);

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
				test.log(LogStatus.PASS, " Click on the Tax_Amount Button close " + selectPaymentMode_SavePaymentMode);

				Thread.sleep(2000);
				// ******** Verify Tax Amount Value DD******//

				// Quantity
				String GetAmount_TitileDD32 = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
						.getText();
				if (GetAmount_Titile11.equals(GetAmount_TitileDD32)) {

					System.out.println(GetAmount_TitileDD32 + ":- PASS");
					test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileDD32);

				} else {
					System.err.println(GetAmount_TitileDD32 + ":- FAIL");
					test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileDD32);

				}

				String GetAmount_TitileDD32A = driver.findElement(By.xpath("//*[@id='ID_UpdateDetails_Quantity']"))
						.getText();
				if (GetAmount_Titile11A.equals(GetAmount_TitileDD32A)) {

					System.out.println(GetAmount_TitileDD32A + ":- PASS");
					test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileDD32A);

				} else {
					System.err.println(GetAmount_TitileDD32A + ":- FAIL");
					test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileDD32A);

				}
				Thread.sleep(100);

				// Exercise Amount
				String GetAmount_TitileDD33 = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/p"))
						.getText();
				if (GetAmount_Titile12.equals(GetAmount_TitileDD33)) {

					System.out.println(GetAmount_TitileDD33 + ":- PASS");
					test.log(LogStatus.PASS," Exercise Amount:- " + GetAmount_TitileDD33);

				} else {
					System.err.println(GetAmount_TitileDD33 + ":- FAIL");
					test.log(LogStatus.FAIL," Exercise Amount:- " + GetAmount_TitileDD33);

				}

				String GetAmount_TitileDD33A = driver
						.findElement(By.xpath("//*[@id='ID_UpdateDetails_ExerciseAmount']")).getText();

				if (GetAmount_Titile12A.equals(GetAmount_TitileDD33A)) {

					System.out.println(GetAmount_TitileDD33A + ":- PASS");
					test.log(LogStatus.PASS," Exercise Amount:- " + GetAmount_TitileDD33A);

				} else {
					System.err.println(GetAmount_TitileDD33A + ":- FAIL");
					test.log(LogStatus.FAIL," Exercise Amount:- " + GetAmount_TitileDD33A);

				}
				Thread.sleep(100);

				// Tax Amount
				String GetAmount_TitileDD34 = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
						.getText();
				String stringDD5 = new String(GetAmount_Titile13);
				String stringDD6 = new String(GetAmount_TitileDD34);

				if (stringDD5.equals(stringDD6)) {

					System.out.println(GetAmount_TitileDD34 + ":- PASS");
					test.log(LogStatus.PASS," Tax Amount:- " + GetAmount_TitileDD34);

				} else {
					System.err.println(GetAmount_TitileDD34 + ":- FAIL");
					test.log(LogStatus.FAIL," Tax Amount:- " + GetAmount_TitileDD34);

				}

				String GetAmount_TitileDD34A = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[2]/ul/li/p"))
						.getText();
				String stringDD7 = new String(GetAmount_Titile13A);
				String stringDD8 = new String(GetAmount_TitileDD34A);
				System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileDD34A);

				if (stringDD7.equals(stringDD8)) {

					System.out.println(GetAmount_TitileDD34A + ":- PASS");
					test.log(LogStatus.PASS," Tax Amount:- " + GetAmount_TitileDD34A);

				} else {
					System.err.println(GetAmount_TitileDD34A + ":- FAIL");
					test.log(LogStatus.FAIL," Tax Amount:- " + GetAmount_TitileDD34A);

				}
				Thread.sleep(100);

				// Total Amount Payable
				String GetAmount_TitileDD35 = driver.findElement(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[2]/tr/td[1]/h4"))
						.getText();
				if (GetAmount_Titile14.equals(GetAmount_TitileDD35)) {

					System.out.println(GetAmount_TitileDD35 + ":- PASS");
					test.log(LogStatus.PASS,"  Total Amount Payable:- " + GetAmount_TitileDD35);

				} else {
					System.err.println(GetAmount_TitileDD35 + ":- FAIL");
					test.log(LogStatus.FAIL,"  Total Amount Payable:- " + GetAmount_TitileDD35);

				}
				String GetAmount_TitileDD35A = driver
						.findElement(By.xpath("//*[@id='ID_UpdateDetails_TotalAmountPayable']")).getText();
				if (GetAmount_Titile14A.equals(GetAmount_TitileDD35A)) {

					System.out.println(GetAmount_TitileDD35A + ":- PASS");
					test.log(LogStatus.PASS,"  Total Amount Payable:- " + GetAmount_TitileDD35A);

				} else {
					System.err.println(GetAmount_TitileDD35A + ":- FAIL");
					test.log(LogStatus.FAIL,"  Total Amount Payable:- " + GetAmount_TitileDD35A);

				}
				Thread.sleep(100);

				// ****************************************************************************//
				Thread.sleep(2000);

				Boolean DemandDraft_Number = driver.findElements(By.xpath(
						"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/input"))
						.size() != 0;
				System.out.println(" Demand Draft Number =" + DemandDraft_Number);
				if (DemandDraft_Number == true) {

					ExerciseNow_Locator.DemandDraft_Number(driver).sendKeys(DemandDraft_Number_Enter);
					System.out.println("Enter Demand Draft Number");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, " Enter Demand Draft Numbers" + DemandDraft_Number);

					WebElement DDDate = driver.findElement(By.id("ID_UpdateDetails_DDDate"));
					if (DDDate.isEnabled()) {

						ExerciseNow_Locator.DDDate1(driver).clear();
						ExerciseNow_Locator.DDDate1(driver).sendKeys(DDDate_Enter);
						System.out.println("Enter Date");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Date " + DDDate_Enter);

					} else {

						System.err.println("Date Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "  Test Case Failed - Date Disable" + DDDate_Enter);

					}

					WebElement BankName_DD = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div/input"));
					if (BankName_DD.isEnabled()) {

						ExerciseNow_Locator.BankName_DD1(driver).clear();
						ExerciseNow_Locator.BankName_DD1(driver).sendKeys(BankName_DD_Enter);
						System.out.println("Enter Bank Name DD");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Bank Name DD " + BankName_DD);

					} else {

						System.err.println("Bank Name DD Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "  Test Case Failed - Bank Name DD Disable" + BankName_DD);

					}

					WebElement DemandDraft_Number2 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[1]/div/input"));
					if (DemandDraft_Number2.isEnabled()) {

						ExerciseNow_Locator.DemandDraft_Number2(driver).clear();
						ExerciseNow_Locator.DemandDraft_Number2(driver).sendKeys(DemandDraft_Number2_Enter);
						System.out.println("Enter Demand Draft Number2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Demand Draft Number2 " + DemandDraft_Number2);

					} else {

						System.err.println(" Demand Draft Number2 Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL,
								"  Test Case Failed - Demand Draft Number2 Disable" + DemandDraft_Number2);

					}

					WebElement DDDate2 = driver.findElement(By.id("ID_UpdateDetails_DDDatePre"));
					if (DDDate2.isEnabled()) {

						ExerciseNow_Locator.DDDate2(driver).clear();
						ExerciseNow_Locator.DDDate2(driver).sendKeys(DDDate2_Enter);
						System.out.println("Enter Date2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Date2 " + DDDate2_Enter);

					} else {

						System.err.println("Date2 Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Enter Date2 " + DDDate2_Enter);

					}
					WebElement BankName_DD2 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/input"));
					if (BankName_DD2.isEnabled()) {

						ExerciseNow_Locator.BankName_DD2(driver).clear();
						ExerciseNow_Locator.BankName_DD2(driver).sendKeys(BankName_DD2_Enter);
						System.out.println("Enter Bank Name DD");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Bank Name DD " + BankName_DD2);

					} else {

						System.err.println("Bank Name DD Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Bank Name DD Disable " + BankName_DD2);

					}

					Boolean Broker_Account = driver.findElements(By.id("ID_UpdateDetails_BrokerAccount")).size() != 0;
					System.out.println(" Broker_Account " + Broker_Account);
					if (Broker_Account == true) {

						String BrokerAccount_Enter1 = driver.findElement(By.id("ID_UpdateDetails_BrokerAccount"))
								.getText();
						System.out.println("= " + BrokerAccount_Enter1);
						Thread.sleep(2000);

						driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")).click();
						Thread.sleep(1000);
						test.log(LogStatus.PASS, " Test Case Failed -Enter Broker_Account:-" + BankName_DD2);

						Select BrokerAccount = new Select(driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")));
						BrokerAccount.selectByVisibleText(BrokerAccount_Enter1);
						Thread.sleep(2000);
					} else {

						System.err.println("Not Enter Broker_Account ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Broker_Account:-" + BankName_DD2);

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
						test.log(LogStatus.PASS, " DematAccount_Enter:-" + DematAccount_Enter2);

					} else {

						System.err.println("Demat Account Not Available  ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL,
								" Test Case Failed- Demat Account Not Available :-" + DematAccount_Enter2);

					}
					WebElement PANNumber_DD = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
					if (PANNumber_DD.isEnabled()) {

						ExerciseNow_Locator.PANNumber_DD1(driver).clear();
						ExerciseNow_Locator.PANNumber_DD1(driver).sendKeys(PANNumber_Enter);
						System.out.println("Enter PAN Number");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter PAN Number:-" + PANNumber_DD);

					} else {

						System.err.println("PAN Number Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Test Case Failed-PAN Number Disable:-" + PANNumber_DD);

					}

					WebElement Residential_DD = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
					if (Residential_DD.isEnabled()) {

						ExerciseNow_Locator.Residential_DD1(driver).clear();
						ExerciseNow_Locator.Residential_DD1(driver).sendKeys(Residential_Enter);
						System.out.println("Enter Residential_Status");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter Residential_Status:-" + Residential_DD);

					} else {

						System.err.println("Residential Status Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Test Case Failed- Enter Residential_Status:-" + Residential_DD);

					}

					WebElement LocationDD = driver.findElement(By.id("ID_UpdateDetails_Location"));
					if (LocationDD.isEnabled()) {

						ExerciseNow_Locator.Location_DD1(driver).clear();
						ExerciseNow_Locator.Location_DD1(driver).sendKeys(Location_Enter);
						System.out.println("Enter Location");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter Location:-" + LocationDD);

					} else {

						System.err.println("Location Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Test Case Failed- Enter Location:-" + LocationDD);

					}

					WebElement NationalityDD = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
					if (NationalityDD.isEnabled()) {

						ExerciseNow_Locator.Nationality_DD1(driver).clear();
						ExerciseNow_Locator.Nationality_DD1(driver).sendKeys(Nationality_Enter);
						System.out.println("Enter Nationality");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Nationality Disable:-" + NationalityDD);

					} else {

						System.err.println("Nationality Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Test Case Failed- Nationality Disable:-" + NationalityDD);

					}

					WebElement Country_Name_DD = driver.findElement(By.id("ID_MyProfile_Country"));
					if (Country_Name_DD.isEnabled()) {

						driver.findElement(By.id("ID_MyProfile_Country")).click();
						Select Country_Name_DD1 = new Select(driver.findElement(By.id("ID_MyProfile_Country")));
						Country_Name_DD1.selectByVisibleText(Country_Name_Enter);
						System.out.println("Enter Country_Name");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter Country_Name:-" + Country_Name_DD);

					} else {

						System.err.println("Country_Name Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Country_Name Disable:-" + Country_Name_DD);

					}

					WebElement Contact_NumberDD = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
					if (Contact_NumberDD.isEnabled()) {

						ExerciseNow_Locator.Contact_Number_DD1(driver).clear();
						ExerciseNow_Locator.Contact_Number_DD1(driver).sendKeys(Contact_Number_Enter);
						System.out.println("Enter Contact_Number");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter Contact_Number:-" + Contact_NumberDD);

					} else {

						System.err.println("Contact_Number Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Test Case Failed- Contact_Number Disable:-" + Contact_NumberDD);

					}

					jse.executeScript("window.scrollBy(0,-1050)");

					Thread.sleep(3000);
					ExerciseNow_Locator.UpdateDetailscheckbox(driver).click();
					System.out.println("Enter on the Update Details checkbox");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "Enter on the Update Details checkbox");

					WebElement UpdateDetails_Confirm = driver.findElement(By.id("ID_UpdateDetails_Confirm"));
					if (UpdateDetails_Confirm.isEnabled()) {

						Boolean UpdateDetails_Confirm2 = driver.findElements(By.id("ID_UpdateDetails_Confirm"))
								.size() != 0;
						System.out.println(" UpdateDExercisedSubmitDownloadetails_Confirm2 =" + UpdateDetails_Confirm2);
						if (UpdateDetails_Confirm2 == true) {

							Thread.sleep(2000);
							ExerciseNow_Locator.UpdateDetails_Confirm2(driver).sendKeys(Keys.ENTER);
							System.out.println("Click on the UpdateDetails_Confirm2 Button");
							Thread.sleep(3000);
							test.log(LogStatus.PASS,
									"Click on the UpdateDetails_Confirm2 Button:-" + UpdateDetails_Confirm2);

							ExerciseNow_Locator.UpdateDetails_ConfirmPopUp(driver).sendKeys(Keys.ENTER);
							System.out.println("Click on the UpdateDetails Confirm PopUp Button");
							Thread.sleep(2000);
							test.log(LogStatus.PASS,
									"Click on the UpdateDetails Confirm PopUp Button:-" + UpdateDetails_Confirm2);

							if (InstrumentName.equals("VerifyInProcess_Card")) {

								Boolean Exerciese_Options2 = driver.findElements(By.linkText("Exercise Options"))
										.size() != 0;
								System.out.println(" Exerciese_Options2 =" + Exerciese_Options2);
								if (Exerciese_Options2 == true) {

									ExerciseNow_Locator.Exerciese_Options(driver).click();
									System.out.println(" Click on the Exerciese Options ");
									Thread.sleep(500);
									test.log(LogStatus.PASS, " Click on the Exerciese Options :-" + Exerciese_Options2);

								} else {

									System.err.println("Not Click on the Exerciese_Options ");
									Thread.sleep(500);
									test.log(LogStatus.PASS, " Test Case Failed-Not Click on the Exerciese_Options :-"
											+ Exerciese_Options2);

								}
								Thread.sleep(5000);

								int Get_Status = driver.findElements(By.className("btn-link2")).size();
								System.out.println(Get_Status + "");
								for (int Index = 1; Index <= Get_Status; Index++) {

									Boolean Get_Status4 = driver
											.findElements(
													By.xpath("//div[" + Index + "]//div/div[2]/div/div/button/span"))
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
							// ************************* Verify Tax Amount Value DD***********************//

							// Quantity
							String GetAmount_TitileDD42 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
									.getText();
							if (GetAmount_Titile11.equals(GetAmount_TitileDD42)) {

								System.out.println(GetAmount_TitileDD42 + ":- PASS");
								test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileDD42);

							} else {
								System.err.println(GetAmount_TitileDD42 + ":- FAIL");
								test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileDD42);

							}

							String GetAmount_TitileDD42A = driver
									.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedQuantity']")).getText();
							System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileDD42A);

							if (GetAmount_Titile11A.equals(GetAmount_TitileDD42A)) {

								System.out.println(GetAmount_TitileDD42A + ":- PASS");
								test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileDD42A);

							} else {
								System.err.println(GetAmount_TitileDD42A + ":- FAIL");
								test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileDD42A);

							}
							Thread.sleep(100);

							// Exercise Amount
							String GetAmount_TitileDD43 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
									.getText();
							if (GetAmount_Titile12.equals(GetAmount_TitileDD43)) {

								System.out.println(GetAmount_TitileDD43 + ":- PASS");

								test.log(LogStatus.PASS,"  Exercise Amount:- " + GetAmount_TitileDD43);

							} else {
								System.err.println(GetAmount_TitileDD43 + ":- FAIL");
								test.log(LogStatus.FAIL,"  Exercise Amount:- " + GetAmount_TitileDD43);

							}

							String GetAmount_TitileDD43A = driver
									.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']")).getText();

							if (GetAmount_Titile12A.equals(GetAmount_TitileDD43A)) {

								System.out.println(GetAmount_TitileDD43A + ":- PASS");
								test.log(LogStatus.PASS,"  Exercise Amount:- " + GetAmount_TitileDD43A);

							} else {
								System.err.println(GetAmount_TitileDD43A + ":- FAIL");
								test.log(LogStatus.FAIL,"  Exercise Amount:- " + GetAmount_TitileDD43A);

							}
							Thread.sleep(100);

							// Tax Amount
							String GetAmount_TitileDD44 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
									.getText();
							String stringDD9 = new String(GetAmount_Titile13);
							String stringDD10 = new String(GetAmount_TitileDD44);

							if (stringDD9.equals(stringDD10)) {

								System.out.println(GetAmount_TitileDD44 + ":- PASS");
								test.log(LogStatus.PASS,"  Tax Amount:- " + GetAmount_TitileDD44);

							} else {
								System.err.println(GetAmount_TitileDD44 + ":- FAIL");
								test.log(LogStatus.FAIL,"  Tax Amount:- " + GetAmount_TitileDD44);

							}

							String GetAmount_TitileDD44A = driver
									.findElement(By.xpath("//*[@id='ID_DeclarationForm_TaxAmount']")).getText();
							String stringDD11 = new String(GetAmount_Titile13A);
							String stringDD12 = new String(GetAmount_TitileDD44A);
							System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileDD44A);

							if (stringDD11.equals(stringDD12)) {

								System.out.println(GetAmount_TitileDD44A + ":- PASS");
								test.log(LogStatus.PASS,"  Tax Amount:- " + GetAmount_TitileDD44A);

							} else {
								System.err.println(GetAmount_TitileDD44A + ":- FAIL");
								test.log(LogStatus.FAIL,"  Tax Amount:- " + GetAmount_TitileDD44A);

							}
							Thread.sleep(100);

							// Total Amount Payable
							String GetAmount_TitileDD45 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
									.getText();
							if (GetAmount_Titile14.equals(GetAmount_TitileDD45)) {

								System.out.println(GetAmount_TitileDD45 + ":- PASS");
								test.log(LogStatus.PASS," Total Amount Payable:- " + GetAmount_TitileDD45);

							} else {
								System.err.println(GetAmount_TitileDD45 + ":- FAIL");
								test.log(LogStatus.FAIL," Total Amount Payable:- " + GetAmount_TitileDD45);

							}
							String GetAmount_TitileDD45A = driver
									.findElement(By.xpath("//*[@id='ID_DeclarationForm_TotalAmntPayable']")).getText();
							if (GetAmount_Titile14A.equals(GetAmount_TitileDD45A)) {

								System.out.println(GetAmount_TitileDD45A + ":- PASS");
								test.log(LogStatus.PASS," Total Amount Payable:- " + GetAmount_TitileDD45A);

							} else {
								System.err.println(GetAmount_TitileDD45A + ":- FAIL");
								test.log(LogStatus.FAIL," Total Amount Payable:- " + GetAmount_TitileDD45A);

							}
							Thread.sleep(100);

							// ****************************************************************************//
						}

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

								test.log(LogStatus.PASS, "Click on the Payment checkbox Button:-" + Payment_checkbox);
								Thread.sleep(1000);

								Boolean ExercisedSubmitDownload1 = driver
										.findElements(By.id("ID_DeclarationForm_ExercisedSubmitDownload")).size() != 0;
								System.out.println("ExercisedSubmitDownload = " + ExercisedSubmitDownload1);
								test.log(LogStatus.PASS,
										"Click on the Exercised Submit Download:-" + ExercisedSubmitDownload1);

								if (ExercisedSubmitDownload1 == true) {

									ExerciseNow_Locator.ExercisedSubmitDownload(driver).click();
									System.out.println("Click on the Exercise Declaration");
									test.log(LogStatus.PASS,
											"Click on the Exercise Declaration:-" + ExercisedSubmitDownload1);

									Boolean Upload_Form = driver.findElements(By.id("pr-custom-file-input"))
											.size() != 0;
									System.out.println("Upload_Form" + Upload_Form);
									test.log(LogStatus.PASS, " Upload_Form:-" + Upload_Form);

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
												System.out.println(" Click on the Exerciese Options ");
												Thread.sleep(500);
												test.log(LogStatus.PASS,
														"Click on the Exerciese Options:-" + Exerciese_Options3);

											} else {

												System.err.println(" Not Click on the Exerciese_Options ");
												Thread.sleep(500);
												test.log(LogStatus.FAIL,
														"Not Click on the Exerciese_Options:-" + Exerciese_Options3);

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
										System.out.println(" Click on the Tax_Amount Button ");
										Thread.sleep(1000);
										test.log(LogStatus.PASS, " Click on the Tax_Amount Button ");

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
										test.log(LogStatus.PASS, " Click on the Tax_Amount Button close ");

										Thread.sleep(3000);
										// ***************** Verify Tax Amount Value DD *******//
										// Quantity

										String GetAmount_TitileDD52 = driver.findElement(By.xpath(
												"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
												.getText();
										if (GetAmount_Titile11.equals(GetAmount_TitileDD52)) {

											System.out.println(GetAmount_TitileDD52 + ":- PASS");
											test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileDD52);

										} else {
											System.err.println(GetAmount_TitileDD52 + ":- FAIL");
											test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileDD52);

										}

										String GetAmount_TitileDD52A = driver
												.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']"))
												.getText();
										System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileDD52A);

										if (GetAmount_Titile11A.equals(GetAmount_TitileDD52A)) {

											System.out.println(GetAmount_TitileDD52A + ":- PASS");
											test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileDD52A);

										} else {
											System.err.println(GetAmount_TitileDD52A + ":- FAIL");
											test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileDD52A);

										}
										Thread.sleep(100);

										// Exercise Amount
										String GetAmount_TitileDD53 = driver.findElement(By.xpath(
												"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
												.getText();
										if (GetAmount_Titile12.equals(GetAmount_TitileDD53)) {

											System.out.println(GetAmount_TitileDD53 + ":- PASS");
											test.log(LogStatus.PASS," Exercise Amount:- " + GetAmount_TitileDD53);

										} else {
											System.err.println(GetAmount_TitileDD53 + ":- FAIL");
											test.log(LogStatus.FAIL," Exercise Amount:- " + GetAmount_TitileDD53);

										}

										String GetAmount_TitileDD53A = driver
												.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']"))
												.getText();

										if (GetAmount_Titile12A.equals(GetAmount_TitileDD53A)) {

											System.out.println(GetAmount_TitileDD53A + ":- PASS");
											test.log(LogStatus.PASS," Exercise Amount:- " + GetAmount_TitileDD53A);

										} else {
											System.err.println(GetAmount_TitileDD53A + ":- FAIL");
											test.log(LogStatus.FAIL," Exercise Amount:- " + GetAmount_TitileDD53A);

										}
										Thread.sleep(100);

										// Tax Amount
										String GetAmount_TitileDD54 = driver.findElement(By.xpath(
												"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
												.getText();
										String stringDD13 = new String(GetAmount_Titile13);
										String stringDD14 = new String(GetAmount_TitileDD54);

										if (stringDD13.equals(stringDD14)) {

											System.out.println(GetAmount_TitileDD54 + ":- PASS");
											test.log(LogStatus.PASS," Tax Amount:- " + GetAmount_TitileDD54);

										} else {
											System.err.println(GetAmount_TitileDD54 + ":- FAIL");
											test.log(LogStatus.FAIL," Tax Amount:- " + GetAmount_TitileDD54);

										}

										String GetAmount_TitileDD54A = driver
												.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
												.getText();
										String stringDD15 = new String(GetAmount_Titile13A);
										String stringDD16 = new String(GetAmount_TitileDD54A);
										System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileDD54A);

										if (stringDD15.equals(stringDD16)) {

											System.out.println(GetAmount_TitileDD54A + ":- PASS");
											test.log(LogStatus.PASS," Tax Amount:- " + GetAmount_TitileDD54A);

										} else {
											System.err.println(GetAmount_TitileDD54A + ":- FAIL");
											test.log(LogStatus.FAIL," Tax Amount:- " + GetAmount_TitileDD54A);

											
										}
										Thread.sleep(100);

										// Total Amount Payable
										String GetAmount_TitileDD56 = driver.findElement(By.xpath(
												"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
												.getText();
										if (GetAmount_Titile14.equals(GetAmount_TitileDD56)) {

											System.out.println(GetAmount_TitileDD56 + ":- PASS");
											test.log(LogStatus.PASS," Total Amount Payable:- " + GetAmount_TitileDD56);

										} else {
											System.err.println(GetAmount_TitileDD56 + ":- FAIL");
											test.log(LogStatus.FAIL," Total Amount Payable:- " + GetAmount_TitileDD56);

										}
										String GetAmount_TitileDD56A = driver
												.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']"))
												.getText();
										if (GetAmount_Titile14A.equals(GetAmount_TitileDD56A)) {

											System.out.println(GetAmount_TitileDD56A + ":- PASS");
											test.log(LogStatus.PASS," Total Amount Payable:- " + GetAmount_TitileDD56A);

										} else {
											System.err.println(GetAmount_TitileDD56A + ":- FAIL");
											test.log(LogStatus.FAIL," Total Amount Payable:- " + GetAmount_TitileDD56A);

										}
										Thread.sleep(1000);

										Boolean ViewExercise_Form = driver
												.findElements(By.className("download-form-wrap")).size() != 0;
										System.out.println("ExercisedSubmitDownload = " + ExercisedSubmitDownload1);

										if (ViewExercise_Form == true) {

											ExerciseNow_Locator.ViewExercise_Form_Click(driver).click();
											System.out.println("Click on the View Exercise Form");
											test.log(LogStatus.PASS,
													" Click on the View Exercise Form :-" + ViewExercise_Form);

											Thread.sleep(5000);

											Boolean Download_Button_ExerciseForm = driver
													.findElements(By.className("download-form-wrap")).size() != 0;
											System.out.println(
													"Download_Button_ExerciseForm = " + Download_Button_ExerciseForm);
											test.log(LogStatus.PASS,
													" Download_Button_ExerciseForm:-" + Download_Button_ExerciseForm);

											if (Download_Button_ExerciseForm == true) {

												ExerciseNow_Locator.Download_ButtonClick_ExerciseForm(driver).click();
												System.out.println("Click on the Download_Button_ExerciseForm");
												Thread.sleep(5000);
												test.log(LogStatus.PASS, "Click on the Download_Button_ExerciseForm:-"
														+ Download_Button_ExerciseForm);

												Boolean Click_toBrowse = driver
														.findElements(By.className("download-form-wrap")).size() != 0;
												System.out.println("Click to Browse = " + Click_toBrowse);
												test.log(LogStatus.PASS, " Click to Browse:-" + Click_toBrowse);

												if (Click_toBrowse == true) {

													ExerciseNow_Locator.Click_toBrowse(driver).click();
													System.out.println("Click_to Browse");
													test.log(LogStatus.PASS, " Click_to Browse:-" + Click_toBrowse);

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
													test.log(LogStatus.PASS, " Click_to Button :-");

													Boolean selectPaymentMode_SavePaymentMode1 = driver
															.findElements(By.id("selectPaymentMode_SavePaymentMode"))
															.size() != 0;
													System.out.println("selectPaymentMode_SavePaymentMode = "
															+ selectPaymentMode_SavePaymentMode1);
													test.log(LogStatus.PASS, " selectPaymentMode_SavePaymentMode :-");

													if (selectPaymentMode_SavePaymentMode1 == true) {

														ExerciseNow_Locator.selectPaymentMode_SavePaymentMode(driver)
																.click();
														System.out
																.println("Click_to selectPaymentMode_SavePaymentMode");
														Thread.sleep(5000);
														test.log(LogStatus.PASS,
																" Click_to selectPaymentMode_SavePaymentMode:-"
																		+ selectPaymentMode_SavePaymentMode1);

														Boolean selectPaymentMode_alert1 = driver.findElements(By.xpath(
																"//*[@id='alert-exercise-success-modal']/div/div"))
																.size() != 0;
														System.out.println(
																"selectPaymentMode_alert= " + selectPaymentMode_alert1);
														test.log(LogStatus.PASS, " selectPaymentMode_alert:-"
																+ selectPaymentMode_alert1);

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
															test.log(LogStatus.FAIL, " " + GetText);

															if (GetText.equals("File is not Successfully upload")) {

																driver.findElement(By.xpath(
																		"//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"))
																		.click();
																System.err.println(".....Fail");
																test.log(LogStatus.FAIL, ".....Fail ");

																break;
															} else {

																System.out.println("File is Successfully upload");
																test.log(LogStatus.PASS,
																		" File is Successfully upload:-"
																				+ selectPaymentMode_alert1);

																Thread.sleep(5000);

																Boolean Acknowledgement_IntiateExercise1 = driver
																		.findElements(By.id(
																				"ID_Acknowledgement_IntiateExercise"))
																		.size() != 0;
																System.out.println("Acknowledgement_IntiateExercise = "
																		+ Acknowledgement_IntiateExercise1);
																test.log(LogStatus.PASS,
																		" Acknowledgement_IntiateExercise :-"
																				+ Acknowledgement_IntiateExercise1);

																if (Acknowledgement_IntiateExercise1 == true) {

																	ExerciseNow_Locator
																			.Acknowledgement_IntiateExercise(driver)
																			.click();
																	System.out.println(
																			"Click_to Acknowledgement_IntiateExercise");

																	Thread.sleep(5000);
																	test.log(LogStatus.PASS,
																			" Click to Acknowledgement IntiateExercise:-"
																					+ Acknowledgement_IntiateExercise1);

																} else {

																	System.err.println(
																			"No Click to Acknowledgement_IntiateExercise");
																	test.log(LogStatus.FAIL,
																			" No Click to Acknowledgement_IntiateExercise:-"
																					+ Acknowledgement_IntiateExercise1);

																}
															}

															System.out.println("Select Payment Alert");
															test.log(LogStatus.PASS,
																	" Select Payment Alert:-" + GetText);

														}
													} else {

														System.err.println(
																"No Click to selectPaymentMode_SavePaymentMode");
														test.log(LogStatus.FAIL,
																" Test Case Failed:-No Click to selectPaymentMode_SavePaymentMode"
																		+ selectPaymentMode_SavePaymentMode1);

													}

												} else {

													System.err.println("No Click to Ok Button");
													test.log(LogStatus.FAIL,
															" Test Case Failed:-No Click to Ok Button ");

												}
											}

										} else {

											System.err.println("Not click on the View Exercise Form");
											test.log(LogStatus.FAIL,
													" Test Case Failed:-Not click on the View Exercise Form ");

										}
									} else {

										System.err.println("ExercisedSubmitDownload Disable");
										Thread.sleep(5000);

										Boolean Acknowledgement_IntiateExercise1 = driver
												.findElements(By.id("ID_Acknowledgement_IntiateExercise")).size() != 0;

										if (Acknowledgement_IntiateExercise1 == true) {

											ExerciseNow_Locator.Acknowledgement_IntiateExercise(driver).click();
											System.out.println("Click_to Acknowledgement_IntiateExercise");

											Thread.sleep(5000);
											test.log(LogStatus.PASS, " Click_to Acknowledgement_IntiateExercise:-"
													+ Acknowledgement_IntiateExercise1);

										} else {

											System.err.println("No Click to Acknowledgement_IntiateExercise");
											test.log(LogStatus.FAIL,
													" Test Case Failed:-No Click to Acknowledgement_IntiateExercise"
															+ Acknowledgement_IntiateExercise1);

										}

									}

								}
							}

							Thread.sleep(1000);

						}

					} else {

						System.err.println("UpdateDetails_Confirm Disable");
						test.log(LogStatus.FAIL,
								" Test Case Failed:- UpdateDetails_Confirm Disable" + UpdateDetails_Confirm);

					}
				} else {

					System.err.println("Not Enter Demand Draft Number");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Test Case Failed:-Not Enter Demand Draft Number" + DemandDraft_Number);

				}
			}

		} else {

			System.err.println("Not Click on SelectPaymentMode");
			Thread.sleep(500);
			test.log(LogStatus.FAIL, " Test Case Failed:-Not Click on SelectPaymentMode" + SelectPaymentModeDD);

		}

	}
}