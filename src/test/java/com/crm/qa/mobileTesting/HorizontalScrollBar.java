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

public class HorizontalScrollBar {

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
		 String visibleText = "Seek Bar";
		 WebElement seekBar= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
			
		 
		 seekBar.click();
		 
		 WebElement seek = driver.findElementById("seek");
		 
		
		 System.out.println("location "+seek.getLocation());
		 int leftX = seek.getLocation().getX();
		 int rightX= leftX +seek.getSize().getWidth();
		 System.err.println("left "+leftX +" right "+rightX);
		 TouchAction action = new TouchAction((MobileDriver)driver);
		 action.longPress(ElementOption.element(seek)).moveTo(ElementOption.element(seek,rightX,rightX)).release().perform();	
		 System.out.println("Performed scrooling");
		
		 
		 
		 WebElement progress = driver.findElementById("progress");
		 System.out.println(progress.getText());
		 
		 
		
		
		
	}

}
