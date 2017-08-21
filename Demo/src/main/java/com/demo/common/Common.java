package com.demo.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.demo.base.Base;
import com.demo.pages.ApplicationSolutionsPage;

public class Common extends Base {
	
	public static void hoverOver(String locator){
		
		WebElement element = Instance.findElement(By.xpath(locator));
		Actions actions = new Actions(Instance);
		actions.moveToElement(element).click().perform();
		
		Instance.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}

}
