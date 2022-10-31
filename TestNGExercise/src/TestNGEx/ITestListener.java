package TestNGEx;

import org.testng.ITestResult;

public interface ITestListener {

	void onTestFailure(ITestResult result);

}