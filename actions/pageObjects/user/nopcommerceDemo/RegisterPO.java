package pageObjects.user.nopcommerceDemo;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.user.nopCommerceDemo.RegisterPageUI;

public class RegisterPO extends Basepage {

	WebDriver driver;
	public RegisterPO(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public boolean isDisplayErrorMessage(String errorMessageID, String errorMessageValue) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.DYNAMIC_ERRO_MESSAGE_BY_ID,errorMessageID,errorMessageValue);
		return isElmentDisplayed(driver,RegisterPageUI.DYNAMIC_ERRO_MESSAGE_BY_ID,errorMessageID,errorMessageValue);
	}
	public void clickToRegisterButton() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.RIGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.RIGISTER_BUTTON);
	}


	public void clickToGenderMaleRadioButton(String radioButtonID) {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.DYNAMIC_GENDER_BY_ID,radioButtonID);
		checkToCheckboxOrRadio(driver,  RegisterPageUI.DYNAMIC_GENDER_BY_ID,radioButtonID);
	}


	public void enterToTextboxByID(String textboxByID, String valueTextbox) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.DYNAMIC_LABLE_TEXTBOX_BY_ID,textboxByID);
		senkeyToElement(driver, RegisterPageUI.DYNAMIC_LABLE_TEXTBOX_BY_ID,valueTextbox,textboxByID);
	}


	public void selectDropdownByName(String dropdownByName, String itemText) {
		// TODO Auto-generated method stub
		selectDropdownByText(driver, RegisterPageUI.DYNAMIC_DAYOFBIRTH_BY_NAME, itemText, dropdownByName);
	}


	public boolean isDisplayErrorMessageSpecified(String errorMessageText, String errorMessageValue) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.DYNAMIC_ERRO_MESSAGE_BY_TEXT,errorMessageText,errorMessageValue);
		return isElmentDisplayed(driver,  RegisterPageUI.DYNAMIC_ERRO_MESSAGE_BY_TEXT,errorMessageText,errorMessageValue);
	}


	public boolean isDisplayRegisterMessage(String registerMessage) {
		// TODO Auto-generated method stub
		
		return isElmentDisplayed(driver, RegisterPageUI.RIGISTER_MESSAGE,registerMessage);
	}


	public HomePO clickToLogoutLink() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.LOG_OUT);
		clickToElement(driver, RegisterPageUI.LOG_OUT);
		return PageGeneratorManager.getHomePage(driver);
	}
	
	
}
