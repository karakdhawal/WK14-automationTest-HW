package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreLocatorPage extends Utility {

    private static final Logger log = LogManager.getLogger(StoreLocatorPage.class.getName());

    public StoreLocatorPage (){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//input[@id='addressInput']")
    WebElement storeLocatorAddField;

    @CacheLookup
    @FindBy (xpath = "//button[@name='search_locations']/span")
    WebElement storeLocatorSearchButton;

    public void clickOnStoreLocatorSearchButton (){
        clickOnElement(storeLocatorSearchButton);
    }
    public void enterAddressInStoreLocatorField (){
        sendTextToElement(storeLocatorAddField, "West Palm Beach");
    }
}
