Feature: TC_Digital_DownLoad_C_003

  Scenario: Verify Product Page from the Main Menu Textbox for Digital Download category for cold users
    Given The cold user is on the main page and see main menu
    When The cold user clicks on name "Digital downloads" on main menu
    Then The cold user should be see, picture, name, ranking, cart, price on Digital Download
