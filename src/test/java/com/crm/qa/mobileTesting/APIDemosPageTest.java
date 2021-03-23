package com.crm.qa.mobileTesting;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.APIDemosPage;
import com.crm.qa.pages.ViewsPage;
import com.crm.qa.utils.TestUtil;


public class APIDemosPageTest extends TestBase {
	
	TestUtil testUtil;
	APIDemosPage apiDemosPage;
	ViewsPage views;
	public APIDemosPageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() throws Throwable {
		initialization();
		testUtil = new TestUtil();
		apiDemosPage = new APIDemosPage();
		views = new ViewsPage();
		
	}
	
	
	@Test(priority=1)
	public void clickingOnViews(){
	 apiDemosPage.bf_ClickOnViews();
	}
	
	@Test(priority=2)
	public void clickingOnPicker(){
		apiDemosPage.bf_ClickOnViews();
		String visibleText ="Picker";
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
		//views.bf_clickOnDragAndDrop();
		views.bf_clickOnPicker();


		
	}
	
	
	
	@AfterMethod
	public void tearDown() throws IOException, Throwable{
		testUtil.takeScreenshotAtEndOfTest();
		Thread.sleep(5000);
		System.out.println("Closing app");
		driver.closeApp();
		
		
	}
	
	

}
