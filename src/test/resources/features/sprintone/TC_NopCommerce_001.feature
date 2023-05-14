Feature: TC_Digital_DownLoad_C_001

  @Cold_User
  Scenario: Verify Product Page from the Home search Textbox for Digital Download category for cold users
    Given The cold user is on the main page
    When The cold user enters name of a product "Vision" in the search text box
    Then The cold user should be see, picture, name, ranking, cart, price