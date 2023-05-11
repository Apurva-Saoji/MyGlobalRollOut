package ExerciseNowTestScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locator;
import jxl.Sheet;
import jxl.Workbook;

public class VerifyvaluesIn_ProcessCard extends MyEsopsLogin {

	public void VerifyvaluesIn_ProcessCard_Method(String InstrumentName, String CompanyID, String User)
			throws Exception {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		test = report.startTest("Exerciese ValuesIn ProcessCard");
		
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

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			String filename = System.getProperty("user.dir") + "\\src\\CalculationData\\Report.xls";
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Quick Notes");
			HSSFRow rowhead = sheet.createRow(0);
			rowhead.createCell(1).setCellValue("Quick Notes");
			HSSFSheet sheet2 = workbook.createSheet("Tax Amount");
			HSSFRow rowhead1 = sheet2.createRow(1);
			HSSFSheet sheet3 = workbook.createSheet("Calculated Summary");
			HSSFRow rowhead10 = sheet3.createRow(0);
			HSSFRow rowhead11 = sheet3.createRow(2);
			HSSFRow rowhead12 = sheet3.createRow(3);
			HSSFRow rowhead13 = sheet3.createRow(4);
			HSSFRow rowhead14 = sheet3.createRow(6);
			HSSFSheet sheet4 = workbook.createSheet("Personal Details Tax Amount");
			HSSFRow rowhead100 = sheet4.createRow(1);
			HSSFSheet sheet5 = workbook.createSheet("Select Payment Mode Tax Amount");
			HSSFRow rowhead500 = sheet5.createRow(1);
			HSSFSheet sheet6 = workbook.createSheet("Update Details Tax Amount");
			HSSFRow rowhead600 = sheet6.createRow(1);
			HSSFSheet sheet7 = workbook.createSheet("Exercise Declaration Tax Amount");
			HSSFRow rowhead700 = sheet7.createRow(1);
			HSSFSheet sheet8 = workbook.createSheet("Upload Form");
			HSSFRow rowhead800 = sheet8.createRow(1);

			Boolean Exerciese_Options = driver.findElements(By.linkText("Exercise Options")).size() != 0;
			System.out.println(" Exerciese_Options =" + Exerciese_Options);
			if (Exerciese_Options == true) {

				ExerciseNow_Locator.Exerciese_Options(driver).click();
				System.out.println("Click on the Exerciese Options ");
				Thread.sleep(500);
				test.log(LogStatus.PASS, " Click on the Exerciese Options :- " + Exerciese_Options);


			} else {

				System.err.println("Not Click on the Exerciese_Options ");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Exerciese_Options:- " + Exerciese_Options);


			}

			Thread.sleep(8000);

			Boolean Quick_Notes = driver.findElements(By.className("btn-link1")).size() != 0;
			System.out.println("Quick_Notes =" + Quick_Notes);
			if (Quick_Notes == true) {

				Thread.sleep(500);
				ExerciseNow_Locator.Quick_Notes(driver).click();
				System.out.println("Click on the Quick_Notes Open");
				Thread.sleep(5000);
				String GetText = driver.findElement(By.id("ID_Exercise_quicknotes")).getText();
				System.out.println("Get Data = " + GetText);
				Thread.sleep(1000);
				sheet.createRow(1).createCell(1).setCellValue(GetText);
				Thread.sleep(1000);
				ExerciseNow_Locator.Quick_Notes(driver).click();
				System.out.println("Click on the Quick_Notes Close");
				Thread.sleep(500);
				test.log(LogStatus.PASS, " Click on the Quick_Notes Close:-" + Quick_Notes);

			} else {

				System.err.println("Not Click on the Quick_Notes ");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Quick_Notes:-" + Quick_Notes);

			}

			Boolean Exercise_ProceedToExercise = driver.findElements(By.linkText("Exercise Options")).size() != 0;
			System.out.println("Exercise_ProceedToExercise=" + Exercise_ProceedToExercise);
			if (Exercise_ProceedToExercise == true) {

				ExerciseNow_Locator.Exercise_ProceedToExercise(driver).click();
				System.out.println("Click on the Exercise Proceed To Exercise ");
				Thread.sleep(500);
				test.log(LogStatus.PASS, " Click on the Exercise Proceed To Exercise:- " + Exercise_ProceedToExercise);

			} else {

				System.err.println("Not Click on the Exercise Proceed To Exercise ");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Exercise Proceed To Exercise:- " + Exercise_ProceedToExercise);

			}

			Boolean StockOptions_QuickNotes = driver
					.findElements(By.xpath(
							"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[1]/div[1]/h2/button"))
					.size() != 0;
			System.out.println("StockOptions_QuickNotes=" + StockOptions_QuickNotes);
			if (StockOptions_QuickNotes == true) {

				ExerciseNow_Locator.StockOptions_QuickNotes(driver).click();
				System.out.println("Click on the Exercise Stock Options Quick Notes Open");
				Thread.sleep(500);
				String GetText = driver.findElement(By.id("ID_Exercise_QuickNotes")).getText();
				System.out.println("Get Data = " + GetText);
				Thread.sleep(1000);
				ExerciseNow_Locator.StockOptions_QuickNotes(driver).click();
				System.out.println("Click on the Exercise Stock Options Quick Notes Close");
				Thread.sleep(500);
				test.log(LogStatus.PASS, " Click on the Exercise Stock Options Quick Notes Close:- " + StockOptions_QuickNotes);

			} else {

				System.err.println("Not Click on the Exercise Stock Options Quick Notes ");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Exercise Stock Options Quick Notes:- " + StockOptions_QuickNotes);

			}
			Thread.sleep(1000);

			Boolean Sort_By = driver.findElements(By.className("select-blue")).size() != 0;
			System.out.println("Sort_By=" + Sort_By);
			if (Sort_By == true) {

				ExerciseNow_Locator.Sort_By(driver).click();
				Thread.sleep(500);
				Select SortBy = new Select(driver.findElement(By.className("select-blue")));
				SortBy.selectByVisibleText("Grant Date");
				ExerciseNow_Locator.Sort_By(driver).click();
				Thread.sleep(1000);
				test.log(LogStatus.PASS, " Click on the Exercise Sort By  " + Sort_By);

			} else {

				System.err.println("Not Click on the Exercise Sort By");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Exercise Sort By " + Sort_By);

			}

			Thread.sleep(1000);

			Boolean Exercise_All = driver.findElements(By.className("btn-h-34-adj")).size() != 0;
			System.out.println("Exercise_All=" + Exercise_All);
			if (Exercise_All == true) {

				ExerciseNow_Locator.Exercise_All(driver).click();
				System.out.println("Click on the Exercise Exercise All Button");
				Thread.sleep(1000);
				test.log(LogStatus.PASS, "Click on the Exercise Exercise All Button:-" + Exercise_All);

			} else {

				System.err.println("Not Click on the Exercise Exercise All Button");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Exercise Exercise All Button:-" + Exercise_All);

			}

			Thread.sleep(1000);

			Boolean Reset_all = driver.findElements(By.className("btn-h-34-adj")).size() != 0;
			System.out.println("Reset_all=" + Reset_all);
			if (Reset_all == true) {

				ExerciseNow_Locator.Reset_all(driver).click();
				System.out.println("Click on the Exercise Reset all Button");
				Thread.sleep(1000);
				test.log(LogStatus.PASS, " Click on the Exercise Reset all Button " + Reset_all);

			} else {

				System.err.println("Not Click on the Exercise Reset all Button");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Exercise Reset all Button " + Reset_all);

			}
			Thread.sleep(1000);

			WebElement Quantity_Enter = driver.findElement(By.xpath("//div/table/tbody/tr[2]/td[2]/div/input"));
			if (Quantity_Enter.isEnabled()) {

				Boolean ExerciseStock_ExercisableQuantity = driver
						.findElements(By.id("ID_ExerciseStock_ExercisableQuantity")).size() != 0;
				System.out.println("ExerciseStock_ExercisableQuantity=" + ExerciseStock_ExercisableQuantity);
				if (ExerciseStock_ExercisableQuantity == true) {

					String GetValue2 = ExerciseNow_Locator.ExerciseStock_ExercisableQuantity(driver).getText();
					System.out.println("Get ExerciseStock_ExercisableQuantity = " + GetValue2);
					// String GetValue = GetValue2;
					String GetValue = GetValue2.replaceAll("[^0-9]+", "");
					Thread.sleep(800);
					System.out.println("Get  =" + GetValue);
					Thread.sleep(1000);

					int t = Integer.parseInt(GetValue);
					System.out.println(t + 1);

					ExerciseNow_Locator.Quantity_Enter(driver).sendKeys(String.valueOf(t + 1));
					System.out.println("Enter Quantity more than Available value");
					Thread.sleep(1000);
					test.log(LogStatus.PASS, " Enter Quantity more than Available value" + ExerciseStock_ExercisableQuantity);

					ExerciseNow_Locator.ExerciseStock_Ok(driver).click();
					System.out.println("Yes PopUp is presernt ");
					Thread.sleep(1000);
					test.log(LogStatus.PASS, " Yes PopUp is presernt " + ExerciseStock_ExercisableQuantity);

					/*
					 * Pattern pattern = Pattern.compile("\\w+([0-9]+)"); Matcher matcher =
					 * pattern.matcher(GetValue);
					 * 
					 * for (int i = 0; i < matcher.groupCount(); i++) { matcher.find();
					 * 
					 * int t = Integer.parseInt(matcher.group()); System.out.println(t + 1);
					 * 
					 * ExerciseNow_Locator.Quantity_Enter(driver).sendKeys(String.valueOf(t + 1));
					 * System.out.println("Enter Quantity more than Available value");
					 * Thread.sleep(1000);
					 * 
					 * ExerciseNow_Locator.ExerciseStock_Ok(driver).click();
					 * System.out.println("Yes PopUp is presernt "); Thread.sleep(1000); }
					 */
					Thread.sleep(1000);

				} else {
					System.err.println("Not Enter Quantity");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Not Enter Quantity " + ExerciseStock_ExercisableQuantity);

				}

				Boolean Quantity_Enter2 = driver.findElements(By.xpath("//div/table/tbody/tr[2]/td[2]/div/input"))
						.size() != 0;
				System.out.println("Quantity_Enter=" + Quantity_Enter2);
				if (Quantity_Enter2 == true) {

					ExerciseNow_Locator.Quantity_Enter(driver).sendKeys("1");
					System.out.println("Enter Quantity");
					Thread.sleep(1000);
					test.log(LogStatus.PASS, " Enter Quantity:- " +Quantity_Enter2);

				} else {
					System.err.println("Not Enter Quantity");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, "Not Enter Quantity:- " +Quantity_Enter2);

				}
			} else {

				System.err.println("Sorry Quantity this field is disable");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, "Sorry Quantity this field is disable:- " +Quantity_Enter);

			}

			Thread.sleep(1000);
			WebElement Calculate_Button = driver.findElement(By.id("ID_ExerciseStock_Continue"));
			if (Calculate_Button.isEnabled()) {

				Boolean Calculate_Button2 = driver.findElements(By.id("ID_ExerciseStock_Continue")).size() != 0;
				System.out.println(" Calculate_Button2=" + Calculate_Button2);
				if (Calculate_Button2 == true) {

					ExerciseNow_Locator.Calculate_Button(driver).sendKeys(Keys.ENTER);
					System.out.println(" Click on the Calculate Button");
					Thread.sleep(5000);
					test.log(LogStatus.PASS, " Click on the Calculate Button:- " +Calculate_Button2);


					Boolean Tax_Amount = driver.findElements(By.linkText("Tax Amount")).size() != 0;
					System.out.println("Tax_Amount  =" + Tax_Amount);
					if (Tax_Amount == true) {

						ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
						System.out.println(" Click on the Tax_Amount Button");
						Thread.sleep(1000);
						test.log(LogStatus.PASS, " Click on the Tax_Amount Button:- " + Tax_Amount);

						int getCount = driver.findElements(By.className("has-table")).size();
						System.err.println("= " + getCount);
						Thread.sleep(1000);

						int getCount2 = driver
								.findElements(
										By.xpath("//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
								.size();
						System.err.println("= " + getCount2);

						String GetAmount_Titile = driver.findElement(By.xpath("//*[@id='heading0']/a/h4")).getText();
						sheet2.createRow(0).createCell(1).setCellValue(GetAmount_Titile);

						for (int i = 1; i <= 4; i++) {

							String GetAmount_Titile1 = driver
									.findElement(By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]"))
									.getText();
							rowhead1.createCell(i).setCellValue(GetAmount_Titile1);
							Thread.sleep(100);

						}

						for (int j = 1; j < 4; j++) {

							String GetAmount_Titile2 = driver.findElement(By.xpath(
									"//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th[" + j + "]"))
									.getText();
							rowhead1.createCell(4 + j).setCellValue(GetAmount_Titile2);
							Thread.sleep(100);

						}

						if (getCount2 >= 2) {

							for (int m = 1; m <= getCount; m++) {

								HSSFRow rowhead3 = sheet2.createRow(m * getCount2);
								// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

								for (int k = 1; k <= 4; k++) {

									String GetAmount_Titile3 = driver
											.findElement(By.xpath(
													"//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
											.getText();
									rowhead3.createCell(k).setCellValue(GetAmount_Titile3);
									Thread.sleep(100);

								}

								for (int l = 1; l < 4; l++) {

									String GetAmount_Titile4 = driver
											.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
													+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
											.getText();
									rowhead3.createCell(4 + l).setCellValue(GetAmount_Titile4);
								}

							}
						} else {

							for (int m = 1; m <= getCount; m++) {

								HSSFRow rowhead3 = sheet2.createRow(m * 2);
								// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

								for (int k = 1; k <= 4; k++) {

									String GetAmount_Titile3 = driver
											.findElement(By.xpath(
													"//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
											.getText();
									rowhead3.createCell(k).setCellValue(GetAmount_Titile3);
									Thread.sleep(100);

								}

								for (int l = 1; l < 4; l++) {

									String GetAmount_Titile4 = driver
											.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
													+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
											.getText();
									rowhead3.createCell(4 + l).setCellValue(GetAmount_Titile4);
								}

							}
						}

						for (int m = 1; m <= getCount; m++) {

							for (int p = 2; p <= getCount2; p++) {

								HSSFRow rowhead5 = sheet2.createRow((m * getCount2) + p - 1);

								for (int l = 1; l < 4; l++) {

									String GetAmount_Titile4 = driver
											.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
													+ "]/td[5]/table/tbody/tr[" + p + "]/td[" + l + "]"))
											.getText();
									rowhead5.createCell(4 + l).setCellValue(GetAmount_Titile4);

								}
							}

						}

						HSSFRow rowhead6 = sheet2.createRow((getCount * getCount2) + 3);

						for (int n = 1; n < 4; n++) {

							String GetAmount_Titile6 = driver
									.findElement(By.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]"))
									.getText();
							rowhead6.createCell(n * 2).setCellValue(GetAmount_Titile6);
							Thread.sleep(100);
						}

						ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
						System.out.println(" Click on the Tax_Amount Button close");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Click on the Tax_Amount Button close:- " + Tax_Amount);

						// ************************* *Excel Calculated Summary ***********************//

						String GetAmount_Titile10 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[3]/div/div[2]/div[1]/div/div/h4"))
								.getText();
						rowhead10.createCell(1).setCellValue(GetAmount_Titile10);
						Thread.sleep(100);

						// Quantity
						String GetAmount_Titile11 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[3]/div/div[2]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
								.getText();
						rowhead11.createCell(1).setCellValue(GetAmount_Titile11);
						String GetAmount_Titile11A = driver
								.findElement(By.xpath("//*[@id='ID_ExerciseStock_FinalQuantity']")).getText();
						rowhead11.createCell(2).setCellValue(GetAmount_Titile11A);
						Thread.sleep(100);

						// Exercise Amount
						String GetAmount_Titile12 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[3]/div/div[2]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/span/span"))
								.getText();
						rowhead12.createCell(1).setCellValue(GetAmount_Titile12);
						String GetAmount_Titile12A = driver
								.findElement(By.xpath("//*[@id='ID_ExerciseStock_FinalAmount']")).getText();
						rowhead12.createCell(2).setCellValue(GetAmount_Titile12A);
						Thread.sleep(100);

						// Tax Amount
						String GetAmount_Titile13 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[3]/div/div[2]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
								.getText();
						rowhead13.createCell(1).setCellValue(GetAmount_Titile13);
						String GetAmount_Titile13A = driver
								.findElement(By.xpath("//*[@id='ID_ExerciseStock_FinalTaxAmount']")).getText();
						rowhead13.createCell(2).setCellValue(GetAmount_Titile13A);
						Thread.sleep(100);

						// Total Amount Payable
						String GetAmount_Titile14 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[3]/div/div[2]/div[1]/div/div/table/tbody[2]/tr[1]/td[1]/span/span"))
								.getText();
						rowhead14.createCell(1).setCellValue(GetAmount_Titile14);
						String GetAmount_Titile14A = driver
								.findElement(By.xpath("//*[@id='ID_ExerciseStock_Heading_FinalTotalAmount']"))
								.getText();
						rowhead14.createCell(2).setCellValue(GetAmount_Titile14A);
						Thread.sleep(100);

						// ****************************************************************************//

						ExerciseNow_Locator.Calculate_Button(driver).sendKeys(Keys.ENTER);
						System.out.println(" Click on the Continue Button");
						Thread.sleep(3000);

						if (Online.equals("Y")) {

							Boolean ExerciseStockProceed_Online = driver
									.findElements(By.id("ID_ExerciseStockProceed_ChangePaymentMode")).size() != 0;
							System.out.println("ExerciseStockProceed_Online =" + ExerciseStockProceed_Online);
							if (ExerciseStockProceed_Online == true) {

								WebElement elementOnline = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_Online_Button(driver)));
								JavascriptExecutor executorOnline = (JavascriptExecutor) driver;
								executorOnline.executeScript("arguments[0].click();", elementOnline);
								System.out.println("Click on the TExerciseStockProceed Online Button");
								Thread.sleep(1000);

								WebElement elementOnline1 = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_Online_Button_Close(driver)));
								JavascriptExecutor executorOnline1 = (JavascriptExecutor) driver;
								executorOnline1.executeScript("arguments[0].click();", elementOnline1);
								System.out.println("Click on the TExerciseStockProceed Online Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, " Click on the TExerciseStockProceed Online Button:- " + ExerciseStockProceed_Online);

							} else {

								System.err.println("Not Click on the TExerciseStockProceed Online Button ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, "Not Click on the TExerciseStockProceed Online Button:- " + ExerciseStockProceed_Online);

							}
						} else if (WireTransfer.equals("Y")) {

							Boolean ExerciseStockProceed_WireTransfer = driver
									.findElements(By.id("ID_ExerciseStockProceed_WireTransfer")).size() != 0;
							System.out.println(
									"ExerciseStockProceed_WireTransfer  =" + ExerciseStockProceed_WireTransfer);
							if (ExerciseStockProceed_WireTransfer == true) {

								WebElement elementWireTransfer = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_WireTransfer_Button(driver)));
								JavascriptExecutor executorWireTransfer = (JavascriptExecutor) driver;
								executorWireTransfer.executeScript("arguments[0].click();", elementWireTransfer);
								System.out.println("Click on the TExerciseStockProceed WireTransfer Button");
								Thread.sleep(1000);

								WebElement elementWireTransfer2 = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(ExerciseNow_Locator
												.ExerciseStockProceed_WireTransfer_Button_Close(driver)));
								JavascriptExecutor executorWireTransfer2 = (JavascriptExecutor) driver;
								executorWireTransfer2.executeScript("arguments[0].click();", elementWireTransfer2);
								System.out.println("Click on the TExerciseStockProceed WireTransfer Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, " Click on the TExerciseStockProceed WireTransfer Button:- " + ExerciseStockProceed_WireTransfer);

							} else {

								System.err.println("Not Click on the TExerciseStockProceed WireTransfer Button ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, " Not Click on the TExerciseStockProceed WireTransfer Button:-" + ExerciseStockProceed_WireTransfer);

							}
						} else if (Cheque.equals("Y")) {

							Boolean ExerciseStockProceed_Cheque = driver
									.findElements(By.id("ID_ExerciseStockProceed_Cheque")).size() != 0;
							System.out.println("ExerciseStockProceed_Cheque  =" + ExerciseStockProceed_Cheque);
							if (ExerciseStockProceed_Cheque == true) {

								WebElement elementCheque = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_Cheque_Button(driver)));
								JavascriptExecutor executorCheque = (JavascriptExecutor) driver;
								executorCheque.executeScript("arguments[0].click();", elementCheque);
								System.out.println("Click on the TExerciseStockProceed Cheque Button");
								Thread.sleep(1000);

								WebElement elementCheque1 = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_Cheque_Button_Close(driver)));
								JavascriptExecutor executorCheque1 = (JavascriptExecutor) driver;
								executorCheque1.executeScript("arguments[0].click();", elementCheque1);
								System.out.println("Click on the TExerciseStockProceed Cheque Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, " Click on the TExerciseStockProceed Cheque Button " + ExerciseStockProceed_Cheque);

							} else {

								System.err.println("Not Click on the TExerciseStockProceed Cheque Button ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, " Not Click on the TExerciseStockProceed Cheque Button  " + ExerciseStockProceed_Cheque);

							}

						} else if (DD.equals("Y")) {

							Boolean ExerciseStockProceed_DD = driver
									.findElements(By.id("ID_ExerciseStockProceed_DemandDraft")).size() != 0;
							System.out.println("ExerciseStockProceed_DD =" + ExerciseStockProceed_DD);
							if (ExerciseStockProceed_DD == true) {

								WebElement elementDD = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_DD_Button(driver)));
								JavascriptExecutor executorDD = (JavascriptExecutor) driver;
								executorDD.executeScript("arguments[0].click();", elementDD);
								System.out.println("Click on the TExerciseStockProceed DD Button");
								Thread.sleep(1000);

								WebElement elementDD1 = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_DD_Button_Close(driver)));
								JavascriptExecutor executorDD1 = (JavascriptExecutor) driver;
								executorDD1.executeScript("arguments[0].click();", elementDD1);
								System.out.println("Click on the TExerciseStockProceed DD Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, "Click on the TExerciseStockProceed DD Button:-" + ExerciseStockProceed_DD );

							} else {

								System.err.println("Not Click on the TExerciseStockProceed DD Button ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, "Not Click on the TExerciseStockProceed DD Button:- " + ExerciseStockProceed_DD );

							}

						} else if (RTGS.equals("Y")) {

							Boolean ExerciseStockProceed_RTGS = driver
									.findElements(By.id("ID_ExerciseStockProceed_RTGS")).size() != 0;
							System.out.println("ExerciseStockProceed_RTGS  =" + ExerciseStockProceed_RTGS);
							if (ExerciseStockProceed_RTGS == true) {

								WebElement elementRTGS = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_RTGS_Button(driver)));
								JavascriptExecutor executorRTGS = (JavascriptExecutor) driver;
								executorRTGS.executeScript("arguments[0].click();", elementRTGS);
								System.out.println("Click on the TExerciseStockProceed RTGS Button");
								Thread.sleep(1000);

								WebElement elementRTGS1 = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_RTGS_Button_Close(driver)));
								JavascriptExecutor executorRTGS1 = (JavascriptExecutor) driver;
								executorRTGS1.executeScript("arguments[0].click();", elementRTGS1);
								System.out.println("Click on the TExerciseStockProceed RTGS Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, " Click on the TExerciseStockProceed RTGS Button" + ExerciseStockProceed_RTGS);

							} else {

								System.err.println("Not Click on the TExerciseStockProceed RTGS Button ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, "Not Click on the TExerciseStockProceed RTGS Button  " + ExerciseStockProceed_RTGS);

							}

						} else if (DirectDebit.equals("Y")) {

							Boolean ExerciseStockProceed_DirectDebit = driver
									.findElements(By.id("ID_ExerciseStockProceed_DirectDebit")).size() != 0;
							System.out.println("ExerciseStockProceedDirectDebit  =" + ExerciseStockProceed_DirectDebit);
							if (ExerciseStockProceed_DirectDebit == true) {

								WebElement elementDirectDebit = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_DirectDebit_Button(driver)));
								JavascriptExecutor executorDirectDebit = (JavascriptExecutor) driver;
								executorDirectDebit.executeScript("arguments[0].click();", elementDirectDebit);
								System.out.println("Click on the TExerciseStockProceed DirectDebit Button");
								Thread.sleep(1000);

								WebElement elementDirectDebit1 = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(ExerciseNow_Locator
												.ExerciseStockProceed_DirectDebit_Button_Close(driver)));
								JavascriptExecutor executorDirectDebit1 = (JavascriptExecutor) driver;
								executorDirectDebit1.executeScript("arguments[0].click();", elementDirectDebit1);
								System.out.println("Click on the TExerciseStockProceed DirectDebit Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, "Click on the TExerciseStockProceed DirectDebit Button:- " + ExerciseStockProceed_DirectDebit);

							} else {

								System.err.println("Not Click on the TExerciseStockProceed DirectDebit Button ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, " Not Click on the TExerciseStockProceed DirectDebit Button:- " + ExerciseStockProceed_DirectDebit);

							}

						} else if (SellAll.equals("Y")) {

							Boolean ExerciseStockProceed_SellAll = driver
									.findElements(By.id("ID_ExerciseStockProceed_SellAll")).size() != 0;
							System.out.println("ExerciseStockProceed_SellAll  =" + ExerciseStockProceed_SellAll);
							if (ExerciseStockProceed_SellAll == true) {

								WebElement elementSellAll = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_SellAll_Button(driver)));
								JavascriptExecutor executorSellAll = (JavascriptExecutor) driver;
								executorSellAll.executeScript("arguments[0].click();", elementSellAll);
								System.out.println("Click on the TExerciseStockProceed SellAll Button");
								Thread.sleep(1000);

								WebElement elementSellAll1 = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_SellAll_Button_Close(driver)));
								JavascriptExecutor executorSellAll1 = (JavascriptExecutor) driver;
								executorSellAll1.executeScript("arguments[0].click();", elementSellAll1);
								System.out.println("Click on the TExerciseStockProceed SellAll Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, " Click on the TExerciseStockProceed SellAll Button:- " +SellAll);

							} else {

								System.err.println("Not Click on the TExerciseStockProceed SellAll Button ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, " Not Click on the TExerciseStockProceed SellAll Button:- " +SellAll);

							}
						} else if (SellPartial.equals("Y")) {

							Boolean ExerciseStockProceed_SellPartial = driver
									.findElements(By.id("ID_ExerciseStockProceed_SellPartialPayment")).size() != 0;
							System.out.println("ExerciseStockProceed_SellPartial =" + ExerciseStockProceed_SellPartial);
							if (ExerciseStockProceed_SellPartial == true) {

								WebElement elementSellPartial = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(
												ExerciseNow_Locator.ExerciseStockProceed_SellPartial_Button(driver)));
								JavascriptExecutor executorSellPartial = (JavascriptExecutor) driver;
								executorSellPartial.executeScript("arguments[0].click();", elementSellPartial);
								System.out.println("Click on the TExerciseStockProceed SellPartial Button");
								Thread.sleep(1000);

								WebElement elementSellPartial1 = (new WebDriverWait(driver, 10))
										.until(ExpectedConditions.elementToBeClickable(ExerciseNow_Locator
												.ExerciseStockProceed_SellPartial_Button_Close(driver)));
								JavascriptExecutor executorSellPartial1 = (JavascriptExecutor) driver;
								executorSellPartial1.executeScript("arguments[0].click();", elementSellPartial1);
								System.out.println("Click on the TExerciseStockProceed SellPartial Button");
								Thread.sleep(1000);
								test.log(LogStatus.PASS, " Click on the TExerciseStockProceed SellPartial Button:- " + ExerciseStockProceed_SellPartial);

							} else {

								System.err.println("Not Click on the TExerciseStockProceed SellPartial Button ");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, " Not Click on the TExerciseStockProceed SellPartial Button:- " + ExerciseStockProceed_SellPartial);

							}
						} else {

							System.err.println("Please Select Payment Mode");
							test.log(LogStatus.FAIL, " Please Select Payment Mode:- " + SellPartial);

						}

						Thread.sleep(1000);
						// ***************** Personal Details Tax Amount *************//

						ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
						System.out.println(" Click on the Tax_Amount Button");
						Thread.sleep(1000);
						test.log(LogStatus.PASS, " Click on the Tax_Amount Button:- ");

						int getCountPersonal_Details = driver.findElements(By.className("has-table")).size();
						System.err.println("= " + getCountPersonal_Details);
						Thread.sleep(1000);

						int getCountPersonal_Details2 = driver
								.findElements(
										By.xpath("//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
								.size();
						System.err.println("= " + getCountPersonal_Details2);

						String GetAmount_TitilePersonal_Details = driver
								.findElement(By.xpath("//*[@id='heading0']/a/h4")).getText();
						sheet4.createRow(0).createCell(1).setCellValue(GetAmount_TitilePersonal_Details);

						for (int i = 1; i <= 4; i++) {

							String GetAmount_TitilePersonal_Details1 = driver
									.findElement(By.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]"))
									.getText();
							rowhead100.createCell(i).setCellValue(GetAmount_TitilePersonal_Details1);
							Thread.sleep(100);

						}
						for (int j = 1; j < 4; j++) {

							String GetAmount_TitilePersonal_Details2 = driver.findElement(By.xpath(
									"//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th[" + j + "]"))
									.getText();
							rowhead100.createCell(4 + j).setCellValue(GetAmount_TitilePersonal_Details2);
							Thread.sleep(100);

						}

						if (getCountPersonal_Details2 >= 2) {

							for (int m = 1; m <= getCountPersonal_Details; m++) {

								HSSFRow rowhead103 = sheet4.createRow(m * getCountPersonal_Details2);
								// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

								for (int k = 1; k <= 4; k++) {

									String GetAmount_TitilePersonal_Details3 = driver
											.findElement(By.xpath(
													"//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
											.getText();
									rowhead103.createCell(k).setCellValue(GetAmount_TitilePersonal_Details3);
									Thread.sleep(100);

								}

								for (int l = 1; l < 4; l++) {

									String GetAmount_TitilePersonal_Details4 = driver
											.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
													+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
											.getText();
									rowhead103.createCell(4 + l).setCellValue(GetAmount_TitilePersonal_Details4);
								}

							}
						} else {

							for (int m = 1; m <= getCountPersonal_Details; m++) {

								HSSFRow rowhead103 = sheet4.createRow(m * 2);
								// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

								for (int k = 1; k <= 4; k++) {

									String GetAmount_TitilePersonal_Details3 = driver
											.findElement(By.xpath(
													"//*[@id='collapse0']/div/table/tbody/tr[" + m + "]/td[" + k + "]"))
											.getText();
									rowhead103.createCell(k).setCellValue(GetAmount_TitilePersonal_Details3);
									Thread.sleep(100);

								}

								for (int l = 1; l < 4; l++) {

									String GetAmount_TitilePersonal_Details4 = driver
											.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
													+ "]/td[5]/table/tbody/tr[1]/td[" + l + "]"))
											.getText();
									rowhead103.createCell(4 + l).setCellValue(GetAmount_TitilePersonal_Details4);
								}

							}
						}

						for (int m = 1; m <= getCountPersonal_Details; m++) {

							for (int p = 2; p <= getCountPersonal_Details2; p++) {

								HSSFRow rowhead105 = sheet4.createRow((m * getCount2) + p - 1);

								for (int l = 1; l < 4; l++) {

									String GetAmount_TitilePersonal_Details4 = driver
											.findElement(By.xpath("//*[@id='collapse0']/div/table/tbody/tr[" + m
													+ "]/td[5]/table/tbody/tr[" + p + "]/td[" + l + "]"))
											.getText();
									rowhead105.createCell(4 + l).setCellValue(GetAmount_TitilePersonal_Details4);

								}
							}

						}

						HSSFRow rowhead106 = sheet4.createRow((getCount * getCountPersonal_Details2) + 3);

						for (int n = 1; n < 4; n++) {

							String GetAmount_TitilePersonal_Details6 = driver
									.findElement(By.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]"))
									.getText();
							rowhead106.createCell(n * 2).setCellValue(GetAmount_TitilePersonal_Details6);
							Thread.sleep(100);
						}

						ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
						System.out.println(" Click on the Tax_Amount Button close");
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " Click on the Tax_Amount Button close ");

						// ************************* Verify Tax Amount Value ***********************//

						// Quantity
						String GetAmount_Titile22 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
								.getText();
						if (GetAmount_Titile11.equals(GetAmount_Titile22)) {

							System.out.println(GetAmount_Titile22 + ":- PASS");
							test.log(LogStatus.PASS, " Quantity:- " + GetAmount_Titile22);

						} else {
							System.err.println(GetAmount_Titile22 + ":- FAIL");
							test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_Titile22);

						}

						String GetAmount_Titile22A = driver
								.findElement(By.xpath("//*[@id='ID_ExerciseStockProceedExercise_Quantity']")).getText();
						if (GetAmount_Titile11A.equals(GetAmount_Titile22A)) {

							System.out.println(GetAmount_Titile22A + ":- PASS");
							test.log(LogStatus.PASS, " Quantity:- " + GetAmount_Titile22A);

						} else {
							System.err.println(GetAmount_Titile22A + ":- FAIL");
							test.log(LogStatus.FAIL, " Quantity:- " + GetAmount_Titile22A);

						}
						Thread.sleep(100);

						// Exercise Amount
						String GetAmount_Titile23 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
								.getText();
						if (GetAmount_Titile12.equals(GetAmount_Titile23)) {

							System.out.println(GetAmount_Titile23 + ":- PASS");
							test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_Titile23);

						} else {
							System.err.println(GetAmount_Titile23 + ":- FAIL");
							test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_Titile23);

						}

						String GetAmount_Titile23A = driver
								.findElement(By.xpath("//*[@id='ID_ExerciseStockProceedExercise_Amount']")).getText();

						if (GetAmount_Titile12A.equals(GetAmount_Titile23A)) {

							System.out.println(GetAmount_Titile23A + ":- PASS");
							test.log(LogStatus.PASS, " Exercise Amount:- " + GetAmount_Titile23A);

						} else {
							System.err.println(GetAmount_Titile23A + ":- FAIL");
							test.log(LogStatus.FAIL, " Exercise Amount:- " + GetAmount_Titile23A);

						}
						Thread.sleep(100);

						// Tax Amount
						String GetAmount_Titile24 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[1]/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
								.getText();
						String string1 = new String(GetAmount_Titile13);
						String string2 = new String(GetAmount_Titile24);

						if (string1.equals(string2)) {

							System.out.println(GetAmount_Titile24 + ":- PASS");
							test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_Titile24);

						} else {
							System.err.println(GetAmount_Titile24 + ":- FAIL");
							test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_Titile24);

						}

						String GetAmount_Titile24A = driver
								.findElement(By.xpath("//*[@id='ID_ExerciseStockProceedExercise_TaxAmountValue']"))
								.getText();
						String string3 = new String(GetAmount_Titile13A);
						String string4 = new String(GetAmount_Titile24A);
						System.out.println(GetAmount_Titile13A + "-" + GetAmount_Titile24A);

						if (string3.equals(string4)) {

							System.out.println(GetAmount_Titile24A + ":- PASS");
							test.log(LogStatus.PASS, " Tax Amount:- " + GetAmount_Titile24A);

						} else {
							System.err.println(GetAmount_Titile24A + ":- FAIL");
							test.log(LogStatus.FAIL, " Tax Amount:- " + GetAmount_Titile24A);

						}
						Thread.sleep(100);

						// Total Amount Payable
						String GetAmount_Titile25 = driver.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
								.getText();
						if (GetAmount_Titile14.equals(GetAmount_Titile25)) {

							System.out.println(GetAmount_Titile25 + ":- PASS");
							test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_Titile25);

						} else {
							System.err.println(GetAmount_Titile25 + ":- FAIL");
							test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_Titile25);

						}
						String GetAmount_Titile25A = driver
								.findElement(By.xpath("//*[@id='ID_Quantity_TotalAmntPayable']")).getText();
						if (GetAmount_Titile14A.equals(GetAmount_Titile25A)) {

							System.out.println(GetAmount_Titile25A + ":- PASS");
							test.log(LogStatus.PASS, " Total Amount Payable:- " + GetAmount_Titile25A);

						} else {
							System.err.println(GetAmount_Titile25A + ":- FAIL");
							test.log(LogStatus.FAIL, " Total Amount Payable:- " + GetAmount_Titile25A);

						}
						Thread.sleep(1000);

						// ****************************************************************************//

						Boolean FMV = driver.findElements(By.xpath(
								"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[2]/div/div/h3"))
								.size() != 0;
						System.out.println("FMV  =" + FMV);

						if (FMV == true) {

							System.err.println("FVM Not Updated");
							test.log(LogStatus.FAIL, " FVM Not Updated:-" +FMV);

							Boolean ExerciseStockProceed_checkbox = driver
									.findElements(By.id("ID_Quantity_PaymentModeDeclaration")).size() != 0;
							System.out.println("ExerciseStockProceed_checkbox  =" + ExerciseStockProceed_checkbox);
							if (ExerciseStockProceed_checkbox == true) {

								ExerciseNow_Locator.ExerciseStockProceed_checkbox1(driver).click();
								System.out.println("Click on the ExerciseStockProceed checkbox Button");
								Thread.sleep(2000);
								test.log(LogStatus.PASS, "Click on the ExerciseStockProceed checkbox Button:- " + ExerciseStockProceed_checkbox);

							} else {

								System.err.println("Not Click on the ExerciseStockProceed checkbox Button");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, "Not Click on the ExerciseStockProceed checkbox Button:- " + ExerciseStockProceed_checkbox);

							}

							WebElement Quantity_ConfirmExercise = driver
									.findElement(By.id("ID_Quantity_ConfirmExercise"));
							if (Quantity_ConfirmExercise.isEnabled()) {

								Boolean Quantity_ConfirmExercise2 = driver
										.findElements(By.id("ID_Quantity_ConfirmExercise")).size() != 0;
								System.out.println("Quantity_ConfirmExercise2 =" + Quantity_ConfirmExercise2);
								if (Quantity_ConfirmExercise2 == true) {

									ExerciseNow_Locator.Confirm_Exercise_Button(driver).click();
									System.out.println("Click on the Confirm Exercise Button");
									Thread.sleep(2000);

									Boolean Quantity_PopUp = driver.findElements(By.id("ID_Quantity_Submit"))
											.size() != 0;
									System.out.println("Quantity_PopUp =" + Quantity_PopUp);
									if (Quantity_PopUp == true) {

										ExerciseNow_Locator.Quantity_Submit(driver).click();
										System.out.println("Click on the Quantity Submit Button");
										Thread.sleep(2000);
										test.log(LogStatus.PASS, " Click on the Quantity Submit Button " + Quantity_PopUp);

									} else {

										System.err.println("Not Click on the Confirm Exercise Button");
										Thread.sleep(500);
										test.log(LogStatus.FAIL, " Not Click on the Confirm Exercise Button " +Quantity_PopUp);

									}

									Thread.sleep(1000);

									Boolean Quantity_MessageText = driver.findElements(By.id("ID_Quantity_MessageText"))
											.size() != 0;
									System.out.println("Quantity_MessageText =" + Quantity_MessageText);
									if (Quantity_MessageText == true) {

										String GetText = ExerciseNow_Locator.Quantity_MessageText(driver).getText();
										System.err.println("==>>" + GetText);
										Thread.sleep(2000);

										ExerciseNow_Locator.QuantityOk_Button1(driver).click();
										System.out.println("Click on the Quantity Ok Button");
										Thread.sleep(2000);
										test.log(LogStatus.PASS, " Click on the Quantity Ok Button:- " +Quantity_MessageText);

									} else {

										System.err.println("Not Click on the Quantity Message Text");
										Thread.sleep(500);
										test.log(LogStatus.FAIL, " Not Click on the Quantity Message Text:- " +Quantity_MessageText);

									}
								} else {

									System.err.println("Not Click on the Confirm Exercise Button");
									Thread.sleep(500);
									test.log(LogStatus.FAIL, " Not Click on the Confirm Exercise Button:- " + Quantity_ConfirmExercise2 );

								}
							}

						} else {

							System.out.println("FVM Updated");

							Boolean ExerciseStockProceed_checkbox = driver
									.findElements(By.id("ID_Quantity_PaymentModeDeclaration")).size() != 0;
							System.out.println("ExerciseStockProceed_checkbox  =" + ExerciseStockProceed_checkbox);
							if (ExerciseStockProceed_checkbox == true) {

								ExerciseNow_Locator.ExerciseStockProceed_checkbox(driver).click();
								System.out.println("Click on the ExerciseStockProceed checkbox Button");
								Thread.sleep(2000);
								test.log(LogStatus.PASS, "Click on the ExerciseStockProceed checkbox Button:- " + ExerciseStockProceed_checkbox);

							} else {

								System.err.println("Not Click on the ExerciseStockProceed checkbox Button");
								Thread.sleep(500);
								test.log(LogStatus.FAIL, "Not Click on the ExerciseStockProceed checkbox Button:- " + ExerciseStockProceed_checkbox);

							}

							Thread.sleep(2000);

							WebElement Quantity_ConfirmExercise = driver
									.findElement(By.id("ID_Quantity_ConfirmExercise"));
							if (Quantity_ConfirmExercise.isEnabled()) {

								Boolean Quantity_ConfirmExercise2 = driver
										.findElements(By.id("ID_Quantity_ConfirmExercise")).size() != 0;
								System.out.println("Quantity_ConfirmExercise2 =" + Quantity_ConfirmExercise2);
								if (Quantity_ConfirmExercise2 == true) {

									ExerciseNow_Locator.Confirm_Exercise_Button(driver).click();
									System.out.println("Click on the Confirm Exercise Button");
									Thread.sleep(2000);

									Boolean Quantity_PopUp = driver.findElements(By.id("ID_Quantity_Submit"))
											.size() != 0;
									System.out.println("Quantity_PopUp =" + Quantity_PopUp);
									if (Quantity_PopUp == true) {

										ExerciseNow_Locator.Quantity_Submit(driver).click();
										System.out.println("Click on the Quantity Submit Button");
										Thread.sleep(2000);
										test.log(LogStatus.PASS, " Click on the Quantity Submit Button " + Quantity_PopUp);

									} else {

										System.err.println("Not Click on the Confirm Exercise Button");
										Thread.sleep(500);
										test.log(LogStatus.FAIL, " Not Click on the Confirm Exercise Button " + Quantity_PopUp);

									}

									Thread.sleep(1000);

									Boolean Quantity_MessageText = driver.findElements(By.id("ID_Quantity_MessageText"))
											.size() != 0;
									System.out.println("Quantity_MessageText =" + Quantity_MessageText);
									if (Quantity_MessageText == true) {

										String GetText = ExerciseNow_Locator.Quantity_MessageText(driver).getText();
										System.err.println("==>>" + GetText);
										Thread.sleep(2000);
										String GetValue1 = GetText.replaceAll("[^0-9]+", "");
										Thread.sleep(800);
										System.out.println("Get  =" + GetValue1);
										Thread.sleep(1000);

										int t1 = Integer.parseInt(GetValue1);
										System.out.println(t1);

										ExerciseNow_Locator.QuantityOk_Button(driver).click();
										System.out.println("Click on the Quantity Ok Button");
										Thread.sleep(2000);

										Boolean Exerciese_Options2 = driver
												.findElements(By.linkText("Exercise Options")).size() != 0;
										System.out.println(" Exerciese_Options2 =" + Exerciese_Options2);
										if (Exerciese_Options2 == true) {

											ExerciseNow_Locator.Exerciese_Options(driver).click();
											System.out.println("Click on the Exerciese Options ");
											Thread.sleep(500);
											test.log(LogStatus.PASS, " Click on the Exerciese Options:- " + Exerciese_Options2);

										} else {

											System.err.println("Not Click on the Exerciese_Options ");
											Thread.sleep(500);
											test.log(LogStatus.FAIL, " Not Click on the Exerciese_Options:-" + Exerciese_Options2);

										}
										Thread.sleep(5000);

										String GetInstrumentNumber = driver
												.findElement(By.xpath("//*[@id='ID_Exercise_InstrumentNumber']"))
												.getText();
										
										int Get_Status = driver.findElements(By.className("btn-link2")).size();
										System.out.println(Get_Status + "");
										for (int Index = 1; Index <= Get_Status; Index++) {

											Boolean Get_Status4 = driver
													.findElements(By.xpath(
															"//div[" + Index + "]//div/div[2]/div/div/button/span"))
													.size() != 0;
											if (Get_Status4 == true) {

												String Get_Status2 = driver
														.findElement(By.xpath(
																"//div[" + Index + "]/div/div[2]/div/div/button/span"))
														.getText();
												Thread.sleep(500);
												if (Get_Status2.equals("Select Payment Mode")) {

													driver.findElement(By.xpath(
															"//div[" + Index + "]/div/div[2]/div/div/button/span"))
															.click();
													Thread.sleep(8000);
													break;
												}

											}
										}
										Thread.sleep(5000);

										if (Online.equals("Y")) {

											// =========== Online Payment Mode =============
											Online_PaymentMode Online_PaymentMode1 = new Online_PaymentMode();
											Online_PaymentMode1.Exercise_Now(sheet4, sheet5, sheet6, sheet7, rowhead500,
													rowhead600, rowhead700, GetAmount_Titile11, GetAmount_Titile11A,
													GetAmount_Titile12, GetAmount_Titile12A, GetAmount_Titile13,
													GetAmount_Titile13A, GetAmount_Titile14, GetAmount_Titile14A);

										} else if (WireTransfer.equals("Y")) {

											// =========== WireTransfer Payment Mode =============
											WireTransfer_PaymentMode WireTransfer_PaymentMode1 = new WireTransfer_PaymentMode();
											WireTransfer_PaymentMode1.Exercise_Now(sheet4, sheet5, sheet6, sheet7,
													sheet8, rowhead500, rowhead600, rowhead700, rowhead800,
													GetAmount_Titile11, GetAmount_Titile11A, GetAmount_Titile12,
													GetAmount_Titile12A, GetAmount_Titile13, GetAmount_Titile13A,
													GetAmount_Titile14, GetAmount_Titile14A, GetInstrumentNumber,
													CompanyID, User, GetValue1);

										} else if (Cheque.equals("Y")) {

											// =========== Cheque Payment Mode =============
											Cheque_PaymentMode Cheque_PaymentMode1 = new Cheque_PaymentMode();
											Cheque_PaymentMode1.Exercise_Now(sheet4, sheet5, sheet6, sheet7, sheet8,
													rowhead500, rowhead600, rowhead700, rowhead800, GetAmount_Titile11,
													GetAmount_Titile11A, GetAmount_Titile12, GetAmount_Titile12A,
													GetAmount_Titile13, GetAmount_Titile13A, GetAmount_Titile14,
													GetAmount_Titile14A, GetInstrumentNumber, CompanyID, User,
													GetValue1);

										} else if (DD.equals("Y")) {

											// =========== DD Payment Mode =============
											DD_PaymentMode DD_PaymentMode1 = new DD_PaymentMode();
											DD_PaymentMode1.Exercise_Now(sheet4, sheet5, sheet6, sheet7, sheet8,
													rowhead500, rowhead600, rowhead700, rowhead800, GetAmount_Titile11,
													GetAmount_Titile11A, GetAmount_Titile12, GetAmount_Titile12A,
													GetAmount_Titile13, GetAmount_Titile13A, GetAmount_Titile14,
													GetAmount_Titile14A, GetInstrumentNumber, CompanyID, User,
													GetValue1);

										} else if (RTGS.equals("Y")) {

											// =========== RTGS Payment Mode =============
											RTGS_PaymentMode RTGS_PaymentMode1 = new RTGS_PaymentMode();
											RTGS_PaymentMode1.Exercise_Now(sheet4, sheet5, sheet6, sheet7, sheet8,
													rowhead500, rowhead600, rowhead700, rowhead800, GetAmount_Titile11,
													GetAmount_Titile11A, GetAmount_Titile12, GetAmount_Titile12A,
													GetAmount_Titile13, GetAmount_Titile13A, GetAmount_Titile14,
													GetAmount_Titile14A, GetInstrumentNumber, CompanyID, User,
													GetValue1);

										} else if (DirectDebit.equals("Y")) {

											// =========== DirectDebit Payment Mode =============
											DirectDebit_PaymentMode DirectDebit_PaymentMode1 = new DirectDebit_PaymentMode();
											DirectDebit_PaymentMode1.Exercise_Now(sheet4, sheet5, sheet6, sheet7,
													sheet8, rowhead500, rowhead600, rowhead700, rowhead800,
													GetAmount_Titile11, GetAmount_Titile11A, GetAmount_Titile12,
													GetAmount_Titile12A, GetAmount_Titile13, GetAmount_Titile13A,
													GetAmount_Titile14, GetAmount_Titile14A, GetInstrumentNumber,
													CompanyID, User, GetValue1);

										} else if (SellAll.equals("Y")) {

											// =========== SellAll Payment Mode =============
											SellAll_PaymentMode SellAll_PaymentMode1 = new SellAll_PaymentMode();
											SellAll_PaymentMode1.Exercise_Now(sheet4, sheet5, sheet6, sheet7, sheet8,
													rowhead500, rowhead600, rowhead700, rowhead800, GetAmount_Titile11,
													GetAmount_Titile11A, GetAmount_Titile12, GetAmount_Titile12A,
													GetAmount_Titile13, GetAmount_Titile13A, GetAmount_Titile14,
													GetAmount_Titile14A, GetInstrumentNumber, CompanyID, User,
													GetValue1);

										} else if (SellPartial.equals("Y")) {

											// =========== SellPartial Payment Mode =============
											SellPartial_PaymentMode SellPartial_PaymentMode1 = new SellPartial_PaymentMode();
											SellPartial_PaymentMode1.Exercise_Now(sheet4, sheet5, sheet6, sheet7,
													sheet8, rowhead500, rowhead600, rowhead700, rowhead800,
													GetAmount_Titile11, GetAmount_Titile11A, GetAmount_Titile12,
													GetAmount_Titile12A, GetAmount_Titile13, GetAmount_Titile13A,
													GetAmount_Titile14, GetAmount_Titile14A, GetInstrumentNumber,
													CompanyID, User, GetValue1);
										}

									} else {

										System.err.println("Not Click on the Quantity Message Text");
										Thread.sleep(500);
										test.log(LogStatus.FAIL, " Not Click on the Quantity Message Text:- " + Quantity_ConfirmExercise2);

									}

								} else {

									System.err.println("Not Click on the Confirm Exercise Button");
									Thread.sleep(500);
									test.log(LogStatus.FAIL, " Not Click on the Confirm Exercise Button:- " + Quantity_ConfirmExercise);

								}
							}
						}

					} else {
						System.err.println("Not Click on the Tax_Amount Button");
						Thread.sleep(500);
						test.log(LogStatus.FAIL, " Not Click on the Tax_Amount Button:- " + Calculate_Button2);

					}

				} else {
					System.err.println("Not Click on the Calculate Button");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " Not Click on the Calculate Button:-" + Calculate_Button);

				}

			} else {

				System.err.println("Sorry  Calculate Button is disable");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Click on the DirectDebit radio Button Button " + Calculate_Button);

			}

			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			workbook.close();
			Thread.sleep(5000);

		}
	}

}
