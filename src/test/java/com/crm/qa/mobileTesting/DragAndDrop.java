package com.crm.qa.mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.crm.qa.utils.TestUtil;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDrop {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "041604aa08431e02");
		capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		capabilities.setCapability("appPackage","io.appium.android.apis");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES,true);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"5000");
		capabilities.setCapability(MobileCapabilityType.NO_RESET,false);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, capabilities);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.unlockDevice();
		driver.launchApp();
		WebElement view = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		 view.click();
		 WebElement DragAndDrop = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
		 
		 DragAndDrop.click();
		 
		 WebElement Source= driver.findElementById("drag_dot_1");
		 WebElement target= driver.findElementById("drag_dot_2");
		 
		 TouchAction action = new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(Source)).moveTo(ElementOption.element(target)).release().perform();		 
		 
		 
		 
		
		
		
	}

}
