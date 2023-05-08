Feature: TC_Sprint_001

  Scenario: Verify Product Page from the Home search Textbox for Digital Download category for cold users
    Given The cold user is on the main page
    When The cold user enters name of a product "Vision" in the search text box
    Then The cold user should be see, picture, name, ranking, cart, price

  Scenario: Verify Product Page from the Main Menu Textbox for Digital Download category for cold users
    Given The cold user is on the main page and see main menu
    When The cold user clicks on name "Digital downloads" on main menu
    Then The cold user should be see, picture, name, ranking, cart, price on Digital Download
