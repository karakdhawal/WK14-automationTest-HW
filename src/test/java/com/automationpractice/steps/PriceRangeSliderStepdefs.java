package com.automationpractice.steps;

import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class PriceRangeSliderStepdefs {
    @And("^I slider change the price range$")
    public void iSliderChangeThePriceRange() throws InterruptedException {
        new SummerDressesPage().changeThePriceRangeSlider();
    }
    @And("^I can see the search result is updated$")
    public void iCanSeeTheSearchResultIsUpdated() {

    }

    @Then("^I can see the items returned are within the price range$")
    public void iCanSeeTheItemsReturnedAreWithinThePriceRange() {
        String verifyresult = new SummerDressesPage().verifyPritedChffonDressText();
        Assert.assertEquals(verifyresult, "Printed Chiffon Dress");
    }


}
