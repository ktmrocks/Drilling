package com.demo.base;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.demo.pages.ApplicationSolutionsPage;
import com.demo.utility.PropertiesFile;

public class Base {
	public static WebDriver Instance = null;

	public static void Initialize() {
	

		if (Instance == null) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
			Instance = new ChromeDriver();
			try {
				Instance.get(PropertiesFile.readPropertiesFile("autUrl"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Instance.manage().window().maximize();
		Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void driverClose() {
		Instance.close();
	}

}