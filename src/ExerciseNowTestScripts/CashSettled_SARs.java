package ExerciseNowTestScripts;

import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import Locators.ExerciseNow_Locator;

public class CashSettled_SARs extends MyEsopsLogin {

	public void CashSettled_SARs_Method() throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Exerciese CashSettled SARs");

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
		HSSFSheet sheet7 = workbook.createSheet("Exercise Declaration Tax Amount");
		HSSFRow rowhead700 = sheet7.createRow(1);

		Boolean Exerciese_Options = driver.findElements(By.linkText("Exercise Options")).size() != 0;
		System.out.println(" Exerciese_Options =" + Exerciese_Options);
		if (Exerciese_Options == true) {

			ExerciseNow_Locator.Exerciese_Options(driver).click();
			System.out.println("Click on the Exerciese Options ");
			Thread.sleep(500);
			test.log(LogStatus.PASS, " Click on the Exerciese Options:-" + Exerciese_Options);

		} else {

			System.err.println("Not Click on the Exerciese_Options ");
			Thread.sleep(500);
			test.log(LogStatus.FAIL, " Not Click on the Exerciese_Options:-" + Exerciese_Options);

		}
		Thread.sleep(8000);

		Boolean Quick_Notes = driver.findElements(By.className("btn-link1")).size() != 0;
		System.out.println("Quick_Notes =" + Quick_Notes);
		if (Quick_Notes == true) {

			Thread.sleep(500);
			ExerciseNow_Locator.Quick_Notes(driver).click();
			System.out.println("Click on the Quick_Notes Open");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, " Click on the Quick_Notes Open:-" + Quick_Notes);

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
			test.log(LogStatus.FAIL, " Test Case Failed- Not Click on the Quick_Notes:- " + Quick_Notes);

		}

		String ExerciseOptions = driver
				.findElement(By.xpath("//kt-excercise-stock-list/div[2]/div[4]/div[3]/div/div[1]/div[1]/h3")).getText();
		System.out.println("=" + ExerciseOptions);

		if (ExerciseOptions.equals("Cash Settled SARs")) {

			Boolean Exercise_ProceedToExercise = driver.findElements(By.linkText("Exercise Options")).size() != 0;
			System.out.println("Exercise_ProceedToExercise=" + Exercise_ProceedToExercise);
			if (Exercise_ProceedToExercise == true) {

				ExerciseNow_Locator.Exercise_ProceedToExercise2(driver).click();
				System.out.println("Click on the Exercise Proceed To Exercis ");
				Thread.sleep(500);
				test.log(LogStatus.PASS, " Click on the Exercise Proceed To Exercise:-" + Exercise_ProceedToExercise);

			} else {

				System.err.println("Not Click on the Exercise Proceed To Exercis ");
				Thread.sleep(500);
				test.log(LogStatus.FAIL,
						" Not Click on the Exercise Proceed To Exercise:-" + Exercise_ProceedToExercise);

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
				test.log(LogStatus.PASS,
						" Click on the Exercise Stock Options Quick Notes Open:- " + StockOptions_QuickNotes);

				String GetText = driver.findElement(By.id("ID_Exercise_QuickNotes")).getText();
				System.out.println("Get Data = " + GetText);
				Thread.sleep(1000);
				ExerciseNow_Locator.StockOptions_QuickNotes(driver).click();
				System.out.println("Click on the Exercise Stock Options Quick Notes Close");
				Thread.sleep(500);
				test.log(LogStatus.PASS,
						" Click on the Exercise Stock Options Quick Notes Close:- " + StockOptions_QuickNotes);

			} else {

				System.err.println("Not Click on the Exercise Stock Options Quick Notes ");
				Thread.sleep(500);
				test.log(LogStatus.FAIL,
						" Not Click on the Exercise Stock Options Quick Notes:-" + StockOptions_QuickNotes);

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
				test.log(LogStatus.PASS, " Click on the Exercise Sort By:- " + Sort_By);

			} else {

				System.err.println("Not Click on the Exercise Sort By");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Exercise Sort By:- " + Sort_By);

			}

			Thread.sleep(1000);

			Boolean Exercise_All = driver.findElements(By.className("btn-h-34-adj")).size() != 0;
			System.out.println("Exercise_All=" + Exercise_All);
			if (Exercise_All == true) {

				ExerciseNow_Locator.Exercise_All2(driver).click();
				System.out.println("Click on the Exercise Exercise All Button");
				Thread.sleep(1000);
				test.log(LogStatus.PASS, " Click on the Exercise Exercise All Button:- " + Exercise_All);

			} else {

				System.err.println("Not Click on the Exercise Exercise All Button");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Not Click on the Exercise Exercise All Button:- " + Exercise_All);

			}

			Thread.sleep(1000);

			Boolean Reset_all = driver.findElements(By.className("btn-h-34-adj")).size() != 0;
			System.out.println("Reset_all=" + Reset_all);
			if (Reset_all == true) {

				ExerciseNow_Locator.Reset_all2(driver).click();
				System.out.println("Click on the Exercise Reset all Button");
				Thread.sleep(1000);
				test.log(LogStatus.PASS, " Click on the Exercise Reset all Button:- " + Reset_all);

			} else {

				System.err.println("Not Click on the Exercise Reset all Button");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Click on the Exercise Reset all Button:- " + Reset_all);

			}
			Thread.sleep(1000);

			WebElement Quantity_Enter = driver
					.findElement(By.xpath("//div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/div/input"));
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

					ExerciseNow_Locator.Quantity_Enter2(driver).sendKeys(String.valueOf(t + 1));
					System.out.println("Enter Quantity more than Available value");
					Thread.sleep(1000);
					test.log(LogStatus.PASS,
							" Enter Quantity more than Available value " + ExerciseStock_ExercisableQuantity);

					ExerciseNow_Locator.ExerciseStock_Ok(driver).click();
					System.out.println(" Yes PopUp is presernt ");
					Thread.sleep(1000);
					test.log(LogStatus.PASS, " Yes PopUp is presernt  " + ExerciseStock_ExercisableQuantity);

				} else {
					System.err.println("Not Enter Quantity");
					Thread.sleep(500);
					test.log(LogStatus.FAIL,
							" TestCase Fail - Not Enter Quantity " + ExerciseStock_ExercisableQuantity);

				}

				Boolean Quantity_Enter2 = driver
						.findElements(By.xpath("//div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/div/input"))
						.size() != 0;
				System.out.println("Quantity_Enter=" + Quantity_Enter2);
				if (Quantity_Enter2 == true) {

					ExerciseNow_Locator.Quantity_Enter2(driver).sendKeys("1");
					System.out.println("Enter Quantity");
					Thread.sleep(1000);
					test.log(LogStatus.PASS, " Enter Quantity " + Quantity_Enter2);

				} else {
					System.err.println("Not Enter Quantity");
					Thread.sleep(500);
					test.log(LogStatus.FAIL, " TestCase Fail - Not Enter Quantity " + Quantity_Enter2);

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
						test.log(LogStatus.PASS, " Click on the Calculate Button " + Calculate_Button2);

						Boolean Tax_Amount = driver.findElements(By.linkText("Tax Amount")).size() != 0;
						System.out.println("Tax_Amount  =" + Tax_Amount);
						if (Tax_Amount == true) {

							ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
							System.out.println(" Click on the Tax_Amount Button");
							Thread.sleep(1000);
							test.log(LogStatus.PASS, " Click on the Tax_Amount Button " + Tax_Amount);

							int getCount = driver.findElements(By.className("has-table")).size();
							System.err.println("= " + getCount);
							Thread.sleep(1000);

							int getCount2 = driver
									.findElements(
											By.xpath("//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
									.size();
							System.err.println("= " + getCount2);

							String GetAmount_Titile = driver.findElement(By.xpath("//*[@id='heading0']/a/h4"))
									.getText();
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

										String GetAmount_Titile3 = driver.findElement(By.xpath(
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

										String GetAmount_Titile3 = driver.findElement(By.xpath(
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
							test.log(LogStatus.PASS, " Click on the Tax_Amount Button close " + Tax_Amount);

							// ************************* *Excel Calculated Summary ***********************//

							String GetAmount_Titile10 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[2]/div/div[2]/div/div/div/h4"))
									.getText();
							rowhead10.createCell(1).setCellValue(GetAmount_Titile10);
							Thread.sleep(100);

							// Quantity
							String GetAmount_Titile11 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[2]/div/div[2]/div/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
									.getText();
							rowhead11.createCell(1).setCellValue(GetAmount_Titile11);
							String GetAmount_Titile11A = driver
									.findElement(By.xpath("//*[@id='ID_ExerciseStock_FinalQuantity']")).getText();
							rowhead11.createCell(2).setCellValue(GetAmount_Titile11A);
							Thread.sleep(100);

							// Exercise Amount
							String GetAmount_Titile12 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[2]/div/div[2]/div/div/div/table/tbody[1]/tr[2]/td[1]/ul/span/span"))
									.getText();
							rowhead12.createCell(1).setCellValue(GetAmount_Titile12);
							String GetAmount_Titile12A = driver
									.findElement(By.xpath("//*[@id='ID_ExerciseStock_FinalAmount']")).getText();
							rowhead12.createCell(2).setCellValue(GetAmount_Titile12A);
							Thread.sleep(100);

							// Tax Amount
							String GetAmount_Titile13 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[2]/div/div[2]/div/div/div/table/tbody[1]/tr[3]/td[1]/ul/li/a/p/span"))
									.getText();
							rowhead13.createCell(1).setCellValue(GetAmount_Titile13);
							String GetAmount_Titile13A = driver
									.findElement(By.xpath("//*[@id='ID_ExerciseStock_FinalTaxAmount']")).getText();
							rowhead13.createCell(2).setCellValue(GetAmount_Titile13A);
							Thread.sleep(100);

							// Total Amount Payable
							String GetAmount_Titile14 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[2]/div/div[2]/div/div/div/table/tbody[2]/tr[1]/td[1]/span/span"))
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
							test.log(LogStatus.PASS, " Click on the Continue Button " + Tax_Amount);

							ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
							System.out.println(" Click on the Tax_Amount Button ");
							Thread.sleep(1000);
							test.log(LogStatus.PASS, " Click on the Tax_Amount Button " + Tax_Amount);

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

										String GetAmount_TitilePersonal_Details3 = driver.findElement(By.xpath(
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

										String GetAmount_TitilePersonal_Details3 = driver.findElement(By.xpath(
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
							test.log(LogStatus.PASS, " Click on the Tax_Amount Button close " + Tax_Amount);

							// ************************* Verify Tax Amount Value ***********************//

							// Quantity
							String GetAmount_Titile22 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
									.getText();
							if (GetAmount_Titile11.equals(GetAmount_Titile22)) {

								System.out.println(GetAmount_Titile22 + ":- PASS");
								test.log(LogStatus.PASS, "Quantity:- " + GetAmount_Titile22);

							} else {
								System.err.println(GetAmount_Titile22 + ":- FAIL");
								test.log(LogStatus.FAIL, "Quantity:- " + GetAmount_Titile22);

							}

							String GetAmount_Titile22A = driver
									.findElement(By.xpath("//*[@id='ID_ExerciseStockProceedExercise_Quantity']"))
									.getText();
							if (GetAmount_Titile11A.equals(GetAmount_Titile22A)) {

								System.out.println(GetAmount_Titile22A + ":- PASS");
								test.log(LogStatus.PASS, "Quantity:- " + GetAmount_Titile22A);

								
							} else {
								System.err.println(GetAmount_Titile22A + ":- FAIL");
								test.log(LogStatus.FAIL, "Quantity:- " + GetAmount_Titile22A);

							}
							Thread.sleep(100);

							// Exercise Amount
							String GetAmount_Titile23 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
									.getText();
							if (GetAmount_Titile12.equals(GetAmount_Titile23)) {

								System.out.println(GetAmount_Titile23 + ":- PASS");
								test.log(LogStatus.PASS, "Exercise Amount:- " + GetAmount_Titile23);

							} else {
								System.err.println(GetAmount_Titile23 + ":- FAIL");
								test.log(LogStatus.FAIL, "Exercise Amount:- " + GetAmount_Titile23);

							}

							String GetAmount_Titile23A = driver
									.findElement(By.xpath("//*[@id='ID_ExerciseStockProceedExercise_Amount']"))
									.getText();

							if (GetAmount_Titile12A.equals(GetAmount_Titile23A)) {

								System.out.println(GetAmount_Titile23A + ":- PASS");
								test.log(LogStatus.PASS, "Exercise Amount:- " + GetAmount_Titile23A);

							} else {
								System.err.println(GetAmount_Titile23A + ":- FAIL");
								test.log(LogStatus.FAIL, "Exercise Amount:- " + GetAmount_Titile23A);

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
								test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_Titile24);

							} else {
								System.err.println(GetAmount_Titile24 + ":- FAIL");
								test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_Titile24);

							}

							String GetAmount_Titile24A = driver
									.findElement(By.xpath("//*[@id='ID_ExerciseStockProceedExercise_TaxAmountValue']"))
									.getText();
							String string3 = new String(GetAmount_Titile13A);
							String string4 = new String(GetAmount_Titile24A);
							System.out.println(GetAmount_Titile13A + "-" + GetAmount_Titile24A);

							if (string3.equals(string4)) {

								System.out.println(GetAmount_Titile24A + ":- PASS");
								test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_Titile24A);

							} else {
								System.err.println(GetAmount_Titile24A + ":- FAIL");
								test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_Titile24A);

							}
							Thread.sleep(100);

							// Total Amount Payable
							String GetAmount_Titile25 = driver.findElement(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
									.getText();
							if (GetAmount_Titile14.equals(GetAmount_Titile25)) {

								System.out.println(GetAmount_Titile25 + ":- PASS");
								test.log(LogStatus.PASS, "Total Amount Payable:- " + GetAmount_Titile25);

							} else {
								System.err.println(GetAmount_Titile25 + ":- FAIL");
								test.log(LogStatus.FAIL, "Total Amount Payable:- " + GetAmount_Titile25);

							}
							String GetAmount_Titile25A = driver
									.findElement(By.xpath("//*[@id='ID_Quantity_TotalAmntPayable']")).getText();
							if (GetAmount_Titile14A.equals(GetAmount_Titile25A)) {

								System.out.println(GetAmount_Titile25A + ":- PASS");
								test.log(LogStatus.PASS, "Total Amount Payable:- " + GetAmount_Titile25A);

							} else {
								System.err.println(GetAmount_Titile25A + ":- FAIL");
								test.log(LogStatus.FAIL, "Total Amount Payable:- " + GetAmount_Titile25A);

							}
							Thread.sleep(1000);

							// ****************************************************************************//

							Boolean FMV = driver.findElements(By.xpath(
									"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[2]/div/div/h3"))
									.size() != 0;
							System.out.println("FMV  =" + FMV);
							if (FMV == true) {

								System.err.println(" FVM Not Updated ");
								test.log(LogStatus.FAIL, " Test Case Failed- FVM Not Updated " + FMV);

								Boolean ExerciseStockProceed_checkbox = driver
										.findElements(By.id("ID_Quantity_PaymentModeDeclaration")).size() != 0;
								System.out.println("ExerciseStockProceed_checkbox  =" + ExerciseStockProceed_checkbox);
								if (ExerciseStockProceed_checkbox == true) {

									ExerciseNow_Locator.ExerciseStockProceed_checkbox1(driver).click();
									System.out.println("Click on the ExerciseStockProceed checkbox Button");
									Thread.sleep(2000);
									test.log(LogStatus.PASS, " Click on the ExerciseStockProceed checkbox Button "
											+ ExerciseStockProceed_checkbox);

								} else {

									System.err.println("Not Click on the ExerciseStockProceed checkbox Button");
									Thread.sleep(500);
									test.log(LogStatus.FAIL,
											" Test Case Fail-Not Click on the ExerciseStockProceed checkbox Button "
													+ ExerciseStockProceed_checkbox);

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
										test.log(LogStatus.PASS,
												" Click on the Confirm Exercise Button " + Quantity_ConfirmExercise2);

										Boolean Quantity_PopUp = driver.findElements(By.id("ID_Quantity_Submit"))
												.size() != 0;
										System.out.println("Quantity_PopUp =" + Quantity_PopUp);
										if (Quantity_PopUp == true) {

											ExerciseNow_Locator.Quantity_Submit(driver).click();
											System.out.println("Click on the Quantity Submit Button");
											Thread.sleep(2000);
											test.log(LogStatus.PASS,
													" Click on the ExerciseStockProceed checkbox Button "
															+ Quantity_PopUp);

										} else {

											System.err.println("Not Click on the Confirm Exercise Button");
											Thread.sleep(500);
											test.log(LogStatus.FAIL,
													" Test Case Fail-Not Click on the Confirm Exercise Button "
															+ Quantity_PopUp);

										}

										Thread.sleep(1000);

										Boolean Quantity_MessageText = driver
												.findElements(By.id("ID_Quantity_MessageText")).size() != 0;
										System.out.println("Quantity_MessageText =" + Quantity_MessageText);
										if (Quantity_MessageText == true) {

											String GetText = ExerciseNow_Locator.Quantity_MessageText(driver).getText();
											System.err.println("==>>" + GetText);
											Thread.sleep(2000);

											ExerciseNow_Locator.QuantityOk_Button1(driver).click();
											System.out.println("Click on the Quantity Ok Button");
											Thread.sleep(2000);
											test.log(LogStatus.PASS,
													" Click on the Quantity Ok Button " + Quantity_MessageText);

										} else {

											System.err.println("Not Click on the Quantity Message Text");
											Thread.sleep(500);
											test.log(LogStatus.FAIL,
													" Test Case Failed- Not Click on the Quantity Message Text "
															+ Quantity_MessageText);

										}
									} else {

										System.err.println("Not Click on the Confirm Exercise Button");
										Thread.sleep(500);
										test.log(LogStatus.FAIL,
												" Test Case Failed- Not Click on the Confirm Exercise Button"
														+ Quantity_ConfirmExercise);

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
									test.log(LogStatus.PASS, " Click on the ExerciseStockProceed checkbox Button "
											+ ExerciseStockProceed_checkbox);

								} else {

									System.err.println("Not Click on the ExerciseStockProceed checkbox Button");
									Thread.sleep(500);
									test.log(LogStatus.FAIL,
											" Test Case Failed- Not Click on the ExerciseStockProceed checkbox Button"
													+ ExerciseStockProceed_checkbox);

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
										test.log(LogStatus.PASS, " Click on the Confirm Exercise Button "
												+ ExerciseStockProceed_checkbox);

										Boolean Quantity_PopUp = driver.findElements(By.id("ID_Quantity_Submit"))
												.size() != 0;
										System.out.println("Quantity_PopUp =" + Quantity_PopUp);
										if (Quantity_PopUp == true) {

											ExerciseNow_Locator.Quantity_Submit(driver).click();
											System.out.println("Click on the Quantity Submit Button");
											Thread.sleep(2000);
											test.log(LogStatus.PASS,
													" Click on the Confirm Exercise Button " + Quantity_PopUp);

										} else {

											System.err.println("Not Click on the Confirm Exercise Button");
											Thread.sleep(500);
											test.log(LogStatus.FAIL,
													" Test Case Failed- Not Click on the Confirm Exercise Button "
															+ Quantity_PopUp);

										}

										Thread.sleep(1000);

										Boolean Quantity_MessageText = driver
												.findElements(By.id("ID_Quantity_MessageText")).size() != 0;
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
											test.log(LogStatus.PASS,
													" Click on the Quantity Ok Button " + Quantity_MessageText);

											// ************************* Exercise Declaration Tax Amount****//

											ExerciseNow_Locator.Tax_Amount_Button(driver).sendKeys(Keys.ENTER);
											System.out.println(" Click on the Tax_Amount Button");
											Thread.sleep(1000);
											test.log(LogStatus.PASS,
													" Click on the Tax_Amount Button " + Quantity_MessageText);

											int getCountExercise_Declaration = driver
													.findElements(By.className("has-table")).size();
											System.err.println("= " + getCountExercise_Declaration);
											Thread.sleep(1000);

											int getCountExercise_Declaration2 = driver.findElements(By.xpath(
													"//*[@id='collapse0']/div/table/tbody/tr[1]/td[5]/table/tbody/tr"))
													.size();
											System.err.println("= " + getCountExercise_Declaration2);

											String GetAmount_TitileExercise_Declaration = driver
													.findElement(By.xpath("//*[@id='heading0']/a/h4")).getText();
											sheet7.createRow(0).createCell(1)
													.setCellValue(GetAmount_TitileExercise_Declaration);

											for (int i = 1; i <= 4; i++) {

												String GetAmount_TitileExercise_Declaration1 = driver.findElement(By
														.xpath("//*[@id='collapse0']/div/table/thead/tr/th[" + i + "]"))
														.getText();
												rowhead700.createCell(i)
														.setCellValue(GetAmount_TitileExercise_Declaration1);
												Thread.sleep(100);

											}
											for (int j = 1; j < 4; j++) {

												String GetAmount_TitileExercise_Declaration2 = driver.findElement(By
														.xpath("//*[@id='collapse0']/div/table/thead/tr/th[5]/table/thead/tr/th["
																+ j + "]"))
														.getText();
												rowhead700.createCell(4 + j)
														.setCellValue(GetAmount_TitileExercise_Declaration2);
												Thread.sleep(100);

											}

											if (getCountExercise_Declaration2 >= 2) {

												for (int m = 1; m <= getCountExercise_Declaration; m++) {

													HSSFRow rowhead703 = sheet7
															.createRow(m * getCountExercise_Declaration2);
													// HSSFRow rowhead4 = sheet2.createRow((m * 2) + 1);

													for (int k = 1; k <= 4; k++) {

														String GetAmount_TitileExercise_Declaration3 = driver
																.findElement(By.xpath(
																		"//*[@id='collapse0']/div/table/tbody/tr[" + m
																				+ "]/td[" + k + "]"))
																.getText();
														rowhead703.createCell(k)
																.setCellValue(GetAmount_TitileExercise_Declaration3);
														Thread.sleep(100);

													}

													for (int l = 1; l < 4; l++) {

														String GetAmount_TitileExercise_Declaration4 = driver
																.findElement(By.xpath(
																		"//*[@id='collapse0']/div/table/tbody/tr[" + m
																				+ "]/td[5]/table/tbody/tr[1]/td[" + l
																				+ "]"))
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

														String GetAmount_TitileExercise_Declaration3 = driver
																.findElement(By.xpath(
																		"//*[@id='collapse0']/div/table/tbody/tr[" + m
																				+ "]/td[" + k + "]"))
																.getText();
														rowhead703.createCell(k)
																.setCellValue(GetAmount_TitileExercise_Declaration3);
														Thread.sleep(100);

													}

													for (int l = 1; l < 4; l++) {

														String GetAmount_TitileExercise_Declaration4 = driver
																.findElement(By.xpath(
																		"//*[@id='collapse0']/div/table/tbody/tr[" + m
																				+ "]/td[5]/table/tbody/tr[1]/td[" + l
																				+ "]"))
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
																.findElement(By.xpath(
																		"//*[@id='collapse0']/div/table/tbody/tr[" + m
																				+ "]/td[5]/table/tbody/tr[" + p
																				+ "]/td[" + l + "]"))
																.getText();
														rowhead705.createCell(4 + l)
																.setCellValue(GetAmount_TitileExercise_Declaration4);

													}
												}

											}

											HSSFRow rowhead706 = sheet7.createRow(
													(getCountExercise_Declaration * getCountExercise_Declaration2) + 3);

											for (int n = 1; n < 4; n++) {

												String GetAmount_TitileExercise_Declaration6 = driver.findElement(By
														.xpath("//*[@id='collapse0']/div/table/tfoot/tr/td[" + n + "]"))
														.getText();
												rowhead706.createCell(n * 2)
														.setCellValue(GetAmount_TitileExercise_Declaration6);
												Thread.sleep(100);
											}
											ExerciseNow_Locator.Tax_Amount_Button_Close(driver).sendKeys(Keys.ENTER);
											System.out.println(" Click on the Tax_Amount Button close");

											Thread.sleep(2000);
											test.log(LogStatus.PASS,
													" Click on the Tax_Amount Button close " + Quantity_MessageText);

											// **************** Verify Tax Amount Value ********//

											// Quantity
											String GetAmount_TitileCheque42 = driver.findElement(By.xpath(
													"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[1]/td[1]/ul/li/p"))
													.getText();
											if (GetAmount_Titile11.equals(GetAmount_TitileCheque42)) {

												System.out.println(GetAmount_TitileCheque42 + ":- PASS");
												test.log(LogStatus.PASS, "Quantity:- " + GetAmount_TitileCheque42);

											} else {
												System.err.println(GetAmount_TitileCheque42 + ":- FAIL");
												test.log(LogStatus.FAIL, "Quantity:- " + GetAmount_TitileCheque42);

											}

											String GetAmount_TitileCheque42A = driver
													.findElement(
															By.xpath("//*[@id='ID_DeclarationForm_ExercisedQuantity']"))
													.getText();
											System.out.println(GetAmount_Titile11A + "-" + GetAmount_TitileCheque42A);

											if (GetAmount_Titile11A.equals(GetAmount_TitileCheque42A)) {

												System.out.println(GetAmount_TitileCheque42A + ":- PASS");
												test.log(LogStatus.PASS, "Quantity:- " + GetAmount_TitileCheque42A);

											} else {
												System.err.println(GetAmount_TitileCheque42A + ":- FAIL");
												test.log(LogStatus.FAIL, "Quantity:- " + GetAmount_TitileCheque42A);

											}
											Thread.sleep(100);

											// Exercise Amount
											String GetAmount_TitileCheque43 = driver.findElement(By.xpath(
													"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[1]/tr[2]/td[1]/ul/li/span/span"))
													.getText();
											if (GetAmount_Titile12.equals(GetAmount_TitileCheque43)) {

												System.out.println(GetAmount_TitileCheque43 + ":- PASS");
												test.log(LogStatus.PASS, "Exercise Amount:- " + GetAmount_TitileCheque43);

											} else {
												System.err.println(GetAmount_TitileCheque43 + ":- FAIL");
												test.log(LogStatus.FAIL, "Exercise Amount:- " + GetAmount_TitileCheque43);

											}

											String GetAmount_TitileCheque43A = driver
													.findElement(
															By.xpath("//*[@id='ID_DeclarationForm_ExercisedAmount']"))
													.getText();

											if (GetAmount_Titile12A.equals(GetAmount_TitileCheque43A)) {

												System.out.println(GetAmount_TitileCheque43A + ":- PASS");
												test.log(LogStatus.PASS, "Exercise Amount:- " + GetAmount_TitileCheque43A);

											} else {
												System.err.println(GetAmount_TitileCheque43A + ":- FAIL");
												test.log(LogStatus.FAIL, "Exercise Amount:- " + GetAmount_TitileCheque43A);

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
												test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_TitileCheque44);

											} else {
												System.err.println(GetAmount_TitileCheque44 + ":- FAIL");
												test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_TitileCheque44);

											}

											String GetAmount_TitileCheque44A = driver
													.findElement(By.xpath("//*[@id='ID_DeclarationForm_TaxAmount']"))
													.getText();
											String stringCheque11 = new String(GetAmount_Titile13A);
											String stringCheque12 = new String(GetAmount_TitileCheque44A);
											System.out.println(GetAmount_Titile13A + "-" + GetAmount_TitileCheque44A);

											if (stringCheque11.equals(stringCheque12)) {

												System.out.println(GetAmount_TitileCheque44A + ":- PASS");
												test.log(LogStatus.PASS, "Tax Amount:- " + GetAmount_TitileCheque44A);

												
											} else {
												System.err.println(GetAmount_TitileCheque44A + ":- FAIL");
												test.log(LogStatus.FAIL, "Tax Amount:- " + GetAmount_TitileCheque44A);

											}
											Thread.sleep(100);

											// Total Amount Payable
											String GetAmount_TitileCheque45 = driver.findElement(By.xpath(
													"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[1]/div/div/table/tbody[2]/tr/td[1]/span/span"))
													.getText();
											if (GetAmount_Titile14.equals(GetAmount_TitileCheque45)) {

												System.out.println(GetAmount_TitileCheque45 + ":- PASS");
												test.log(LogStatus.PASS, "Total Amount Payable:- " + GetAmount_TitileCheque45);

											} else {
												System.err.println(GetAmount_TitileCheque45 + ":- FAIL");
												test.log(LogStatus.FAIL, "Total Amount Payable:- " + GetAmount_TitileCheque45);

											}
											String GetAmount_TitileCheque45A = driver
													.findElement(
															By.xpath("//*[@id='ID_DeclarationForm_TotalAmntPayable']"))
													.getText();
											if (GetAmount_Titile14A.equals(GetAmount_TitileCheque45A)) {

												System.out.println(GetAmount_TitileCheque45A + ":- PASS");
												test.log(LogStatus.PASS, "Total Amount Payable:- " + GetAmount_TitileCheque45A);

											} else {
												System.err.println(GetAmount_TitileCheque45A + ":- FAIL");
												test.log(LogStatus.FAIL, "Total Amount Payable:- " + GetAmount_TitileCheque45A);

											}
											Thread.sleep(1000);

											// ****************************************************************************//

											Boolean Acknowledgment_Payment = driver
													.findElements(By.id("ID_Acknowledgment_Payment")).size() != 0;
											System.out.println("Acknowledgment_Payment  =" + Acknowledgment_Payment);
											if (Acknowledgment_Payment == true) {

												Thread.sleep(1000);

												Boolean Payment_checkbox = driver.findElements(By.xpath(
														"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[2]/div/div/table/tbody[1]/tr/td/div/label/span"))
														.size() != 0;
												System.out.println("Payment_checkbox = " + Payment_checkbox);
												if (Payment_checkbox == true) {

													ExerciseNow_Locator.Payment_checkbox(driver).click();
													System.out.println("Click on the Payment checkbox Button");

													Thread.sleep(1000);
													test.log(LogStatus.PASS, " Click on the Payment checkbox Button "
															+ Payment_checkbox);

													Boolean ExercisedSubmitDownload1 = driver
															.findElements(
																	By.id("ID_DeclarationForm_ExercisedSubmitDownload"))
															.size() != 0;
													System.out.println(
															"ExercisedSubmitDownload = " + ExercisedSubmitDownload1);

													if (ExercisedSubmitDownload1 == true) {

														ExerciseNow_Locator.ExercisedSubmitDownload(driver).click();
														System.out.println(" Click on the Exercise Declaration ");
														Thread.sleep(1000);
														test.log(LogStatus.PASS, " Click on the Exercise Declaration "
																+ ExercisedSubmitDownload1);

														ExerciseNow_Locator.Acknowledgement_IntiateExercise(driver)
																.click();
														System.out.println(
																"Click on the Acknowledgement_IntiateExercise");
														Thread.sleep(1000);
														test.log(LogStatus.PASS,
																" Click on the Acknowledgement_IntiateExercise"
																		+ ExercisedSubmitDownload1);

													} else {

														System.err.println("Not Click on the Exercise Declaration");
														test.log(LogStatus.FAIL,
																" Test Case Failed- Not Click on the Exercise Declaration"
																		+ ExercisedSubmitDownload1);

													}

												} else {

													System.err.println("Not Click on the Payment checkbox Button");
													test.log(LogStatus.FAIL,
															" Test Case Failed- Not Click on the Payment checkbox Button"
																	+ Payment_checkbox);

												}

											} else {
												System.err.println("Acknowledgment_Payment Fail");
												test.log(LogStatus.FAIL,
														" Test Case Failed- Acknowledgment_Payment Fail"
																+ Acknowledgment_Payment);

											}

										} else {

											System.err.println("Quantity_MessageText Fail");
											test.log(LogStatus.FAIL, " Test Case Failed- Quantity_MessageText Fail"
													+ Quantity_MessageText);

										}
									} else {

										System.err.println("Not Click on the Quantity Message Text");
										Thread.sleep(500);
										test.log(LogStatus.FAIL,
												" Test Case Failed- Not Click on the Quantity Message Text"
														+ Quantity_ConfirmExercise2);

									}

								} else {

									System.err.println("Not Click on the Confirm Exercise Button");
									Thread.sleep(500);
									test.log(LogStatus.FAIL,
											" Test Case Failed- Not Click on the Confirm Exercise Button"
													+ Quantity_ConfirmExercise);

								}
							}
						}
					}
				}
			} else {

				System.err.println("Sorry Quantity this field is disable");
				Thread.sleep(500);
				test.log(LogStatus.FAIL, " Test Case Failed- Sorry Quantity this field is disable" + Quantity_Enter);

			}

		}

		FileOutputStream fileOut = new FileOutputStream(filename);
		workbook.write(fileOut);
		workbook.close();
		Thread.sleep(10000);

	}

}
