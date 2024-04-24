package listenerUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass1;

public class ListenerImple extends BaseClass1 implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution Started");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution completed");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Execution Started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Execution completed com");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
    test.log(LogStatus.FAIL, test.addScreenCapture(getWebPageScreenshot(driver)));
	}
	

}
