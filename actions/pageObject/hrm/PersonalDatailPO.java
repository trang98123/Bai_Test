package pageObject.hrm;

import org.openqa.selenium.WebDriver;

import commons.Basepage;
import pageUIs.hrm.PersonalDetailUI;

public class PersonalDatailPO extends Basepage {
    WebDriver driver;

public PersonalDatailPO(WebDriver driver) {
	this.driver = driver;
}

public void clickToChangPhotoImage() {
	// TODO Auto-generated method stub
	waitForElementClickable(driver, PersonalDetailUI.AVATA_IMAGE);
	clickToElement(driver, PersonalDetailUI.AVATA_IMAGE);
}

public boolean isUploadAvataSuccessMessageDisplayed() {
	// TODO Auto-generated method stub
	waitForElementVisible(driver, PersonalDetailUI.UPLOAD_AVATA_SUCCESS_MESSAGE);
	return isElmentDisplayed(driver, PersonalDetailUI.UPLOAD_AVATA_SUCCESS_MESSAGE);
}

public boolean isNewAvataImageDisplayed() {
	// TODO Auto-generated method stub
	waitForElementVisible(driver, PersonalDetailUI.AVATA_IMAGE);
	int imageWidth=Integer.parseInt(getElementAttribute(driver, PersonalDetailUI.AVATA_IMAGE, "width"));
	int imageHeight=Integer.parseInt(getElementAttribute(driver, PersonalDetailUI.AVATA_IMAGE, "height"));
	return (imageWidth!=200)||(imageHeight!=200);
}
}
