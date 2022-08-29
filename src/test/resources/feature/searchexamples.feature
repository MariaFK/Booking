Feature: Search
  Scenario Outline: User goes to main page search for the hotel name <name> click search <button> and checks
  hotel name <name2>
    Given Main booking page opened
    When User enters the hotel name <name>
    And Clicks <button> button
    Then <name2> hotel presents on page
    Examples:
      | name | button | name2 |
      | "Hotel Morfeo" | "Search"|"Hotel Morfeo" |

  Scenario Outline: User goes to main page search for the hotel name <name> click search <button> and checks
  hotel is valued <number> stars
    Given Main booking page opened
    When User enters the hotel name <name>
    And Clicks <button> button
    Then Hotel is valued at <number>
    Examples:
      | name | button | number |
      | "Hotel Morfeo" | "Search"|"4" |

