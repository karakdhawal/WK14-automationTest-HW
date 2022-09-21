package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v93.log.Log;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage (){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy (xpath = "//div[@id='block_top_menu']/ul[1]/li[1]/a[1]")
    WebElement womenTab;

    @CacheLookup
    @FindBy (xpath = "//div[@id='block_top_menu']/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
    WebElement summerDresses;

    @CacheLookup
    @FindBy (xpath = "//div[@class='header_user_info']/a[1]")
    WebElement signinLink;

    @CacheLookup
    @FindBy (xpath = "//a[@title='Our stores']")
    WebElement ourStore;

    public void clickOnOurStore (){
        clickOnElement(ourStore);
    }
    public void clickOnSignInLink (){
        clickOnElement(signinLink);
    }

    public void clickOnSummerDresses (){
        clickOnElement(summerDresses);
    }

    public void mouseHoverToWomenTab (){
        mouseHoverToElement(womenTab);
    }

}
