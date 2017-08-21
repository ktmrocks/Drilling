package com.demo.utility;

import org.testng.ITestResult;

public class MethodName {
	public static String getActiveTestName(ITestResult result){
		String testName = "none";
		testName = result.getMethod().getMethodName();
		return testName;
	}

}
