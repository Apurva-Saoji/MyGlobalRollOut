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

public class RTGS_PaymentMode extends ExerciseNow {

	public void Exercise_Now(HSSFSheet sheet4, HSSFSheet sheet5, HSSFSheet sheet6, HSSFSheet sheet7, HSSFSheet sheet8,
			HSSFRow rowhead500, HSSFRow rowhead600, HSSFRow rowhead700, HSSFRow rowhead800, String GetAmount_Titile11,
			String GetAmount_Titile11A, String GetAmount_Titile12, String GetAmount_Titile12A,
			String GetAmount_Titile13, String GetAmount_Titile13A, String GetAmount_Titile14,
			String GetAmount_Titile14A, String InstrumentName, String CompanyID, String User, String GetInstrumnetValue)
			throws Exception {

		test = report.startTest("Exerciese RTGS Payment Mode");

		String filepath = System.getProperty("user.dir") + "\\src\\Excels\\ExercieseOptions.xls";
		FileInputStream Exfile = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(Exfile);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Sheet sh7 = wb.getSheet("RTGS");
		int totalNoOfRows7 = sh7.getRows();

		System.out.println("Total number of rows are : " + totalNoOfRows7);
		Add_Log.info("Total number of rows are : " + totalNoOfRows7);
		// To get the number of columns present in sheet

		System.out.println("Total number of columns are : " + totalNoOfRows7);
		Add_Log.info("Total number of columns are : " + totalNoOfRows7);

		Boolean SelectPaymentModeRTGS = driver.findElements(By.className("kt-portlet-table-adj")).size() != 0;
		System.out.println(" Select Payment Mode RTGS =" + SelectPaymentModeRTGS);
		if (SelectPaymentModeRTGS == true) {

			Thread.sleep(2000);

			ExerciseNow_Locator.selectPaymentMode_RTGS(driver).click();
			System.out.println("Click on the RTGS radio Button Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the RTGS radio Button Button " + SelectPaymentModeRTGS);

			ExerciseNow_Locator.selectPaymentModeRTGS_popUpClose(driver).click();
			System.out.println("Click on the select PaymentMode RTGS Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the select PaymentMode RTGS Button " + SelectPaymentModeRTGS);

			// ********** Select Payment Mode TaxAmount Tax Amount ********//

			ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
			System.out.println(" Click on the Tax_Amount Button");
			Thread.sleep(1000);
			test.log(LogStatus.PASS, " Click on the Tax_Amount Button " + SelectPaymentModeRTGS);

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
			test.log(LogStatus.PASS, " Click on the Tax_Amount Button close " + SelectPaymentModeRTGS);

			Thread.sleep(2000);
			// ********** Verify Tax Amount Value RTGS********//

			// Quantity
			String GetAmount_TitileRTGS22 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
					.getText();
			if (GetAmount_Titile11.equals(GetAmount_TitileRTGS22)) {

				System.out.println(GetAmount_TitileRTGS22 + ":- PASS");
				test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileRTGS22);

			} else {
				System.err.println(GetAmount_TitileRTGS22 + ":- FAIL");
				test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileRTGS22);

			}

