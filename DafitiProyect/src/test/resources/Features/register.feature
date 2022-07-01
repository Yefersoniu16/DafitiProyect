Feature: a registration on the dafiti page and entry
  of the product to the shopping cart

  Scenario: a user login with incorrect username and password
    Given User is in the app register page
    When the user enters the registration data
      | firstname | lastname | number | email                | password   |
      | Yeferson  | Ibarguen | 10101  | yeferson@hotmail.com | Yefersoniu |
    Then the user enters the page