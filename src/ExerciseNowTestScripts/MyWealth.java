package ExerciseNowTestScripts;

import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Login_Locator;

public class MyWealth extends MyEsopsLogin {

	public void MyWealth_Method() throws Exception {
		// excelDataRemove();

		test = report.startTest("My Wealth");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String filename = System.getProperty("user.dir") + "\\src\\CalculationData\\MyWealth.xls";
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("My Wealth");
		HSSFRow rowhead = sheet.createRow(1);

		Boolean Dashboard = driver.findElements(By.xpath("//*[@id='kt_aside_menu']/ul/li[1]/a/span")).size() != 0;
		System.out.println("Dashboard=" + Dashboard);

		Thread.sleep(2000);
		if (Dashboard == true) {

			test.log(LogStatus.PASS, "My Wealth Dashboard is available:-" + Dashboard);

			Login_Locator.Dashboard_Click(driver).click();
			Thread.sleep(2000);

			Boolean Get_MyWealthData = driver
					.findElements(By
							.xpath("//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[1]/div[1]/h3"))
					.size() != 0;
			System.out.println("Get_MyWealthData=" + Get_MyWealthData);
			jse.executeScript("window.scrollBy(0,350)");

			List<WebElement> Get_Value = driver.findElements(By.xpath(
					".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr"));
			System.out.println("Get_MyWealthData=" + Get_Value.size());

			Thread.sleep(2000);
			if (Get_MyWealthData == true) {

				String Get_Titile = driver
						.findElement(By.xpath(
								"//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[1]/div[1]/h3"))
						.getText();
				System.out.println("Get_Titile=" + Get_Titile);
				Thread.sleep(2000);

				List col = driver.findElements(By.xpath(
						".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/thead/tr/th"));
				System.out.println("No of cols are : " + col.size());

				for (int i = 1; i <= col.size(); i++) {

					HSSFRow rowhead1 = sheet.createRow(1 + i);

					String SubTitles = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/thead/tr/th["
									+ i + "]"))
							.getText();
					System.out.println(" SubTitles are : " + SubTitles);
					rowhead.createCell(i).setCellValue(SubTitles);
					// No.of rows

				}

				List rows = driver.findElements(By.xpath(
						".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr"));
				System.out.println("No of rows are : " + rows.size());

				for (int j = 1; j <= rows.size(); j++) {

					HSSFRow rowhead2 = sheet.createRow(1 + j);
					HSSFRow rowhead3 = sheet.createRow(1 + j);
					HSSFRow rowhead4 = sheet.createRow(1 + j);
					HSSFRow rowhead5 = sheet.createRow(1 + j);

					String GetData = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ j + "]/td[1]"))
							.getText();
					System.out.println("GetData are : " + GetData);
					rowhead2.createCell(1).setCellValue(GetData);

					String GetData2 = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ j + "]/td[2]"))
							.getText();
					System.out.println("GetData are : " + GetData2);
					rowhead3.createCell(2).setCellValue(GetData2);

					String GetData3 = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ j + "]/td[3]"))
							.getText();
					System.out.println("GetData are : " + GetData3);
					rowhead4.createCell(3).setCellValue(GetData3);

					String GetData4 = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ j + "]/td[4]"))
							.getText();
					System.out.println("GetData are : " + GetData4);
					rowhead5.createCell(4).setCellValue(GetData4);

				}

				test.log(LogStatus.PASS, "Check calculations of value of vested:-" + Get_MyWealthData);
				Thread.sleep(2000);

			} else {

				test.log(LogStatus.FAIL, "Test Failed - Check calculations of value of vested:-" + Get_MyWealthData);

			}

			Boolean Get_MyWealthData2 = driver.findElements(By.xpath(
					".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr"))
					.size() != 0;
			System.out.println("Get_MyWealthData2=" + Get_MyWealthData2);

			if (Get_MyWealthData2 == true) {
				List<WebElement> rows5 = driver.findElements(By.xpath(
						".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr"));
				System.out.println("No of rows are : " + rows5.size());

				for (int n = 1; n <= rows5.size(); n++) {

					String GetData = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ n + "]/td[1]"))
							.getText();

					String GetData2 = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ n + "]/td[2]"))
							.getText();
					String GetValue2 = GetData2.replaceAll("[^0-9]+", "");
					Thread.sleep(800);
					int t2 = Integer.parseInt(GetValue2);

					String GetData3 = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ n + "]/td[3]"))
							.getText();
					String GetValue3 = GetData3.replaceAll("[^0-9]+", "");
					Thread.sleep(800);
					System.out.println("Value of Unvested  =" + GetValue3);
					int t3 = Integer.parseInt(GetValue3);
					int OutstandingValue = t2 + t3;

					String GetData4 = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ n + "]/td[4]"))
							.getText();
					String GetValue4 = GetData4.replaceAll("[^0-9]+", "");
					Thread.sleep(800);
					int t4 = Integer.parseInt(GetValue4);
					int OutstandingGetValue = t4;

					if (OutstandingValue == (OutstandingGetValue)) {

						System.out.println("Instrument Name" + GetData + ":- PASS");
						System.out.println("Instrument Name" + GetData + "=>" + OutstandingGetValue);

					} else {
						System.err.println("Instrument Name" + GetData + ":- FAIL");
					}

				}

				/*test.log(LogStatus.PASS, "Check calculations of value of unvested:-" + Get_MyWealthData2);*/

			}

			else {

				/*test.log(LogStatus.FAIL, "Test Failed - Check calculations of value of unvested:-" + Get_MyWealthData2);*/

			}

			jse.executeScript("window.scrollBy(0,350)");

			Boolean Get_MyWealthData3 = driver.findElements(By.xpath(
					".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr"))
					.size() != 0;
			System.out.println("Get_MyWealthData3=" + Get_MyWealthData3);

			if (Get_MyWealthData3 == true) {

				List rows = driver.findElements(By.xpath(
						".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr"));
				System.out.println("No of rows are : " + rows.size());

				for (int k = 1; k <= rows.size(); k++) {

					String GetData = driver.findElement(By.xpath(
							".//*[@id='kt_content']/div/kt-dashboard/div[3]/div[1]/div[5]/div/div[2]/div/table/tbody/tr["
									+ k + "]/td[1]"))
							.getText();
					System.out.println("GetData-  : " + GetData);
					Thread.sleep(2000);
					Select fruits = new Select(driver.findElement(By.className("mr10")));
					fruits.selectByVisibleText(GetData);
					Thread.sleep(2000);
				}

				/*test.log(LogStatus.PASS, "Check calculations of value of outstanding:-" + Get_MyWealthData3);*/

			} else {

				/*test.log(LogStatus.FAIL,
						"Test Failed -Check calculations of value of outstanding:-" + Get_MyWealthData3);*/
			}

		} else {

			test.log(LogStatus.FAIL, "Test Failed - My Wealth Dashboard is not available:-" + Dashboard);

		}

		FileOutputStream fileOut = new FileOutputStream(filename);
		workbook.write(fileOut);
		workbook.close();
		Thread.sleep(10000);

	}
}