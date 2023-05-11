package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExerciseNow_Locator {
	private static WebElement element = null;

	/*******************************************************************************************
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : AKSHAY 20-NOV-2019 1.0
	 *
	 *******************************************************************************************/
	
	
	public static WebElement Exerciese_confirm(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/kt-base/div/div/div/div/div/kt-excercise-stock-list/div[8]/div/div/div[2]/form/div/button[1]"));
		return element;
	}
	
	public static WebElement Exercise_Cancel(WebDriver driver) {

		element = driver.findElement(By.id("ID_Exercise_Cancel"));
		return element;
	}
	public static WebElement Pending_Information(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='kt_content']/div/kt-excercise-stock-list/div[2]/div/ul/li[1]"));
		return element;
	}
	public static WebElement UpdateDetails_PreviewOK(WebDriver driver) {

		element = driver.findElement(By.id("ID_UploadDetails_uploadFormByExerciseFileName"));
		return element;
	}
	
	public static WebElement UpdateDetails_Preview(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Preview"));
		return element;
	}
	public static WebElement UpdateDetails_Upload(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Upload"));
		return element;
	}
	public static WebElement UploadFile(WebDriver driver) {

		element = driver.findElement(By.id("file-upload"));
		return element;
	}
	public static WebElement Exercise_ProceedToExercise3(WebDriver driver) {

		element = driver.findElement(By.xpath("//kt-excercise-stock-list/div[2]/div[4]/div[3]/div/div[1]/div[2]/div/button"));
		return element;
	}
	public static WebElement selectPaymentMode_alert(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_alert"));
		return element;
	}
	public static WebElement Clickto_Ok_Button(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"));
		return element;
	}
	public static WebElement Clickto_Ok_Button1(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='successfulUpload']/div/div/div[2]/form/div/button"));
		return element;
	}
	
	public static WebElement Click_toBrowse(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='kt_content']/div/kt-excercise-stock-payment2/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/div/label/div[2]"));
		return element;
	}
	
	public static WebElement Download_ButtonClick_ExerciseForm(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='nomination-modal']/div/div/div[3]/button"));
		return element;
	}
	public static WebElement ViewExercise_Form_Click(WebDriver driver) {

		element = driver.findElement(By.linkText("View Exercise Form"));
		return element;
	}

	public static WebElement Acknowledgement_IntiateExercise(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='ID_Acknowledgement_IntiateExercise']"));
		return element;
	}
	public static WebElement Contact_Number_DD1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
		return element;
	}

	public static WebElement Country_Name_DD1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement Nationality_DD1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
		return element;
	}

	public static WebElement Location_DD1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Location"));
		return element;
	}

	public static WebElement Residential_DD1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
		return element;
	}

	public static WebElement PANNumber_DD1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement Contact_NumberDirectDebit1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
		return element;
	}

	public static WebElement NationalityDirectDebit1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
		return element;
	}

	public static WebElement LocationDirectDebit1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Location"));
		return element;
	}

	public static WebElement Residential_DirectDebit1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
		return element;
	}

	public static WebElement PANNumber_DirectDebit1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement Contact_NumberRTGS1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
		return element;
	}

	public static WebElement NationalityRTGS1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
		return element;
	}

	public static WebElement LocationRTGS1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Location"));
		return element;
	}

	public static WebElement Residential_RTGS1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
		return element;
	}

	public static WebElement PANNumber_RTGS1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement ExercisedConfirmRTGS(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Confirm"));
		return element;
	}

	public static WebElement RTGS_Date2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"/html/body/kt-base/div/div/div/div/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[5]/div/input"));
		return element;
	}

	public static WebElement RTGS_Bank_Account_Number2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[4]/div/input"));
		return element;
	}

	public static WebElement RTGS_Bank_Branch2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/input"));
		return element;
	}

	public static WebElement RTGS_Bank_Name2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/input"));
		return element;
	}

	public static WebElement RTGS_Number2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[1]/div/input"));
		return element;
	}

	public static WebElement RTGS_Date1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_WireTransferDate"));
		return element;
	}

	public static WebElement RTGS_Bank_Account_Number1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[4]/div/input"));
		return element;
	}

	public static WebElement RTGS_Bank_Branch1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div/input"));
		return element;
	}

	public static WebElement RTGS_Bank_Name1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/input"));
		return element;
	}

	public static WebElement RTGS_Number1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/input"));
		return element;
	}

	public static WebElement DemandDraft_Number(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/input"));
		return element;
	}

	public static WebElement DDDate1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_DDDate"));
		return element;
	}

	public static WebElement BankName_DD1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div/input"));
		return element;
	}

	public static WebElement DemandDraft_Number2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[1]/div/input"));
		return element;
	}

	public static WebElement DDDate2(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_DDDatePre"));
		return element;
	}

	public static WebElement BankName_DD2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/input"));
		return element;
	}

	public static WebElement Wire_TransferUpdateDetails_Confirm(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Confirm"));
		return element;
	}

	public static WebElement Contact_NumberSellPartial1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
		return element;
	}

	public static WebElement Country_NameSellPartial1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement NationalitySellPartial1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
		return element;
	}

	public static WebElement LocationSellPartial1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Location"));
		return element;
	}

	public static WebElement Residential_StatusSellPartial1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
		return element;
	}

	public static WebElement PANNumber_SellPartial1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement Contact_NumberSellAll1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
		return element;
	}

	public static WebElement Country_NameSellAll1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement NationalitySellAll1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
		return element;
	}

	public static WebElement LocationSellAll1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Location"));
		return element;
	}

	public static WebElement Residential_StatusSellAll1(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
		return element;
	}

	public static WebElement PANNumber_SellAll1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement Check_box(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[2]/div/div/table/tbody[1]/tr/td/div/label/span"));
		return element;
	}

	public static WebElement Wire_TransferContact_Number(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
		return element;
	}

	public static WebElement Wire_TransferCountryName(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement Wire_TransferNationality(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
		return element;
	}

	public static WebElement Wire_TransferLocation(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Location"));
		return element;
	}

	public static WebElement ResidentialStatus(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_ResidentialStatus"));
		return element;
	}

	public static WebElement PAN_Number(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement Wire_Transfer_Date2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[6]/div/input"));
		return element;
	}

	public static WebElement Bank_Account_Number2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[5]/div/input"));
		return element;
	}

	public static WebElement Bank_Branch2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[4]/div/input"));
		return element;
	}

	public static WebElement BankName_TransferredFrom2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/input"));
		return element;
	}

	public static WebElement ABN_Routing2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/input"));
		return element;
	}

	public static WebElement Reference_ID2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[1]/div/input"));
		return element;
	}

	public static WebElement Wire_Transfer_Date(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_WireTransferDate"));
		return element;
	}

	public static WebElement Bank_Account_Number(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/input"));
		return element;
	}

	public static WebElement Bank_Branch(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[4]/div/input"));
		return element;
	}

	public static WebElement BankName_TransferredFrom(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div/input"));
		return element;
	}

	public static WebElement ABN_Routing(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/input"));
		return element;
	}

	public static WebElement Reference_ID(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/input"));
		return element;
	}

	public static WebElement ExerciseStockProceed_DirectDebit_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStockProceed_DirectDebit"));
		return element;
	}

	public static WebElement ExerciseStockProceed_DirectDebit_Button_Close(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='excercise-payment-direct-debit-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement ExerciseStockProceed_RTGS_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStockProceed_RTGS"));
		return element;
	}

	public static WebElement ExerciseStockProceed_RTGS_Button_Close(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='excercise-payment-rtgs-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement ExerciseStockProceed_DD_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStockProceed_DemandDraft"));
		return element;
	}

	public static WebElement ExerciseStockProceed_DD_Button_Close(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='excercise-payment-demand-draft-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement selectPaymentMode_DirectDebit(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_PaymentDirectDebit"));
		return element;
	}

	public static WebElement selectPaymentModeDirectDebit_popUpClose(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_DirectDebit1"));
		return element;
	}

	public static WebElement selectPaymentMode_RTGS(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_PaymentRTGS"));
		return element;
	}

	public static WebElement selectPaymentModeRTGS_popUpClose(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_RTGS1"));
		return element;
	}

	public static WebElement selectPaymentMode_DD(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_PaymentDemandDraft"));
		return element;
	}

	public static WebElement selectPaymentModeDD_popUpClose(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_DemandDraft1"));
		return element;
	}

	public static WebElement selectPaymentMode_alert_Ok(WebDriver driver) {

		element = driver
				.findElement(By.xpath("//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"));
		return element;
	}

	public static WebElement PayNow(WebDriver driver) {

		element = driver.findElement(By.id("IDdeclaration_PayNow"));
		return element;
	}

	public static WebElement makepayment(WebDriver driver) {

		element = driver.findElement(By.id("IDdeclaration_makepayment"));
		return element;
	}

	public static WebElement selectPaymentMode_SellPartial(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_SellPartial"));
		return element;
	}
	public static WebElement OK_PopUp(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='alert-exercise-success-modal']/div/div/div[2]/form/div/button"));
		return element;
	}
	
	public static WebElement selectPaymentModeSellPartial_popUpClose(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='sell-partial-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement selectPaymentMode_SellAll(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_ExpandIcon"));
		return element;
	}

	public static WebElement selectPaymentModeSellAll_popUpClose(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='sell-all-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement selectPaymentMode_WireTransfer(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_PaymentWireTransfer"));
		return element;
	}

	public static WebElement selectPaymentModeWireTransfer_popUpClose(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_WireTransfer1"));
		return element;
	}

	public static WebElement selectPaymentMode_Online(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-stock-payment1/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/p/label/i/img"));
		return element;
	}

	public static WebElement selectPaymentModeOnline_popUpClose(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='excercise-payment-online-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement ExerciseStockProceed_SellPartial_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStockProceed_SellPartialPayment"));
		return element;
	}

	public static WebElement ExerciseStockProceed_SellPartial_Button_Close(WebDriver driver) {

		element = driver.findElement(By.id("ID_Quantity_CloseButton"));
		return element;
	}

	public static WebElement ExerciseStockProceed_SellAll_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStockProceed_SellAll"));
		return element;
	}

	public static WebElement ExerciseStockProceed_SellAll_Button_Close(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='sell-all-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement ExerciseStockProceed_WireTransfer_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStockProceed_WireTransfer"));
		return element;
	}

	public static WebElement ExerciseStockProceed_WireTransfer_Button_Close(WebDriver driver) {

		element = driver
				.findElement(By.xpath("//*[@id='excercise-payment-wire-transfer-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement ExerciseStockProceed_Online_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStockProceed_ChangePaymentMode"));
		return element;
	}

	public static WebElement ExerciseStockProceed_Online_Button_Close(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='excercise-payment-online-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement Exerciese_Options(WebDriver driver) {

		element = driver.findElement(By.linkText("Exercise Options"));
		return element;
	}

	public static WebElement Location(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Location"));
		return element;
	}

	public static WebElement Initiate_exercise(WebDriver driver) {

		element = driver.findElement(By.id("ID_Acknowledgement_IntiateExercise"));
		return element;
	}

	public static WebElement ExercisedSubmitDownload(WebDriver driver) {

		element = driver.findElement(By.id("ID_DeclarationForm_ExercisedSubmitDownload"));
		return element;
	}

	public static WebElement Payment_checkboxRTGS(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[2]/div/div/table/tbody[1]/tr/td/div/label/span"));
		return element;
	}

	public static WebElement Payment_checkbox(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-stock-payment1-iii/div[2]/div/div[3]/div[2]/div/div/table/tbody[1]/tr/td/div/label/span"));
		return element;
	}

	public static WebElement UpdateDetails_ConfirmPopUp(WebDriver driver) {

		element = driver.findElement(By.id("Cancel"));
		return element;
	}

	public static WebElement Nationality(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[3]/div[2]/div/div[4]/div/input"));
		return element;
	}

	public static WebElement Country_Name(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[1]/div/input"));
		return element;
	}

	public static WebElement Contact_Number(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/div/input"));
		return element;
	}

	public static WebElement UpdateDetailscheckbox(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[3]/div[2]/div/div/table/tbody[1]/tr/td/div/label/span"));
		return element;
	}

	public static WebElement UpdateDetails_Confirm2(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_Confirm"));
		return element;
	}

	public static WebElement Cheque_Number(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/input"));
		return element;
	}

	public static WebElement Cheque_Number2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[1]/div/input"));
		return element;
	}

	public static WebElement ChequeDate(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_ChequeDate"));
		return element;
	}

	public static WebElement ChequeDate2(WebDriver driver) {

		element = driver.findElement(By.id("ID_UpdateDetails_ChequeDatePre"));
		return element;
	}

	public static WebElement Bank_Name(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div/input"));
		return element;
	}

	public static WebElement Bank_Name2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-payment-wire-transfer/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/input"));
		return element;
	}

	public static WebElement selectPaymentMode_SavePaymentMode(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_SavePaymentMode"));
		return element;
	}

	public static WebElement Quick_Notes(WebDriver driver) {

		element = driver.findElement(By.className("btn-link1"));
		return element;
	}

	public static WebElement selectPaymentMode_Cheque(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_PaymentCheque"));
		return element;
	}

	public static WebElement selectPaymentMode_popUpClose(WebDriver driver) {

		element = driver.findElement(By.id("selectPaymentMode_Cheque1"));
		return element;
	}

	public static WebElement QuantityOk_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_Quantity_buttonOk"));
		return element;
	}

	public static WebElement QuantityOk_Button1(WebDriver driver) {

		element = driver.findElement(By.id("ID_Quantity_Ok"));
		return element;
	}

	public static WebElement Quantity_MessageText(WebDriver driver) {

		element = driver.findElement(By.id("ID_Quantity_MessageText"));
		return element;
	}

	public static WebElement Quantity_Submit(WebDriver driver) {

		element = driver.findElement(By.id("ID_Quantity_Submit"));
		return element;
	}

	public static WebElement Exercise_ProceedToExercise(WebDriver driver) {

		element = driver.findElement(By.id("ID_Exercise_ProceedToExercise"));
		return element;
	}
	public static WebElement Exercise_ProceedToExercise2(WebDriver driver) {

		element = driver.findElement(By.xpath("//kt-excercise-stock-list/div[2]/div[4]/div[3]/div/div[1]/div[2]/div/button"));
		return element;
	}

	public static WebElement ExerciseStockProceed_Cheque_Button_Close(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='excercise-payment-cheque-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement ExerciseStockProceed_Cheque_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStockProceed_Cheque"));
		return element;
	}

	public static WebElement Confirm_Exercise_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_Quantity_ConfirmExercise"));
		return element;
	}

	public static WebElement ExerciseStockProceed_checkbox(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[2]/div/div/table/tbody[1]/tr/td/div/label/span"));
		return element;
	}

	public static WebElement ExerciseStockProceed_checkbox1(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise-view/div[2]/div/div[2]/div[3]/div/div/table/tbody[1]/tr/td/div/label/span"));
		return element;
	}

	public static WebElement Tax_Amount_Button_Close(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='total-amount-modal']/div/div/div[1]/button"));
		return element;
	}

	public static WebElement Tax_Amount_Button(WebDriver driver) {

		element = driver.findElement(By.linkText("Tax Amount"));
		return element;
	}

	public static WebElement StockOptions_QuickNotes(WebDriver driver) {

		element = driver.findElement(
				By.xpath("//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[1]/div[1]/h2/button"));
		return element;
	}

	public static WebElement ExerciseDetails_Btn(WebDriver driver) {

		element = driver.findElement(By.linkText("Exercise Details"));
		return element;
	}

	public static WebElement Sort_By(WebDriver driver) {

		element = driver.findElement(By.className("select-blue"));
		return element;
	}

	public static WebElement Exercise_All(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[3]/div/div[1]/div[1]/div[2]/ul/li/div/button[1]"));

//		element = driver.findElement(By.xpath("//button[contains(text(),'Exercise All')]"));
		return element;
	}
	
	public static WebElement Exercise_All2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[2]/div/div[1]/div[1]/div[2]/ul/li/div/button[1]"));

