package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Constants;
import Utilities.SeleniumUtils;

public class LoginPage {
@FindBy(id="username")
public WebElement userNameTxtBox;
@FindBy(name="pwd")
public WebElement pwdTxtBox;
@FindBy(id="loginButton")
public WebElement loginBtn;

public void loginToApp()
{
	SeleniumUtils.enterValue(userNameTxtBox, Constants.USERNAME);
	SeleniumUtils.enterValue(pwdTxtBox, Constants.PASSWORD);
	SeleniumUtils.performClick(loginBtn);
}




}
