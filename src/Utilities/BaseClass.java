package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Pages.HomePage;
import Pages.LoginPage;
public class BaseClass {
public static WebDriver driver;
@Parameters("browser")
@BeforeClass
public void beforeConfig(String browser)
{
	if(browser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", 
				"path of gecko driver");
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.ie.driver", 
				"path of ie driver");
		driver=new InternetExplorerDriver();
	}
	else if(browser.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webdriver.edge.driver", 
				"path of edge driver");
		driver=new EdgeDriver();
	}
	Reporter.log("Browser Launched");
	driver.get(Constants.URL);
	Reporter.log("Passed the URL");
	SeleniumUtils.waitforPageToLoad(30);
}
@AfterClass
public void tearDown()
{
	driver.manage().deleteAllCookies();
	Reporter.log("Deleted all cookies");
	driver.quit();
	Reporter.log("Browser closed");
}
@BeforeMethod
public void login()
{
LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
lp.loginToApp();
Reporter.log("Login operation is success");
}
@AfterMethod
public void logout()
{
	HomePage hp=PageFactory.initElements(driver, HomePage.class);
	hp.logoutFromApp();
	Reporter.log("Logout operation is success");
}
}












