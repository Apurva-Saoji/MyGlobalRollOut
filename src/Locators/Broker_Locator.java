package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Broker_Locator {
	private static WebElement element = null;

	/*******************************************************************************************
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : AKSHAY 20-NOV-2019 1.0
	 *
	 *******************************************************************************************/

	public static WebElement Add_Broker(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='kt_content']/div/kt-broker-details/div[2]/div/div/div/div[2]/div[2]/div/button"));
		return element;

	}

	public static WebElement brokerName(WebDriver driver) {

		element = driver.findElement(By.id("ID_brokerName"));
		return element;

	}

	public static WebElement brokertrustCmpId(WebDriver driver) {

		element = driver.findElement(By.id("ID_brokertrustCmpId"));
		return element;

	}

	public static WebElement broker_ElectAccNum(WebDriver driver) {

		element = driver.findElement(By.id("ID_broker_ElectAccNum"));
		return element;

	}

	public static WebElement BrokerSubmit_Button(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='ID_broker_add-box']/div/div[3]/div/div/button[2]"));
		return element;

	}

}
