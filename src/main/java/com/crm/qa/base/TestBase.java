package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.utils.TestUtil;
import com.crm.qa.utils.WebEventListener;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class TestBase {
	
	public static AndroidDriver<WebElement> driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase() {
		
		try {
			prop =new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/crm"+"/qa/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static DesiredCapabilities  getDesiredCapabilities() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		System.err.println(prop.getProperty("platformName"));
		System.err.println(prop.getProperty("apk"));
		System.err.println(prop.getProperty("deviceName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,prop.getProperty("PlatformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,prop.getProperty("deviceName"));
		//capabilities.setCapability(MobileCapabilityType.APP,prop.getProperty("apk"));
		capabilities.setCapability("appActivity",prop.getProperty("appActivity"));
		capabilities.setCapability("appPackage",prop.getProperty("appPackage"));					
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,prop.getProperty("automationName"));
		capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES,true);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"5000");
		capabilities.setCapability(MobileCapabilityType.NO_RESET,false);
		return capabilities;
	}
	
	
	public static void initialization() throws MalformedURLException {
		String browserName = prop.getProperty("platformName");
		if(browserName.equalsIgnoreCase("Android")) {
			System.out.println("Creating Android driver");
			//AndroidDriver<WebElement> driver = new  AndroidDriver<WebElement>(prop.getProperty("url"), TestBase.getDesiredCapabilities());
			driver = new AndroidDriver<WebElement>(new URL(prop.getProperty("url")), TestBase.getDesiredCapabilities());
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.unlockDevice();
			driver.launchApp();
	
		
		
	
			
			
		}	
		
	}

}
