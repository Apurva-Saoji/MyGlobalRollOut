package ExerciseNowTestScripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locator;
import Locators.Login_Locator;
import jxl.Sheet;
import jxl.Workbook;

public class Cheque_PaymentMode extends ExerciseNow {

	public void Exercise_Now(HSSFSheet sheet4, HSSFSheet sheet5, HSSFSheet sheet6, HSSFSheet sheet7, HSSFSheet sheet8,
			HSSFRow rowhead500, HSSFRow rowhead600, HSSFRow rowhead700, HSSFRow rowhead800, String GetAmount_Titile11,
			String GetAmount_Titile11A, String GetAmount_Titile12, String GetAmount_Titile12A,
			String GetAmount_Titile13, String GetAmount_Titile13A, String GetAmount_Titile14,
			String GetAmount_Titile14A, String InstrumentName, String CompanyID, String User, String GetInstrumnetValue)
			throws Exception {

		test = report.startTest("Exerciese Cheque Payment Mode");

		String filepath = System.getProperty("user.dir") + "\\src\\Excels\\ExercieseOptions.xls";
		FileInputStream Exfile = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(Exfile);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Sheet sh6 = wb.getSheet("Cheque");
		int totalNoOfRows6 = sh6.getRows();

		System.out.println("Total number of rows are : " + totalNoOfRows6);
		Add_Log.info("Total number of rows are : " + totalNoOfRows6);
		// To get the number of columns present in sheet

		System.out.println("Total number of columns are : " + totalNoOfRows6);
		Add_Log.info("Total number of columns are : " + totalNoOfRows6);

		Boolean SelectPaymentModeCheque = driver.findElements(By.className("kt-portlet-table-adj")).size() != 0;
		System.out.println(" Select Payment Mode Cheque  =" + SelectPaymentModeCheque);
		if (SelectPaymentModeCheque == true) {

			Thread.sleep(2000);

			ExerciseNow_Locator.selectPaymentMode_Cheque(driver).click();
			System.out.println("Click on the Cheque_radio Button ");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the Cheque_radio Button:-" + SelectPaymentModeCheque);

			ExerciseNow_Locator.selectPaymentMode_popUpClose(driver).click();
			System.out.println("Click on the select PaymentMode Cheque Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the select PaymentMode Cheque Button:- " + SelectPaymentModeCheque);

			// **************** Select Payment Mode TaxAmount Tax Amount************//

			ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
			System.out.println(" Click on the Tax_Amount Button");
			Thread.sleep(1000);

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
			test.log(LogStatus.PASS, " Click on the Tax_Amount Button close:- " + SelectPaymentModeCheque);

			Thread.sleep(2000);
			// ************** Verify Tax Amount Value Cheque***********//

			// Quantity
			String GetAmount_TitileCheque22 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
					.getText();
			if (GetAmount_Titile11.equals(GetAmount_TitileCheque22)) {

				System.out.println(GetAmount_TitileCheque22 + ":- PASS");
				test.log(LogStatus.PASS, "Quantity:- " + GetAmount_TitileCheque22);

			} else {
				System.err.println(GetAmount_TitileCheque22 + ":- FAIL");
				test.log(LogStatus.FAIL, "Quantity:- " + GetAmount_TitileCheque22);

			}

			String GetAmount_TitileCheque22A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']")).getText();
			if (GetAmount_Titile11A.equals(GetAmount_TitileCheque22A)) {

				System.out.println(GetAmount_TitileCheque22A + ":- PASS");
				test.log(LogStatus.PASS, "Quantity:- " + GetAmount_TitileCheque22A);

			} else {
				System.err.println(GetAmount_TitileCheque22A + ":- FAIL");
				test.log(LogStatus.FAIL, "Quantity:- " + GetAmount_TitileCheque22A);

			}
			Thread.sleep(100);

			// Exercise Amount
			String GetAmount_TitileCheque23 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
					.getText();
			if (GetAmount_Titile12.equals(GetAmount_TitileCheque23)) {

				System.out.println(GetAmount_TitileCheque23 + ":- PASS");
				test.log(LogStatus.PASS, "Exercise Amount:- " + GetAmount_TitileCheque23);

			} else {
				System.err.println(GetAmount_TitileCheque23 + ":- FAIL");
				test.log(LogStatus.FAIL, "Exercise Amount:- " + GetAmount_TitileCheque23);

			}

			String GetAmount_TitileCheque23A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseAmount']")).getText();
            
			System.out.println("Print of 23 A" +GetAmount_TitileCheque23A);
			
			if (GetAmount_Titile12A.equals(GetAmount_TitileCheque23A)) {

				System.out.println(GetAmount_TitileCheque23A + ":- PASS");
				test.log(LogStatus.PASS, "Exercise Amount:- " + GetAmount_TitileCheque23A);

			} else {
				System.err.println(GetAmount_TitileCheque23A + ":- FAIL");
				test.log(LogStatus.FAIL, "Exercise Amount:- " + GetAmount_TitileCheque23A);

			}
			Thread.sleep(100);

			// Tax Amount
			String GetAmount_TitileCheque24 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
					.getText();
			String stringCheque1 = new String(GetAmount_Titile13);
			String stringCheque2 = new String(GetAmount_TitileCheque24);

			if (stringCheque1.equals(stringCheque2)) {

				System.out.println(GetAmount_TitileCheque24 + ":- PASS");
				test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_TitileCheque24);

			} else {
				System.err.println(GetAmount_TitileCheque24 + ":- FAIL");
				test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_TitileCheque24);

			}