			String GetAmount_TitileRTGS22A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']")).getText();
			if (GetAmount_Titile11A.equals(GetAmount_TitileRTGS22A)) {

				System.out.println(GetAmount_TitileRTGS22A + ":- PASS");
				test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileRTGS22A);

			} else {
				System.err.println(GetAmount_TitileRTGS22A + ":- FAIL");
				test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileRTGS22A);

			}
			Thread.sleep(100);

			// Exercise Amount
			String GetAmount_TitileRTGS23 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
					.getText();
			if (GetAmount_Titile12.equals(GetAmount_TitileRTGS23)) {

				System.out.println(GetAmount_TitileRTGS23 + ":- PASS");
				test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileRTGS23);

			} else {
				System.err.println(GetAmount_TitileRTGS23 + ":- FAIL");
				test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileRTGS23);

			}

			String GetAmount_TitileRTGS23A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseAmount']"))
					.getText();

			if (GetAmount_Titile12A.equals(GetAmount_TitileRTGS23A)) {

				System.out.println(GetAmount_TitileRTGS23A + ":- PASS");
				test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileRTGS23A);

			} else {
				System.err.println(GetAmount_TitileRTGS23A + ":- FAIL");
				test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileRTGS23A);

			}
			Thread.sleep(100);

			// Tax Amount
			String GetAmount_TitileRTGS24 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
					.getText();
			String stringRTGS1 = new String(GetAmount_Titile13);
			String stringRTGS2 = new String(GetAmount_TitileRTGS24);

			if (stringRTGS1.equals(stringRTGS2)) {

				System.out.println(GetAmount_TitileRTGS24 + ":- PASS");
				test.log(LogStatus.PASS, "  Tax Amount:- " + GetAmount_TitileRTGS24);

			} else {
				System.err.println(GetAmount_TitileRTGS24 + ":- FAIL");
				test.log(LogStatus.FAIL, "  Tax Amount:- " + GetAmount_TitileRTGS24);

			}

			String GetAmount_TitileRTGS24A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
					.getText();
			String stringRTGS3 = new String(GetAmount_Titile13A);
			String stringRTGS4 = new String(GetAmount_TitileRTGS24A);
			System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileRTGS24A);

			if (stringRTGS3.equals(stringRTGS4)) {

				System.out.println(GetAmount_TitileRTGS24A + ":- PASS");
				test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileRTGS24A);

			} else {
				System.err.println(GetAmount_TitileRTGS24A + ":- FAIL");
				test.log(LogStatus.FAIL, "  Tax Amount:- " + GetAmount_TitileRTGS24A);

			}
			Thread.sleep(100);

			// Total Amount Payable
			String GetAmount_TitileRTGS25 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[2]/tr/td[1]/span/span"))
					.getText();
			if (GetAmount_Titile14.equals(GetAmount_TitileRTGS25)) {

				System.out.println(GetAmount_TitileRTGS25 + ":- PASS");
				test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileRTGS25);

			} else {
				System.err.println(GetAmount_TitileRTGS25 + ":- FAIL");
				test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileRTGS25);

			}
			String GetAmount_TitileRTGS25A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']"))
					.getText();
			if (GetAmount_Titile14A.equals(GetAmount_TitileRTGS25A)) {

				System.out.println(GetAmount_TitileRTGS25A + ":- PASS");
				test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileRTGS25A);

			} else {
				System.err.println(GetAmount_TitileRTGS25A + ":- FAIL");
				test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileRTGS25A);

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
				test.log(LogStatus.PASS, " Click on the Continue Button " + selectPaymentMode_SavePaymentMode);

				for (int row7 = 1; row7 < totalNoOfRows7; row7++) {

					String RTGS_Number_Enter = sh7.getCell(0, row7).getContents();
					System.out.println("RTGS_Number_Enter" + RTGS_Number_Enter);
					Add_Log.info("RTGS_Number_Enter" + RTGS_Number_Enter);

					String RTGS_Bank_Name_Enter = sh7.getCell(1, row7).getContents();
					System.out.println("RTGS_Bank_Name_Enter" + RTGS_Bank_Name_Enter);
					Add_Log.info("RTGS_Bank_Name_Enter" + RTGS_Bank_Name_Enter);

					String RTGS_Bank_Branch_Enter = sh7.getCell(2, row7).getContents();
					System.out.println("RTGS_Bank_Branch_Enter" + RTGS_Bank_Branch_Enter);
					Add_Log.info("RTGS_Bank_Branch_Enter" + RTGS_Bank_Branch_Enter);

					String RTGS_Bank_Account_Number_Enter = sh7.getCell(3, row7).getContents();
					System.out.println("RTGS_Bank_Account_Number_Enter" + RTGS_Bank_Account_Number_Enter);
					Add_Log.info("RTGS_Bank_Account_Number_Enter" + RTGS_Bank_Account_Number_Enter);

					String RTGS_Date_Enter = sh7.getCell(4, row7).getContents();
					System.out.println("RTGS_Date_Enter" + RTGS_Date_Enter);
					Add_Log.info("RTGS_Date_Enter" + RTGS_Date_Enter);

					String RTGS_Number2_Enter = sh7.getCell(5, row7).getContents();
					System.out.println("RTGS_Number2_Enter" + RTGS_Number2_Enter);
					Add_Log.info("RTGS_Number2_Enter" + RTGS_Number2_Enter);

					String RTGS_Bank_Name2_Enter = sh7.getCell(6, row7).getContents();
					System.out.println("RTGS_Bank_Name2_Enter" + RTGS_Bank_Name2_Enter);
					Add_Log.info("RTGS_Bank_Name2_Enter" + RTGS_Bank_Name2_Enter);

					String RTGS_Bank_Branch2_Enter = sh7.getCell(7, row7).getContents();
					System.out.println("RTGS_Bank_Branch2_Enter" + RTGS_Bank_Branch2_Enter);
					Add_Log.info("RTGS_Bank_Branch2_Enter" + RTGS_Bank_Branch2_Enter);

					String RTGS_Bank_Account_Number2_Enter = sh7.getCell(8, row7).getContents();
					System.out.println("RTGS_Bank_Account_Number2_Enter" + RTGS_Bank_Account_Number2_Enter);
					Add_Log.info("RTGS_Bank_Account_Number2_Enter" + RTGS_Bank_Account_Number2_Enter);

					String RTGS_Date2_Enter = sh7.getCell(9, row7).getContents();
					System.out.println("RTGS_Date2_Enter" + RTGS_Date2_Enter);
					Add_Log.info("RTGS_Date2_Enter" + RTGS_Date2_Enter);

					String Broker_Account_Enter = sh7.getCell(10, row7).getContents();
					System.out.println("Broker_Account_Enter" + Broker_Account_Enter);
					Add_Log.info("Broker_Account_Enter" + Broker_Account_Enter);

					String PANNumber_Enter = sh7.getCell(11, row7).getContents();
					System.out.println("PANNumber_Enter" + PANNumber_Enter);
					Add_Log.info("PANNumber_Enter" + PANNumber_Enter);

					String Residential_Enter = sh7.getCell(12, row7).getContents();
					System.out.println("Residential_Enter" + Residential_Enter);
					Add_Log.info("Residential_Enter" + Residential_Enter);

					String Location_Enter = sh7.getCell(13, row7).getContents();
					System.out.println("Location_Enter" + Location_Enter);
					Add_Log.info("Location_Enter" + Location_Enter);

					String Nationality_Enter = sh7.getCell(14, row7).getContents();
					System.out.println("Nationality_Enter" + Nationality_Enter);
					Add_Log.info("Nationality_Enter" + Nationality_Enter);

					String Country_Name_Enter = sh7.getCell(15, row7).getContents();
					System.out.println("Country_Name_Enter" + Country_Name_Enter);
					Add_Log.info("Country_Name_Enter" + Country_Name_Enter);

					String Contact_Number_Enter = sh7.getCell(16, row7).getContents();
					System.out.println("Contact_Number_Enter" + Contact_Number_Enter);
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
								.findElement(By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]"))
								.getText();
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
										.findElement(By.xpath(
												"//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
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
										.findElement(By.xpath(
												"//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
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
								.findElement(By.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]"))
								.getText();
						rowhead606.createCell(n * 2).setCellValue(GetAmount_TitileUpdate_Details6);
						Thread.sleep(100);
					}
					ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
					System.out.println(" Click on the Tax_Amount Button close");
					test.log(LogStatus.PASS,
							" Click on the Tax_Amount Button close " + selectPaymentMode_SavePaymentMode);

					Thread.sleep(2000);
					// ********** Verify Tax Amount Value RTGS*******//

					// Quantity
					String GetAmount_TitileRTGS32 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
							.getText();
					if (GetAmount_Titile11.equals(GetAmount_TitileRTGS32)) {

						System.out.println(GetAmount_TitileRTGS32 + ":- PASS");
						test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileRTGS32);

					} else {
						System.err.println(GetAmount_TitileRTGS32 + ":- FAIL");
						test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileRTGS32);

					}

					String GetAmount_TitileRTGS32A = driver
							.findElement(By.xpath("//*[@id='ID_UpdateDetails_Quantity']")).getText();
					if (GetAmount_Titile11A.equals(GetAmount_TitileRTGS32A)) {

						System.out.println(GetAmount_TitileRTGS32A + ":- PASS");
						test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileRTGS32A);

					} else {
						System.err.println(GetAmount_TitileRTGS32A + ":- FAIL");
						test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileRTGS32A);

					}
					Thread.sleep(100);

					// Exercise Amount
					String GetAmount_TitileRTGS33 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/p"))
							.getText();
					if (GetAmount_Titile12.equals(GetAmount_TitileRTGS33)) {

						System.out.println(GetAmount_TitileRTGS33 + ":- PASS");
						test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileRTGS33);

					} else {
						System.err.println(GetAmount_TitileRTGS33 + ":- FAIL");
						test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileRTGS33);

					}

					String GetAmount_TitileRTGS33A = driver
							.findElement(By.xpath("//*[@id='ID_UpdateDetails_ExerciseAmount']")).getText();

					if (GetAmount_Titile12A.equals(GetAmount_TitileRTGS33A)) {

						System.out.println(GetAmount_TitileRTGS33A + ":- PASS");
						test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileRTGS33A);

					} else {
						System.err.println(GetAmount_TitileRTGS33A + ":- FAIL");
						test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileRTGS33A);

					}
					Thread.sleep(100);

					// Tax Amount
					String GetAmount_TitileRTGS34 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
							.getText();
					String stringRTGS5 = new String(GetAmount_Titile13);
					String stringRTGS6 = new String(GetAmount_TitileRTGS34);

					if (stringRTGS5.equals(stringRTGS6)) {

						System.out.println(GetAmount_TitileRTGS34 + ":- PASS");
						test.log(LogStatus.PASS, "Tax Amount- " + GetAmount_TitileRTGS34);

					} else {
						System.err.println(GetAmount_TitileRTGS34 + ":- FAIL");
						test.log(LogStatus.FAIL, "Tax Amount- " + GetAmount_TitileRTGS34);

					}

					String GetAmount_TitileRTGS34A = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[2]/ul/li/p"))
							.getText();
					String stringRTGS7 = new String(GetAmount_Titile13A);
					String stringRTGS8 = new String(GetAmount_TitileRTGS34A);
					System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileRTGS34A);

					if (stringRTGS7.equals(stringRTGS8)) {

						System.out.println(GetAmount_TitileRTGS34A + ":- PASS");
						test.log(LogStatus.PASS, "Tax Amount- " + GetAmount_TitileRTGS34A);

					} else {
						System.err.println(GetAmount_TitileRTGS34A + ":- FAIL");
						test.log(LogStatus.FAIL, "Tax Amount- " + GetAmount_TitileRTGS34A);

					}
					Thread.sleep(100);

					// Total Amount Payable
					String GetAmount_TitileRTGS35 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[2]/tr/td[1]/h4"))
							.getText();
					if (GetAmount_Titile14.equals(GetAmount_TitileRTGS35)) {

						System.out.println(GetAmount_TitileRTGS35 + ":- PASS");
						test.log(LogStatus.PASS, " Total Amount Payable- " + GetAmount_TitileRTGS35);

					} else {
						System.err.println(GetAmount_TitileRTGS35 + ":- FAIL");
						test.log(LogStatus.FAIL, " Total Amount Payable- " + GetAmount_TitileRTGS35);

					}
					String GetAmount_TitileRTGS35A = driver
							.findElement(By.xpath("//*[@id='ID_UpdateDetails_TotalAmountPayable']")).getText();
					if (GetAmount_Titile14A.equals(GetAmount_TitileRTGS35A)) {

						System.out.println(GetAmount_TitileRTGS35A + ":- PASS");
						test.log(LogStatus.PASS, " Total Amount Payable- " + GetAmount_TitileRTGS35A);

					} else {
						System.err.println(GetAmount_TitileRTGS35A + ":- FAIL");
						test.log(LogStatus.FAIL, " Total Amount Payable- " + GetAmount_TitileRTGS35A);

					}
					Thread.sleep(100);

					// ****************************************************************************//
					Boolean RTGS_Number = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/input"))
							.size() != 0;
					System.out.println("RTGS_Number =" + RTGS_Number);
					if (RTGS_Number == true) {

						ExerciseNow_Locator.RTGS_Number1(driver).sendKeys(RTGS_Number_Enter);
						System.out.println("Entr RTGS_Number");
						Thread.sleep(2000);

						WebElement RTGS_Bank_Name = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/input"));
						if (RTGS_Bank_Name.isEnabled()) {

							ExerciseNow_Locator.RTGS_Bank_Name1(driver).clear();
							ExerciseNow_Locator.RTGS_Bank_Name1(driver).sendKeys(RTGS_Bank_Name_Enter);
							System.out.println("Enter RTGS Bank Name ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Bank Name " + RTGS_Bank_Name);

						} else {

							System.err.println("RTGS Bank Name Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Bank Name Disable " + RTGS_Bank_Name);

						}

						WebElement RTGS_Bank_Branch = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div/input"));
						if (RTGS_Bank_Branch.isEnabled()) {

							ExerciseNow_Locator.RTGS_Bank_Branch1(driver).clear();
							ExerciseNow_Locator.RTGS_Bank_Branch1(driver).sendKeys(RTGS_Bank_Branch_Enter);
							System.out.println("Enter RTGS Bank Branch ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Bank Branch " + RTGS_Bank_Branch);

						} else {

							System.err.println("RTGS Bank Branch Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Bank Branch Disable " + RTGS_Bank_Branch);

						}

						WebElement RTGS_Bank_Account_Number = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[4]/div/input"));
						if (RTGS_Bank_Account_Number.isEnabled()) {

							ExerciseNow_Locator.RTGS_Bank_Account_Number1(driver).clear();
							ExerciseNow_Locator.RTGS_Bank_Account_Number1(driver)
									.sendKeys(RTGS_Bank_Account_Number_Enter);
							System.out.println("Enter RTGS Bank Account Number ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Bank Account Number " + RTGS_Bank_Account_Number);

						} else {

							System.err.println("RTGS Bank Account Number Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Bank Account Number Disable " + RTGS_Bank_Account_Number);

						}

						WebElement RTGS_Date = driver.findElement(By.id("ID_UpdateDetails_WireTransferDate"));
						if (RTGS_Date.isEnabled()) {

							ExerciseNow_Locator.RTGS_Date1(driver).sendKeys(RTGS_Date_Enter);
							System.out.println("Enter RTGS Date ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Date " + RTGS_Date);

						} else {

							System.err.println("RTGS Date Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Date Disable " + RTGS_Date);

						}

						WebElement RTGS_Number2 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[1]/div/input"));
						if (RTGS_Number2.isEnabled()) {

							ExerciseNow_Locator.RTGS_Number2(driver).clear();
							ExerciseNow_Locator.RTGS_Number2(driver).sendKeys(RTGS_Number2_Enter);
							System.out.println("Enter RTGS Number2 ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Number2 " + RTGS_Number2);

						} else {

							System.err.println("RTGS Number2 Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Number2 Disable " + RTGS_Number2);

						}
						WebElement RTGS_Bank_Name2 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/input"));
						if (RTGS_Bank_Name2.isEnabled()) {

							ExerciseNow_Locator.RTGS_Bank_Name2(driver).clear();
							ExerciseNow_Locator.RTGS_Bank_Name2(driver).sendKeys(RTGS_Bank_Name2_Enter);
							System.out.println("Enter RTGS Bank Name ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Bank Name " + RTGS_Bank_Name2);

						} else {

							System.err.println("RTGS Bank Name Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Bank Name Disable " + RTGS_Bank_Name2);

						}

						WebElement RTGS_Bank_Branch2 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/input"));
						if (RTGS_Bank_Branch2.isEnabled()) {

							ExerciseNow_Locator.RTGS_Bank_Branch2(driver).clear();
							ExerciseNow_Locator.RTGS_Bank_Branch2(driver).sendKeys(RTGS_Bank_Branch2_Enter);
							System.out.println("Enter RTGS Bank Branch ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Bank Branch " + RTGS_Bank_Branch2);

						} else {

							System.err.println("RTGS Bank Branch Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Bank Branch Disable " + RTGS_Bank_Branch2);

						}

						WebElement RTGS_Bank_Account_Number2 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[4]/div/input"));
						if (RTGS_Bank_Account_Number2.isEnabled()) {

							ExerciseNow_Locator.RTGS_Bank_Account_Number2(driver).clear();
							ExerciseNow_Locator.RTGS_Bank_Account_Number2(driver)
									.sendKeys(RTGS_Bank_Account_Number2_Enter);
							System.out.println("Enter RTGS Bank Account Number ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Bank Account Number " + RTGS_Bank_Account_Number2);

						} else {

							System.err.println("RTGS Bank Account Number Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Bank Account Number Disable" + RTGS_Bank_Account_Number2);

						}

						WebElement RTGS_Date2 = driver.findElement(By.xpath(
								"/html/body/kt-base/div/div/div/div/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[5]/div/input"));
						if (RTGS_Date2.isEnabled()) {

							ExerciseNow_Locator.RTGS_Date2(driver).sendKeys(RTGS_Date2_Enter);
							System.out.println("Enter RTGS Date ");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter RTGS Date " + RTGS_Date2);

						} else {

							System.err.println("RTGS Date Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " RTGS Date Disable " + RTGS_Date2);

						}
						Boolean Broker_Account = driver.findElements(By.id("ID_UpdateDetails_BrokerAccount"))
								.size() != 0;
						System.out.println(" Broker_Account " + Broker_Account);
						if (Broker_Account == true) {

							String BrokerAccount_Enter1 = driver.findElement(By.id("ID_UpdateDetails_BrokerAccount"))
									.getText();
							System.out.println("= " + BrokerAccount_Enter1);
							Thread.sleep(2000);

							driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")).click();
							Thread.sleep(1000);

							Select BrokerAccount = new Select(
									driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")));
							BrokerAccount.selectByVisibleText(BrokerAccount_Enter1);
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter Broker_Account " + Broker_Account);

						} else {

							System.err.println(" Not Enter Broker_Account ");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Not Enter Broker_Account " + Broker_Account);

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

							test.log(LogStatus.PASS, " Demat Account Available " + DematAccount_Enter2);

						} else {

							System.err.println("Demat Account Not Available  ");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Demat Account Not Available  " + DematAccount_Enter2);

						}
						WebElement PANNumber_RTGS = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
						if (PANNumber_RTGS.isEnabled()) {

							ExerciseNow_Locator.PANNumber_RTGS1(driver).clear();
							ExerciseNow_Locator.PANNumber_RTGS1(driver).sendKeys(PANNumber_Enter);
							System.out.println("Enter PAN Number");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter PAN Number " + PANNumber_RTGS);

						} else {

							System.err.println("PAN Number Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " PAN Number Disable " + PANNumber_RTGS);

						}

						WebElement Residential_StatusRTGS = driver
								.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
						if (Residential_StatusRTGS.isEnabled()) {

							ExerciseNow_Locator.Residential_RTGS1(driver).clear();
							ExerciseNow_Locator.Residential_RTGS1(driver).sendKeys(Residential_Enter);
							System.out.println("Enter Residential_Status");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter Residential_Status " + Residential_StatusRTGS);

						} else {

							System.err.println("Residential Status Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Residential Status Disable " + Residential_StatusRTGS);

						}

						WebElement LocationRTGS = driver.findElement(By.id("ID_UpdateDetails_Location"));
						if (LocationRTGS.isEnabled()) {

							ExerciseNow_Locator.LocationRTGS1(driver).clear();
							ExerciseNow_Locator.LocationRTGS1(driver).sendKeys(Location_Enter);
							System.out.println("Enter Location");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter Location " + LocationRTGS);

						} else {

							System.err.println("Location Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Enter Location " + LocationRTGS);

						}

						WebElement NationalityRTGS = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
						if (NationalityRTGS.isEnabled()) {

							ExerciseNow_Locator.NationalityRTGS1(driver).clear();
							ExerciseNow_Locator.NationalityRTGS1(driver).sendKeys(Nationality_Enter);
							System.out.println("Enter Nationality");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter Nationality " + NationalityRTGS);

						} else {

							System.err.println("Nationality Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Nationality Disable  " + NationalityRTGS);

						}

						WebElement Country_NameRTGS = driver.findElement(By.id("ID_MyProfile_Country"));
						if (Country_NameRTGS.isEnabled()) {

							driver.findElement(By.id("ID_MyProfile_Country")).click();
							Select Country_NameRTGS1 = new Select(driver.findElement(By.id("ID_MyProfile_Country")));
							Country_NameRTGS1.selectByVisibleText(Country_Name_Enter);

							System.out.println("Enter Country_Name RTGS");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter Country_Name RTGS " + Country_NameRTGS);

						} else {

							System.err.println("Country_Name Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Country_Name Disable " + Country_NameRTGS);

						}

						WebElement Contact_NumberRTGS = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
						if (Contact_NumberRTGS.isEnabled()) {

							ExerciseNow_Locator.Contact_NumberRTGS1(driver).clear();
							ExerciseNow_Locator.Contact_NumberRTGS1(driver).sendKeys(Contact_Number_Enter);
							System.out.println("Enter Contact_Number");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter Contact_Number " + Contact_NumberRTGS);

						} else {

							System.err.println("Contact_Number Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Contact_Number Disable " + Contact_NumberRTGS);

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
							test.log(LogStatus.PASS, " Click on the Check_box " + Check_box);

							WebElement UpdateDetails_Confirm = driver.findElement(By.id("ID_UpdateDetails_Confirm"));
							if (UpdateDetails_Confirm.isEnabled()) {

								ExerciseNow_Locator.Wire_TransferUpdateDetails_Confirm(driver).click();
								System.out.println("Wire_TransferUpdateDetails_Confirm Enabled");
								Thread.sleep(2000);
								test.log(LogStatus.PASS,
										" Wire_TransferUpdateDetails_Confirm Enabled:-" + UpdateDetails_Confirm);

								ExerciseNow_Locator.UpdateDetails_ConfirmPopUp(driver).sendKeys(Keys.ENTER);
								System.out.println("Click on the UpdateDetails Confirm PopUp Button");
								Thread.sleep(2000);
								test.log(LogStatus.PASS,
										" Click on the UpdateDetails Confirm PopUp Button:-" + UpdateDetails_Confirm);

								if (InstrumentName.equals("VerifyInProcess_Card")) {

									Boolean Exerciese_Options2 = driver.findElements(By.linkText("Exercise Options"))
											.size() != 0;
									System.out.println(" Exerciese_Options2 =" + Exerciese_Options2);
									if (Exerciese_Options2 == true) {

										ExerciseNow_Locator.Exerciese_Options(driver).click();
										System.out.println("Click on the Exerciese Options ");
										Thread.sleep(500);
										test.log(LogStatus.PASS,
												" Click on the Exerciese Options " + Exerciese_Options2);

									} else {

										System.err.println("Not Click on the Exerciese_Options ");
										Thread.sleep(500);
										test.log(LogStatus.FAIL,
												" Not Click on the Exerciese_Options " + Exerciese_Options2);

									}
									Thread.sleep(5000);

									int Get_Status = driver.findElements(By.className("btn-link2")).size();
									System.out.println(Get_Status + "");
									for (int Index = 1; Index <= Get_Status; Index++) {

										Boolean Get_Status4 = driver
												.findElements(By
														.xpath("//div[" + Index + "]//div/div[2]/div/div/button/span"))
												.size() != 0;
										if (Get_Status4 == true) {

											String Get_Status2 = driver
													.findElement(By.xpath(
															"//div[" + Index + "]/div/div[2]/div/div/button/span"))
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
								// ******************** Verify Tax Amount Value RTGS**********//

								// Quantity
								String GetAmount_TitileRTGS42 = driver.findElement(By.xpath(
										"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
										.getText();
								if (GetAmount_Titile11.equals(GetAmount_TitileRTGS42)) {

									System.out.println(GetAmount_TitileRTGS42 + ":- PASS");
									test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileRTGS42);

								} else {
									System.err.println(GetAmount_TitileRTGS42 + ":- FAIL");
									test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileRTGS42);

								}

								String GetAmount_TitileRTGS42A = driver
										.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedQuantity']"))
										.getText();
								System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileRTGS42A);

								if (GetAmount_Titile11A.equals(GetAmount_TitileRTGS42A)) {

									System.out.println(GetAmount_TitileRTGS42A + ":- PASS");
									test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileRTGS42A);

								} else {
									System.err.println(GetAmount_TitileRTGS42A + ":- FAIL");
									test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileRTGS42A);

								}
								Thread.sleep(100);

								// Exercise Amount
								String GetAmount_TitileRTGS43 = driver.findElement(By.xpath(
										"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
										.getText();
								if (GetAmount_Titile12.equals(GetAmount_TitileRTGS43)) {

									System.out.println(GetAmount_TitileRTGS43 + ":- PASS");
									test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileRTGS43);

								} else {
									System.err.println(GetAmount_TitileRTGS43 + ":- FAIL");
									test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileRTGS43);

								}

								String GetAmount_TitileRTGS43A = driver
										.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']"))
										.getText();

								if (GetAmount_Titile12A.equals(GetAmount_TitileRTGS43A)) {

									System.out.println(GetAmount_TitileRTGS43A + ":- PASS");
									test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileRTGS43A);

								} else {
									System.err.println(GetAmount_TitileRTGS43A + ":- FAIL");
									test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileRTGS43A);

								}
								Thread.sleep(100);

								// Tax Amount
								String GetAmount_TitileRTGS44 = driver.findElement(By.xpath(
										"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
										.getText();
								String stringRTGS9 = new String(GetAmount_Titile13);
								String stringRTGS10 = new String(GetAmount_TitileRTGS44);

								if (stringRTGS9.equals(stringRTGS10)) {

									System.out.println(GetAmount_TitileRTGS44 + ":- PASS");
									test.log(LogStatus.PASS, "  Tax Amount:- " + GetAmount_TitileRTGS44);

								} else {
									System.err.println(GetAmount_TitileRTGS44 + ":- FAIL");
									test.log(LogStatus.FAIL, "  Tax Amount:- " + GetAmount_TitileRTGS44);

								}

								String GetAmount_TitileRTGS44A = driver
										.findElement(By.xpath("//*[@id='ID_DeclarationForm_TaxAmount']")).getText();
								String stringRTGS11 = new String(GetAmount_Titile13A);
								String stringRTGS12 = new String(GetAmount_TitileRTGS44A);
								System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileRTGS44A);

								if (stringRTGS11.equals(stringRTGS12)) {

									System.out.println(GetAmount_TitileRTGS44A + ":- PASS");
									test.log(LogStatus.PASS, "  Tax Amount:- " + GetAmount_TitileRTGS44A);

								} else {
									System.err.println(GetAmount_TitileRTGS44A + ":- FAIL");
									test.log(LogStatus.FAIL, "  Tax Amount:- " + GetAmount_TitileRTGS44A);

								}
								Thread.sleep(100);

								// Total Amount Payable
								String GetAmount_TitileRTGS45 = driver.findElement(By.xpath(
										"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
										.getText();
								if (GetAmount_Titile14.equals(GetAmount_TitileRTGS45)) {

									System.out.println(GetAmount_TitileRTGS45 + ":- PASS");
									test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileRTGS45);

								} else {
									System.err.println(GetAmount_TitileRTGS45 + ":- FAIL");
									test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileRTGS45);

								}
								String GetAmount_TitileRTGS45A = driver
										.findElement(By.xpath("//*[@id='ID_DeclarationForm_TotalAmntPayable']"))
										.getText();
								if (GetAmount_Titile14A.equals(GetAmount_TitileRTGS45A)) {

									System.out.println(GetAmount_TitileRTGS45A + ":- PASS");
									test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileRTGS45A);

								} else {
									System.err.println(GetAmount_TitileRTGS45A + ":- FAIL");
									test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileRTGS45A);

								}
								Thread.sleep(100);

								// ****************************************************************************//

								Boolean Acknowledgment_Payment = driver.findElements(By.id("ID_Acknowledgment_Payment"))
										.size() != 0;
								System.out.println("Acknowledgment_Payment  =" + Acknowledgment_Payment);
								if (Acknowledgment_Payment == true) {

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
										test.log(LogStatus.PASS,
												" Click on the Payment checkbox ButtonP:-" + Payment_checkbox);

										Boolean ExercisedSubmitDownload1 = driver
												.findElements(By.id("ID_DeclarationForm_ExercisedSubmitDownload"))
												.size() != 0;
										System.out.println("ExercisedSubmitDownload = " + ExercisedSubmitDownload1);

										if (ExercisedSubmitDownload1 == true) {

											ExerciseNow_Locator.ExercisedSubmitDownload(driver).click();
											System.out.println("Click on the Exercise Declaration");

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
														test.log(LogStatus.PASS, " Click on the Exerciese Options "
																+ Exerciese_Options3);

													} else {

														System.err.println("Not Click on the Exerciese_Options ");
														Thread.sleep(500);
														test.log(LogStatus.FAIL, " Not Click on the Exerciese_Options "
																+ Exerciese_Options3);

													}
													Thread.sleep(5000);

													int Get_Status12 = driver.findElements(By.className("btn-link2"))
															.size();
													System.out.println(Get_Status12 + "");
													for (int Index1 = 1; Index1 <= Get_Status12; Index1++) {

														Boolean Get_Status14 = driver
																.findElements(By.xpath("//div[" + Index1
																		+ "]//div/div[2]/div/div/button/span"))
																.size() != 0;
														if (Get_Status14 == true) {

															String Get_Status13 = driver
																	.findElement(By.xpath("//div[" + Index1
																			+ "]/div/div[2]/div/div/button/span"))
																	.getText();
															Thread.sleep(500);
															if (Get_Status13.equals("Upload Form")) {

																driver.findElement(By.xpath("//div[" + Index1
																		+ "]/div/div[2]/div/div/button/span")).click();
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

												int getCountAcknowledgement = driver
														.findElements(By.className("has-table")).size();
												System.err.println("= " + getCountAcknowledgement);
												Thread.sleep(1000);

												int getCountAcknowledgement2 = driver.findElements(By.xpath(
														"//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
														.size();
												System.err.println("= " + getCountAcknowledgement2);

												String GetAmount_TitileAcknowledgement = driver
														.findElement(By.xpath("//*[@id='heading0']/a/h4")).getText();
												sheet8.createRow(0).createCell(1)
														.setCellValue(GetAmount_TitileAcknowledgement);

												for (int i = 1; i <= 4; i++) {

													String GetAmount_TitileAcknowledgement1 = driver.findElement(
															By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i
																	+ "]"))
															.getText();
													rowhead800.createCell(i)
															.setCellValue(GetAmount_TitileAcknowledgement1);
													Thread.sleep(100);

												}
												for (int j = 1; j < 4; j++) {

													String GetAmount_TitileAcknowledgement2 = driver.findElement(By
															.xpath("//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th["
																	+ j + "]"))
															.getText();
													rowhead800.createCell(4 + j)
															.setCellValue(GetAmount_TitileAcknowledgement2);
													Thread.sleep(100);

												}

												if (getCountAcknowledgement2 >= 2) {

													for (int m = 1; m <= getCountAcknowledgement; m++) {

														HSSFRow rowhead803 = sheet8
																.createRow(m * getCountAcknowledgement2);
														// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

														for (int k = 1; k <= 4; k++) {

															String GetAmount_TitileAcknowledgement3 = driver
																	.findElement(By.xpath(
																			"//*[@id='collapse0']/div/table/tbody/tr["
																					+ m + "]/td[" + k + "]"))
																	.getText();
															rowhead803.createCell(k)
																	.setCellValue(GetAmount_TitileAcknowledgement3);
															Thread.sleep(100);

														}

														for (int l = 1; l < 4; l++) {

															String GetAmount_TitileAcknowledgement4 = driver
																	.findElement(By.xpath(
																			"//*[@id='collapse0']/div/table/tbody/tr["
																					+ m
																					+ "]/td[5]/table/tbody/tr[1]/td["
																					+ l + "]"))
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

															String GetAmount_TitileAcknowledgement3 = driver
																	.findElement(By.xpath(
																			"//*[@id='collapse0']/div/table/tbody/tr["
																					+ m + "]/td[" + k + "]"))
																	.getText();
															rowhead803.createCell(k)
																	.setCellValue(GetAmount_TitileAcknowledgement3);
															Thread.sleep(100);

														}

														for (int l = 1; l < 4; l++) {

															String GetAmount_TitileAcknowledgement4 = driver
																	.findElement(By.xpath(
																			"//*[@id='collapse0']/div/table/tbody/tr["
																					+ m
																					+ "]/td[5]/table/tbody/tr[1]/td["
																					+ l + "]"))
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

															String GetAmount_TitileAcknowledgement4 = driver
																	.findElement(By.xpath(
																			"//*[@id='collapse0']/div/table/tbody/tr["
																					+ m + "]/td[5]/table/tbody/tr[" + p
																					+ "]/td[" + l + "]"))
																	.getText();
															rowhead805.createCell(4 + l)
																	.setCellValue(GetAmount_TitileAcknowledgement4);

														}
													}

												}

												HSSFRow rowhead806 = sheet8.createRow(
														(getCountAcknowledgement * getCountAcknowledgement2) + 3);

												for (int n = 1; n < 4; n++) {

													String GetAmount_TitileAcknowledgement6 = driver.findElement(
															By.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n
																	+ "]"))
															.getText();
													rowhead806.createCell(n * 2)
															.setCellValue(GetAmount_TitileAcknowledgement6);
													Thread.sleep(100);
												}
												ExerciseNow_Locator.Tax_Amount_Button_Close(driver)
														.sendKeys(Keys.ENTER);
												System.out.println(" Click on the Tax_Amount Button close");

												Thread.sleep(3000);
												// ***************** Verify Tax Amount Value RTGS *******//
												// Quantity

												String GetAmount_TitileRTGS52 = driver.findElement(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
														.getText();
												if (GetAmount_Titile11.equals(GetAmount_TitileRTGS52)) {

													System.out.println(GetAmount_TitileRTGS52 + ":- PASS");
													test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileRTGS52);

												} else {
													System.err.println(GetAmount_TitileRTGS52 + ":- FAIL");
													test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileRTGS52);

												}

												String GetAmount_TitileRTGS52A = driver
														.findElement(By
																.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']"))
														.getText();
												System.out
														.println(GetAmount_Titile11A + "-" + GetAmount_TitileRTGS52A);

												if (GetAmount_Titile11A.equals(GetAmount_TitileRTGS52A)) {

													System.out.println(GetAmount_TitileRTGS52A + ":- PASS");
													test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileRTGS52A);

												} else {
													System.err.println(GetAmount_TitileRTGS52A + ":- FAIL");
													test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileRTGS52A);

												}
												Thread.sleep(100);

												// Exercise Amount
												String GetAmount_TitileRTGS53 = driver.findElement(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
														.getText();
												if (GetAmount_Titile12.equals(GetAmount_TitileRTGS53)) {

													System.out.println(GetAmount_TitileRTGS53 + ":- PASS");
													test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileRTGS53);

												} else {
													System.err.println(GetAmount_TitileRTGS53 + ":- FAIL");
													test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileRTGS53);

												}

												String GetAmount_TitileRTGS53A = driver
														.findElement(By
																.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']"))
														.getText();

												if (GetAmount_Titile12A.equals(GetAmount_TitileRTGS53A)) {

													System.out.println(GetAmount_TitileRTGS53A + ":- PASS");
													test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileRTGS53A);

												} else {
													System.err.println(GetAmount_TitileRTGS53A + ":- FAIL");
													test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileRTGS53A);

												}
												Thread.sleep(100);

												// Tax Amount
												String GetAmount_TitileRTGS54 = driver.findElement(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
														.getText();
												String stringRTGS13 = new String(GetAmount_Titile13);
												String stringRTGS14 = new String(GetAmount_TitileRTGS54);

												if (stringRTGS13.equals(stringRTGS14)) {

													System.out.println(GetAmount_TitileRTGS54 + ":- PASS");
													test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileRTGS54);

												} else {
													System.err.println(GetAmount_TitileRTGS54 + ":- FAIL");
													test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileRTGS54);

												}

												String GetAmount_TitileRTGS54A = driver
														.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
														.getText();
												String stringRTGS15 = new String(GetAmount_Titile13A);
												String stringRTGS16 = new String(GetAmount_TitileRTGS54A);
												System.out
														.println(GetAmount_Titile13A + "-" + GetAmount_TitileRTGS54A);

												if (stringRTGS15.equals(stringRTGS16)) {

													System.out.println(GetAmount_TitileRTGS54A + ":- PASS");
													test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileRTGS54A);

												} else {
													System.err.println(GetAmount_TitileRTGS54A + ":- FAIL");
													test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileRTGS54A);

												}
												Thread.sleep(100);

												// Total Amount Payable
												String GetAmount_TitileRTGS56 = driver.findElement(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
														.getText();
												if (GetAmount_Titile14.equals(GetAmount_TitileRTGS56)) {

													System.out.println(GetAmount_TitileRTGS56 + ":- PASS");
													test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileRTGS56);

												} else {
													System.err.println(GetAmount_TitileRTGS56 + ":- FAIL");
													test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileRTGS56);

												}
												String GetAmount_TitileRTGS56A = driver
														.findElement(
																By.xpath("//*[@id='selectPaymentMode_AmountPayable']"))
														.getText();
												if (GetAmount_Titile14A.equals(GetAmount_TitileRTGS56A)) {

													System.out.println(GetAmount_TitileRTGS56A + ":- PASS");
													test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileRTGS56A);

												} else {
													System.err.println(GetAmount_TitileRTGS56A + ":- FAIL");
													test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileRTGS56A);

												}
												Thread.sleep(2000);

												Boolean ViewExercise_Form = driver
														.findElements(By.className("download-form-wrap")).size() != 0;
												System.out.println(
														"ExercisedSubmitDownload = " + ExercisedSubmitDownload1);

												if (ViewExercise_Form == true) {

													ExerciseNow_Locator.ViewExercise_Form_Click(driver).click();
													System.out.println("Click on the View Exercise Form");

													Thread.sleep(5000);

													Boolean Download_Button_ExerciseForm = driver
															.findElements(By.className("download-form-wrap"))
															.size() != 0;
													System.out.println("Download_Button_ExerciseForm = "
															+ Download_Button_ExerciseForm);
													test.log(LogStatus.PASS,
															" Download_Button_ExerciseForm  " + ViewExercise_Form);

													if (Download_Button_ExerciseForm == true) {

														ExerciseNow_Locator.Download_ButtonClick_ExerciseForm(driver)
																.click();
														System.out.println("Click on the Download_Button_ExerciseForm");

														Thread.sleep(5000);
														test.log(LogStatus.PASS,
																"Click on the Download_Button_ExerciseForm"
																		+ Download_Button_ExerciseForm);

														Boolean Click_toBrowse = driver
																.findElements(By.className("download-form-wrap"))
																.size() != 0;
														System.out.println("Click to Browse = " + Click_toBrowse);

														if (Click_toBrowse == true) {

															ExerciseNow_Locator.Click_toBrowse(driver).click();
															System.out.println("Click_to Browse");
															test.log(LogStatus.PASS,
																	" Click_to Browse " + Click_toBrowse);

															Thread.sleep(5000);
															StringSelection str = new StringSelection(
																	"D:\\Testing Team Automation\\MyGlobalRollOut\\DownloadFile\\"
																			+ CompanyID + "_" + User + "_"
																			+ GetInstrumnetValue + ".pdf");
															Toolkit.getDefaultToolkit().getSystemClipboard()
																	.setContents(str, null);

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

															Boolean selectPaymentMode_SavePaymentMode1 = driver
																	.findElements(
																			By.id("selectPaymentMode_SavePaymentMode"))
																	.size() != 0;
															System.out.println("selectPaymentMode_SavePaymentMode = "
																	+ selectPaymentMode_SavePaymentMode1);

															if (selectPaymentMode_SavePaymentMode1 == true) {

																ExerciseNow_Locator
																		.selectPaymentMode_SavePaymentMode(driver)
																		.click();
																System.out.println(
																		"Click_to selectPaymentMode_SavePaymentMode");

																Thread.sleep(5000);
																test.log(LogStatus.PASS,
																		" Click_to selectPaymentMode_SavePaymentMode "
																				+ selectPaymentMode_SavePaymentMode1);

																Boolean selectPaymentMode_alert1 = driver
																		.findElements(By.xpath(
																				"//*[@id='alert-exercise-success-modal']/div/div"))
																		.size() != 0;
																System.out.println("selectPaymentMode_alert= "
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

																	if (GetText.equals(
																			"File is not Successfully upload")) {

																		driver.findElement(By.xpath(
																				"//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"))
																				.click();
																		System.err.println(".....Fail");
																		test.log(LogStatus.PASS,
																				" .....Fail " + GetText);

																		break;
																	} else {

																		System.out
																				.println("File is Successfully upload");
																		test.log(LogStatus.PASS,
																				"File is Successfully upload"
																						+ GetText);

																		Thread.sleep(5000);

																		Boolean Acknowledgement_IntiateExercise1 = driver
																				.findElements(By.id(
																						"ID_Acknowledgement_IntiateExercise"))
																				.size() != 0;
																		System.out.println(
																				"Acknowledgement_IntiateExercise = "
																						+ Acknowledgement_IntiateExercise1);

																		if (Acknowledgement_IntiateExercise1 == true) {

																			ExerciseNow_Locator
																					.Acknowledgement_IntiateExercise(
																							driver)
																					.click();
																			System.out.println(
																					"Click_to Acknowledgement_IntiateExercise");

																			Thread.sleep(5000);
																			test.log(LogStatus.PASS,
																					" Click_to Acknowledgement_IntiateExercise "
																							+ Acknowledgement_IntiateExercise1);

																		} else {

																			System.err.println(
																					"No Click to Acknowledgement_IntiateExercise");
																			test.log(LogStatus.FAIL,
																					" No Click to Acknowledgement_IntiateExercise "
																							+ Acknowledgement_IntiateExercise1);

																		}

																	}

																	System.out.println("Select Payment Alert");
																	test.log(LogStatus.FAIL, " Select Payment Alert "
																			+ selectPaymentMode_alert1);

																}
															} else {

																System.err.println(
																		"No Click to selectPaymentMode_SavePaymentMode");
																test.log(LogStatus.FAIL,
																		" No Click to selectPaymentMode_SavePaymentMode "
																				+ Click_toBrowse);

															}

														} else {

															System.err.println("No Click to Ok Button");
															test.log(LogStatus.FAIL, " No Click to Ok Button "
																	+ Download_Button_ExerciseForm);

														}
													}

												} else {

													System.err.println("Not click on the View Exercise Form");
													test.log(LogStatus.FAIL,
															" Not click on the View Exercise Form " + Upload_Form);

												}
											} else {

												System.err.println("ExercisedSubmitDownload Disable");
												Thread.sleep(5000);
												test.log(LogStatus.FAIL,
														" ExercisedSubmitDownload Disable " + Upload_Form);

												Boolean Acknowledgement_IntiateExercise1 = driver
														.findElements(By.id("ID_Acknowledgement_IntiateExercise"))
														.size() != 0;
												System.out.println("Acknowledgement_IntiateExercise = "
														+ Acknowledgement_IntiateExercise1);

												if (Acknowledgement_IntiateExercise1 == true) {

													ExerciseNow_Locator.Acknowledgement_IntiateExercise(driver).click();
													System.out.println("Click_to Acknowledgement_IntiateExercise");

													Thread.sleep(5000);
													test.log(LogStatus.FAIL,
															" Click_to Acknowledgement_IntiateExercise "
																	+ Acknowledgement_IntiateExercise1);

												} else {

													System.err.println("No Click to Acknowledgement_IntiateExercise");
													test.log(LogStatus.FAIL,
															"No Click to Acknowledgement_IntiateExercise:-"
																	+ Acknowledgement_IntiateExercise1);

												}
											}

										}
									}

								}
							}
						} else {

							System.err.println("Wire_TransferUpdateDetails_Confirm Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Wire_TransferUpdateDetails_Confirm Disable " + Check_box);

						}
					} else {

						System.err.println("Can't Enter RTGS_Number");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Can't Enter RTGS_Number " + RTGS_Number);

					}
				}
			} else {

				System.err.println("Not Click on the Continue");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Continue " + selectPaymentMode_SavePaymentMode);

			}

		} else {

			System.err.println("Not Click on SelectPaymentMode");
			Thread.sleep(500);
			test.log(LogStatus.FAIL, " Not Click on SelectPaymentMode " + SelectPaymentModeRTGS);

		}

	}
}