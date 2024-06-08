@Tugas
Feature: Search feature
Scenario: Sort the product names (Z to A) and add the products to the cart and remove one of the selected products then click continue shopping
When User login with valid username "standard_user" and password "secret_sauce"
  Then User should be directed to the dashboard page
  And sort product icon is displayed
  And user click on sort product icon
  And Choose sort Name "Z to A"
  And user click add to cart product "Sauce Labs Onesie" and product "Test.allTheThings() T-Shirt (Red)"
  And Click cart icon
  And click remove button on product "Test.allTheThings() T-Shirt (Red)"
  And user verify that the product has been deleted
  Then user click continue shopping button


  Scenario: Sort the product names (A to Z) and add the products to the cart
    When User login with valid username "standard_user" and password "secret_sauce"
    Then User should be directed to the dashboard page
    And sort product icon is displayed
    And user click on sort product icon
    And Choose sort Name "A to Z"
#    Then user click add to cart product "Sauce Labs Backpack" and product "Sauce Labs Bike Light"

  Scenario: Sort the product price (Low to High) and add the products to the cart
    When User login with valid username "standard_user" and password "secret_sauce"
    Then User should be directed to the dashboard page
    And sort product icon is displayed
    And user click on sort product icon
    And Choose sort Price "Low to High"


  Scenario: Sort the product price (High to Low) and add the products to the cart
    When User login with valid username "standard_user" and password "secret_sauce"
    Then User should be directed to the dashboard page
    And sort product icon is displayed
    And user click on sort product icon
    And Choose sort Price "High to Low"

