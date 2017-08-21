package com.demo.utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.demo.base.Base;

public class ScreenShot extends Base {

	public static void takeScreenShot(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) Instance; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(source, new File("./screenshots/"+MethodName.getActiveTestName(result)+"_"+Utility.getDateTimeForScreenShot() +".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
