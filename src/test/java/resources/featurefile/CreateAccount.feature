Feature:  Create account page test
  User should be able to create an account successfully

  @Regression
  Scenario: User should be able to create account
    Given User is on Homepage
    When User clicks on sign in link
    And User enters email address
    And User clicks on create an account button
    And User fills out all the mandatory fields: "John","Johnson","Prime258","John","Johnson","43 London rd","London","Idaho","90987","07572537467","Home"
    And User clicks on register button
    And User can see the message "My Account" appear