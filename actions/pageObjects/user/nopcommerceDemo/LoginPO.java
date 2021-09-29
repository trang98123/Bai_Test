package pageObjects.user.nopcommerceDemo;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.user.nopCommerceDemo.LoginpageUI;

public class LoginPO extends Basepage{

	WebDriver driver;
	public LoginPO(WebDriver driver)
	{
		this.driver=driver;
	}
	public HomePO clickToLoginButon() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, LoginpageUI.LOGIN);
		clickToElement(driver,LoginpageUI.LOGIN);
		return PageGeneratorManager.getHomePage(driver);
	}
	public void enterToEmailTextbox(String email) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginpageUI.EMAIL);
		senkeyToElement(driver, LoginpageUI.EMAIL, email);
	}
	public boolean isDisplayErrorMessage(String messageValue) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginpageUI.ERROR_MESSAGE_EMPTY,messageValue);
		//	getElementText(driver, LoginpageUI.DYNAMIC_ERROR_MESSAGE_BY_TEXT,byText);
	return	isElmentDisplayed(driver,LoginpageUI.ERROR_MESSAGE_EMPTY,messageValue);
		
	}
	public void enterToPasswordTextbox(String passWord) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginpageUI.PASSWORD);
		senkeyToElement(driver, LoginpageUI.PASSWORD, passWord);
	}
	public boolean isDisplayErrorMessageInvalid1(String messageValue) {
		// TODO Auto-generated method stub
				waitForElementVisible(driver, LoginpageUI.ERROR_MESSAGE_INVALID_1,messageValue);
				//	getElementText(driver, LoginpageUI.DYNAMIC_ERROR_MESSAGE_BY_TEXT,byText);
			return	isElmentDisplayed(driver,LoginpageUI.ERROR_MESSAGE_INVALID_1,messageValue);
	}
	public boolean isDisplayErrorMessageInvalid2(String messageValue) {
		// TODO Auto-generated method stub
				waitForElementVisible(driver, LoginpageUI.ERROR_MESSAGE_INVALID_2,messageValue);
				//	getElementText(driver, LoginpageUI.DYNAMIC_ERROR_MESSAGE_BY_TEXT,byText);
			return	isElmentDisplayed(driver,LoginpageUI.ERROR_MESSAGE_INVALID_2,messageValue);
	}


}
