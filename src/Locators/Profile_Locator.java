package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile_Locator {
	private static WebElement element = null;

	/*******************************************************************************************
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : AKSHAY 20-NOV-2019 1.0
	 *
	 *******************************************************************************************/

	public static WebElement ViewProfile_EditProfil(WebDriver driver) {

		element = driver.findElement(By.id("ID_ViewProfile_EditProfile"));
		return element;

	}
	
	public static WebElement MyProfile_DateOfJoinning(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_DateOfJoinning"));
		return element;

	}
	
	public static WebElement MyProfile_Level(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_Level"));
		return element;

	}
	
	public static WebElement MyProfile_Designation(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_Designation"));
		return element;

	}
	
	public static WebElement MyProfile_Email(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_Email"));
		return element;

	}
	
	public static WebElement MyProfile_ContactNo(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_ContactNo"));
		return element;

	}
	
	public static WebElement MyProfile_SecondaryEmail(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_SecondaryEmail"));
		return element;

	}
	
	public static WebElement MyProfile_Address(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_Address"));
		return element;

	}
	
	public static WebElement MyProfile_PAN(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_PAN"));
		return element;

	}
	
	public static WebElement MyProfile_ResidentialStatus(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_ResidentialStatus"));
		return element;

	}
	
	public static WebElement MyProfile_InsiderEmployee(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_InsiderEmployee"));
		return element;

	}
	
	public static WebElement MyProfile_Entity(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_Entity"));
		return element;

	}
	
	public static WebElement MyProfile_Department(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_Department"));
		return element;

	}
	
	public static WebElement MyProfile_SBU(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_SBU"));
		return element;

	}
	
	public static WebElement MyProfile_CostCente(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_CostCenter"));
		return element;

	}
	
	public static WebElement MyProfile_Location(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_Location"));
		return element;

	}
	
	public static WebElement MyProfile_TaxIdentifierCountry(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_TaxIdentifierCountry"));
		return element;

	}
	
	public static WebElement MyProfile_TaxIdentifierState(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_TaxIdentifierState"));
		return element;

	}
	
	public static WebElement MyProfile_Submit(WebDriver driver) {

		element = driver.findElement(By.id("ID_MyProfile_Submit"));
		return element;

	}
}
