package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewsPage extends TestBase{
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	AndroidElement Animation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Auto Complete\"]")
	AndroidElement AutoComplete;
		
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Buttons\"]")
	AndroidElement Buttons;
		
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Chronometer\"]")
	AndroidElement App;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Controls\"]")
	AndroidElement Controls;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Custom\"]")
	AndroidElement Custom;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Date Widgets\"]")
	AndroidElement DateWidgets;
		
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Drag and Drop\"]")
	AndroidElement DragAndDrop;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
	AndroidElement ExpandableLists;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Focus\"]")
	AndroidElement Focus;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Gallery\"]")
	AndroidElement Gallery;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Game Controller Input\"]")
	AndroidElement GameControllerInput;
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Picker\"]")
	AndroidElement Picker;
	
	public ViewsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void bf_clickOnDragAndDrop() {
		DragAndDrop.click();
	}
	public void bf_clickOnPicker() {
		Picker.click();
	}

}
