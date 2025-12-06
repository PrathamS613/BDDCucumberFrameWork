Feature: Search and place the order for Products
@OffersPage
  Scenario Outline: Search experience for product search in both home and offers page
    Given user is on GreenCart landing Page
    When user Searched with shortname <Name> and  extracted actual name of the product
    Then user Searched for <Name>  same short name in offers page
    And validate product name in offers page matched with landing page

    Examples:
      | Name |                                                   
      | Tom  |
      | Beet |
