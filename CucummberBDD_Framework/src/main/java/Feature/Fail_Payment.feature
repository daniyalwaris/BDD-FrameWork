Feature: UI automation framework

#---------------------------------------------------------------------------#
# In case of Example we will us Scenario Outline

Scenario: Test Unsuccesful end to end checkout flow due expire card details and Show the Output

Given User is on the webPage For buying pillows
When title of page is Sample Store
Then User able to proceed with the payment checkout
Then User able to enter the Credit card details
 |CerditCardNumber   | Expirydate | OPT |
 | 4811111111111114  | 0221       | 123 |
 
	