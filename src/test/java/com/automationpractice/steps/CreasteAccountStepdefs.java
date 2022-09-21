package com.automationpractice.steps;

import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CreasteAccountStepdefs {
    @When("^I click on signin link$")
    public void iClickOnSigninLink() {
        new HomePage().clickOnSignInLink();
    }

    @And("^I enter lorduku in email address field$")
    public void iEnterLordukuInEmailAddressField() {
        new CreateAccountPage().enterinvalidEmailforCreateAnAccountField();
    }

    @And("^I click on create an account$")
    public void iClickOnCreateAnAccount() {
        new CreateAccountPage().clickOnCreateAccountButton();
    }

    @Then("^I see the error message Invalid email address$")
    public void iSeeTheErrorMessageInvalidEmailAddress() {
        String errorMes = new CreateAccountPage().verifyErrorMesInvalidEmailAd();
        Assert.assertEquals(errorMes, "Invalid email address.");
    }

    @And("^I enter valid email address$")
    public void iEnterValidEmailAddress() {
        new CreateAccountPage().enterValidEmailAddress();
    }

    @And("^I fill all mandatory fields$")
    public void iFillAllMandatoryFields() throws InterruptedException {
        new CreateAccountPage().enterFirstName();
        Thread.sleep(500);
        new CreateAccountPage().enterLastName();
        Thread.sleep(500);
        new CreateAccountPage().enterPassword();
        Thread.sleep(500);
        new CreateAccountPage().enterAddressField();
        Thread.sleep(500);
        new CreateAccountPage().enterCity();
        Thread.sleep(500);
        new CreateAccountPage().selectState();
        Thread.sleep(500);
        new CreateAccountPage().enterPostCode();
        Thread.sleep(500);
        new CreateAccountPage().enterMobilePhoneNumber();
        Thread.sleep(500);
        new CreateAccountPage().clickOnRegisterButton();
    }

    @And("^I click on Register Button$")
    public void iClickOnRegisterButton() {
      //  new CreateAccountPage().clickOnRegisterButton();
    }

    @Then("^I verify message my account$")
    public void iVerifyMessageMyAccount() throws InterruptedException {
        Thread.sleep(1000);
        String MyAcMes = new CreateAccountPage().verifyMessageMyAccount();
        Assert.assertEquals(MyAcMes, "MY ACCOUNT");
    }
}
