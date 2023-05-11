package ExerciseNowTestScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import Locators.Login_Locator;

public class Login extends MyEsopsLogin {

	public void LoginIN(String User, String Password, String CompanyID, String Ans1, String Ans2) throws Exception {
		// excelDataRemove();
		test = report.startTest("Login Page");
		if (driver.getTitle().equals("MyESOPs")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		try {

			Login_Locator.OK_PopUp(driver).click();

		} catch (Exception e) {
			// TODO: handle exception
		}
		// ======Login ===============
		Thread.sleep(1000);

		Boolean MYESOPUserID = driver.findElements(By.id("username")).size() != 0;
		if (MYESOPUserID == true) {

			Login_Locator.MYESOPUserID(driver).clear();
			Thread.sleep(1000);

			Login_Locator.MYESOPUserID(driver).sendKeys(User);
			Thread.sleep(1000);

			System.out.println(User);

			test.log(LogStatus.PASS, "Enter User Name :-" + User);

		} else {

			test.log(LogStatus.FAIL, "Enter User Name Test Failed");
		}

		Thread.sleep(1000);

		Boolean MYESOPPassword = driver.findElements(By.name("userPassword")).size() != 0;
		if (MYESOPPassword == true) {

			Actions actions = new Actions(driver);
			actions.moveToElement(Login_Locator.MYESOPPassword(driver));
			actions.click();
			actions.sendKeys(Password);
			actions.build().perform();
			System.out.println(Password);

			test.log(LogStatus.PASS, "Enter Password Name :-" + Password);

		} else {

			test.log(LogStatus.FAIL, "Enter User Password Test Failed");
		}

		Boolean MYESOPCompanyId = driver.findElements(By.id("companyId")).size() != 0;
		if (MYESOPCompanyId == true) {

			Login_Locator.MYESOPCompanyId(driver).clear();
			Thread.sleep(1000);
			Login_Locator.MYESOPCompanyId(driver).sendKeys(CompanyID);
			Thread.sleep(1000);
			System.out.println(CompanyID);

			test.log(LogStatus.PASS, "Enter CompanyID :-" + CompanyID);

		} else {

			test.log(LogStatus.FAIL, "Enter CompanyID Test Failed");
		}

		Boolean LoginButton = driver.findElements(By.xpath("//button[contains(text(),'Login')]")).size() != 0;
		if (LoginButton == true) {

			Login_Locator.LoginButton(driver).click();
			Thread.sleep(8000);

			test.log(LogStatus.PASS, "Click on the login Button :-" + LoginButton);

		} else {

			test.log(LogStatus.FAIL, "Click on the login Button Test Failed");
		}

		Boolean iselementpresent1 = driver
				.findElements(By.xpath("/html/body/kt-auth/div/div/div/kt-login6/div[1]/div[1]")).size() != 0;
		System.out.println("iselementpresent" + iselementpresent1);

		Thread.sleep(2000);
		if (iselementpresent1 == true) {
			Login_Locator.SeqAns1(driver).sendKeys(Ans1);
			Thread.sleep(1000);
			System.out.println(Ans1);
			Login_Locator.SeqAns2(driver).sendKeys(Ans2);
			Thread.sleep(1000);
			System.out.println(Ans2);
			Thread.sleep(1000);
			Login_Locator.SubmitAns(driver).click();
			Thread.sleep(1000);

		}

		try {

			Boolean ImportantNotification = driver
					.findElements(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-dashboard/div[10]/div/div"))
					.size() != 0;
			System.out.println(" ImportantNotification =" + ImportantNotification);

			Thread.sleep(2000);
			if (ImportantNotification == true) {

				Login_Locator.ImportantNotificationClose(driver).click();
				Thread.sleep(2000);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		Boolean PendingTasks = driver.findElements(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnMdlNo1\"]"))
				.size() != 0;
		System.out.println(" PendingTasks=" + PendingTasks);

		Thread.sleep(2000);
		if (PendingTasks == true) {

			//Login_Locator.Skip_Dashboard(driver).click();
			Thread.sleep(2000);

			test.log(LogStatus.PASS, "Click on the Pending Tasks Button :-" + PendingTasks);

		} else {

			test.log(LogStatus.FAIL, "Click on the Pending Tasks Button Test Failed");
		}

	}
}