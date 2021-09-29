package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.user.nopCommerce.MyAccountPageUI;

public class MyAccountPageObject extends Basepage{
WebDriver driver;
public MyAccountPageObject(WebDriver driver)
{
	this.driver= driver;
}


}
