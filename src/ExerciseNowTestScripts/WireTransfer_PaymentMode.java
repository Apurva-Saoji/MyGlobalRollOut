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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locator;
import jxl.Sheet;
import jxl.Workbook;

public class WireTransfer_PaymentMode extends ExerciseNow {

	public void Exercise_Now(HSSFSheet sheet4, HSSFSheet sheet5, HSSFSheet sheet6, HSSFSheet sheet7, HSSFSheet sheet8,
			HSSFRow rowhead500, HSSFRow rowhead600, HSSFRow rowhead700, HSSFRow rowhead800, String GetAmount_Titile11,
			String GetAmount_Titile11A, String GetAmount_Titile12, String GetAmount_Titile12A,
			String GetAmount_Titile13, String GetAmount_Titile13A, String GetAmount_Titile14,
			String GetAmount_Titile14A, String InstrumentName, String CompanyID, String User, String GetInstrumnetValue)
			throws Exception {

		test = report.startTest("Exerciese  WireTransfer Payment Mode");

		String filepath = System.getProperty("user.dir") + "\\src\\Excels\\ExercieseOptions.xls";
		FileInputStream Exfile = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(Exfile);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Sheet sh2 = wb.getSheet("WireTransfer");
		int totalNoOfRows2 = sh2.getRows();

		System.out.println("Total number of rows are : " + totalNoOfRows2);
		Add_Log.info("Total number of rows are : " + totalNoOfRows2);
		// To get the number of columns present in sheet

		System.out.println("Total number of columns are : " + totalNoOfRows2);
		Add_Log.info("Total number of columns are : " + totalNoOfRows2);

		Boolean SelectPaymentModeWireTransfer = driver.findElements(By.className("kt-portlet-table-adj")).size() != 0;
		System.out.println(" Select Payment Mode WireTransfer =" + SelectPaymentModeWireTransfer);
		if (SelectPaymentModeWireTransfer == true) {

			Thread.sleep(2000);

			ExerciseNow_Locator.selectPaymentMode_WireTransfer(driver).click();
			System.out.println("Click on the WireTransfer radio Button ");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the WireTransfer radio Button:- " + SelectPaymentModeWireTransfer);

			ExerciseNow_Locator.selectPaymentModeWireTransfer_popUpClose(driver).click();
			System.out.println("Click on the select PaymentMode WireTransfer Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS,
					" Click on the select PaymentMode WireTransfer Button:- " + SelectPaymentModeWireTransfer);

			// *********** Select Payment Mode TaxAmount Tax Amount*************//

			ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
			System.out.println(" Click on the Tax_Amount Button");
			Thread.sleep(1000);
			test.log(LogStatus.PASS, " Click on the Tax_Amount Button:- " + SelectPaymentModeWireTransfer);

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
			test.log(LogStatus.PASS, " Click on the Tax_Amount Button close:- " + SelectPaymentModeWireTransfer);

			Thread.sleep(2000);
			// ****** Verify Tax Amount Value WireTransfer******//

			// Quantity
			String GetAmount_TitileWireTransfer22 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
					.getText();
			if (GetAmount_Titile11.equals(GetAmount_TitileWireTransfer22)) {

				System.out.println(GetAmount_TitileWireTransfer22 + ":- PASS");
				test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileWireTransfer22);

			} else {
				System.err.println(GetAmount_TitileWireTransfer22 + ":- FAIL");
				test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileWireTransfer22);

			}

