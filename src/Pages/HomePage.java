package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.SeleniumUtils;

public class HomePage {
@FindBy(id="logoutLink")
public WebElement logoutLink;

@FindBy(xpath="//div[text()='Time-Track']")
public WebElement timeTrackTab;
@FindBy(xpath="//div[text()='Tasks']")
public WebElement tasksTab;
@FindBy(xpath="//div[text()='Reports']")
public WebElement reportsTab;
@FindBy(xpath="//div[text()='Users']")
public WebElement usersTab;
public void logoutFromApp()
{
	SeleniumUtils.waitforPageToLoad(10);
	SeleniumUtils.performClick(logoutLink);
}
public void navigateToReports()
{
	SeleniumUtils.performClick(reportsTab);
}
public void naviagteToTasks()
{
	SeleniumUtils.performClick(tasksTab);
}
public void navigateToTimeTrack()
{
	SeleniumUtils.performClick(timeTrackTab);
}
public void navigateToUsers()
{
	SeleniumUtils.performClick(usersTab);
}
}




