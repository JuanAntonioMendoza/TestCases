Feature: TC_Digital_DownLoad_H_002

  Scenario: Verify Product Page from the Home search Textbox for Digital Download category for cold users
    Given The hot user is on the main page
    When The hot user enters name of a product "Vision" in the search text box
    Then The hot user should be see, picture, name, ranking, cart, price
