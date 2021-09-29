package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.user.nopCommerce.OrderPageUI;

public class OrderPageObject extends Basepage {
WebDriver driver;
public OrderPageObject(WebDriver driver)
{
	this.driver=driver;
}

}
