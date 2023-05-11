package ExerciseNowTestScripts;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locator;
import Locators.Login_Locator;
import jxl.Sheet;
import jxl.Workbook;

public class Online_PaymentMode extends ExerciseNow {

	public void Exercise_Now(HSSFSheet sheet4, HSSFSheet sheet5, HSSFSheet sheet6, HSSFSheet sheet7, HSSFRow rowhead500,
			HSSFRow rowhead600, HSSFRow rowhead700, String GetAmount_Titile11, String GetAmount_Titile11A,
			String GetAmount_Titile12, String GetAmount_Titile12A, String GetAmount_Titile13,
			String GetAmount_Titile13A, String GetAmount_Titile14, String GetAmount_Titile14A) throws Exception {

		test = report.startTest("Exerciese Online Payment Mode");

		String filepath = System.getProperty("user.dir") + "\\src\\Excels\\ExercieseOptions.xls";
		FileInputStream Exfile = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(Exfile);

		Sheet sh1 = wb.getSheet("OnlineMode");
		int totalNoOfRows1 = sh1.getRows();

		System.out.println("Total number of rows are : " + totalNoOfRows1);
		Add_Log.info("Total number of rows are : " + totalNoOfRows1);
		// To get the number of columns present in sheet

		System.out.println("Total number of columns are : " + totalNoOfRows1);
		Add_Log.info("Total number of columns are : " + totalNoOfRows1);

		Boolean SelectPaymentModeOnline = driver.findElements(By.className("kt-portlet-table-adj")).size() != 0;
		System.out.println(" Select Payment Mode Online  =" + SelectPaymentModeOnline);
		if (SelectPaymentModeOnline == true) {

			Thread.sleep(2000);

			ExerciseNow_Locator.selectPaymentMode_Online(driver).click();
			System.out.println("Click on the Online_radio Button Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the Online_radio Button Button " + SelectPaymentModeOnline);

			ExerciseNow_Locator.selectPaymentModeOnline_popUpClose(driver).click();
			System.out.println("Click on the select PaymentMode Online Button");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, " Click on the select PaymentMode Online Button " + SelectPaymentModeOnline);

			// ********** Select Payment Mode TaxAmount Tax Amount*******************//

			ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
			System.out.println(" Click on the Tax_Amount Button");
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "  Click on the Tax_Amount Button " + SelectPaymentModeOnline);

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
			test.log(LogStatus.PASS, " Click on the Tax_Amount Button close " + SelectPaymentModeOnline);

			// ************** Verify Tax Amount Value Online************//

