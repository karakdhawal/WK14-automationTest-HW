package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import gherkin.lexer.Th;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
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

    @CacheLookup
    @FindBy (xpath = "//button[@class='dismissButton']")
    WebElement okButton;

    @CacheLookup
    @FindBy (xpath = "//button[@title='Zoom out']")
    WebElement zoomOut;

    @CacheLookup
   // @FindBy (xpath = "//div[@class='gm-style']/div[2]/div[2]")
    @FindBy (xpath = "//div[@class='gm-style']")
    WebElement map;

    public void getScreenShot () throws InterruptedException {
//        WebElement frame = driver.findElement(By.id("map"));
//        driver.switchTo().frame(frame);
        Thread.sleep(1000);
//        WebElement map = driver.findElement(By.xpath("//div[@class='gm-style']"));
//        map.click();
        Utility.takeScreenShot(map);

    }

    public void clickOnZoomOut () throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(zoomOut);
        Thread.sleep(1000);
        clickOnElement(zoomOut);
    }

    public void clickOnOkButton (){
        clickOnElement(okButton);
    }

    public void clickOnStoreLocatorSearchButton (){
        clickOnElement(storeLocatorSearchButton);
    }
    public void enterAddressInStoreLocatorField (){
        sendTextToElement(storeLocatorAddField, "West Palm Beach");
    }
}
