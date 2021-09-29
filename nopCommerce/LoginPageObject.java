package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.user.nopCommerce.LoginPageUI;

public class LoginPageObject extends Basepage{
	private WebDriver driver;
	public LoginPageObject(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("driver at LoginPageObject= "+ driver.toString());
	}
	public void enterToEmailTextbox(String email) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
	}

	public void enterTopasswordTextbox(String password) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public HomePageObject clickToLoginButton() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	return PageGeneratorManager.getHomePage(driver);
	}
	public HomePageObject openHomePage() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, LoginPageUI.HOMEPAGE_IMG);
		clickToElement(driver, LoginPageUI.HOMEPAGE_IMG);
		return PageGeneratorManager.getHomePage(driver);
	}

}
