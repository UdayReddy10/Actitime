package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.SeleniumUtils;

public class TasksPage {
@FindBy(xpath="//div[text()='Add New']")
public WebElement addNewButton;
@FindBy(xpath="//div[contains(text(),'New Customer')]")
public WebElement newCustomerBtn;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
public WebElement customerNametxtBox;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
public WebElement customerDescTxtBox;
@FindBy(xpath="//div[text()='Create Customer']")
public WebElement createCustomerBtn;

public void createCustomer(String cusName,String cusDesc)
{
	SeleniumUtils.performClick(addNewButton);
	SeleniumUtils.performClick(newCustomerBtn);
	SeleniumUtils.waitForElementVisiblity(10, customerNametxtBox);
	SeleniumUtils.enterValue(customerNametxtBox, cusName);
	SeleniumUtils.enterValue(customerDescTxtBox, cusDesc);
	SeleniumUtils.performClick(createCustomerBtn);
}
}








