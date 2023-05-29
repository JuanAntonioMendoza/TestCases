Feature: TC_NopCommerce

  @Cold_User
  Scenario: Verify Product Page from the Home search Textbox for Digital Download category for cold users
    Given The cold user is on the main page
    When The cold user enters name of a product "Apple" in the search text box
      #Table
      | Products |
      | Vision   |
      | digital  |
      | fashion  |
      | sports   |
      | vision   |
    Then The cold user should be see, picture, name, ranking, cart, price

  @Cold_User
  Scenario: Verify Product Page from the Main Menu Textbox for Digital Download category for cold users
    Given The cold user is on the main page and see main menu
    When The cold user clicks on name "Digital downloads" on main menu
    Then The cold user should be see the next content on Digital Download
      #Table
      | Section  |  Label Name  | Class                                   | Text Value  | Optional  | Requirement |
      | picture  |  img         |                                         |             | False     | Picture     |
      | details  |  a           |                                         |  NotNull    | False     | Name        |
      | details  |  div         | rating                                  |             | False     | Ranking     |
      | details  |  button      | button-2 product-box-add-to-cart-button | ADD TO CART | False     | Cart        |
      | details  |  span        | price actual-price                      |  NotNull    | False     | Price       |

  @Cold_User
  Scenario: Verify Product Details Page from the Home search Textbox for Digital Download category for cold users
    Given The cold user is on the main page for check Digital Downloads Product
    When The cold user enters name of a product "Vision" in the search text box for start Digital Downloads Product
    Then The cold user should be see button download, button add wishlist,button compare list, button email, price, ranking

  @Cold_User
  Scenario: Verify Product Review Page from the Home search Textbox for Digital Download category for cold users
    Given The cold user is on the main page for check Digital Downloads Product and see review
    When The cold user enters name of a product "Vision" in the search text box for start Digital Downloads Product and press link
    Then The cold user should be see form review disable

  @Cold_User
  Scenario: Verify Product Page from the Cloud Tag for Digital Download category for cold users
    Given The cold user is on the main page and click on any link
    When The cold user clicks on "digital" in the popular tag
    Then The cold user should be see, picture, name, ranking, cart, price on Digital Tag
      #Table
      | Section  |  Label Name  | Class                                   | Text Value  | Optional  | Requirement |
      | picture  |  img         |                                         |             | False     | Picture     |
      | details  |  a           |                                         |  NotNull    | False     | Name        |
      | details  |  div         | rating                                  |             | False     | Ranking     |
      | details  |  button      | button-2 product-box-add-to-cart-button | ADD TO CART | False     | Cart        |
      | details  |  span        | price actual-price                      |             | False     | Price       |

  @Global
  Scenario: Test create a user for credentials
    Given The user is on the main page
    When The user enters a "Register" in main page
    Then The user create a temporary credentials

  @Hot_User
  Scenario: Verify Product Page from the Home search Textbox for Digital Download category for cold users
    Given The hot user is on the main page
    When The hot user enters name of a product "Apple" in the search text box
    Then The hot user should be see, picture, name, ranking, cart, price

  @Hot_User
  Scenario: Verify Product Page from the Main Menu Textbox for Digital Download category for hot users
    Given The hot user is on the main page and see main menu
    When The hot user clicks on name "Digital downloads" on main menu
    Then The hot user should be see, picture, name, ranking, cart, price on Digital Download
      #Table
      | Section  |  Label Name  | Class                                   | Text Value  | Optional  | Requirement |
      | picture  |  img         |                                         |             | False     | Picture     |
      | details  |  a           |                                         |  NotNull    | False     | Name        |
      | details  |  div         | rating                                  |             | False     | Ranking     |
      | details  |  button      | button-2 product-box-add-to-cart-button | ADD TO CART | False     | Cart        |
      | details  |  span        | price actual-price                      |  NotNull    | False     | Price       |

  @Hot_User
  Scenario: Verify Product Details Page from the Home search Textbox for Digital Download category for hot users
    Given The hot user is on the main page for check Digital Downloads Product
    When The hot user enters name of a product "Vision" in the search text box for start Digital Downloads Product
    Then The hot user should be see button download, button add wishlist,button compare list, button email, price, ranking

  @Hot_User
  Scenario: Verify Product Review Page from the Home search Textbox for Digital Download category for hot users
    Given The hot user is on the main page for check Digital Downloads Product and see review
    When The hot user enters name of a product "Vision" in the search text box for start Digital Downloads Product and press link
#    When The hot user enters name of a product "If You Wait (donation)" in the search text box for start Digital Downloads Product and press link
    Then The hot user should be see form and add review

  @Hot_User
  Scenario: Verify Product Page from the Cloud Tag for Digital Download category for cold users
    Given The hot user is on the main page and click on any link
    When The hot user clicks on "digital" in the popular tag
    Then The hot user should be see, picture, name, ranking, cart, price on Digital Tag
      #Table
      | Section  |  Label Name  | Class                                   | Text Value  | Optional  | Requirement |
      | picture  |  img         |                                         |             | False     | Picture     |
      | details  |  a           |                                         |  NotNull    | False     | Name        |
      | details  |  div         | rating                                  |             | False     | Ranking     |
      | details  |  button      | button-2 product-box-add-to-cart-button | ADD TO CART | False     | Cart        |
      | details  |  span        | price actual-price                      |             | False     | Price       |
