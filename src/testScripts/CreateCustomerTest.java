package testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.TasksPage;
import Utilities.BaseClass;
import Utilities.ExcelLibrary;
@Listeners(Utilities.Screenshot.class)
public class CreateCustomerTest extends BaseClass {
  @Test
  public void f() throws Exception {
	  String cusName=ExcelLibrary.FetchStringData("Customer", 1, 0);
	  String cusDesc=ExcelLibrary.FetchStringData("Customer", 1, 1);
	  HomePage hp=PageFactory.initElements(driver, HomePage.class);
	  hp.naviagteToTasks();
	  Reporter.log("Navigated to Tasks Tab");
	  TasksPage tp=PageFactory.initElements(driver, TasksPage.class);
	  tp.createCustomer(cusName, cusDesc);
	  Reporter.log("Customer Created Succesfully");
	  
  }
}






