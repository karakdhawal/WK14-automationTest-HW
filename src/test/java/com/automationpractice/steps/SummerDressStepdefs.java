package com.automationpractice.steps;

import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class SummerDressStepdefs {
    @Then("^I can see Summer items$")
    public void iCanSeeSummerItems() {
        String summerDressText = new SummerDressesPage().verifySummerDressesDisplay();
        Assert.assertEquals(summerDressText, "SUMMER DRESSES ");
    }
}
