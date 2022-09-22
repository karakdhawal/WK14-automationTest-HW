package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import cucumber.api.java.zh_cn.假如;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SummerDressesPage extends Utility {

    private static final Logger log = LogManager.getLogger(SummerDressesPage.class.getName());

    public SummerDressesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='center_column']/ul[1]/li[3]/div[1]/div[2]/h5/a[1]")
    WebElement printedchiffonDress;

    @CacheLookup
    @FindBy(xpath = "//div[@class='box-cart-bottom']/div[1]/p[1]/button[1]/span[1]")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='button-container']/a[1]/span[1]")
    WebElement proceedToCheckOut;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Delete']")
    WebElement delete;

    @CacheLookup
    @FindBy(xpath = "//div[@id='center_column']/p[1]")
    WebElement shoppingCartEmptyText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cat-name']")
    WebElement summerDressesText;

    @CacheLookup
    //@FindBy (xpath = "//a[@style='left: 25%;']") ////div[@id='left_column']//a[2]
    //@FindBy (xpath = "//span[@id='layered_price_range']")
    //@FindBy(xpath = "//div[@class='layered_slider_container']")
    @FindBy (xpath = "//div[@class='layered_slider_container']/div[1]/a[2]")
    WebElement priceSlider;

    @CacheLookup
    @FindBy(xpath = "//a[@style='left: 25%;']")
    WebElement priceTarget;

    public String verifyPritedChffonDressText() {
        return getTextFromElement(printedchiffonDress);
    }

    public void changeThePriceRangeSlider() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("slider axis are - " +priceSlider.getLocation());

         Actions actions = new Actions(driver);
         actions.dragAndDropBy(priceSlider, -182,0).build().perform();
        // actions.dragAndDrop(priceSlider, priceTarget).build().perform();
        //     actions.dragAndDropBy(priceSlider, -182, 0).build().perform();
        //        clickOnElement(priceSlider);
//        Thread.sleep(1000);
        //        driver.get()
//        String percent = priceSlider.getAttribute("style");
//        Actions move = new Actions()
//        (percent.contains("left: 25%;"));
//        (priceSlider);
//driver.findElement(By.id("sp-cc-accept")).click();
       /* JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,1500)");
*/

//        Actions actions = new Actions(driver);
//        WebElement mainSlider = driver.findElement(By.id("layered_price_slider"));
//        int width = mainSlider.getSize().width;
//        int haldWidth = width / 2;
//        WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-state-default ui-corner-all'][2]"));
//        actions.dragAndDropBy(slider,haldWidth,0).build().perform();
    }


//    @Test
//    public void testSliderExample() throws InterruptedException {
//        //driver.findElement(By.id("sp-cc-accept")).click();
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        Thread.sleep(2000);
//        jse.executeScript("window.scrollBy(0,1500)");
//    }


    public String verifySummerDressesDisplay() {
        return getTextFromElement(summerDressesText);
    }

    public String verifyYourShoppingCartIsEmptyText() {
        return getTextFromElement(shoppingCartEmptyText);
    }

    public void clickOnDelete() {
        clickOnElement(delete);
    }

    public void clickOnProceedToCheckout() {
        clickOnElement(proceedToCheckOut);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void clickOnPrintedChiffonDress() {
        clickOnElement(printedchiffonDress);
    }
}
