package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.user.nopCommerce.HomePageUI;

public class HomePageObject extends Basepage{
private WebDriver driver;
public HomePageObject(WebDriver driver)
{
	// khi new 1 class nên thì nó sẽ nhảy vào hàm khởi tạo đầu tiên
	//cùng tên vs class
	//ko có kiể trả v�?
	// 1 class có thể có nhi�?u hàm khởi tạo>> tính chất đa hình
	this.driver= driver;
	System.out.println("driver at HomePageObject= "+ driver.toString());
}
	public boolean isHomePageSlideDisplay() {
		waitForElementVisible(driver, HomePageUI.HOMEPAGE_SLIDER);
		return	isElmentDisplayed(driver, HomePageUI.HOMEPAGE_SLIDER);
	}

	public RegisterPageObject clickToRegisterLink() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getRegister(driver);
	}

	public LoginPageObject clickToLoginLink() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		if(driver.toString().contains("chrome")|| driver.toString().contains("edge"))
{
	sleepInSecond(3);
}
	
		return PageGeneratorManager.getLoginpage(driver);
	}

}
