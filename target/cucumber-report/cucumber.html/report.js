$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/automationTest.feature");
formatter.feature({
  "line": 1,
  "name": "automation test functionality",
  "description": "",
  "id": "automation-test-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10409723300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User able to delete the item from the basket page",
  "description": "",
  "id": "automation-test-functionality;user-able-to-delete-the-item-from-the-basket-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover to women tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on summer dresses",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on printed chiffon dress",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on delete button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I can see Your Shopping cart is empty",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletebuttonStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 146891000,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iMouseHoverToWomen()"
});
formatter.result({
  "duration": 193654200,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iClickOnSummerDresses()"
});
formatter.result({
  "duration": 4843474300,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iClickOnPrintedChiffonDress()"
});
formatter.result({
  "duration": 7805255000,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iClickOnAddToCart()"
});
formatter.result({
  "duration": 82397000,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iClickOnProceedToCheckout()"
});
formatter.result({
  "duration": 17464913000,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iClickOnDeleteButton()"
});
formatter.result({
  "duration": 84955700,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iCanSeeYourShoppingCartIsEmpty()"
});
formatter.result({
  "duration": 1058618300,
  "error_message": "java.lang.AssertionError: expected [Your shopping cart is empty.] but found []\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat com.automationpractice.steps.DeletebuttonStepdefs.iCanSeeYourShoppingCartIsEmpty(DeletebuttonStepdefs.java:50)\r\n\tat ✽.Then I can see Your Shopping cart is empty(src/test/java/resources/featurefile/automationTest.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 193958100,
  "status": "passed"
});
formatter.before({
  "duration": 8692754500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User can select Summer Dresses option from the Navigation Menu",
  "description": "",
  "id": "automation-test-functionality;user-can-select-summer-dresses-option-from-the-navigation-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I mouse hover to women tab",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on summer dresses",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I can see Summer items",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletebuttonStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 23800,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iMouseHoverToWomen()"
});
formatter.result({
  "duration": 162067700,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iClickOnSummerDresses()"
});
formatter.result({
  "duration": 4013072000,
  "status": "passed"
});
formatter.match({
  "location": "SummerDressStepdefs.iCanSeeSummerItems()"
});
formatter.result({
  "duration": 45252300,
  "status": "passed"
});
formatter.after({
  "duration": 67400,
  "status": "passed"
});
formatter.before({
  "duration": 7055462600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User can change the range for summer dress",
  "description": "",
  "id": "automation-test-functionality;user-can-change-the-range-for-summer-dress",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I mouse hover to women tab",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on summer dresses",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I slider change the price range",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I can see the search result is updated",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I can see the items returned are within the price range",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletebuttonStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 33300,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iMouseHoverToWomen()"
});
formatter.result({
  "duration": 154512800,
  "status": "passed"
});
formatter.match({
  "location": "DeletebuttonStepdefs.iClickOnSummerDresses()"
});
formatter.result({
  "duration": 6532362300,
  "status": "passed"
});
formatter.match({
  "location": "PriceRangeSliderStepdefs.iSliderChangeThePriceRange()"
});
formatter.result({
  "duration": 1480608700,
  "status": "passed"
});
formatter.match({
  "location": "PriceRangeSliderStepdefs.iCanSeeTheSearchResultIsUpdated()"
});
formatter.result({
  "duration": 35600,
  "status": "passed"
});
formatter.match({
  "location": "PriceRangeSliderStepdefs.iCanSeeTheItemsReturnedAreWithinThePriceRange()"
});
formatter.result({
  "duration": 40862300,
  "status": "passed"
});
formatter.after({
  "duration": 65400,
  "status": "passed"
});
formatter.before({
  "duration": 6195110000,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User can not create account with invalid details",
  "description": "",
  "id": "automation-test-functionality;user-can-not-create-account-with-invalid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I enter lorduku in email address field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I see the error message Invalid email address",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletebuttonStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 28500,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iClickOnSigninLink()"
});
formatter.result({
  "duration": 3473484300,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iEnterLordukuInEmailAddressField()"
});
formatter.result({
  "duration": 108746500,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iClickOnCreateAnAccount()"
});
formatter.result({
  "duration": 76726200,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iSeeTheErrorMessageInvalidEmailAddress()"
});
formatter.result({
  "duration": 1902224600,
  "status": "passed"
});
formatter.after({
  "duration": 35800,
  "status": "passed"
});
formatter.before({
  "duration": 5562655900,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User can create new account successfully",
  "description": "",
  "id": "automation-test-functionality;user-can-create-new-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "I enter valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I fill all mandatory fields",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on Register Button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I verify message my account",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletebuttonStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 39200,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iClickOnSigninLink()"
});
formatter.result({
  "duration": 5082153600,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iEnterValidEmailAddress()"
});
formatter.result({
  "duration": 107566300,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iClickOnCreateAnAccount()"
});
formatter.result({
  "duration": 77975800,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iFillAllMandatoryFields()"
});
formatter.result({
  "duration": 16315509200,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 46800,
  "status": "passed"
});
formatter.match({
  "location": "CreasteAccountStepdefs.iVerifyMessageMyAccount()"
});
formatter.result({
  "duration": 1053628800,
  "status": "passed"
});
formatter.after({
  "duration": 30500,
  "status": "passed"
});
formatter.before({
  "duration": 7578668700,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "User can drag the map to see West Palm Beach Store and take screen shot",
  "description": "",
  "id": "automation-test-functionality;user-can-drag-the-map-to-see-west-palm-beach-store-and-take-screen-shot",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "I click on our store",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "I move the page slider down",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click on ok button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click minus button twice",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I take screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletebuttonStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 23900,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreMapStepdefs.iClickOnOurStore()"
});
formatter.result({
  "duration": 4304213800,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreMapStepdefs.iMoveThePageSliderDown()"
});
formatter.result({
  "duration": 38800,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreMapStepdefs.iClickOnOkButton()"
});
formatter.result({
  "duration": 74529800,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreMapStepdefs.iClickMinusButtonTwice()"
});
formatter.result({
  "duration": 2125815100,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreMapStepdefs.iTakeScreenshot()"
});
formatter.result({
  "duration": 1223314500,
  "status": "passed"
});
formatter.after({
  "duration": 33500,
  "status": "passed"
});
});