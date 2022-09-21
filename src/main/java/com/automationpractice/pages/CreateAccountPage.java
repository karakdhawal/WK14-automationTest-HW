package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class CreateAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage (){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//input[@id='email_create']")
    WebElement emailFieldCreateAccount;

    @CacheLookup
    @FindBy (xpath = "//button[@id='SubmitCreate']/span")
    WebElement createAcButton;

    @CacheLookup
    @FindBy ( xpath = "//div[@id='create_account_error']/ol/li[1]")
    WebElement errorText;

    @CacheLookup
    @FindBy (xpath = "//input[@id='customer_firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy (xpath = "//input[@id='customer_lastname']")
    WebElement lastName;
    @CacheLookup
    @FindBy (xpath = "//input[@id='passwd']")
    WebElement passwordfield;
    @CacheLookup
    @FindBy (xpath = "//input[@id='firstname']")
    WebElement addressFirstName;
    @CacheLookup
    @FindBy (xpath = "//input[@id='lastname']")
    WebElement addressLastName;
    @CacheLookup
    @FindBy (xpath = "//input[@id='address1']")
    WebElement addressField;
    @CacheLookup
    @FindBy (xpath = "//input[@id='city']")
    WebElement cityfield;
    @CacheLookup
    @FindBy (xpath = "//select[@id='id_state']")
    WebElement stateDropDown;
    @CacheLookup
    @FindBy (xpath = "//input[@id='postcode']")
    WebElement postCodefield;
    @CacheLookup
    @FindBy (xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhoneField;
    @CacheLookup
    @FindBy (xpath = "//button[@id='submitAccount']/span[1]")
    WebElement registerButton;
    @CacheLookup
    @FindBy (xpath = "//div[@id='center_column']/h1")
    WebElement myAccountText;

    public String verifyMessageMyAccount (){
        return getTextFromElement(myAccountText);
    }

    public void clickOnRegisterButton (){
        clickOnElement(registerButton);
    }
    public void enterMobilePhoneNumber (){
        sendTextToElement(mobilePhoneField, "1234567890");
    }
    public void enterPostCode (){
        sendTextToElement(postCodefield, "78701");
    }
    public void selectState () {
        selectByVisibleTextFromDropDown(stateDropDown, "Texas");
    }
    public void enterCity (){
        sendTextToElement(cityfield, "Austin");
    }
    public void enterAddressField (){
        sendTextToElement(addressField, "1100 Congress Ave");
    }
    public void enterPassword (){
        sendTextToElement(passwordfield, "123456");
    }
    public void enterLastName (){
        sendTextToElement(lastName, "uk");
    }
    public void enterFirstName (){
        sendTextToElement(firstName, "lord");
    }
    public void enterValidEmailAddress (){
        Random randomNum = new Random();
        int randomgenerator = randomNum.nextInt(1000);
        sendTextToElement(emailFieldCreateAccount, "lorduk"+randomgenerator+"@gmail.com");
    }
    public String verifyErrorMesInvalidEmailAd (){
        return getTextFromElement(errorText);
    }
    public void clickOnCreateAccountButton (){
        clickOnElement(createAcButton);
    }
    public void enterinvalidEmailforCreateAnAccountField (){
        sendTextToElement(emailFieldCreateAccount, "lorduku");
    }
}
