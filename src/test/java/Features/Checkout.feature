
Feature: place the order for Products
@PlaceOrder
  Scenario Outline: Search experience for product search in both home and offers page
    Given user is on GreenCart landing Page
    When user Searched with shortname <Name> and  extracted actual name of the product
    And Added "3" items to the selected product to cart 
    Then user proceeds to checkout and validate the <Name> items in checkout page 
    And verify user has ability to enter promo code and place order 

    Examples:
      | Name |
      | Tom  |