			String GetAmount_TitileWireTransfer22A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']")).getText();
			if (GetAmount_Titile11A.equals(GetAmount_TitileWireTransfer22A)) {

				System.out.println(GetAmount_TitileWireTransfer22A + ":- PASS");
				test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileWireTransfer22A);

			} else {
				System.err.println(GetAmount_TitileWireTransfer22A + ":- FAIL");
				test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileWireTransfer22A);

			}
			Thread.sleep(100);

			// Exercise Amount
			String GetAmount_TitileWireTransfer23 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
					.getText();
			if (GetAmount_Titile12.equals(GetAmount_TitileWireTransfer23)) {

				System.out.println(GetAmount_TitileWireTransfer23 + ":- PASS");
				test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileWireTransfer23);

			} else {
				System.err.println(GetAmount_TitileWireTransfer23 + ":- FAIL");
				test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileWireTransfer23);

			}

			String GetAmount_TitileWireTransfer23A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseAmount']")).getText();

			if (GetAmount_Titile12A.equals(GetAmount_TitileWireTransfer23A)) {

				System.out.println(GetAmount_TitileWireTransfer23A + ":- PASS");
				test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileWireTransfer23A);

			} else {
				System.err.println(GetAmount_TitileWireTransfer23A + ":- FAIL");
				test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileWireTransfer23A);

			}
			Thread.sleep(100);

			// Tax Amount
			String GetAmount_TitileWireTransfer24 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
					.getText();
			String stringWireTransfer1 = new String(GetAmount_Titile13);
			String stringWireTransfer2 = new String(GetAmount_TitileWireTransfer24);

			if (stringWireTransfer1.equals(stringWireTransfer2)) {

				System.out.println(GetAmount_TitileWireTransfer24 + ":- PASS");
				test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_TitileWireTransfer24);

			} else {
				System.err.println(GetAmount_TitileWireTransfer24 + ":- FAIL");
				test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_TitileWireTransfer24);

			}

			String GetAmount_TitileWireTransfer24A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']")).getText();
			String stringWireTransfer3 = new String(GetAmount_Titile13A);
			String stringWireTransfer4 = new String(GetAmount_TitileWireTransfer24A);
			System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileWireTransfer24A);

			if (stringWireTransfer3.equals(stringWireTransfer4)) {

				System.out.println(GetAmount_TitileWireTransfer24A + ":- PASS");
				test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_TitileWireTransfer24A);

			} else {
				System.err.println(GetAmount_TitileWireTransfer24A + ":- FAIL");
				test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_TitileWireTransfer24A);

			}
			Thread.sleep(100);

			// Total Amount Payable
			String GetAmount_TitileWireTransfer25 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[2]/tr/td[1]/span/span"))
					.getText();
			if (GetAmount_Titile14.equals(GetAmount_TitileWireTransfer25)) {

				System.out.println(GetAmount_TitileWireTransfer25 + ":- PASS");
				test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileWireTransfer25);

			} else {
				System.err.println(GetAmount_TitileWireTransfer25 + ":- FAIL");
				test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileWireTransfer25);

			}
			String GetAmount_TitileWireTransfer25A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']")).getText();
			if (GetAmount_Titile14A.equals(GetAmount_TitileWireTransfer25A)) {

				System.out.println(GetAmount_TitileWireTransfer25A + ":- PASS");
				test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileWireTransfer25A);

			} else {
				System.err.println(GetAmount_TitileWireTransfer25A + ":- FAIL");
				test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileWireTransfer25A);

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
				test.log(LogStatus.PASS, " Click on the Continue Button:- " + selectPaymentMode_SavePaymentMode);

				for (int row2 = 1; row2 < totalNoOfRows2; row2++) {

					String Reference_ID_Enter = sh2.getCell(0, row2).getContents();
					System.out.println("  Reference_ID_Enter  = " + Reference_ID_Enter);
					Add_Log.info(" Reference_ID_Enter " + Reference_ID_Enter);

					String ABN_Routing_Enter = sh2.getCell(1, row2).getContents();
					System.out.println("ABN_Routing_Enter  = " + ABN_Routing_Enter);
					Add_Log.info("ABN_Routing_Enter " + ABN_Routing_Enter);

					String BankName_TransferredFrom_Enter = sh2.getCell(2, row2).getContents();
					System.out.println(" BankName_TransferredFrom_Enter = " + BankName_TransferredFrom_Enter);
					Add_Log.info(" BankName_TransferredFrom_Enter " + BankName_TransferredFrom_Enter);

					String Bank_Branch_Enter = sh2.getCell(3, row2).getContents();
					System.out.println(" Bank_Branch_Enter = " + Bank_Branch_Enter);
					Add_Log.info(" Bank_Branch_Enter" + Bank_Branch_Enter);

					String Bank_Account_Number_Enter = sh2.getCell(4, row2).getContents();
					System.out.println(" Bank_Account_Number_Enter  = " + Bank_Account_Number_Enter);
					Add_Log.info(" Bank_Account_Number_Enter" + Bank_Account_Number_Enter);

					String Wire_Transfer_Date_Enter = sh2.getCell(5, row2).getContents();
					System.out.println("  Wire_Transfer_Date_Enter = " + Wire_Transfer_Date_Enter);
					Add_Log.info(" Wire_Transfer_Date_Enter " + Wire_Transfer_Date_Enter);

					String Reference_ID2_Enter = sh2.getCell(6, row2).getContents();
					System.out.println("Reference_ID2_Enter  = " + Reference_ID2_Enter);
					Add_Log.info(" Reference_ID2_Enter " + Reference_ID2_Enter);

					String ABN_Routing2_Enter = sh2.getCell(7, row2).getContents();
					System.out.println("ABN_Routing2_Enter  = " + ABN_Routing2_Enter);
					Add_Log.info("ABN_Routing2_Enter  " + ABN_Routing2_Enter);

					String BankName_TransferredFrom2_Enter = sh2.getCell(8, row2).getContents();
					System.out.println("BankName_TransferredFrom2_Enter = " + BankName_TransferredFrom2_Enter);
					Add_Log.info(" BankName_TransferredFrom2_Enter	 " + BankName_TransferredFrom2_Enter);

					String Bank_Branch2_Enter = sh2.getCell(9, row2).getContents();
					System.out.println(" Bank_Branch2_Enter  = " + Bank_Branch2_Enter);
					Add_Log.info(" Bank_Branch2_Enter " + Bank_Branch2_Enter);

					String Bank_Account_Number2_Enter = sh2.getCell(10, row2).getContents();
					System.out.println(" Bank_Account_Number2_Enter = " + Bank_Account_Number2_Enter);
					Add_Log.info("Bank_Account_Number2_Enter" + Bank_Account_Number2_Enter);

					String Wire_Transfer_Date2_Enter = sh2.getCell(11, row2).getContents();
					System.out.println("Wire_Transfer_Date2_Enter = " + Wire_Transfer_Date2_Enter);
					Add_Log.info("Wire_Transfer_Date2_Enter" + Wire_Transfer_Date2_Enter);

					String Broker_Account_Enter = sh2.getCell(12, row2).getContents();
					System.out.println(" Broker_Account_Enter = " + Broker_Account_Enter);
					Add_Log.info("Broker_Account_Enter" + Broker_Account_Enter);

					String PAN_Number_Enter = sh2.getCell(13, row2).getContents();
					System.out.println(" PAN_Number_Enter = " + PAN_Number_Enter);
					Add_Log.info("PAN_Number_Enter " + PAN_Number_Enter);

					String ResidentialStatus_Enter = sh2.getCell(14, row2).getContents();
					System.out.println(" ResidentialStatus_Enter = " + ResidentialStatus_Enter);
					Add_Log.info("ResidentialStatus_Enter  " + ResidentialStatus_Enter);

					String Location_Enter = sh2.getCell(15, row2).getContents();
					System.out.println("Location_Enter = " + Location_Enter);
					Add_Log.info(" Location_Enter  " + Location_Enter);

					String Nationality_Enter = sh2.getCell(16, row2).getContents();
					System.out.println("Nationality_Enter = " + Nationality_Enter);
					Add_Log.info("Nationality_Enter " + Nationality_Enter);

					String CountryName_Enter = sh2.getCell(17, row2).getContents();
					System.out.println("CountryName_Enter  = " + CountryName_Enter);
					Add_Log.info("CountryName_Enter " + CountryName_Enter);

					String Contact_Number_Enter = sh2.getCell(18, row2).getContents();
					System.out.println(" Contact_Number_Enter= " + Contact_Number_Enter);
					Add_Log.info(" Contact_Number_Enter" + Contact_Number_Enter);

					// ************************* Update Details Tax Amount ***********************//

					ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
					System.out.println(" Click on the Tax_Amount Button");
					Thread.sleep(1000);
					test.log(LogStatus.PASS, " Click on the Tax_Amount Button:- " + selectPaymentMode_SavePaymentMode);

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

					Thread.sleep(2000);
					// ****** Verify Tax Amount Value WireTransfer********//

					// Quantity
					String GetAmount_TitileWireTransfer32 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
							.getText();
					if (GetAmount_Titile11.equals(GetAmount_TitileWireTransfer32)) {

						System.out.println(GetAmount_TitileWireTransfer32 + ":- PASS");
						test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileWireTransfer32);

					} else {
						System.err.println(GetAmount_TitileWireTransfer32 + ":- FAIL");
						test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileWireTransfer32);

					}

					String GetAmount_TitileWireTransfer32A = driver
							.findElement(By.xpath("//*[@id='ID_UpdateDetails_Quantity']")).getText();
					if (GetAmount_Titile11A.equals(GetAmount_TitileWireTransfer32A)) {

						System.out.println(GetAmount_TitileWireTransfer32A + ":- PASS");
						test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileWireTransfer32A);

					} else {
						System.err.println(GetAmount_TitileWireTransfer32A + ":- FAIL");
						test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileWireTransfer32A);

					}
					Thread.sleep(100);

					// Exercise Amount
					String GetAmount_TitileWireTransfer33 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/p"))
							.getText();
					if (GetAmount_Titile12.equals(GetAmount_TitileWireTransfer33)) {

						System.out.println(GetAmount_TitileWireTransfer33 + ":- PASS");
						test.log(LogStatus.PASS, "  Exercise Amount:- " + GetAmount_TitileWireTransfer33);

					} else {
						System.err.println(GetAmount_TitileWireTransfer33 + ":- FAIL");
						test.log(LogStatus.FAIL, "  Exercise Amount:- " + GetAmount_TitileWireTransfer33);

					}

					String GetAmount_TitileWireTransfer33A = driver
							.findElement(By.xpath("//*[@id='ID_UpdateDetails_ExerciseAmount']")).getText();

					if (GetAmount_Titile12A.equals(GetAmount_TitileWireTransfer33A)) {

						System.out.println(GetAmount_TitileWireTransfer33A + ":- PASS");
						test.log(LogStatus.PASS, "  Exercise Amount:- " + GetAmount_TitileWireTransfer33A);

					} else {
						System.err.println(GetAmount_TitileWireTransfer33A + ":- FAIL");
						test.log(LogStatus.FAIL, "  Exercise Amount:- " + GetAmount_TitileWireTransfer33A);

					}
					Thread.sleep(100);

					// Tax Amount
					String GetAmount_TitileWireTransfer34 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
							.getText();
					String stringWireTransfer5 = new String(GetAmount_Titile13);
					String stringWireTransfer6 = new String(GetAmount_TitileWireTransfer34);

					if (stringWireTransfer5.equals(stringWireTransfer6)) {

						System.out.println(GetAmount_TitileWireTransfer34 + ":- PASS");
						test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileWireTransfer34);

					} else {
						System.err.println(GetAmount_TitileWireTransfer34 + ":- FAIL");
						test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileWireTransfer34);

					}

					String GetAmount_TitileWireTransfer34A = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[1]/tr[3]/td[2]/ul/li/p"))
							.getText();
					String stringWireTransfer7 = new String(GetAmount_Titile13A);
					String stringWireTransfer8 = new String(GetAmount_TitileWireTransfer34A);
					System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileWireTransfer34A);

					if (stringWireTransfer7.equals(stringWireTransfer8)) {

						System.out.println(GetAmount_TitileWireTransfer34A + ":- PASS");
						test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileWireTransfer34A);

					} else {
						System.err.println(GetAmount_TitileWireTransfer34A + ":- FAIL");
						test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileWireTransfer34A);

					}
					Thread.sleep(100);

					// Total Amount Payable
					String GetAmount_TitileWireTransfer35 = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[1]/div[2]/div/table/tbody[2]/tr/td[1]/h4"))
							.getText();
					if (GetAmount_Titile14.equals(GetAmount_TitileWireTransfer35)) {

						System.out.println(GetAmount_TitileWireTransfer35 + ":- PASS");
						test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileWireTransfer35);

					} else {
						System.err.println(GetAmount_TitileWireTransfer35 + ":- FAIL");
						test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileWireTransfer35);

					}
					String GetAmount_TitileWireTransfer35A = driver
							.findElement(By.xpath("//*[@id='ID_UpdateDetails_TotalAmountPayable']")).getText();
					if (GetAmount_Titile14A.equals(GetAmount_TitileWireTransfer35A)) {

						System.out.println(GetAmount_TitileWireTransfer35A + ":- PASS");
						test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileWireTransfer35A);

					} else {
						System.err.println(GetAmount_TitileWireTransfer35A + ":- FAIL");
						test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileWireTransfer35A);

					}
					Thread.sleep(100);

					// ****************************************************************************//

					Boolean Reference_ID = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/input"))
							.size() != 0;
					System.out.println(" Reference_ID =" + Reference_ID);
					if (Reference_ID == true) {

						ExerciseNow_Locator.Reference_ID(driver).sendKeys(Reference_ID_Enter);
						System.out.println("Enter Reference_ID");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Reference_ID:- " + Reference_ID);

					} else {

						System.err.println("Not Enter Reference_ID");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Reference_ID:-" + Reference_ID);

					}

					Boolean ABN_Routing = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/input"))
							.size() != 0;
					System.out.println(" ABN_Routing=" + ABN_Routing);
					if (ABN_Routing == true) {

						ExerciseNow_Locator.ABN_Routing(driver).sendKeys(ABN_Routing_Enter);
						System.out.println("Enter ABN_Routing");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter ABN_Routing:- " + ABN_Routing);

					} else {

						System.err.println("Not Enter ABN_Routing");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Not Enter ABN_Routing:- " + ABN_Routing);

					}

					Boolean BankName_TransferredFrom = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div/input"))
							.size() != 0;
					System.out.println(" Bank Name Transferred From=" + BankName_TransferredFrom);
					if (BankName_TransferredFrom == true) {

						ExerciseNow_Locator.BankName_TransferredFrom(driver).sendKeys(BankName_TransferredFrom_Enter);
						System.out.println("Enter Bank Name Transferred From");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Bank Name Transferred From:-" + BankName_TransferredFrom);

					} else {

						System.err.println("Not Enter Bank Name Transferred From");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Bank Name Transferred From:- " + BankName_TransferredFrom);

					}

					Boolean Bank_Branch = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[4]/div/input"))
							.size() != 0;
					System.out.println(" Bank_Branch=" + Bank_Branch);
					if (Bank_Branch == true) {

						ExerciseNow_Locator.Bank_Branch(driver).sendKeys(Bank_Branch_Enter);

						System.out.println("Enter Bank Branch");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Bank Branch:- " + Bank_Branch);

					} else {

						System.err.println("Not Enter Bank Branch");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Bank Branch:- " + Bank_Branch);

					}

					Boolean Bank_Account_Number = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/input"))
							.size() != 0;
					System.out.println(" Bank_Account_Number" + Bank_Account_Number);
					if (Bank_Account_Number == true) {

						ExerciseNow_Locator.Bank_Account_Number(driver).sendKeys(Bank_Account_Number_Enter);

						System.out.println("Enter Bank_Account_Number");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Bank_Account_Number:- " + Bank_Account_Number);

					} else {

						System.err.println("Not Enter Bank_Account_Number");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Bank_Account_Number:- " + Bank_Account_Number);

					}

					Boolean Wire_Transfer_Date = driver.findElements(By.id("ID_UpdateDetails_WireTransferDate"))
							.size() != 0;
					System.out.println(" Wire_Transfer_Date " + Wire_Transfer_Date);
					if (Wire_Transfer_Date == true) {

						ExerciseNow_Locator.Wire_Transfer_Date(driver).sendKeys(Wire_Transfer_Date_Enter);

						System.out.println("Enter Wire_Transfer_Date ");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Wire_Transfer_Date:- " + Wire_Transfer_Date);

					} else {

						System.err.println("Not Enter Wire_Transfer_Date ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Wire_Transfer_Date:- " + Wire_Transfer_Date);

					}

					Boolean UploadFile1 = driver.findElements(By.id("file-upload")).size() != 0;
					System.out.println("UploadFile Click=" + UploadFile1);
					if (UploadFile1 == true) {

						Actions action = new Actions(driver);
						action.moveToElement(driver.findElement(By.id("file-upload"))).click().perform();
						// driver.findElement(By.id("file-upload")).sendKeys(Keys.ENTER);
						System.out.println("Click on UploadFile");
						Thread.sleep(1000);
						test.log(LogStatus.PASS, " Click on UploadFile:-" + UploadFile1);

					} else {

						System.err.println("Not Click UploadFile");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Click UploadFile:-" + UploadFile1);

					}

					Boolean UploadFile = driver.findElements(By.id("file-upload")).size() != 0;
					System.out.println("UploadFile=" + UploadFile);
					if (UploadFile == true) {

						Thread.sleep(5000);
						StringSelection str = new StringSelection(
								"D:\\Testing Team Automation\\MyGlobalRollOut\\src\\UploadFile\\sample.pdf");
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

						Robot robot = new Robot();
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);

						Thread.sleep(8000);
						ExerciseNow_Locator.UpdateDetails_Upload(driver).click();
						System.out.println("Click_to Upload Button");
						test.log(LogStatus.PASS, " Click_to Upload Button:- " + UploadFile);

						Thread.sleep(5000);
						ExerciseNow_Locator.Clickto_Ok_Button1(driver).click();
						System.out.println("Click_to Button");
						test.log(LogStatus.PASS, " Click_to Button:- " + UploadFile);

						Thread.sleep(1000);
						ExerciseNow_Locator.UpdateDetails_Preview(driver).click();
						System.out.println("Click_to Preview");
						test.log(LogStatus.PASS, " Click_to Preview:- " + UploadFile);

						Thread.sleep(5000);
						ExerciseNow_Locator.UpdateDetails_PreviewOK(driver).click();
						System.out.println("Click to Upload Form By Exercise FileName");
						Thread.sleep(3000);
						test.log(LogStatus.PASS, " Click to Upload Form By Exercise FileName:- " + UploadFile);
						Thread.sleep(3000);

					} else {

						System.err.println("Not Enter UploadFile");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter UploadFile:- " + UploadFile);

					}
					Boolean Reference_ID2 = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[1]/div/input"))
							.size() != 0;
					System.out.println(" Reference_ID2 =" + Reference_ID2);
					if (Reference_ID2 == true) {

						ExerciseNow_Locator.Reference_ID2(driver).sendKeys(Reference_ID2_Enter);

						System.out.println("Enter Reference_ID2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Reference_ID2:- " + Reference_ID2);

					} else {

						System.err.println("Not Enter Reference_ID2");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Reference_ID2:- " + Reference_ID2);

					}

					Boolean ABN_Routing2 = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/input"))
							.size() != 0;
					System.out.println(" ABN_Routin2=" + ABN_Routing2);
					if (ABN_Routing2 == true) {

						ExerciseNow_Locator.ABN_Routing2(driver).sendKeys(ABN_Routing2_Enter);

						System.out.println("Enter ABN_Routing2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter ABN_Routing2:-" + ABN_Routing2);

					} else {

						System.err.println("Not Enter ABN_Routing2");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter ABN_Routing2:-" + ABN_Routing2);

					}

					Boolean BankName_TransferredFrom2 = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/input"))
							.size() != 0;
					System.out.println(" Bank Name Transferred From2=" + BankName_TransferredFrom2);
					if (BankName_TransferredFrom2 == true) {

						ExerciseNow_Locator.BankName_TransferredFrom2(driver).sendKeys(BankName_TransferredFrom2_Enter);

						System.out.println("Enter Bank Name Transferred From2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter Bank Name Transferred From2:- " + BankName_TransferredFrom2);

					} else {

						System.err.println("Not Enter Bank Name Transferred From2");
						Thread.sleep(500);
						test.log(LogStatus.FAIL,
								"Not Enter Bank Name Transferred From2:- " + BankName_TransferredFrom2);

					}

					Boolean Bank_Branch2 = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[4]/div/input"))
							.size() != 0;
					System.out.println(" Bank_Branch2=" + Bank_Branch2);
					if (Bank_Branch2 == true) {

						ExerciseNow_Locator.Bank_Branch2(driver).sendKeys(Bank_Branch2_Enter);

						System.out.println("Enter Bank Branch2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Bank Branch2:- " + Bank_Branch2);

					} else {

						System.err.println("Not Enter Bank Branch2");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Not Enter Bank Branch2:- " + Bank_Branch2);

					}

					Boolean Bank_Account_Number2 = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[5]/div/input"))
							.size() != 0;
					System.out.println(" Bank_Account_Number2" + Bank_Account_Number2);
					if (Bank_Account_Number2 == true) {

						ExerciseNow_Locator.Bank_Account_Number2(driver).sendKeys(Bank_Account_Number2_Enter);

						System.out.println("Enter Bank_Account_Number2");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter Bank_Account_Number2:- " + Bank_Account_Number2);

					} else {

						System.err.println("Not Enter Bank_Account_Number2");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Bank_Account_Number2:- " + Bank_Account_Number2);

					}

					Boolean Wire_Transfer_Date2 = driver.findElements(By.id("ID_UpdateDetails_WireTransferDate"))
							.size() != 0;
					System.out.println(" Wire_Transfer_Date2 " + Wire_Transfer_Date2);
					if (Wire_Transfer_Date2 == true) {

						ExerciseNow_Locator.Wire_Transfer_Date2(driver).sendKeys(Wire_Transfer_Date2_Enter);

						System.out.println("Enter Wire_Transfer_Date2 ");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Enter Wire_Transfer_Date2:- " + Wire_Transfer_Date2);

					} else {

						System.err.println("Not Enter Wire_Transfer_Date2 ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Not Enter Wire_Transfer_Date2:-" + Wire_Transfer_Date2);

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

						Select BrokerAccount = new Select(driver.findElement(By.id("ID_UpdateDetails_BrokerAccount")));
						BrokerAccount.selectByVisibleText(BrokerAccount_Enter1);
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Broker_Account:-" + Broker_Account);

					} else {

						System.err.println("Not Enter Broker_Account ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Enter Broker_Account :- " + Broker_Account);

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

						test.log(LogStatus.PASS, " Demat Account Available :- " + DematAccount_Enter2);

					} else {

						System.err.println("Demat Account Not Available  ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Demat Account Not Available :-" + DematAccount_Enter2);

					}
					WebElement PAN_Number = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
					if (PAN_Number.isEnabled()) {

						ExerciseNow_Locator.PAN_Number(driver).clear();
						ExerciseNow_Locator.PAN_Number(driver).sendKeys(PAN_Number_Enter);
						System.out.println("PAN_Number Enabled");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " PAN_Number Enabled:- " + PAN_Number);

					} else {

						System.err.println("PAN_Number Disable ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " PAN_Number Disable:- " + PAN_Number);

					}

					WebElement ResidentialStatus = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
					if (ResidentialStatus.isEnabled()) {

						ExerciseNow_Locator.ResidentialStatus(driver).clear();
						ExerciseNow_Locator.ResidentialStatus(driver).sendKeys(ResidentialStatus_Enter);
						System.out.println("Residential Status Enabled");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Residential Status Enabled:-" + ResidentialStatus);

					} else {

						System.err.println("Residential Status Disable ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Residential Status Disable:-" + ResidentialStatus);

					}

					WebElement Location = driver.findElement(By.id("ID_UpdateDetails_Location"));
					if (Location.isEnabled()) {

						ExerciseNow_Locator.Wire_TransferLocation(driver).clear();
						ExerciseNow_Locator.Wire_TransferLocation(driver).sendKeys(Location_Enter);
						System.out.println("Location Enabled");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Location Enabled:-" + Location);

					} else {

						System.err.println("Location Disable ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Location Disable:-" + Location);

					}

					WebElement Nationality = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
					if (Nationality.isEnabled()) {

						ExerciseNow_Locator.Wire_TransferNationality(driver).clear();
						ExerciseNow_Locator.Wire_TransferNationality(driver).sendKeys(Nationality_Enter);
						System.out.println("Nationality Enabled");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Nationality Enabled:-" + Nationality);

					} else {

						System.err.println("Nationality Disable ");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Nationality Disable:- " + Nationality);

					}

					WebElement Country_NameWireTransfer = driver.findElement(By.id("ID_MyProfile_Country"));
					if (Country_NameWireTransfer.isEnabled()) {

						driver.findElement(By.id("ID_MyProfile_Country")).click();
						Select Country_Name_WireTransfer1 = new Select(
								driver.findElement(By.id("ID_MyProfile_Country")));
						Country_Name_WireTransfer1.selectByVisibleText(CountryName_Enter);
						System.out.println("Enter Country_Name");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Enter Country_Name:-" + Country_NameWireTransfer);

					} else {

						System.err.println("Country_Name Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, "Country_Name Disable:- " + Country_NameWireTransfer);

					}

					WebElement Contact_Number = driver.findElement(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
					if (Contact_Number.isEnabled()) {

						ExerciseNow_Locator.Wire_TransferContact_Number(driver).clear();
						ExerciseNow_Locator.Wire_TransferContact_Number(driver).sendKeys(Contact_Number_Enter);
						System.out.println("Contact Number Enabled");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Contact Number Enabled:- " + Contact_Number);

					} else {

						System.err.println("Contact Number Disable");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Contact Number Disable:- " + Contact_Number);

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
							test.log(LogStatus.PASS,
									" Wire_TransferUpdateDetails_Confirm Enabled:- " + UpdateDetails_Confirm);

							ExerciseNow_Locator.UpdateDetails_ConfirmPopUp(driver).sendKeys(Keys.ENTER);
							System.out.println("Click on the UpdateDetails Confirm PopUp Button");
							Thread.sleep(2000);
							test.log(LogStatus.PASS,
									" Click on the UpdateDetails Confirm PopUp Button:- " + UpdateDetails_Confirm);

							if (InstrumentName.equals("VerifyInProcess_Card")) {

								Boolean Exerciese_Options2 = driver.findElements(By.linkText("Exercise Options"))
										.size() != 0;
								System.out.println(" Exerciese_Options2 =" + Exerciese_Options2);
								if (Exerciese_Options2 == true) {

									ExerciseNow_Locator.Exerciese_Options(driver).click();
									System.out.println("Click on the Exerciese Options ");
									Thread.sleep(500);
									test.log(LogStatus.PASS, "Click on the Exerciese Options:-" + Exerciese_Options2);

								} else {

									System.err.println("Not Click on the Exerciese_Options ");
									Thread.sleep(500);
									test.log(LogStatus.FAIL,
											"Not Click on the Exerciese_Options :- " + Exerciese_Options2);

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

							// ************* Exercise Declaration Tax Amount*******//

							ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
							System.out.println(" Click on the Tax_Amount Button");
							Thread.sleep(1000);
							test.log(LogStatus.PASS, " Click on the Tax_Amount Button:- " + UpdateDetails_Confirm);

							int getCountExercise_Declaration = driver.findElements(By.className("has-table")).size();
							System.err.println("= " + getCountExercise_Declaration);
							Thread.sleep(1000);

							int getCountExercise_Declaration2 = driver
									.findElements(
											By.xpath("//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
									.size();
							System.err.println("= " + getCountExercise_Declaration2);

							String GetAmount_TitileExercise_Declaration = driver
									.findElement(By.xpath("//*[@id='heading0']/a/h4")).getText();
							sheet7.createRow(0).createCell(1).setCellValue(GetAmount_TitileExercise_Declaration);

							for (int i = 1; i <= 4; i++) {

								String GetAmount_TitileExercise_Declaration1 = driver
										.findElement(By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]"))
										.getText();
								rowhead700.createCell(i).setCellValue(GetAmount_TitileExercise_Declaration1);
								Thread.sleep(100);

							}
							for (int j = 1; j < 4; j++) {

								String GetAmount_TitileExercise_Declaration2 = driver.findElement(By.xpath(
										"//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th[" + j + "]"))
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
										rowhead703.createCell(k).setCellValue(GetAmount_TitileExercise_Declaration3);
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
										rowhead703.createCell(k).setCellValue(GetAmount_TitileExercise_Declaration3);
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

									HSSFRow rowhead705 = sheet7.createRow((m * getCountExercise_Declaration2) + p - 1);

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
										.findElement(By.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]"))
										.getText();
								rowhead706.createCell(n * 2).setCellValue(GetAmount_TitileExercise_Declaration6);
								Thread.sleep(100);
							}
							ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
							System.out.println(" Click on the Tax_Amount Button close");
							test.log(LogStatus.PASS,
									" Click on the Tax_Amount Button close:- " + UpdateDetails_Confirm);

							Thread.sleep(2000);
							// ******* Verify Tax Amount Value WireTransfer*****//

							// Quantity

							String GetAmount_TitileWireTransfer42 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
									.getText();
							if (GetAmount_Titile11.equals(GetAmount_TitileWireTransfer42)) {

								System.out.println(GetAmount_TitileWireTransfer42 + ":- PASS");
								test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileWireTransfer42);

							} else {
								System.err.println(GetAmount_TitileWireTransfer42 + ":- FAIL");
								test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileWireTransfer42);

							}

							String GetAmount_TitileWireTransfer42A = driver
									.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedQuantity']")).getText();
							System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileWireTransfer42A);

							if (GetAmount_Titile11A.equals(GetAmount_TitileWireTransfer42A)) {

								System.out.println(GetAmount_TitileWireTransfer42A + ":- PASS");
								test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileWireTransfer42A);

							} else {
								System.err.println(GetAmount_TitileWireTransfer42A + ":- FAIL");
								test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileWireTransfer42A);

							}
							Thread.sleep(100);

							// Exercise Amount
							String GetAmount_TitileWireTransfer43 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
									.getText();
							if (GetAmount_Titile12.equals(GetAmount_TitileWireTransfer43)) {

								System.out.println(GetAmount_TitileWireTransfer43 + ":- PASS");
								test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileWireTransfer43);

							} else {
								System.err.println(GetAmount_TitileWireTransfer43 + ":- FAIL");
								test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileWireTransfer43);

							}

							String GetAmount_TitileWireTransfer43A = driver
									.findElement(By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']")).getText();

							if (GetAmount_Titile12A.equals(GetAmount_TitileWireTransfer43A)) {

								System.out.println(GetAmount_TitileWireTransfer43A + ":- PASS");
								test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileWireTransfer43A);

							} else {
								System.err.println(GetAmount_TitileWireTransfer43A + ":- FAIL");
								test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileWireTransfer43A);

							}
							Thread.sleep(100);

							// Tax Amount
							String GetAmount_TitileWireTransfer44 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
									.getText();
							String stringWireTransfer9 = new String(GetAmount_Titile13);
							String stringWireTransfer10 = new String(GetAmount_TitileWireTransfer44);

							if (stringWireTransfer9.equals(stringWireTransfer10)) {

								System.out.println(GetAmount_TitileWireTransfer44 + ":- PASS");
								test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileWireTransfer44);

							} else {
								System.err.println(GetAmount_TitileWireTransfer44 + ":- FAIL");
								test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileWireTransfer44);

							}

							String GetAmount_TitileWireTransfer44A = driver
									.findElement(By.xpath("//*[@id='ID_DeclarationForm_TaxAmount']")).getText();
							String stringWireTransfer11 = new String(GetAmount_Titile13A);
							String stringWireTransfer12 = new String(GetAmount_TitileWireTransfer44A);
							System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileWireTransfer44A);

							if (stringWireTransfer11.equals(stringWireTransfer12)) {

								System.out.println(GetAmount_TitileWireTransfer44A + ":- PASS");
								test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileWireTransfer44A);

							} else {
								System.err.println(GetAmount_TitileWireTransfer44A + ":- FAIL");
								test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileWireTransfer44A);

							}
							Thread.sleep(100);

							// Total Amount Payable
							String GetAmount_TitileWireTransfer45 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
									.getText();
							if (GetAmount_Titile14.equals(GetAmount_TitileWireTransfer45)) {

								System.out.println(GetAmount_TitileWireTransfer45 + ":- PASS");
								test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileWireTransfer45);

							} else {
								System.err.println(GetAmount_TitileWireTransfer45 + ":- FAIL");
								test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileWireTransfer45);

							}
							String GetAmount_TitileWireTransfer45A = driver
									.findElement(By.xpath("//*[@id='ID_DeclarationForm_TotalAmntPayable']")).getText();
							if (GetAmount_Titile14A.equals(GetAmount_TitileWireTransfer45A)) {

								System.out.println(GetAmount_TitileWireTransfer45A + ":- PASS");
								test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileWireTransfer45A);

							} else {
								System.err.println(GetAmount_TitileWireTransfer45A + ":- FAIL");
								test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileWireTransfer45A);

							}
							Thread.sleep(100);

							// ****************************************************************************//
							Thread.sleep(2000);

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
									test.log(LogStatus.PASS,
											"Click on the Payment checkbox Butto:- " + Payment_checkbox);

									Thread.sleep(1000);

									Boolean ExercisedSubmitDownload1 = driver
											.findElements(By.id("ID_DeclarationForm_ExercisedSubmitDownload"))
											.size() != 0;
									System.out.println("ExercisedSubmitDownload = " + ExercisedSubmitDownload1);
									test.log(LogStatus.PASS, " ExercisedSubmitDownload:-  " + Payment_checkbox);

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
													test.log(LogStatus.PASS,
															" Click on the Exerciese Options:- " + Exerciese_Options3);

												} else {

													System.err.println("Not Click on the Exerciese_Options ");
													Thread.sleep(500);
													test.log(LogStatus.FAIL, " Not Click on the Exerciese_Options:-"
															+ Exerciese_Options3);

												}
												Thread.sleep(5000);

												int Get_Status12 = driver.findElements(By.className("btn-link2"))
														.size();
												System.out.println(Get_Status12 + "");
												for (int Index1 = 1; Index1 <= Get_Status12; Index1++) {

													Boolean Get_Status14 = driver.findElements(By.xpath(
															"//div[" + Index1 + "]//div/div[2]/div/div/button/span"))
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
											test.log(LogStatus.PASS,
													"  Click on the Tax_Amount Button:- " + Upload_Form);

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
											sheet8.createRow(0).createCell(1)
													.setCellValue(GetAmount_TitileAcknowledgement);

											for (int i = 1; i <= 4; i++) {

												String GetAmount_TitileAcknowledgement1 = driver.findElement(By
														.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]"))
														.getText();
												rowhead800.createCell(i).setCellValue(GetAmount_TitileAcknowledgement1);
												Thread.sleep(100);

											}
											for (int j = 1; j < 4; j++) {

												String GetAmount_TitileAcknowledgement2 = driver.findElement(By.xpath(
														"//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th["
																+ j + "]"))
														.getText();
												rowhead800.createCell(4 + j)
														.setCellValue(GetAmount_TitileAcknowledgement2);
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

											HSSFRow rowhead806 = sheet8.createRow(
													(getCountAcknowledgement * getCountAcknowledgement2) + 3);

											for (int n = 1; n < 4; n++) {

												String GetAmount_TitileAcknowledgement6 = driver.findElement(By
														.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]"))
														.getText();
												rowhead806.createCell(n * 2)
														.setCellValue(GetAmount_TitileAcknowledgement6);
												Thread.sleep(100);
											}
											ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
											System.out.println(" Click on the Tax_Amount Button close");

											Thread.sleep(3000);
											// ***************** Verify Tax Amount Value WireTransafer *******//
											// Quantity

											String GetAmount_TitileWireTransfer52 = driver.findElement(By.xpath(
													"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
													.getText();
											if (GetAmount_Titile11.equals(GetAmount_TitileWireTransfer52)) {

												System.out.println(GetAmount_TitileWireTransfer52 + ":- PASS");
												test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileWireTransfer52);

											} else {
												System.err.println(GetAmount_TitileWireTransfer52 + ":- FAIL");
												test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileWireTransfer52);

											}

											String GetAmount_TitileWireTransfer52A = driver
													.findElement(
															By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']"))
													.getText();
											System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileWireTransfer52A);

											if (GetAmount_Titile11A.equals(GetAmount_TitileWireTransfer52A)) {

												System.out.println(GetAmount_TitileWireTransfer52A + ":- PASS");
												test.log(LogStatus.PASS, " Quantity:- " + GetAmount_TitileWireTransfer52A);

											} else {
												System.err.println(GetAmount_TitileWireTransfer52A + ":- FAIL");
												test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_TitileWireTransfer52A);

											}
											Thread.sleep(100);

											// Exercise Amount
											String GetAmount_TitileWireTransfer53 = driver.findElement(By.xpath(
													"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
													.getText();
											if (GetAmount_Titile12.equals(GetAmount_TitileWireTransfer53)) {

												System.out.println(GetAmount_TitileWireTransfer53 + ":- PASS");
												test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileWireTransfer53);

											} else {
												System.err.println(GetAmount_TitileWireTransfer53 + ":- FAIL");
												test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileWireTransfer53);

											}

											String GetAmount_TitileWireTransfer53A = driver
													.findElement(
															By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']"))
													.getText();

											if (GetAmount_Titile12A.equals(GetAmount_TitileWireTransfer53A)) {

												System.out.println(GetAmount_TitileWireTransfer53A + ":- PASS");
												test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_TitileWireTransfer53A);

											} else {
												System.err.println(GetAmount_TitileWireTransfer53A + ":- FAIL");
												test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_TitileWireTransfer53A);

											}
											Thread.sleep(100);

											// Tax Amount
											String GetAmount_TitileWireTransfer54 = driver.findElement(By.xpath(
													"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
													.getText();
											String stringWireTransfer13 = new String(GetAmount_Titile13);
											String stringWireTransfer14 = new String(GetAmount_TitileWireTransfer54);

											if (stringWireTransfer13.equals(stringWireTransfer14)) {

												System.out.println(GetAmount_TitileWireTransfer54 + ":- PASS");
												test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileWireTransfer54);

											} else {
												System.err.println(GetAmount_TitileWireTransfer54 + ":- FAIL");
												test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileWireTransfer54);

											}

											String GetAmount_TitileWireTransfer54A = driver
													.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
													.getText();
											String stringWireTransfer15 = new String(GetAmount_Titile13A);
											String stringWireTransfer16 = new String(GetAmount_TitileWireTransfer54A);
											System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileWireTransfer54A);

											if (stringWireTransfer15.equals(stringWireTransfer16)) {

												System.out.println(GetAmount_TitileWireTransfer54A + ":- PASS");
												test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_TitileWireTransfer54A);

											} else {
												System.err.println(GetAmount_TitileWireTransfer54A + ":- FAIL");
												test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_TitileWireTransfer54A);

											}
											Thread.sleep(100);

											// Total Amount Payable
											String GetAmount_TitileWireTransfer56 = driver.findElement(By.xpath(
													"//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
													.getText();
											if (GetAmount_Titile14.equals(GetAmount_TitileWireTransfer56)) {

												System.out.println(GetAmount_TitileWireTransfer56 + ":- PASS");
												test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileWireTransfer56);

											} else {
												System.err.println(GetAmount_TitileWireTransfer56 + ":- FAIL");
												test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileWireTransfer56);

											}
											String GetAmount_TitileWireTransfer56A = driver
													.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']"))
													.getText();
											if (GetAmount_Titile14A.equals(GetAmount_TitileWireTransfer56A)) {

												System.out.println(GetAmount_TitileWireTransfer56A + ":- PASS");
												test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_TitileWireTransfer56A);

											} else {
												System.err.println(GetAmount_TitileWireTransfer56A + ":- FAIL");
												test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_TitileWireTransfer56A);

											}
											Thread.sleep(1000);
											Boolean ViewExercise_Form = driver
													.findElements(By.className("download-form-wrap")).size() != 0;
											System.out.println("ExercisedSubmitDownload = " + ExercisedSubmitDownload1);

											if (ViewExercise_Form == true) {

												ExerciseNow_Locator.ViewExercise_Form_Click(driver).click();
												System.out.println("Click on the View Exercise Form");
												test.log(LogStatus.PASS,
														" Click on the View Exercise Form:- " + ViewExercise_Form);

												Thread.sleep(5000);

												Boolean Download_Button_ExerciseForm = driver
														.findElements(By.className("download-form-wrap")).size() != 0;
												System.out.println("Download_Button_ExerciseForm = "
														+ Download_Button_ExerciseForm);

												if (Download_Button_ExerciseForm == true) {

													ExerciseNow_Locator.Download_ButtonClick_ExerciseForm(driver)
															.click();
													System.out.println("Click on the Download_Button_ExerciseForm");

													Thread.sleep(5000);

													Boolean Click_toBrowse = driver
															.findElements(By.className("download-form-wrap"))
															.size() != 0;
													System.out.println("Click to Browse = " + Click_toBrowse);

													if (Click_toBrowse == true) {

														ExerciseNow_Locator.Click_toBrowse(driver).click();
														System.out.println("Click_to Browse");
														test.log(LogStatus.PASS,
																" Click_to Browse:- " + Click_toBrowse);

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
																	.selectPaymentMode_SavePaymentMode(driver).click();
															System.out.println(
																	"Click_to selectPaymentMode_SavePaymentMode");
															test.log(LogStatus.PASS,
																	" Click_to selectPaymentMode_SavePaymentMode:- "
																			+ selectPaymentMode_SavePaymentMode1);

															Thread.sleep(5000);

															Boolean selectPaymentMode_alert1 = driver.findElements(By
																	.xpath("//*[@id='alert-exercise-success-modal']/div/div"))
																	.size() != 0;
															System.out.println("selectPaymentMode_alert= "
																	+ selectPaymentMode_alert1);
															test.log(LogStatus.PASS, " selectPaymentMode_alert:- "
																	+ selectPaymentMode_SavePaymentMode1);

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
																test.log(LogStatus.FAIL, "" + GetText);

																if (GetText.equals("File is not Successfully upload")) {

																	driver.findElement(By.xpath(
																			"//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"))
																			.click();
																	System.err.println(".....Fail");
																	test.log(LogStatus.FAIL, " .....Fail:- " + GetText);

																	break;
																} else {

																	System.out.println("File is Successfully upload");

																	Thread.sleep(5000);

																	Boolean Acknowledgement_IntiateExercise1 = driver
																			.findElements(By.id(
																					"ID_Acknowledgement_IntiateExercise"))
																			.size() != 0;
																	System.out.println(
																			"Acknowledgement_IntiateExercise = "
																					+ Acknowledgement_IntiateExercise1);
																	test.log(LogStatus.PASS,
																			" Acknowledgement_IntiateExercise:- "
																					+ Acknowledgement_IntiateExercise1);

																	if (Acknowledgement_IntiateExercise1 == true) {

																		ExerciseNow_Locator
																				.Acknowledgement_IntiateExercise(driver)
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

																}

																System.out.println("Select Payment Alert");
																test.log(LogStatus.PASS, " Select Payment Alert:- "
																		+ selectPaymentMode_alert1);

															}
														} else {

															System.err.println(
																	"Not Click to selectPaymentMode_SavePaymentMode");
															test.log(LogStatus.FAIL,
																	"Not Click to selectPaymentMode_SavePaymentMode:- "
																			+ Click_toBrowse);

														}

													} else {

														System.err.println("Not Click to Ok Button");
														test.log(LogStatus.FAIL, " Not Click to Ok Button:- "
																+ Download_Button_ExerciseForm);

													}
												}

											} else {

												System.err.println("Not click on the View Exercise Form");
												test.log(LogStatus.FAIL,
														"Not click on the View Exercise Form:- " + Upload_Form);

											}
										} else {

											System.err.println("ExercisedSubmitDownload Disable");
											Thread.sleep(5000);
											test.log(LogStatus.FAIL,
													"ExercisedSubmitDownload Disable:- " + ExercisedSubmitDownload1);

											Boolean Acknowledgement_IntiateExercise1 = driver
													.findElements(By.id("ID_Acknowledgement_IntiateExercise"))
													.size() != 0;
											System.out.println("Acknowledgement_IntiateExercise = "
													+ Acknowledgement_IntiateExercise1);

											if (Acknowledgement_IntiateExercise1 == true) {

												ExerciseNow_Locator.Acknowledgement_IntiateExercise(driver).click();
												System.out.println("Click_to Acknowledgement_IntiateExercise");

												Thread.sleep(5000);
												test.log(LogStatus.PASS, " Click_to Acknowledgement_IntiateExercise:- "
														+ Acknowledgement_IntiateExercise1);

											} else {

												System.err.println("No Click to Acknowledgement_IntiateExercise");
												test.log(LogStatus.FAIL,
														" No Click to Acknowledgement_IntiateExercise:- "
																+ Acknowledgement_IntiateExercise1);

											}
										}

									}
								}

							}

						} else {

							System.err.println("Wire_TransferUpdateDetails_Confirm Disable");
							test.log(LogStatus.FAIL, " Wire_TransferUpdateDetails_Confirm:-" + UpdateDetails_Confirm);

						}
					} else {

						System.err.println("Not Click on the Check_box ");
						test.log(LogStatus.FAIL, " Not Click on the Check_box:- " + Check_box);

					}

				}
			} else {

				System.err.println("Not Click on the Continue");
				test.log(LogStatus.FAIL, " Not Click on the Continue:- " + selectPaymentMode_SavePaymentMode);

			}

		} else {

			System.err.println("Not Click on SelectPaymentMode");
			test.log(LogStatus.FAIL, " Not Click on SelectPaymentMode:- " + SelectPaymentModeWireTransfer);

		}
	}
}