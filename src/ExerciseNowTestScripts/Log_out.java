package ExerciseNowTestScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.LogStatus;
import Locators.Login_Locator;

public class Log_out extends MyEsopsLogin {

	public void LogOut() throws Exception {
		// excelDataRemove();

		test = report.startTest("LogOut Page");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);

		WebElement Profile = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(Login_Locator.Profile(driver)));
		JavascriptExecutor executor_Profile = (JavascriptExecutor) driver;
		executor_Profile.executeScript("arguments[0].click();", Profile);

		// Login_Locator.Profile(driver).click();
		System.out.println("Click on the Profile Button");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, " Click on the Profile Button");

		Boolean Logout = driver.findElements(By.id("ID_Topbar_LogOut")).size() != 0;
		System.out.println("Logout =" + Logout);
		if (Logout == true) {

			Thread.sleep(2000);
			Login_Locator.Logout(driver).click();
			System.out.println(" Click on the LogOut Button:- "+Logout);
			Thread.sleep(1000);
			test.log(LogStatus.PASS, " Click on the LogOut Button ");

			driver.close();
			System.out.println("Browser Close");
			test.log(LogStatus.PASS, " Browser Close ");

		} else {

			test.log(LogStatus.FAIL, "Test Case Fail :- Browser Close " + Logout);
		}
		Thread.sleep(10000);
	}
}