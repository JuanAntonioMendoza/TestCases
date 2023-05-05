Feature: TC_Digital_DownLoad_H_Cloud_Tag_010

  Scenario: Verify Product Page from the Cloud Tag for Digital Download category for cold users
    Given The hot user is on the main page and click on any link
    When The hot user clicks on "digital" in the popular tag
    Then The hot user should be see, picture, name, ranking, cart, price on Digital Tag