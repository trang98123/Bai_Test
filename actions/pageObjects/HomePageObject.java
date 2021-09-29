package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.HomePageUI;

public class HomePageObject extends Basepage{
    private WebDriver driver;
    public HomePageObject( WebDriver _driver)
    {
    	this.driver= _driver;			
    }
	public void clickToRegisterLink()  {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
	}

	public void clickToLoginLink() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
	}

	public void clickToMyAcountLink() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

}
