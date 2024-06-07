Feature: Search feature
Scenario: Sort the product names (Z to A) and add the products to the cart and remove one of the selected products then click continue shopping
When User login with valid username "standard_user" and password "secret_sauce"
  Then User should be directed to the dashboard page
  And sort product icon is displayed
  And user click on sort product icon
  And Choose sort Name (Z to A)
  And user click add to cart product "Sauce Labs Onesie" and product "Test.allTheThings() T-Shirt (Red)"
  And Click cart icon
  And click remove button on product "Test.allTheThings() T-Shirt (Red)"
  Then user click continue shopping button


