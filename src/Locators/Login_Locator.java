package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Locator {
	private static WebElement element = null;

	/*******************************************************************************************
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : AKSHAY 20-NOV-2019 1.0
	 *
	 *******************************************************************************************/
	
	public static WebElement Dashboard_Click(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='kt_aside_menu']/ul/li[1]/a/span"));
		return element;
	}
	public static WebElement OK_PopUp(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='confirm-exercise-success-modal']/div/div/div[2]/form/div/button"));
		return element;
	}
	public static WebElement COVID(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='btn1']"));
		return element;
	}

	public static WebElement MYESOPUserID(WebDriver driver) {

		element = driver.findElement(By.id("username"));
		return element;
	}

	public static WebElement MYESOPPassword(WebDriver driver) {

		element = driver.findElement(By.name("userPassword"));
		return element;
	}

	public static WebElement MYESOPCompanyId(WebDriver driver) {

		element = driver.findElement(By.id("companyId"));
		return element;
	}

	public static WebElement LoginButton(WebDriver driver) {
		// element = driver.findElement(By.id("btnOk"));
		element = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));

		return element;
	}
	
	public static WebElement ImportantNotificationClose(WebDriver driver) {
		//element = driver.findElement(By.xpath("//*[@id='kt_content']/div/kt-dashboard/div[10]/div/div/div[1]/button"));
		element = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/kt-dashboard/div[5]/div/div/button/span"));

		return element;
	} 
	
	public static WebElement Skip_Dashboard(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='kt_content']/div/kt-dashboard/div[6]/div/div/div/div[2]/button"));
		return element;
	}
	
	
	public static WebElement Profile(WebDriver driver) {
		element = driver.findElement(By.xpath("//em[contains(text(),'Profile')]"));
		return element;
	}
	
	public static WebElement System(WebDriver driver) {
		element = driver.findElement(By.linkText("System"));
		return element;
	}

	public static WebElement Logout(WebDriver driver) {
		//element = driver.findElement(By.id("ID_Topbar_LogOut"));
		//element=driver.findElement(By.xpath("(//button[@id='ID_Topbar_LogOut'])[1]"));
		element=driver.findElement(By.xpath("(//button[@id='ID_Topbar_LogOut'])[2]"));
		return element;
	}

	public static WebElement SeqAns1(WebDriver driver) {
		element = driver.findElement(By.id("id_answer1"));
//		element = driver.findElement(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_txtAnswer1"));
		return element;
	}

	public static WebElement SeqAns2(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='kt_login']/div/div/kt-login6/div[1]/div[1]/form/div[2]/input"));
//		element = driver.findElement(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_txtAnswer2"));
		return element;
	}

	public static WebElement SubmitAns(WebDriver driver) {
		element = driver.findElement(By.id("btn_answer"));
//		element = driver.findElement(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_btnCheckAnswers"));
		return element;
	}

}
