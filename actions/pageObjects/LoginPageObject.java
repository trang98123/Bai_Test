package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends Basepage{
	private WebDriver driver;
	public LoginPageObject(WebDriver _driver)
	{
		this.driver=_driver;
	}

	public void enterToEmailTextbox(String email) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
	}

	public void enterTopasswordtextbox(String password) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public void clickToLoginButton() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}

}
