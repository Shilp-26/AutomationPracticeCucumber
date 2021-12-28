Feature: Browsing our stores page
  User should be able to browse all the stores

  Scenario: User should be able to see a store from west palm beach and take a screenshot
    Given User is on Our Stores page
    When User can drag the map to see a store from West Palm Beach
    Then User can take a screenshot