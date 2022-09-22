package com.automationpractice.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.StoreLocatorPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OurStoreMapStepdefs {
    @When("^I click on our store$")
    public void iClickOnOurStore() {
        new HomePage().clickOnOurStore();
    }

    @And("^I move the page slider down$")
    public void iMoveThePageSliderDown() {
    }

    @And("^I click on ok button$")
    public void iClickOnOkButton() {
        new StoreLocatorPage().clickOnOkButton();
    }

    @And("^I click minus button twice$")
    public void iClickMinusButtonTwice() throws InterruptedException {
        new StoreLocatorPage().clickOnZoomOut();
    }

    @Then("^I take screenshot$")
    public void iTakeScreenshot() {
    }
}
