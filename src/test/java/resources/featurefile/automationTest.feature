Feature:   automation test functionality

 Scenario: User able to delete the item from the basket page
   Given I am on Homepage
   When I mouse hover to women tab
   And I click on summer dresses
   And I click on printed chiffon dress
   And I click on add to cart
   And I click on proceed to checkout
   And I click on delete button
   Then I can see Your Shopping cart is empty

  Scenario: User can select Summer Dresses option from the Navigation Menu
    Given I am on Homepage
    When I mouse hover to women tab
    And I click on summer dresses
    Then I can see Summer items

  Scenario: User can change the range for summer dress
    Given I am on Homepage
    When I mouse hover to women tab
    And I click on summer dresses
    And I slider change the price range
    And I can see the search result is updated
    Then I can see the items returned are within the price range

    Scenario: User can not create account with invalid details
      Given I am on Homepage
      When I click on signin link
      And I enter lorduku in email address field
      And I click on create an account
      Then I see the error message Invalid email address

    Scenario:  User can create new account successfully
      Given I am on Homepage
      When I click on signin link
      And I enter valid email address
      And I click on create an account
      And I fill all mandatory fields
      And I click on Register Button
      Then I verify message my account

    Scenario: User can drag the map to see West Palm Beach Store and take screen shot
      Given I am on Homepage
      When I click on our store
      And I move the page slider down
      And I click on ok button
      And I click minus button twice
      Then I take screenshot
