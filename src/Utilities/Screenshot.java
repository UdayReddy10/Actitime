package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
	}
	@Override
public void onTestSuccess(ITestResult result) {
EventFiringWebDriver efw=new EventFiringWebDriver(BaseClass.driver);
File src=efw.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\GANGA\\eclipse-workspace"
				+ "\\Framework\\PassedScreenshot\\Screen"
				+System.currentTimeMillis()+".png");
try {
	FileUtils.copyFile(src, des);
} catch (IOException e) {
System.out.println("Screenshot not captured");
		}
	}
	@Override
	public void onTestFailure(ITestResult result) {
		EventFiringWebDriver efw=new EventFiringWebDriver(BaseClass.driver);
		File src=efw.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\GANGA\\eclipse-workspace"
				+ "\\Framework\\FailedScreenshot\\Screen"
				+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.out.println("Screenshot not captured");
		}
	}
@Override
public void onTestSkipped(ITestResult result) {
	}
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
@Override
public void onTestFailedWithTimeout(ITestResult result) {
	}
@Override
public void onStart(ITestContext context) {
	}
@Override
public void onFinish(ITestContext context) {
}
}
