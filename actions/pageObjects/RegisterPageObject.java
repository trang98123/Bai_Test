package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends Basepage{
	private WebDriver driver;
	public RegisterPageObject(WebDriver _driver)
	{
		driver=_driver;
	}
	public void clickToGenderMaleRadio() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.GENDER_MAIL_RADIO);
		clickToElement(driver, RegisterPageUI.GENDER_MAIL_RADIO);
	}

	public void enterToFirstNameTextBox(String firstname) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstname);
	}

	public void enterToLastNameTextBox(String lastname) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastname);
	}

	public void selectDateDropdown(String day) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.DAY_DROPDOWN);
		selectDropdownByText(driver,  RegisterPageUI.DAY_DROPDOWN, day);
	}

	public void selectMonthDropdown(String month) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.MONTH_DROPDOWN);
		selectDropdownByText(driver, RegisterPageUI.MONTH_DROPDOWN, month);
	}

	public void selectYearDropdown(String year) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.YEAR_DROPDOWN);
		selectDropdownByText(driver, RegisterPageUI.YEAR_DROPDOWN, year);
	}

	public void enterToEmailTextBox(String email) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
	}

	public void enterToCompanyTextBox(String company) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.COMPANY_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.COMPANY_TEXTBOX, company);
	}

	public void enterToPassworkTextBox(String password) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
	}

	public void enterToConfirmPassworkTextBox(String confirmpassword) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmpassword);
	}

	public void clickToRegisterButton() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

//	public boolean isRegisterSuccessMessageDisplay() {
//		// TODO Auto-generated method stub
////		waitForElementVisible(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
////		return isElementDisplayed(driver,  RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
//	}

	public void clickToLogoutLink() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.LOGOUT_LINK);
		clickToElement(driver, RegisterPageUI.LOGOUT_LINK);
	}

}