//		element = driver.findElement(By.xpath("//button[contains(text(),'Exercise All')]"));
		return element;
	}

	public static WebElement Reset_all(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[3]/div/div[1]/div[1]/div[2]/ul/li/div/button[2]"));

//		element = driver.findElement(By.xpath("//button[contains(text(),'Reset all')]"));
		return element;
	}
	public static WebElement Reset_all2(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[@id='kt_content']/div/kt-excercise-stock-proceed-exercise/div[2]/div/div[1]/div[1]/div[2]/ul/li/div/button[2]"));

//		element = driver.findElement(By.xpath("//button[contains(text(),'Reset all')]"));
		return element;
	}


	public static WebElement Quantity_Enter(WebDriver driver) {

		element = driver.findElement(By.xpath("//div/table/tbody/tr[2]/td[2]/div/input"));
		return element;
	}
	public static WebElement Quantity_Enter2(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[2]/div/input"));
		return element;
	}
	
	public static WebElement Calculate_Button(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStock_Continue"));
		return element;
	}

	public static WebElement ExerciseStock_ExercisableQuantity(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStock_ExercisableQuantity"));
		return element;
	}

	public static WebElement ExerciseStock_Ok(WebDriver driver) {

		element = driver.findElement(By.id("ID_ExerciseStock_Ok"));
		return element;
	}

	public static WebElement TPSLTransID(WebDriver driver) {

		element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTPSLTransID"));
		return element;
	}

	public static WebElement UpdateSuccess_button(WebDriver driver) {

		element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnUpdateTranscationSuccessStatus"));
		return element;
	}

	public static WebElement Payment_Status(WebDriver driver) {

		element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPaymentstatus"));
		return element;
	}

	public static WebElement Exercise_No(WebDriver driver) {

		element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtExerciseNo"));
		return element;
	}

}
