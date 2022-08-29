Feature: Search
  Scenario: Search for the hotel
    Given Main booking page opened
    When User enters the hotel name "Hotel Morfeo"
    And Clicks "Search" button
    Then "Hotel Morfeo" hotel presents on page

  Scenario: Search for the hotel
    Given Main booking page opened
    When User enters the hotel name "Hotel Morfeo"
    And Clicks "Search" button
    Then Hotel is valued at "4"