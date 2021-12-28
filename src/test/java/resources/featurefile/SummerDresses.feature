Feature: Select summer dresses option
  As a user i should be able to select Summer Dresses from the navigation menu

#  Scenario: Select summer dresses option
#    Given User is on Homepage
#    When User clicks on Summer dresses option
#    Then User can see the summer dresses page displayed

    Scenario: Changing the price range
      Given User is on Summer dresses page
      When User selects the price range
      Then User can see the updated results
