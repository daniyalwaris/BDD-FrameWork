Feature: UI automation framework

Scenario: Test script to test end to end successful checkout flow for purchasing
Given User is on the purchase page
When  title of page is coco
Then  User able to proceed with the checkout flow for purchasing Pillow
Then  User able to purchase though the Credit card payment method and Enter the "4811111111111114" and "0221" and "123"


#---------------------------------------------------------------------------#
# In case of Example we will us Scenario Outline

#Scenario Outline: Test script to test end to end checkout flow for purchasing

#Given User is on the purchase page
#When  title of page is coco
#Then  User able to proceed with the checkout flow for purchasing Pillow
#Then  User able to purchase though the Credit card payment method and Enter the "<Credit Card Number>" and "<Expiry Date>" OPT
 
# Examples:
#	| Credit Card Number| Expiry Date |
#	| 4811111111111114  | 0221        |
	