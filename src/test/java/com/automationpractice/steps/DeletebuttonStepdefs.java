package com.automationpractice.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DeletebuttonStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover to women tab$")
    public void iMouseHoverToWomen() {
        new HomePage().mouseHoverToWomenTab();
    }

    @And("^I click on summer dresses$")
    public void iClickOnSummerDresses() {
        new HomePage().clickOnSummerDresses();
    }

    @And("^I click on printed chiffon dress$")
    public void iClickOnPrintedChiffonDress() {
        new SummerDressesPage().clickOnPrintedChiffonDress();
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new SummerDressesPage().clickOnAddToCartButton();
    }

    @And("^I click on proceed to checkout$")
    public void iClickOnProceedToCheckout() {
        new SummerDressesPage().clickOnProceedToCheckout();
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        new SummerDressesPage().clickOnDelete();
    }

    @Then("^I can see Your Shopping cart is empty$")
    public void iCanSeeYourShoppingCartIsEmpty() throws InterruptedException {
        Thread.sleep(1000);
        String verifyText = new SummerDressesPage().verifyYourShoppingCartIsEmptyText();
        Assert.assertEquals(verifyText, "Your shopping cart is empty.");
    }
}
