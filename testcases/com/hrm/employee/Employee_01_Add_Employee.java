package com.hrm.employee;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObject.hrm.AddEmployeePO;
import pageObject.hrm.DashboadPO;
import pageObject.hrm.EmployeeListPO;
import pageObject.hrm.LoginPO;
import pageObject.hrm.PageGeneratorManager;
import pageObject.hrm.PersonalDatailPO;

public class Employee_01_Add_Employee extends BaseTest {
	WebDriver driver;
	String adminUserName, adminPassword, empFirstName, empLastName, empUserName, empPassword,empFullName;
	String employeeID, statusValue;
String avatarFilePath=GlobalConstants.UPLOAD_FOLDER_PATH + "pyramid.jpg";
	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		log.info("Pre-Condition - Step 01: Open browser" + browserName + "and navigate to" + appUrl);
		driver = getBrowerDriver(browserName, appUrl);
		driver.manage().window().maximize();
		loginPage = PageGeneratorManager.getLoginPage(driver);
		statusValue = "Enabled";
		adminUserName = "Admin";
		adminPassword = "admin123";
		empFirstName = "Automation";
		empLastName = "FC";
		empFullName=empFirstName+" "+empLastName;
		empUserName = "automationfc";
		empPassword = "automation123";
		
		log.info("Pre-Condition - step 02: Login With Admin role");
		dashboadPage =loginPage.loginToSystem(driver, adminUserName, adminPassword);
	}

	@Test
	public void Employee_01_Add_New_Employee() {
		log.info("Add_New_01 - Step 01: Open 'Employee List' page");
		dashboadPage.openSubMenuPage(driver, "PIM", "Employee List");
		employeeListPage = PageGeneratorManager.getEmployeeListPage(driver);
		log.info("Add_New_01 - Step 02: Click to 'Add' button");
		employeeListPage.clickToButtonByID(driver, "btnAdd");
		addEmployeePage = PageGeneratorManager.getEmployeePage(driver);
		log.info("Add_New_01 - Step 03: Enter valid info to 'First Name' textbox");
		addEmployeePage.enterToTextboxByID(driver, "firstName", empFirstName);
		log.info("Add_New_01 - Step 04: Enter valid info to 'Last Name' textbox");
		addEmployeePage.enterToTextboxByID(driver, "lastName", empLastName);
		log.info("Add_New_01 - Step 05: Get value of 'Employee ID");
		employeeID = addEmployeePage.getTextboxValueByID(driver, "employeeId");
		log.info("Add_New_01 - Step 06: Click to 'Created Login Detail' checkbox");
		addEmployeePage.checkToCheckboxByLable(driver, "Create Login Details");
		log.info("Add_New_01 - Step 07: Enter valid infor to 'User Name' textbox");
		addEmployeePage.enterToTextboxByID(driver, "user_name", empUserName);
		log.info("Add_New_01 - Step 08: Enter valid infor to 'Password' textbox");
		addEmployeePage.enterToTextboxByID(driver, "user_password",empPassword);
		log.info("Add_New_01 - Step 09: Enter valid infor to 'Confirm Password' textbox");
		addEmployeePage.enterToTextboxByID(driver, "re_password", empPassword);
		log.info("Add_New_01 - Step 10: Select" + statusValue + " value in 'Status' dropdown");
		addEmployeePage.selectItemInDropdowmnByID(driver, "status", statusValue);
		log.info("Add_New_01 - Step 11: Click to 'Save' button");
		addEmployeePage.clickToButtonByID(driver, "btnSave");
		personalDatailPage = PageGeneratorManager.getPesonalDetailPage(driver);
		log.info("Add_New_01 - Step 12: Open 'Enployee List' page");
		personalDatailPage.openSubMenuPage(driver, "PIM", "Employee List");
		employeeListPage = PageGeneratorManager.getEmployeeListPage(driver);
		log.info("Add_New_01 - Step 13: Enter valid infor to 'Employee Name' textbox");
		 employeeListPage.sleepInSecond(5);
	  //  employeeListPage.jQueryAJAXLoadedSuccess(driver);
		employeeListPage.enterToTextboxByID(driver, "empsearch_employee_name_empName",empFullName);
		 employeeListPage.sleepInSecond(5);
		//employeeListPage.jQueryAJAXLoadedSuccess(driver);
		log.info("Add_New_01 - Step 14: Click 'Search' button");
		employeeListPage.clickToButtonByID(driver, "searchBtn");
		 employeeListPage.sleepInSecond(5);
		// employeeListPage.jQueryAJAXLoadedSuccess(driver);
		log.info("Add_New_01 - Step 15: Verify Employee Infomation displayed at 'Result Table'");
		verifyEquals(employeeListPage.getValueInTableIDAtColumnNameAndRowNumber(driver, "resultTable", "Id", "1"),
				employeeID);
		verifyEquals(employeeListPage.getValueInTableIDAtColumnNameAndRowNumber(driver, "resultTable",
				"First (& Middle) Name", "1"), empFirstName);
		verifyEquals(
				employeeListPage.getValueInTableIDAtColumnNameAndRowNumber(driver, "resultTable", "Last Name", "1"),
				empLastName);
	}

	@Test
	public void Employee_02_Upload_Avata() {
		log.info("Employee_02_Upload_Avata - Step 01: Login with employee role");
		loginPage = employeeListPage.logoutToSystem(driver);
		dashboadPage= loginPage.loginToSystem(driver, empUserName, empPassword);
		log.info("Employee_02_Upload_Avata - Step 02: Open Personal Detail Page");
		dashboadPage.openMenuPage(driver, "My Info");
		personalDatailPage= PageGeneratorManager.getPesonalDetailPage(driver);
		log.info("Employee_02_Upload_Avata - Step 03: Click To Change Photo Image");
		personalDatailPage.clickToChangPhotoImage();
		log.info("Employee_02_Upload_Avata - Step 04: Upload new Avata Image");
		personalDatailPage.uploadImage(driver,avatarFilePath);
		log.info("Employee_02_Upload_Avata - Step 05: Click To Upload button");
		personalDatailPage.clickToButtonByID(driver, "btnSave");
		log.info("Employee_02_Upload_Avata - Step 06: Verify Success message is displayed");
		verifyTrue(personalDatailPage.isUploadAvataSuccessMessageDisplayed());
		log.info("Employee_02_Upload_Avata - Step 07: Verify new Avatar image is displayed");
		verifyTrue(personalDatailPage.isNewAvataImageDisplayed());
	}

	@Test
	public void Employee_03_Personal_Details() {

	}

	@Test
	public void Employee_04_Contact_Details() {

	}

	@Test
	public void Employee_05_Emergency_Detail() {

	}

	@Test
	public void Employee_06_Assigned_Dependents() {

	}

	@Test
	public void Employee_07_Edit_View_Job() {

	}

	@Test
	public void Employee_08_Edit_View_Salary() {

	}

	@Test
	public void Employee_9_Edit_View_Tax() {

	}

	@Test
	public void Employee_10_Qualifications() {

	}

	@Test
	public void Employee_11_Search_Employee() {

	}

	@Parameters({ "browser" })
	@AfterClass(alwaysRun = true)
	public void cleanBrowser(String browserName) {
		log.info("Post-Condition: Close browser" + browserName);
		// cleanDriverInstance();
	}

	LoginPO loginPage;
	AddEmployeePO addEmployeePage;
	DashboadPO dashboadPage;
	EmployeeListPO employeeListPage;
	PersonalDatailPO personalDatailPage;
}
