package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.user.nopCommerce.RegisterPageUI;

public class RegisterPageObject extends Basepage{
	private WebDriver driver;
   public RegisterPageObject(WebDriver driver)
   {
	   this.driver=driver;
		System.out.println("driver at RegisterPageObject= "+ driver.toString());
   }
	public void clickToGenderMaleRadioButton() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.GENDER_MALE_RADIO);
		clickToElement(driver, RegisterPageUI.GENDER_MALE_RADIO);
	}

	public void enterToFirstnameTextbox(String firstName) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
	}

	public void enterToLastnameTextbox(String lastName) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastName);
	}

	public void enterToEmailTextbox(String Email) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, Email);
	}

	public void enterToPasswordTextbox(String password) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTOX);
		senkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTOX, password);
	}

	public void enterToConfirmPasswordTextbox(String confirmPassword) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.CONFIRM_TEXTBOX, confirmPassword);
	}

	public void clickToRegisterButton() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public boolean isSuccessMessageDisplay() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.SUCCESS_MESSAGE);
		return	isElmentDisplayed(driver, RegisterPageUI.SUCCESS_MESSAGE);
	}

	public HomePageObject clickToLogoutLink() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.LOGOUT_LINK);
		clickToElement(driver, RegisterPageUI.LOGOUT_LINK);
		if(driver.toString().contains("chrome")|| driver.toString().contains("edge"))
{
	sleepInSecond(3);
}
	
		return PageGeneratorManager.getHomePage(driver);
	}




}
