package com.crm.qa.mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstTestInMobile {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "041604aa08431e02");
		capabilities.setCapability(MobileCapabilityType.APP, "D:\\Appium\\ApiDemos-debug.apk");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES,true);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"5000");
		capabilities.setCapability(MobileCapabilityType.NO_RESET,false);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, capabilities);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		
		
	}

}
