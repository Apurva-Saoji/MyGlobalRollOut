package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demat_Locator {
	private static WebElement element = null;

	/*******************************************************************************************
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : AKSHAY 20-NOV-2019 1.0
	 *
	 *******************************************************************************************/

	public static WebElement AddDemat(WebDriver driver) {

		element = driver.findElement(By.id("ID_demat_AddDematAcc"));
		return element;

	}
	
	public static WebElement DepositoryParticipantName(WebDriver driver) {

		element = driver.findElement(By.id("ID_demat_DepositoryParticipantName"));
		return element;

	}
	
	public static WebElement ClientIDNo(WebDriver driver) {

		element = driver.findElement(By.id("ID_demat_clientIDNo"));
		return element;

	}
	
	public static WebElement DpRecordName(WebDriver driver) {

		element = driver.findElement(By.id("ID_demat_DpRecordName"));
		return element;

	}
	
	public static WebElement Demat_SubmitButton(WebDriver driver) {

		element = driver.findElement(By.id("ID_demat_submit"));
		return element;

	}
}
