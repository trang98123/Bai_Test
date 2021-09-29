package pageObjects.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.user.nopCommerce.SearchPageUI;

public class SearchPageObject extends Basepage {
WebDriver driver;
public SearchPageObject(WebDriver driver)
{
	this.driver=driver;
}

}
