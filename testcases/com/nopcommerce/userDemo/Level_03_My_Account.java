//package com.nopcommerce.userDemo;
//
//import java.util.Random;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import com.nopcommerce.data.Admin;
//
//import commons.BaseTest;
//import pageObjects.user.nopcommerceDemo.HomePO;
//import pageObjects.user.nopcommerceDemo.LoginPO;
//import pageObjects.user.nopcommerceDemo.LogoutPO;
//import pageObjects.user.nopcommerceDemo.MyAccountPO;
//import pageObjects.user.nopcommerceDemo.PageGeneratorManager;
//import pageObjects.user.nopcommerceDemo.RegisterPO;
//import utilities.DataUitil;
//
//public class Level_03_My_Account extends BaseTest {
//	WebDriver driver;
//	Select select;
//	String COMPANY_NAME, emailAddress;
//
//	@Parameters({ "browser", "url" })
//	@BeforeClass
//	public void beforClass(String browserName, String appUrl) {
//		log.info("Pre-condition: Open Browser" + browserName + "and navigate to" + appUrl);
//		driver = getBrowerDriver(browserName, appUrl);
//		emailAddress = getRamdomEmail();
//		//emailAddress=faker.randomEmail();
//		homePage = PageGeneratorManager.getHomePage(driver);
//		log.info("Pre-condition: Click to register link");
//		registerPage = homePage.clickToRegiterLink(driver, "Register");
//		// fakerAdmin= Admin.getAdmin();
//		faker = DataUitil.getData();
//		// register
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 01: Click To Gender Male Radio Button");
//		registerPage.clickToGenderMaleRadioButton("gender-male");
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 02: Enter To First Name Textbox");
//		registerPage.enterToTextboxByID("FirstName", faker.getfirstName());
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 03: Enter To Last Name Textbox");
//		registerPage.enterToTextboxByID("LastName", faker.getLastName());
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 04: Enter To Company Textbox");
//		registerPage.enterToTextboxByID("Company", Admin.PersonalDetal.COMPANY_NAME);
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 05: Enter To Email Textbox");
//		registerPage.enterToTextboxByID("Email",emailAddress);
//		System.out.println("1: "+ faker.randomEmail());
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 05: Enter To Pasword Textbox");
//		registerPage.enterToTextboxByID("Password", Admin.PersonalDetal.PASSWORD);
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 06: Enter To Confirm Password Textbox");
//		registerPage.enterToTextboxByID("ConfirmPassword", Admin.PersonalDetal.PASSWORD);
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 07: Select item in date dropdown");
//		registerPage.selectDropdownByName("DateOfBirthDay", Admin.PersonalDetal.DAY);
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 08: Select item in month dropdown");
//		registerPage.selectDropdownByName("DateOfBirthMonth", Admin.PersonalDetal.MONTH);
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 09: Select item in year dropdown");
//		registerPage.selectDropdownByName("DateOfBirthYear", Admin.PersonalDetal.YEARS);
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		registerPage.clickToRegisterButton();
//		log.info("TC_01_Sigin_Thong_Tin_Hop_Le - Step 11: Verify created account susscessfully");
//		verifyTrue(registerPage.isDisplayRegisterMessage("Your registration completed"));
//		
//		homePage= registerPage.clickToLogoutLink();
//		loginPage=	homePage.clickToLoginLink(driver,"Log in");
//		
//		//loginPage= PageGeneratorManager.getLogin(driver);
//		// login
//		log.info("TC_06_Login_Email_Da_Dang_Ki_Passwork_Dung - Step 01: Enter To Email Textbox");
//		loginPage.enterToEmailTextbox(emailAddress);
//		System.out.println(faker.randomEmail());
//		log.info("TC_06_Login_Email_Da_Dang_Ki_Passwork_Dung - Step 01: Enter To Password Textbox");
//		loginPage.enterToPasswordTextbox(Admin.PersonalDetal.PASSWORD);
//		log.info("TC_06_Login_Email_Da_Dang_Ki_Passwork_Dung - Step 01: Click To Login Button");
//		//loginPage.clickToLoginButon();
//		homePage= loginPage.clickToLoginButon();
//		myAccount= homePage.clickToMyAccountLink(driver,"My account");
//		
//	}
//	
//
//	@Test
//	public void TC_01_Sigin_Thong_Tin_Hop_Le() {
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 12: Click To My Account Link"));
//		// myAccount = registerPage.clickToLinkmyAccount();
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 13: Update To Gender Female Radio Button"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 14: Update To First Name Textbox"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 15: Update To Last Name Textbox"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 16: Update To Email Name Textbox"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 17: Update to day"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 18: Update to month"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 19: Update to year"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 20: Click To REGISTER button"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 21: Update To Company Name Textbox"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 22: Click To SAVE button"));
//
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//		log.info(("TC_01_Sigin_Thong_Tin_Hop_Le - Step 10: Click To REGISTER button"));
//	}
//
//	@AfterClass
//	public void afterClass() {
//		log.info("Post-condition: Close browser");
//		
//	}
//	public String getRamdomEmail() {
//		Random rand = new Random();
//		return "kooll" + rand.nextInt(9999) + "@live.com";
//	}
//	DataUitil faker;
//	HomePO homePage;
//	LoginPO loginPage;
//	RegisterPO registerPage;
//	Admin fakerAdmin;
//	MyAccountPO myAccount;
//	LogoutPO logoutPage;
//}
