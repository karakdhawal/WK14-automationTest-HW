package com.automationpractice;

import com.automationpractice.propertyreader.PropertyReader;
import com.automationpractice.utility.Utility;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


public class Hooks extends Utility {

    @Before
    public void setUp() throws InterruptedException {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
////    }
////    public void acceptCookies () throws InterruptedException {
//        WebElement frame7 = driver.findElement(By.id("gdpr-consent-notice"));
//        driver.switchTo().frame(frame7);
//        Thread.sleep(1000);
//        WebElement acceptCookie = driver.findElement(By.xpath("//button[@id='save']/span[1]/div[1]/span[1]"));
//        acceptCookie.click();
    }

    @After

    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       // closeBrowser();
    }
}
