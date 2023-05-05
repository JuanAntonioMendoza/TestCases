Feature: TC_Digital_DownLoad_H_Detail_006

  Scenario: Verify Product Details Page from the Home search Textbox for Digital Download category for hot users
    Given The hot user is on the main page for check Digital Downloads Product
    When The hot user enters name of a product "Vision" in the search text box for start Digital Downloads Product
    Then The hot user should be see button download, button add wishlist,button compare list, button email, price, ranking