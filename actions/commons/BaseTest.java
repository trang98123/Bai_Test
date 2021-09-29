package commons;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
//private	String projectPath = System.getProperty("user.dir");
//private String osName= System.getProperty("os.name");
	private enum BROWSER {
		CHROME, FIREFOX, IE, SAFARI, EDGE_LEGACY, EDGE_CHROMEIUM, CHEADLESS, FHEADLESS, H_CHROME, H_FIREFOX;
	}

//private enum OS
//{
//	WINDOWS, MAC_OSX, LINUS;
//}
//private enum PLATFRORM
//{
//	WINDOW_PHONE, IOS, ANDROID;
//}
	private WebDriver driver;
	protected final Log log;

//Constructor
	protected BaseTest() {
		log = LogFactory.getLog(getClass());
	}

	protected WebDriver getBrowerDriver(String browserName) {
		BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());
		if (browser == BROWSER.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			// check browser version hiện tại là bao nhiêu
			// tải về
			// Init browser lên đúng đc
			driver = new FirefoxDriver();
			System.out.println("Driver init at base Test = " + driver.toString());
		} else if (browser == BROWSER.CHROME) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser == BROWSER.EDGE_CHROMEIUM) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Please enter correct browser name!");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(GlobalConstants.DEV_APP_URL);
		return driver;
	}

	protected WebDriver getBrowerDriver(String browserName, String appUrl) {
		BROWSER browser = BROWSER.valueOf(browserName.toUpperCase());
		if (browser == BROWSER.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			// check browser version hiện tại là bao nhiêu
			// tải về
			// Init browser lên đúng đc
			driver = new FirefoxDriver();
			System.out.println("Driver init at base Test = " + driver.toString());
		} else if (browser == BROWSER.CHROME) {
			WebDriverManager.chromedriver().driverVersion("91.0.4472.101").setup();
			driver = new ChromeDriver();
		} else if (browser == BROWSER.EDGE_CHROMEIUM) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Please enter correct browser name!");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(appUrl);
		return driver;
	}

	protected String getSlash(String folderName) {
		String separtor = File.separator;
		return separtor + folderName + separtor;
	}

	public WebDriver getWebDriver() {
		return this.driver;
	}

	private boolean checkTrue(boolean condition) {
		boolean pass = true;
		try {
			if (condition == true) {
				log.info(" -------------------------- PASSED -------------------------- ");
			} else {
				log.info(" -------------------------- FAILED -------------------------- ");
			}
			Assert.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;

			// Add lỗi vào ReportNG
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyTrue(boolean condition) {
		return checkTrue(condition);
	}

	private boolean checkFailed(boolean condition) {
		boolean pass = true;
		try {
			if (condition == false) {
				log.info(" -------------------------- PASSED -------------------------- ");
			} else {
				log.info(" -------------------------- FAILED -------------------------- ");
			}
			Assert.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyFalse(boolean condition) {
		return checkFailed(condition);
	}

	private boolean checkEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			log.info(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			pass = false;
			log.info(" -------------------------- FAILED -------------------------- ");
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		return checkEquals(actual, expected);
	}

	@BeforeTest
	public void deleteAllFilesInreportNGScreenshot() {
		log.info("--------------START delete file in folder -----------");

		try {
			String workingDir = System.getProperty("user.dir");
			String pathFolderDownload = workingDir + "/screenshotreportNG";
			File file = new File(pathFolderDownload);
			File[] listOfFiles = file.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					new File(listOfFiles[i].toString()).delete();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		log.info("--------------END delete file in folder -----------");

	}

	protected void cleanDriverInstance() {// browser
		String cmd = "";
		try {

			// Executable driver
			// Get ra tên của OS và convert qua chữ thường
			String osName = System.getProperty("os.name").toLowerCase();
			log.info("OS name = " + osName);
			// Khai báo 1 biến command line để thực thi

			// Quit driver executable file in Task Manager
			if (driver.toString().contains("chrome")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
				} else {
					cmd = "pkill chromedriver";
				}
			} else if (driver.toString().contains("internetexplorer")) {
				if (osName.contains("window")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
				}
			} else if (driver.toString().contains("firefox")) {

				if (osName.contains("windows")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
				} else {
					cmd = "pkill geckodriver";

				}
			}

			else if (driver.toString().contains("edge")) {

				if (osName.contains("windows")) {
					cmd = "taskkill /F /FI \"IMAGENAME eq msedgedriver*\"";
				} else {
					cmd = "pkill msedgedriver";
				}
			}

			System.out.println("Driver instance= " + driver.toString());

			if (driver != null) {
				// IE browser
				driver.manage().deleteAllCookies();
				driver.quit();
				System.out.println("Close driver instance");
			}

		} catch (Exception e) {
			log.info(e.getMessage());
		} finally {

			try {
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
				System.out.println("Run command line");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@AfterSuite(alwaysRun = true)
	protected void clearnExcutableDriver() {

	}

}
