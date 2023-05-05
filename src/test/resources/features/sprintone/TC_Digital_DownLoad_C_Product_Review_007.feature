Feature: TC_Digital_DownLoad_C_Product_Review_007

  Scenario: Verify Product Review Page from the Home search Textbox for Digital Download category for cold users
    Given The cold user is on the main page for check Digital Downloads Product and see review
    When The cold user enters name of a product "Vision" in the search text box for start Digital Downloads Product and press link
    Then The cold user should be see form review disable