			String GetAmount_TitileCheque24A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
					.getText();
			String stringCheque3 = new String(GetAmount_Titile13A);
			String stringCheque4 = new String(GetAmount_TitileCheque24A);
			System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileCheque24A);

			if (stringCheque3.equals(stringCheque4)) {

				System.out.println(GetAmount_TitileCheque24A + ":- PASS");
				test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_TitileCheque24A);

			} else {
				System.err.println(GetAmount_TitileCheque24A + ":- FAIL");
				test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_TitileCheque24A);

			}
			Thread.sleep(100);

			// Total Amount Payable
			String GetAmount_TitileCheque25 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[2]/tr/td[1]/span/span"))
					.getText();
			if (GetAmount_Titile14.equals(GetAmount_TitileCheque25)) {

				System.out.println(GetAmount_TitileCheque25 + ":- PASS");
				test.log(LogStatus.PASS, "Total Amount Payable:- " + GetAmount_TitileCheque25);

			} else {
				System.err.println(GetAmount_TitileCheque25 + ":- FAIL");
				test.log(LogStatus.FAIL, "Total Amount Payable:- " + GetAmount_TitileCheque25);

			}
			String GetAmount_TitileCheque25A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']")).getText();
			if (GetAmount_Titile14A.equals(GetAmount_TitileCheque25A)) {

				System.out.println(GetAmount_TitileCheque25A + ":- PASS");
				test.log(LogStatus.PASS, "Total Amount Payable:- " + GetAmount_TitileCheque25A);

			} else {
				System.err.println(GetAmount_TitileCheque25A + ":- FAIL");
				test.log(LogStatus.FAIL, "Total Amount Payable:- " + GetAmount_TitileCheque25A);

			}
			Thread.sleep(100);

			// *************Verify Tax Amount Value Cheque**************//

			Boolean selectPaymentMode_SavePaymentMode = driver.findElements(By.id("selectPaymentMode_SavePaymentMode"))
					.size() != 0;
			System.out.println(" selectPaymentMode_SavePaymentMode =" + selectPaymentMode_SavePaymentMode);
			if (selectPaymentMode_SavePaymentMode == true) {

				ExerciseNow_Locator.selectPaymentMode_SavePaymentMode(driver).click();
				System.out.println("Click on the Continue Button");
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Click on the Continue Button:- " + selectPaymentMode_SavePaymentMode);
				
				Thread.sleep(2000);

				for (int row6 = 1; row6 < totalNoOfRows6; row6++) {

					String ChequeNumber_Enter = sh6.getCell(0, row6).getContents();
					System.out.println("ChequeNumber_Enter " + ChequeNumber_Enter);
					Add_Log.info("ChequeNumber_Enter" + ChequeNumber_Enter);

					String ChequeDate_Enter = sh6.getCell(1, row6).getContents();
					System.out.println("ChequeDate_Enter" + ChequeDate_Enter);
					Add_Log.info("ChequeDate_Enter" + ChequeDate_Enter);

					String Bank_Name_Enter = sh6.getCell(2, row6).getContents();
					System.out.println("Bank_Name_Enter" + Bank_Name_Enter);
					Add_Log.info("Bank_Name_Enter" + Bank_Name_Enter);

					String Cheque_Number2_Enter = sh6.getCell(3, row6).getContents();
					System.out.println("Cheque Number2_Enter " + Cheque_Number2_Enter);
					Add_Log.info("Cheque Number2_Enter" + Cheque_Number2_Enter);

					String ChequeDate2_Enter = sh6.getCell(4, row6).getContents();
					System.out.println("ChequeDate2_Enter " + ChequeDate2_Enter);
					Add_Log.info("ChequeDate2_Enter" + ChequeDate2_Enter);

					String Bank_Name2_Enter = sh6.getCell(5, row6).getContents();
					System.out.println("Bank_Name2_Enter " + Bank_Name2_Enter);
					Add_Log.info("Bank_Name2_Enter" + Bank_Name2_Enter);

					String BrokerAccount_Enter = sh6.getCell(6, row6).getContents();
					System.out.println("BrokerAccount_Enter " + BrokerAccount_Enter);
					Add_Log.info("BrokerAccount_Enter" + BrokerAccount_Enter);

					String Location_Enter = sh6.getCell(7, row6).getContents();
					System.out.println("Location_Enter" + Location_Enter);
					Add_Log.info("Location_Enter" + Location_Enter);

					String Nationality_Enter = sh6.getCell(8, row6).getContents();
					System.out.println("Nationality_Enter " + Nationality_Enter);
					Add_Log.info("Nationality_Enter" + Nationality_Enter);

					String CountryName_Enter = sh6.getCell(9, row6).getContents();
					System.out.println("CountryName_Enter " + CountryName_Enter);
					Add_Log.info("CountryName_Enter" + CountryName_Enter);

					String ContactNumber_Enter = sh6.getCell(10, row6).getContents();
					System.out.println("ContactNumber_Enter " + ContactNumber_Enter);
					Add_Log.info("ContactNumber_Enter" + ContactNumber_Enter);

					Boolean UpdateDetails = driver.findElements(By.id("ID_Acknowledgment_Payment")).size() != 0;
					System.out.println("UpdateDetails =" + UpdateDetails);
					if (UpdateDetails == true) {

						// ************************* Update Details Tax Amount ***********************//

						ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
						System.out.println(" Click on the Tax_Amount Button");
						Thread.sleep(1000);
						test.log(LogStatus.PASS,
								"  Click on the Tax_Amount Button:- " + selectPaymentMode_SavePaymentMode);

						int getCountUpdate_Details = driver.findElements(By.className("has-table")).size();
						System.err.println("= " + getCountUpdate_Details);
						Thread.sleep(1000);

						int getCountUpdate_Details2 = driver
								.findElements(
										By.xpath("//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
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

							String GetAmount_TitileUpdate_Details2 = driver.findElement(By.xpath(
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

						Thread.sleep(2000);
						// ************** Verify Tax Amount Value Cheque*******//

						// Quantity
						String GetAmount_TitileCheque32 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
								.getText();
						if (GetAmount_Titile11.equals(GetAmount_TitileCheque32)) {

							System.out.println(GetAmount_TitileCheque32 + ":- PASS");
							test.log(LogStatus.PASS, "Quantity:- " + GetAmount_TitileCheque32);

						} else {
							System.err.println(GetAmount_TitileCheque32 + ":- FAIL");
							test.log(LogStatus.FAIL, "Quantity:- " + GetAmount_TitileCheque32);

						}

						String GetAmount_TitileCheque32A = driver
								.findElement(By.xpath("//*[@id='ID_UpdateDetails_Quantity']")).getText();
						if (GetAmount_Titile11A.equals(GetAmount_TitileCheque32A)) {

							System.out.println(GetAmount_TitileCheque32A + ":- PASS");
							test.log(LogStatus.PASS, "Quantity:- " + GetAmount_TitileCheque32A);

						} else {
							System.err.println(GetAmount_TitileCheque32A + ":- FAIL");
							test.log(LogStatus.FAIL, "Quantity:- " + GetAmount_TitileCheque32A);

						}
						Thread.sleep(100);

						// Exercise Amount
						String GetAmount_TitileCheque33 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/p"))
								.getText();
						if (GetAmount_Titile12.equals(GetAmount_TitileCheque33)) {

							System.out.println(GetAmount_TitileCheque33 + ":- PASS");
							test.log(LogStatus.PASS, "Exercise Amount:- " + GetAmount_TitileCheque33);

						} else {
							System.err.println(GetAmount_TitileCheque33 + ":- FAIL");
							test.log(LogStatus.FAIL, "Exercise Amount:- " + GetAmount_TitileCheque33);

						}

						String GetAmount_TitileCheque33A = driver
								.findElement(By.xpath("//*[@id='ID_UpdateDetails_ExerciseAmount']")).getText();

						if (GetAmount_Titile12A.equals(GetAmount_TitileCheque33A)) {

							System.out.println(GetAmount_TitileCheque33A + ":- PASS");
							test.log(LogStatus.PASS, "Exercise Amount:- " + GetAmount_TitileCheque33A);

						} else {
							System.err.println(GetAmount_TitileCheque33A + ":- FAIL");
							test.log(LogStatus.FAIL, "Exercise Amount:- " + GetAmount_TitileCheque33A);

						}
						Thread.sleep(100);

						// Tax Amount
						String GetAmount_TitileCheque34 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
								.getText();
						String stringCheque5 = new String(GetAmount_Titile13);
						String stringCheque6 = new String(GetAmount_TitileCheque34);

						if (stringCheque5.equals(stringCheque6)) {

							System.out.println(GetAmount_TitileCheque34 + ":- PASS");
							test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_TitileCheque34);

						} else {
							System.err.println(GetAmount_TitileCheque34 + ":- FAIL");
							test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_TitileCheque34);

						}

						String GetAmount_TitileCheque34A = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[2]/ul/li/p"))
								.getText();
						String stringCheque7 = new String(GetAmount_Titile13A);
						String stringCheque8 = new String(GetAmount_TitileCheque34A);
						System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileCheque34A);

						if (stringCheque7.equals(stringCheque8)) {

							System.out.println(GetAmount_TitileCheque34A + ":- PASS");
							test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_TitileCheque34A);

						} else {
							System.err.println(GetAmount_TitileCheque34A + ":- FAIL");
							test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_TitileCheque34A);

						}
						Thread.sleep(100);

						// Total Amount Payable
						String GetAmount_TitileCheque35 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[2]/tr/td[1]/h4"))
								.getText();
						if (GetAmount_Titile14.equals(GetAmount_TitileCheque35)) {

							System.out.println(GetAmount_TitileCheque35 + ":- PASS");
							test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileCheque35);

						} else {
							System.err.println(GetAmount_TitileCheque35 + ":- FAIL");
							test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileCheque35);

						}
						String GetAmount_TitileCheque35A = driver
								.findElement(By.xpath("//*[@id='ID_UpdateDetails_TotalAmountPayable']")).getText();
						if (GetAmount_Titile14A.equals(GetAmount_TitileCheque35A)) {

							System.out.println(GetAmount_TitileCheque35A + ":- PASS");
							test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileCheque35A);

						} else {
							System.err.println(GetAmount_TitileCheque35A + ":- FAIL");
							test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileCheque35A);

						}
						Thread.sleep(100);

						// ****************************************************************************//
						ExerciseNow_Locator.Cheque_Number(driver).clear();
						ExerciseNow_Locator.Cheque_Number(driver).sendKeys(ChequeNumber_Enter);
						System.out.println("Enter on the Cheque Number");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter on the Cheque Number:- " + selectPaymentMode_SavePaymentMode);

						ExerciseNow_Locator.ChequeDate(driver).sendKeys(ChequeDate_Enter);
						System.out.println("Enter on the Cheque Date");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter on the Cheque Date:- " + selectPaymentMode_SavePaymentMode);

						ExerciseNow_Locator.Bank_Name(driver).clear();
						ExerciseNow_Locator.Bank_Name(driver).sendKeys(Bank_Name_Enter);
						System.out.println("Enter on the Bank Name");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter on the Bank Name:- " + selectPaymentMode_SavePaymentMode);

						ExerciseNow_Locator.Cheque_Number2(driver).sendKeys(Cheque_Number2_Enter);
						System.out.println("Enter on the Cheque Number2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter on the Cheque Number2:- " + selectPaymentMode_SavePaymentMode);

						ExerciseNow_Locator.ChequeDate2(driver).sendKeys(ChequeDate2_Enter);
						System.out.println("Enter on the Cheque Date2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter on the Cheque Date2:- " + selectPaymentMode_SavePaymentMode);

						ExerciseNow_Locator.Bank_Name2(driver).clear();
						ExerciseNow_Locator.Bank_Name2(driver).sendKeys(Bank_Name2_Enter);
						System.out.println("Enter on the Bank Name2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS,
								" Click on the Exerciese Options " + selectPaymentMode_SavePaymentMode);

						Boolean BrokerAccount_Enter2 = driver.findElements(By.id("ID_UpdateDetails_BrokerAccount"))
								.size() != 0;
						System.out.println(" BrokerAccount_Enter =" + BrokerAccount_Enter2);
						if (BrokerAccount_Enter2 == true) {

							String BrokerAccount_Enter1 = driver.findElement(By.id("ID_UpdateDetails_BrokerAccount"))
									.getText();
							System.out.println("= " + BrokerAccount_Enter1);
							Thread.sleep(2000);

							driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")).click();
							Thread.sleep(1000);

							Select BrokerAccount = new Select(
									driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")));
							BrokerAccount.selectByVisibleText(BrokerAccount_Enter1);
							test.log(LogStatus.PASS, " Broker Account  Available:-  " + BrokerAccount_Enter2);

						} else {

							System.err.println("Broker Account Not Available  ");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, "Broker Account Not Available:- " + BrokerAccount_Enter2);

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
							test.log(LogStatus.PASS, " Demat Account Available:- " + DematAccount_Enter2);
						} else {

							System.err.println("Demat Account Not Available  ");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Demat Account Not Available:- " + DematAccount_Enter2);

						}

						ExerciseNow_Locator.Location(driver).clear();
						ExerciseNow_Locator.Location(driver).sendKeys(Location_Enter);
						System.out.println("Enter on the Location");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter on the Location");

						ExerciseNow_Locator.Nationality(driver).clear();
						ExerciseNow_Locator.Nationality(driver).sendKeys(Nationality_Enter);
						System.out.println("Enter on the Nationality");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter on the Nationality");

						WebElement Country_NameCheque = driver.findElement(By.id("ID_MyProfile_Country"));
						if (Country_NameCheque.isEnabled()) {

							driver.findElement(By.id("ID_MyProfile_Country")).click();
							Select Country_Name_Cheque1 = new Select(driver.findElement(By.id("ID_MyProfile_Country")));
							Country_Name_Cheque1.selectByVisibleText(CountryName_Enter);
							System.out.println("Enter Country_Name");
							Thread.sleep(2000);
							test.log(LogStatus.PASS, " Enter Country_Name:- " + Country_NameCheque);

						} else {

							System.err.println("Country_Name Disable");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, " Country_Name Disable:-" + Country_NameCheque);

						}

						ExerciseNow_Locator.Contact_Number(driver).clear();
						ExerciseNow_Locator.Contact_Number(driver).sendKeys(ContactNumber_Enter);
						System.out.println("Enter on the Contact Number");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter on the Contact Number:- ");

						jse.executeScript("window.scrollBy(0,-1050)");

						Thread.sleep(3000);
						ExerciseNow_Locator.UpdateDetailscheckbox(driver).click();
						System.out.println("Enter on the Update Details checkbox");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter on the Update Details checkbox ");

						WebElement UpdateDetails_Confirm = driver.findElement(By.id("ID_UpdateDetails_Confirm"));
						if (UpdateDetails_Confirm.isEnabled()) {

							Boolean UpdateDetails_Confirm2 = driver.findElements(By.id("ID_UpdateDetails_Confirm"))
									.size() != 0;
							System.out.println(
									" UpdateDExercisedSubmitDownloadetails_Confirm2 =" + UpdateDetails_Confirm2);
							if (UpdateDetails_Confirm2 == true) {

								Thread.sleep(2000);
								ExerciseNow_Locator.UpdateDetails_Confirm2(driver).sendKeys(Keys.ENTER);
								System.out.println("Click on the UpdateDetails_Confirm2 Button");
								Thread.sleep(3000);
								test.log(LogStatus.PASS,
										" Click on the UpdateDetails_Confirm2 Button:-  " + UpdateDetails_Confirm2);

								ExerciseNow_Locator.UpdateDetails_ConfirmPopUp(driver).sendKeys(Keys.ENTER);
								System.out.println("Click on the UpdateDetails Confirm PopUp Button");
								Thread.sleep(2000);
								test.log(LogStatus.PASS,
										" Click on the UpdateDetails Confirm PopUp Button:-" + UpdateDetails_Confirm2);

								if (InstrumentName.equals("VerifyInProcess_Card")) {

									Boolean Exerciese_Options2 = driver.findElements(By.linkText("Exercise Options"))
											.size() != 0;
									System.out.println(" Exerciese_Options2 =" + Exerciese_Options2);
									if (Exerciese_Options2 == true) {

										ExerciseNow_Locator.Exerciese_Options(driver).click();
										System.out.println("Click on the Exerciese Options ");
										Thread.sleep(500);
										test.log(LogStatus.PASS,
												"Click on the Exerciese Options:-" + Exerciese_Options2);

									} else {

										System.err.println("Not Click on the Exerciese_Options ");
										Thread.sleep(500);
										test.log(LogStatus.FAIL,
												" Not Click on the Exerciese_Options:-" + Exerciese_Options2);

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
								// ************************* Exercise Declaration Tax Amount****//

								ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
								System.out.println(" Click on the Tax_Amount Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, " Click on the Tax_Amount Button ");

								int getCountExercise_Declaration = driver.findElements(By.className("has-table"))
										.size();
								System.err.println("= " + getCountExercise_Declaration);
								Thread.sleep(1000);

								int getCountExercise_Declaration2 = driver
										.findElements(By.xpath(
												"//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
										.size();
								System.err.println("= " + getCountExercise_Declaration2);

								String GetAmount_TitileExercise_Declaration = driver
										.findElement(By.xpath("//*[@id='heading0']/a/h4")).getText();
								sheet7.createRow(0).createCell(1).setCellValue(GetAmount_TitileExercise_Declaration);

								for (int i = 1; i <= 4; i++) {

									String GetAmount_TitileExercise_Declaration1 = driver
											.findElement(
													By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]"))
											.getText();
									rowhead700.createCell(i).setCellValue(GetAmount_TitileExercise_Declaration1);
									Thread.sleep(100);

								}
								for (int j = 1; j < 4; j++) {

									String GetAmount_TitileExercise_Declaration2 = driver.findElement(
											By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th["
													+ j + "]"))
											.getText();
									rowhead700.createCell(4 + j).setCellValue(GetAmount_TitileExercise_Declaration2);
									Thread.sleep(100);

								}

								if (getCountExercise_Declaration2 >= 2) {

									for (int m = 1; m <= getCountExercise_Declaration; m++) {

										HSSFRow rowhead703 = sheet7.createRow(m * getCountExercise_Declaration2);
										// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

										for (int k = 1; k <= 4; k++) {

											String GetAmount_TitileExercise_Declaration3 = driver.findElement(By.xpath(
													"//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
													.getText();
											rowhead703.createCell(k)
													.setCellValue(GetAmount_TitileExercise_Declaration3);
											Thread.sleep(100);

										}

										for (int l = 1; l < 4; l++) {

											String GetAmount_TitileExercise_Declaration4 = driver
													.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
															+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
													.getText();
											rowhead703.createCell(4 + l)
													.setCellValue(GetAmount_TitileExercise_Declaration4);
										}

									}
								} else {

									for (int m = 1; m <= getCountExercise_Declaration; m++) {

										HSSFRow rowhead703 = sheet7.createRow(m * 2);
										// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

										for (int k = 1; k <= 4; k++) {

											String GetAmount_TitileExercise_Declaration3 = driver.findElement(By.xpath(
													"//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
													.getText();
											rowhead703.createCell(k)
													.setCellValue(GetAmount_TitileExercise_Declaration3);
											Thread.sleep(100);

										}

										for (int l = 1; l < 4; l++) {

											String GetAmount_TitileExercise_Declaration4 = driver
													.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
															+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
													.getText();
											rowhead703.createCell(4 + l)
													.setCellValue(GetAmount_TitileExercise_Declaration4);
										}

									}
								}

								for (int m = 1; m <= getCountExercise_Declaration; m++) {

									for (int p = 2; p <= getCountExercise_Declaration2; p++) {

										HSSFRow rowhead705 = sheet7
												.createRow((m * getCountExercise_Declaration2) + p - 1);

										for (int l = 1; l < 4; l++) {

											String GetAmount_TitileExercise_Declaration4 = driver
													.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
															+ "]/td[5]/table/tbody/tr[" + p + "]/td[" + l + "]"))
													.getText();
											rowhead705.createCell(4 + l)
													.setCellValue(GetAmount_TitileExercise_Declaration4);

										}
									}

								}

								HSSFRow rowhead706 = sheet7
										.createRow((getCountExercise_Declaration * getCountExercise_Declaration2) + 3);

								for (int n = 1; n < 4; n++) {

									String GetAmount_TitileExercise_Declaration6 = driver
											.findElement(
													By.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]"))
											.getText();
									rowhead706.createCell(n * 2).setCellValue(GetAmount_TitileExercise_Declaration6);
									Thread.sleep(100);
								}
								ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
								System.out.println(" Click on the Tax_Amount Button close");
								test.log(LogStatus.PASS, " Click on the Tax_Amount Button close:-");

								Thread.sleep(2000);
								// **************** Verify Tax Amount Value Cheque********//

								// Quantity
								String GetAmount_TitileCheque42 = driver.findElement(By.xpath(
										"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
										.getText();
								if (GetAmount_Titile11.equals(GetAmount_TitileCheque42)) {

									System.out.println(GetAmount_TitileCheque42 + ":- PASS");
									test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileCheque42);

								} else {
									System.err.println(GetAmount_TitileCheque42 + ":- FAIL");
									test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileCheque42);

								}

								String GetAmount_TitileCheque42A = driver
										.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedQuantity']"))
										.getText();
								System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileCheque42A);

								if (GetAmount_Titile11A.equals(GetAmount_TitileCheque42A)) {

									System.out.println(GetAmount_TitileCheque42A + ":- PASS");
									test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileCheque42A);

								} else {
									System.err.println(GetAmount_TitileCheque42A + ":- FAIL");
									test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileCheque42A);

								}
								Thread.sleep(100);

								// Exercise Amount
								String GetAmount_TitileCheque43 = driver.findElement(By.xpath(
										"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
										.getText();
								if (GetAmount_Titile12.equals(GetAmount_TitileCheque43)) {

									System.out.println(GetAmount_TitileCheque43 + ":- PASS");
									test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileCheque43);

								} else {
									System.err.println(GetAmount_TitileCheque43 + ":- FAIL");
									test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileCheque43);

								}

								String GetAmount_TitileCheque43A = driver
										.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']"))
										.getText();

								if (GetAmount_Titile12A.equals(GetAmount_TitileCheque43A)) {

									System.out.println(GetAmount_TitileCheque43A + ":- PASS");
									test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileCheque43A);

								} else {
									System.err.println(GetAmount_TitileCheque43A + ":- FAIL");
									test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileCheque43A);

								}
								Thread.sleep(100);

								// Tax Amount
								String GetAmount_TitileCheque44 = driver.findElement(By.xpath(
										"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
										.getText();
								String stringCheque9 = new String(GetAmount_Titile13);
								String stringCheque10 = new String(GetAmount_TitileCheque44);

								if (stringCheque9.equals(stringCheque10)) {

									System.out.println(GetAmount_TitileCheque44 + ":- PASS");
									test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileCheque44);

								} else {
									System.err.println(GetAmount_TitileCheque44 + ":- FAIL");
									test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileCheque44);

								}

								String GetAmount_TitileCheque44A = driver
										.findElement(By.xpath("//*[@id='ID_DeclarationForm_TaxAmount']")).getText();
								String stringCheque11 = new String(GetAmount_Titile13A);
								String stringCheque12 = new String(GetAmount_TitileCheque44A);
								System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileCheque44A);

								if (stringCheque11.equals(stringCheque12)) {

									System.out.println(GetAmount_TitileCheque44A + ":- PASS");
									test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileCheque44A);

								} else {
									System.err.println(GetAmount_TitileCheque44A + ":- FAIL");
									test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileCheque44A);

								}
								Thread.sleep(100);

								// Total Amount Payable
								String GetAmount_TitileCheque45 = driver.findElement(By.xpath(
										"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
										.getText();
								if (GetAmount_Titile14.equals(GetAmount_TitileCheque45)) {

									System.out.println(GetAmount_TitileCheque45 + ":- PASS");
									test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileCheque45);

								} else {
									System.err.println(GetAmount_TitileCheque45 + ":- FAIL");
									test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileCheque45);

								}
								String GetAmount_TitileCheque45A = driver
										.findElement(By.xpath("//*[@id='ID_DeclarationForm_TotalAmntPayable']"))
										.getText();
								if (GetAmount_Titile14A.equals(GetAmount_TitileCheque45A)) {

									System.out.println(GetAmount_TitileCheque45A + ":- PASS");
									test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileCheque45A);

								} else {
									System.err.println(GetAmount_TitileCheque45A + ":- FAIL");
									test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileCheque45A);

								}
								Thread.sleep(1000);

								// ****************************************************************************//

								Boolean Acknowledgment_Payment = driver.findElements(By.id("ID_Acknowledgment_Payment"))
										.size() != 0;
								System.out.println("Acknowledgment_Payment  =" + Acknowledgment_Payment);
								if (Acknowledgment_Payment == true) {

									Thread.sleep(1000);

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
										test.log(LogStatus.PASS,
												" Click on the Payment checkbox Button:- " + Payment_checkbox);

										Thread.sleep(1000);

										Boolean ExercisedSubmitDownload1 = driver
												.findElements(By.id("ID_DeclarationForm_ExercisedSubmitDownload"))
												.size() != 0;
										System.out.println("ExercisedSubmitDownload = " + ExercisedSubmitDownload1);


										
										if (ExercisedSubmitDownload1 == true) {

											ExerciseNow_Locator.ExercisedSubmitDownload(driver).click();
											System.out.println("Click on the Exercise Declaration");
											test.log(LogStatus.PASS,
													" Click on the Exercise Declaration:- " + ExercisedSubmitDownload1);
											
											
											System.out.println("new changes popup 1");
											
											
											WebElement element9=driver.findElement(By.xpath("(//button[@class='close'])[8]"));
											Thread.sleep(2000);
											System.out.println("Click");
											
											Thread.sleep(2000); 
											
											element9.click();
											
											//int ok_size=driver.findElements(By.xpath("//button[text()='OK']")).size();
											//System.out.println("yes");

											/*WebElement element9 =new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='confirm-exercise-success-modal']/div/div/div[2]/form/div/button")));
											element9.click();
											System.out.println("click");*/
											
											
											
											//WebElement newpopup=driver.findElement(By.xpath("//*[@id='confirm-exercise-success-modal']/div/div/div[2]/form/div/button"));
											System.out.println("Click on new popup");
											
											
										/*	
											Alert alert = driver.switchTo().alert();
											System.out.println("alert");
											alert.accept();*/
											

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
														test.log(LogStatus.PASS, "Click on the Exerciese Options:-"
																+ Exerciese_Options3);

													} else {

														System.err.println("Not Click on the Exerciese_Options ");
														Thread.sleep(500);
														test.log(LogStatus.FAIL,
																" Not Click on the Exerciese_Options :-"
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
												test.log(LogStatus.PASS, "  Click on the Tax_Amount Button ");

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
												test.log(LogStatus.PASS, " Click on the Tax_Amount Button close:");

												Thread.sleep(3000);
												// ***************** Verify Tax Amount Value Cheque *******//
												// Quantity

												String GetAmount_TitileCheque52 = driver.findElement(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
														.getText();
												if (GetAmount_Titile11.equals(GetAmount_TitileCheque52)) {

													System.out.println(GetAmount_TitileCheque52 + ":- PASS");
													test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileCheque52);

												} else {
													System.err.println(GetAmount_TitileCheque52 + ":- FAIL");
													test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileCheque52);

												}

												String GetAmount_TitileCheque52A = driver
														.findElement(By
																.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']"))
														.getText();
												System.out
														.println(GetAmount_Titile11A + "-" + GetAmount_TitileCheque52A);

												if (GetAmount_Titile11A.equals(GetAmount_TitileCheque52A)) {

													System.out.println(GetAmount_TitileCheque52A + ":- PASS");
													test.log(LogStatus.PASS,
															" Quantity:- " + GetAmount_TitileCheque52A);

												} else {
													System.err.println(GetAmount_TitileCheque52A + ":- FAIL");
													test.log(LogStatus.FAIL,
															" Quantity:- " + GetAmount_TitileCheque52A);

												}
												Thread.sleep(100);

												// Exercise Amount
												String GetAmount_TitileCheque53 = driver.findElement(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
														.getText();
												if (GetAmount_Titile12.equals(GetAmount_TitileCheque53)) {

													System.out.println(GetAmount_TitileCheque53 + ":- PASS");
													test.log(LogStatus.PASS,
															" Exercise Amount:- " + GetAmount_TitileCheque53);

												} else {
													System.err.println(GetAmount_TitileCheque53 + ":- FAIL");
													test.log(LogStatus.FAIL,
															" Exercise Amount:- " + GetAmount_TitileCheque53);

												}

												String GetAmount_TitileCheque53A = driver
														.findElement(By
																.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']"))
														.getText();

												if (GetAmount_Titile12A.equals(GetAmount_TitileCheque53A)) {

													System.out.println(GetAmount_TitileCheque53A + ":- PASS");
													test.log(LogStatus.PASS,
															" Exercise Amount:- " + GetAmount_TitileCheque53A);

												} else {
													System.err.println(GetAmount_TitileCheque53A + ":- FAIL");
													test.log(LogStatus.FAIL,
															" Exercise Amount:- " + GetAmount_TitileCheque53A);

												}
												Thread.sleep(100);

												// Tax Amount
												String GetAmount_TitileCheque54 = driver.findElement(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
														.getText();
												String stringCheque13 = new String(GetAmount_Titile13);
												String stringCheque14 = new String(GetAmount_TitileCheque54);

												if (stringCheque13.equals(stringCheque14)) {

													System.out.println(GetAmount_TitileCheque54 + ":- PASS");
													test.log(LogStatus.PASS,
															" Tax Amount:- " + GetAmount_TitileCheque54);

												} else {
													System.err.println(GetAmount_TitileCheque54 + ":- FAIL");
													test.log(LogStatus.FAIL,
															" Tax Amount:- " + GetAmount_TitileCheque54);

												}

												String GetAmount_TitileCheque54A = driver
														.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
														.getText();
												String stringCheque15 = new String(GetAmount_Titile13A);
												String stringCheque16 = new String(GetAmount_TitileCheque54A);
												System.out
														.println(GetAmount_Titile13A + "-" + GetAmount_TitileCheque54A);

												if (stringCheque15.equals(stringCheque16)) {

													System.out.println(GetAmount_TitileCheque54A + ":- PASS");
													test.log(LogStatus.PASS,
															" Tax Amount:- " + GetAmount_TitileCheque54A);

												} else {
													System.err.println(GetAmount_TitileCheque54A + ":- FAIL");
													test.log(LogStatus.FAIL,
															" Tax Amount:- " + GetAmount_TitileCheque54A);

												}
												Thread.sleep(100);

												// Total Amount Payable
												String GetAmount_TitileCheque56 = driver.findElement(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
														.getText();
												if (GetAmount_Titile14.equals(GetAmount_TitileCheque56)) {

													System.out.println(GetAmount_TitileCheque56 + ":- PASS");
													test.log(LogStatus.PASS,
															" Total Amount Payable:- " + GetAmount_TitileCheque56);

												} else {
													System.err.println(GetAmount_TitileCheque56 + ":- FAIL");
													test.log(LogStatus.FAIL,
															" Total Amount Payable:- " + GetAmount_TitileCheque56);

												}
												String GetAmount_TitileCheque56A = driver
														.findElement(
																By.xpath("//*[@id='selectPaymentMode_AmountPayable']"))
														.getText();
												if (GetAmount_Titile14A.equals(GetAmount_TitileCheque56A)) {

													System.out.println(GetAmount_TitileCheque56A + ":- PASS");
													test.log(LogStatus.PASS,
															" Total Amount Payable:- " + GetAmount_TitileCheque56A);

												} else {
													System.err.println(GetAmount_TitileCheque56A + ":- FAIL");
													test.log(LogStatus.FAIL,
															" Total Amount Payable:- " + GetAmount_TitileCheque56A);

												}
												Thread.sleep(1000);

												Boolean ViewExercise_Form = driver
														.findElements(By.className("download-form-wrap")).size() != 0;
												System.out.println(
														"ExercisedSubmitDownload = " + ExercisedSubmitDownload1);
												

												if (ViewExercise_Form == true) {

													ExerciseNow_Locator.ViewExercise_Form_Click(driver).click();
													System.out.println("Click on the View Exercise Form");
													test.log(LogStatus.PASS,
															" Click on the View Exercise Form:- " + ViewExercise_Form);

													Thread.sleep(5000);

													Boolean Download_Button_ExerciseForm = driver
															.findElements(By.className("download-form-wrap"))
															.size() != 0;
													System.out.println("Download_Button_ExerciseForm = "
															+ Download_Button_ExerciseForm);

													if (Download_Button_ExerciseForm == true) {

														ExerciseNow_Locator.Download_ButtonClick_ExerciseForm(driver)
																.click();
														System.out.println("Click on the Download_Button_ExerciseForm");
														test.log(LogStatus.PASS,
																" Click on the Download_Button_ExerciseForm:- "
																		+ Download_Button_ExerciseForm);

														Thread.sleep(5000);
														
														System.out.println("new changes popup 2");
														
														
														WebElement element10=driver.findElement(By.xpath("(//button[@class='close'])[5]"));
														Thread.sleep(2000);
														System.out.println("Click");
														
														Thread.sleep(2000); 
														
														element10.click();

														Boolean Click_toBrowse = driver
																.findElements(By.className("download-form-wrap"))
																.size() != 0;
														System.out.println("Click to Browse = " + Click_toBrowse);

														if (Click_toBrowse == true) {

															ExerciseNow_Locator.Click_toBrowse(driver).click();
															System.out.println("Click_to Browse");
															test.log(LogStatus.PASS,
																	" Click to Browse:- " + Click_toBrowse);

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

															Boolean Clickto_Ok_Button1 = driver.findElements(By.xpath(
																	"//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"))
																	.size() != 0;
															System.out.println(
																	"Clickto_Ok_Button= " + Clickto_Ok_Button1);

															if (Clickto_Ok_Button1 == true) {

																ExerciseNow_Locator.Clickto_Ok_Button(driver).click();
																System.out.println("Click_to Button");
															}

															Thread.sleep(1000);

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

																/*Boolean selectPaymentMode_alert1 = driver
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

																	Thread.sleep(1000);*/
																
																	/*String GetText = ExerciseNow_Locator
																			.selectPaymentMode_alert(driver).getText();
																	System.err.println("" + GetText);

																	if (GetText.equals(
																			"File is not Successfully upload")) {

																		driver.findElement(By.xpath(
																				"//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"))
																				.click();
																		System.err.println(".....Fail");
																		test.log(LogStatus.FAIL, ".....Fail" + GetText);

																		break;
																	} else {

																		System.out
																				.println("File is Successfully upload");

																		Thread.sleep(5000);
																		test.log(LogStatus.PASS,
																				" File is Successfully upload "
																						+ GetText);*/

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
																					" Click_to Acknowledgement_IntiateExercise:- "
																							+ Acknowledgement_IntiateExercise1);

																		} else {

																			System.err.println(
																					"No Click to Acknowledgement_IntiateExercise");
																			test.log(LogStatus.FAIL,
																					"No Click to Acknowledgement_IntiateExercise:- "
																							+ Acknowledgement_IntiateExercise1);

																		}

																	

																	System.out.println("Select Payment Alert");
																/*	test.log(LogStatus.FAIL, "Select Payment Alert:- "
																			+ selectPaymentMode_alert1);*/

																}
															} else {

																System.err.println(
																		"No Click to selectPaymentMode_SavePaymentMode");
																test.log(LogStatus.FAIL,
																		"No Click to selectPaymentMode_SavePaymentMode:-"
																				+ Click_toBrowse);

															}

														} else {

															System.err.println("No Click to Ok Button");
															test.log(LogStatus.FAIL, " No Click to Ok Button:-"
																	+ Download_Button_ExerciseForm);

														}
													}

												} else {

													/*System.err.println("Not click on the View Exercise Form");
													test.log(LogStatus.FAIL, " Not click on the View Exercise Form:- "
															+ ViewExercise_Form);*/

												}

											} else {

												System.err.println("ExercisedSubmitDownload Disable");
												test.log(LogStatus.FAIL, "ExercisedSubmitDownload Disable:- "
														+ ExercisedSubmitDownload1);

												Thread.sleep(5000);

											/*	Boolean Acknowledgement_IntiateExercise1 = driver
														.findElements(By.id("ID_Acknowledgement_IntiateExercise"))
														.size() != 0;
												System.out.println("Acknowledgement_IntiateExercise = "
														+ Acknowledgement_IntiateExercise1);

												if (Acknowledgement_IntiateExercise1 == true) {

													ExerciseNow_Locator.Acknowledgement_IntiateExercise(driver).click();
													System.out.println("Click_to Acknowledgement_IntiateExercise");

													Thread.sleep(5000);
													test.log(LogStatus.PASS,
															" Click_to Acknowledgement_IntiateExercise:- "
																	+ Acknowledgement_IntiateExercise1);

												} else {

													System.err.println("No Click to Acknowledgement_IntiateExercise");
													test.log(LogStatus.FAIL,
															" No Click to Acknowledgement_IntiateExercise:- "
																	+ Acknowledgement_IntiateExercise1);

												}*/

											}

										}
									}

								}
							} else {

								System.err.println("UpdateDetails_Confirm Disable");
								test.log(LogStatus.FAIL, " UpdateDetails_Confirm Disable:- " + UpdateDetails_Confirm);

							}

						} else {

							System.err.println("Not Click on UpdateDetails");
							Thread.sleep(500);
							test.log(LogStatus.FAIL, "Not Click on UpdateDetails:-" + UpdateDetails);

						}
					}

				}
			} else {

				System.err.println("Not Click on the Continue");
				Thread.sleep(500);
				/*test.log(LogStatus.FAIL, " Not Click on the Continue :-" + selectPaymentMode_SavePaymentMode);*/

			}

		} /*else {

			System.err.println("Not Click on the Quantity Message Text");
			Thread.sleep(500);
			test.log(LogStatus.FAIL, " Not Click on the Quantity Message Text:- " + SelectPaymentModeCheque);

		}*/

															}
																	
																										
														