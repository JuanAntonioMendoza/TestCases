Feature: TC_Digital_DownLoad_C_Cloud_Tag_009

  Scenario: Verify Product Page from the Cloud Tag for Digital Download category for cold users
    Given The cold user is on the main page and click on any link
    When The cold user clicks on "digital" in the popular tag
    Then The cold user should be see, picture, name, ranking, cart, price on Digital Tag