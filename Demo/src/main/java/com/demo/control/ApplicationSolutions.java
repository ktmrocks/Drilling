package com.demo.control;

import org.openqa.selenium.By;

import com.demo.base.Base;
import com.demo.common.Common;
import com.demo.pages.ApplicationSolutionsPage;

public class ApplicationSolutions extends Base {
	
	/*
	 * Contains all the methods to perform user activites in application solutions page
	 */

	// Hover over drilling tile block
	public static void hoverOverDrilling() {
		Common.hoverOver(ApplicationSolutionsPage.drillingTile);
	}

	
	
	// returns the button button text that shows up after hovering to Drilling tile
	public static String getBtnTextInsideDrillingTile(String btnName) {
		String btnText = "none";
		
		switch (btnName.toUpperCase()){
			case "WOOD":
				 btnText = Instance.findElement(By.xpath(ApplicationSolutionsPage.drillingWood)).getText();
				 break;
			case "METAL":
				btnText = Instance.findElement(By.xpath(ApplicationSolutionsPage.drillingMetal)).getText();
				 break;
			case "MASONARY":	
				btnText = Instance.findElement(By.xpath(ApplicationSolutionsPage.drillingMasonary)).getText();
				 break;
			case "CONCRETE":
				btnText = Instance.findElement(By.xpath(ApplicationSolutionsPage.drillingConcrete)).getText();
				break;
		}
				
		return btnText;

	}

}