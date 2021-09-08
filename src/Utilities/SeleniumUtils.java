package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
public static void performClick(WebElement element)
{
	if(element.isDisplayed()&&element.isEnabled())
	{
		element.click();
	}
}
public static void enterValue(WebElement element,String  value)
{
	if(element.isDisplayed()&&element.isEnabled())
	{
		element.sendKeys(value);
	}
}
public static void waitforPageToLoad(int time)
{
	BaseClass.driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
}
public static void waitForElementVisiblity(long timeout,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(BaseClass.driver,timeout);
	wait.until(ExpectedConditions.visibilityOf(element));
}
public static void mouseHover(WebElement element)
{
	Actions act=new Actions(BaseClass.driver);
	act.moveToElement(element).perform();
}
public static void selectOptionByIndex(WebElement element,int index)
{
	Select s=new Select(null);
	s.selectByIndex(index);
}
public static String getVisibleText(WebElement element)
{
	String text = null;
	if(element.isDisplayed())
	{
	text=element.getText();
	}
	return text;
}
public static void waitForElementVisiblityAndClick(long timeout,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(BaseClass.driver,timeout);
	wait.until(ExpectedConditions.visibilityOf(element)).click();
}
public static void selectOptionByValue(WebElement element,String value)
{
	Select s=new Select(element);
	s.selectByValue(value);
}
public static void selectOptionByVisibleText(WebElement element,String text)
{
	Select s=new Select(element);
	s.selectByVisibleText(text);
}
public static void acceptAlert()
{
	Alert alt=BaseClass.driver.switchTo().alert();
	alt.accept();
}
public static void dismissAlert()
{
	Alert alt=BaseClass.driver.switchTo().alert();
	alt.dismiss();
}
public static String getAlertMsg()
{
	Alert alt=BaseClass.driver.switchTo().alert();
	String text=alt.getText();
	return text;
}
public static void switchFrameByIndex(int index)
{
	BaseClass.driver.switchTo().frame(index);
}
public static void switchFrameByName(String name)
{
	BaseClass.driver.switchTo().frame(name);
}
public static void switchFrameByWebElement(WebElement wb)
{
	BaseClass.driver.switchTo().frame(wb);
}
public static void switchToDefault()
{
	BaseClass.driver.switchTo().defaultContent();
}
public static void pressEnter()
{
	Actions act=new Actions(BaseClass.driver);
	act.sendKeys(Keys.ENTER).perform();
}
public static void pressTab()
{
	Actions act=new Actions(BaseClass.driver);
	act.sendKeys(Keys.TAB).perform();
}
public static void NavigateBack()
{
	BaseClass.driver.navigate().back();
}








}