			// Quantity
			String GetAmount_TitileOnline22 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
					.getText();
			if (GetAmount_Titile11.equals(GetAmount_TitileOnline22)) {

				System.out.println(GetAmount_TitileOnline22 + ":- PASS");
				test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileOnline22);

			} else {
				System.err.println(GetAmount_TitileOnline22 + ":- FAIL");
				test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileOnline22);

			}

			String GetAmount_TitileOnline22A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseQuantity']")).getText();
			if (GetAmount_Titile11A.equals(GetAmount_TitileOnline22A)) {

				System.out.println(GetAmount_TitileOnline22A + ":- PASS");
				test.log(LogStatus.PASS," Quantity:- " + GetAmount_TitileOnline22A);

			} else {
				System.err.println(GetAmount_TitileOnline22A + ":- FAIL");
				test.log(LogStatus.FAIL," Quantity:- " + GetAmount_TitileOnline22A);

			}
			Thread.sleep(100);

			// Exercise Amount
			String GetAmount_TitileOnline23 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
					.getText();
			if (GetAmount_Titile12.equals(GetAmount_TitileOnline23)) {

				System.out.println(GetAmount_TitileOnline23 + ":- PASS");
				test.log(LogStatus.PASS," Exercise Amount:- " + GetAmount_TitileOnline23);

			} else {
				System.err.println(GetAmount_TitileOnline23 + ":- FAIL");
				test.log(LogStatus.FAIL," Exercise Amount:- " + GetAmount_TitileOnline23);

			}

			String GetAmount_TitileOnline23A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_ExerciseAmount']")).getText();

			if (GetAmount_Titile12A.equals(GetAmount_TitileOnline23A)) {

				System.out.println(GetAmount_TitileOnline23A + ":- PASS");
				test.log(LogStatus.PASS," Exercise Amount:- " + GetAmount_TitileOnline23A);

			} else {
				System.err.println(GetAmount_TitileOnline23A + ":- FAIL");
				test.log(LogStatus.FAIL," Exercise Amount:- " + GetAmount_TitileOnline23A);

			}
			Thread.sleep(100);

			// Tax Amount
			String GetAmount_TitileOnline24 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
					.getText();
			String stringOnline1 = new String(GetAmount_Titile13);
			String stringOnline2 = new String(GetAmount_TitileOnline24);

			if (stringOnline1.equals(stringOnline2)) {

				System.out.println(GetAmount_TitileOnline24 + ":- PASS");
				test.log(LogStatus.PASS," Tax Amount:- " + GetAmount_TitileOnline24);

			} else {
				System.err.println(GetAmount_TitileOnline24 + ":- FAIL");
				test.log(LogStatus.FAIL," Tax Amount:- " + GetAmount_TitileOnline24);

			}

			String GetAmount_TitileOnline24A = driver.findElement(By.xpath("//*[@id='selectPaymentMode_TaxAmount']"))
					.getText();
			String stringOnline3 = new String(GetAmount_Titile13A);
			String stringOnline4 = new String(GetAmount_TitileOnline24A);
			System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileOnline24A);

			if (stringOnline3.equals(stringOnline4)) {

				System.out.println(GetAmount_TitileOnline24A + ":- PASS");
				test.log(LogStatus.PASS," Tax Amount:- " + GetAmount_TitileOnline24A);

			} else {
				System.err.println(GetAmount_TitileOnline24A + ":- FAIL");
				test.log(LogStatus.FAIL," Tax Amount:- " + GetAmount_TitileOnline24A);

			}
			Thread.sleep(100);

			// Total Amount Payable
			String GetAmount_TitileOnline25 = driver.findElement(By.xpath(
					"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div/div[2]/div/table/tbody[2]/tr/td[1]/span/span"))
					.getText();
			if (GetAmount_Titile14.equals(GetAmount_TitileOnline25)) {

				System.out.println(GetAmount_TitileOnline25 + ":- PASS");
				test.log(LogStatus.PASS," Total Amount Payable:- " + GetAmount_TitileOnline25);

			} else {
				System.err.println(GetAmount_TitileOnline25 + ":- FAIL");
				test.log(LogStatus.FAIL," Total Amount Payable:- " + GetAmount_TitileOnline25);

			}
			String GetAmount_TitileOnline25A = driver
					.findElement(By.xpath("//*[@id='selectPaymentMode_AmountPayable']")).getText();
			if (GetAmount_Titile14A.equals(GetAmount_TitileOnline25A)) {

				System.out.println(GetAmount_TitileOnline25A + ":- PASS");
				test.log(LogStatus.PASS," Total Amount Payable:- " + GetAmount_TitileOnline25A);

			} else {
				System.err.println(GetAmount_TitileOnline25A + ":- FAIL");
				test.log(LogStatus.FAIL," Total Amount Payable:- " + GetAmount_TitileOnline25A);

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

				Boolean SelectBankName = driver.findElements(By.className("kt-radio-list")).size() != 0;
				System.out.println(" Select BankName   =" + SelectBankName);
				if (SelectBankName == true) {

					for (int row1 = 1; row1 < totalNoOfRows1; row1++) {

						String SelectBank = sh1.getCell(0, row1).getContents();
						System.out.println("SelectBank= " + SelectBank);
						Add_Log.info("SelectBank" + SelectBank);

						Thread.sleep(2000);

						WebElement Option1 = driver.findElement(
								By.xpath("//*[@id='bank-name-modal']/div/div/div[2]/div/div[1]/div/label/em"));
						WebElement Option2 = driver.findElement(
								By.xpath("//*[@id='bank-name-modal']/div/div/div[2]/div/div[2]/div/label/em"));
						WebElement Option3 = driver.findElement(
								By.xpath("//*[@id='bank-name-modal']/div/div/div[2]/div/div[3]/div/label/em"));
						WebElement Option4 = driver.findElement(
								By.xpath("//*[@id='bank-name-modal']/div/div/div[2]/div/div[4]/div/label/em"));
						WebElement Option5 = driver.findElement(
								By.xpath("//*[@id='bank-name-modal']/div/div/div[2]/div/div[5]/div/label/em"));

						if (SelectBank.equals("AlfaCon Bank")) {

							Option1.click();

						} else if (SelectBank.equals("Bank Of NY")) {

							Option2.click();

						} else if (SelectBank.equals("DBS Bank")) {

							Option3.click();

						} else if (SelectBank.equals("Grand Bank")) {

							Option4.click();

						} else if (SelectBank.equals("HSBC Bank")) {

							Option5.click();
						}

						break;
					}

					Boolean selectPaymentMode_alert = driver.findElements(By.id("bank-name-modal")).size() != 0;
					System.out.println(" selectPaymentMode_alert  =" + selectPaymentMode_alert);
					if (selectPaymentMode_alert == true) {

						ExerciseNow_Locator.makepayment(driver).click();
						System.out.println("Click on makepayment Button");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Click on makepayment Button " + selectPaymentMode_alert);

						ExerciseNow_Locator.PayNow(driver).click();
						System.out.println("Click on PayNow Button");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Click on PayNow Button " + selectPaymentMode_alert);

						String GetText3 = driver.findElement(By.id("selectPaymentMode_alert")).getText();
						System.out.println(" GetText= " + GetText3);
						Thread.sleep(2000);

//						ExerciseNow_Locator.selectPaymentMode_alert_Ok(driver).click();

					} else {

						System.err.println("Not Click on selectPaymentMode_alert");
						Thread.sleep(500);
						test.log(LogStatus.FAIL,
								" Test Case Fail- Not Click on selectPaymentMode_alert " + selectPaymentMode_alert);

					}

					Boolean PaymentMode = driver.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[3]/div[2]/div/div/p"))
							.size() != 0;
					System.out.println("Payment  =" + PaymentMode);

					if (PaymentMode == true) {

						Actions action = new Actions(driver);
						action.moveToElement(driver.findElement(
								By.xpath("//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button")))
								.click().perform();

						System.out.println("Click on Ok Button");
						Thread.sleep(5000);
						test.log(LogStatus.PASS, " Click on Ok Button " + PaymentMode);

						System.out.println("Payment Updated");
						test.log(LogStatus.PASS, " Payment Updated " + PaymentMode);

					} else {
						System.err.println("Payment Not Updated");
						test.log(LogStatus.FAIL, " Test Case Fail- Payment Not Updated " + PaymentMode);

					}

				} else {

					System.err.println("Not Click on SelectPaymentMode");
					Thread.sleep(500);
					test.log(LogStatus.FAIL,
							" Test Case Fail- Not Click on SelectPaymentMode " + SelectPaymentModeOnline);

				}
			} else {

				System.err.println("Not Click on the Continue");
				Thread.sleep(500);
				test.log(LogStatus.FAIL,
						" Test Case Fail- Not Click on the Continue " + selectPaymentMode_SavePaymentMode);

			}

		} else {

			System.err.println("Not Click on SelectPaymentMode");
			Thread.sleep(500);
			test.log(LogStatus.FAIL, " Test Case Fail- Not Click on SelectPaymentMode " + SelectPaymentModeOnline);

		}

		Thread.sleep(2000);
	}

}