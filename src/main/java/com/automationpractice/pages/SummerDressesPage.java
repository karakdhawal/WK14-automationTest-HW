package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDressesPage extends Utility {

    private static final Logger log = LogManager.getLogger(SummerDressesPage.class.getName());

    public SummerDressesPage (){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//div[@id='center_column']/ul[1]/li[3]/div[1]/div[2]/h5/a[1]")
    WebElement printedchiffonDress;

    @CacheLookup
    @FindBy (xpath = "//div[@class='box-cart-bottom']/div[1]/p[1]/button[1]/span[1]")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy (xpath = "//div[@class='button-container']/a[1]/span[1]")
    WebElement proceedToCheckOut;

    @CacheLookup
    @FindBy (xpath = "//a[@title='Delete']")
    WebElement delete;

    @CacheLookup
    @FindBy (xpath = "//div[@id='center_column']/p[1]")
    WebElement shoppingCartEmptyText;

    @CacheLookup
    @FindBy (xpath = "//span[@class='cat-name']")
    WebElement summerDressesText;

    @CacheLookup
    //@FindBy (xpath = "//a[@style='left: 25%;']")
    @FindBy (xpath = "//span[@id='layered_price_range']")
    WebElement priceSlider;

    public String verifyPritedChffonDressText (){
        return getTextFromElement(printedchiffonDress);
    }

    public void changeThePriceRangeSlider () throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(priceSlider);
        Thread.sleep(1000);
        //        driver.get()
//        String percent = priceSlider.getAttribute("style");
//        Actions move = new Actions()
//        (percent.contains("left: 25%;"));
//        (priceSlider);
    }

    public String verifySummerDressesDisplay (){
        return getTextFromElement(summerDressesText);
    }

    public String verifyYourShoppingCartIsEmptyText (){
        return getTextFromElement(shoppingCartEmptyText);
    }

    public void clickOnDelete (){
        clickOnElement(delete);
    }
    public void clickOnProceedToCheckout (){
        clickOnElement(proceedToCheckOut);
    }

    public void clickOnAddToCartButton () {
        clickOnElement(addToCartButton);
    }

    public void clickOnPrintedChiffonDress () {
        clickOnElement(printedchiffonDress);
    }
}
