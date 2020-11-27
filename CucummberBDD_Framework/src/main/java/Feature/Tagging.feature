Feature: UI automation framework

#---------------------------------------------------------------------------#
# In case of Example we will us Scenario Outline
@RegressionTest
Scenario: Learn The Tegging Information for multiple test cases in one
Given User is on the webPage For buying pillows
When title of page is Sample Store
Then User able to proceed with the payment checkout
Then User able to enter the Credit card details
 |CerditCardNumber   | Expirydate | OPT |
 | 4811111111111114  | 0221       | 123 |
 
	