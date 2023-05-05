Feature: TC_Digital_DownLoad_C_Detail_005

  Scenario: Verify Product Details Page from the Home search Textbox for Digital Download category for cold users
    Given The cold user is on the main page for check Digital Downloads Product
    When The cold user enters name of a product "Vision" in the search text box for start Digital Downloads Product
    Then The cold user should be see button download, button add wishlist,button compare list, button email, price, ranking