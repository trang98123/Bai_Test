package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.MyAccountUI;

public class MyAccountPageObject extends Basepage {
	private WebDriver driver;
	public MyAccountPageObject(WebDriver _driver)
	{
		driver=_driver;
	}
	public boolean isGenderMaleRadioSelected() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, MyAccountUI.GENDER_MAIL_RADIO);
		return isElementSelect(driver, MyAccountUI.GENDER_MAIL_RADIO);
	}

	public String getFirstNameTextboxValue() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, MyAccountUI.FIRSTNAME_TEXTBOX);
		return getElementAttribute(driver, MyAccountUI.FIRSTNAME_TEXTBOX, "value");
	}

	public String getLastNameTextboxValue() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, MyAccountUI.LASTNAME_TEXTBOX);
		
		return getElementAttribute(driver, MyAccountUI.LASTNAME_TEXTBOX, "value");
	}

	public String getEmailTextboxValue() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, MyAccountUI.EMAIL_TEXTBOX);
		return getElementAttribute(driver, MyAccountUI.EMAIL_TEXTBOX, "value");
	}

	public String getCompanyNameTextboxValue() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, MyAccountUI.COMPANY_TEXTBOX);
		return getElementAttribute(driver, MyAccountUI.COMPANY_TEXTBOX, "value");
	}

	public String getDateDropdownValue() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, MyAccountUI.DAY_DROPDOWN);
		return getSelectItemDropdown(driver,MyAccountUI.DAY_DROPDOWN);
	}

	public String getMonthDropdownValue() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, MyAccountUI.MONTH_DROPDOWN);
		return getSelectItemDropdown(driver,MyAccountUI.MONTH_DROPDOWN);
	}

	public String getYearDropdownValue() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, MyAccountUI.YEAR_DROPDOWN);
		return getSelectItemDropdown(driver,MyAccountUI.YEAR_DROPDOWN);
	}

}
