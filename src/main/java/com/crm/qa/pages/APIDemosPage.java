package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class APIDemosPage extends TestBase{
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Access'ibility\"]")
	AndroidElement Accessibility1;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility\"]")
	AndroidElement Accessibility2;
		
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	AndroidElement Animation;
		
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
	AndroidElement App;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Content\"]")
	AndroidElement Content;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Graphics\"]")
	AndroidElement Graphics;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Media\"]")
	AndroidElement Media;
		
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"NFC\"]")
	AndroidElement NFC;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"OS\"]")
	AndroidElement OS;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Preference\"]")
	AndroidElement Preference;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
	AndroidElement Text;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
	AndroidElement Views;
	
	
	public APIDemosPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void bf_ClickOnViews() {
		Views.click();
	
	}

}
