package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demo.base.Base;
import com.demo.control.ApplicationSolutions;

public class ApplicationSolutionsPageTest {
	
	/*
	 * Contains all tests of Applications Solutions page.
	 * Test Data : reads from testNG.xml file
	 * ScreenShot : for every test screen shot is captured at ./screenshots folder
	 */
	
	@BeforeTest(alwaysRun=true)
	public void Setup(){
		Base.Initialize();
	}
	

	@Test(groups={"smoke"})
	@Parameters({"wood","metal","masonry","concrete"})
	public void verifyButtonTextValuesUnderDrilling(String wood, String metal, String masonary, String concrete){
		
		ApplicationSolutions.hoverOverDrilling();
		Assert.assertEquals(ApplicationSolutions.getBtnTextInsideDrillingTile("wood"), wood);
		Assert.assertEquals(ApplicationSolutions.getBtnTextInsideDrillingTile("metal"), metal);
		Assert.assertEquals(ApplicationSolutions.getBtnTextInsideDrillingTile("masonary"), masonary);
		Assert.assertEquals(ApplicationSolutions.getBtnTextInsideDrillingTile("concrete"), concrete);
		
	}
	
	@AfterTest(alwaysRun=true)
	public void tearDown(){
		Base.driverClose();
	}
}
