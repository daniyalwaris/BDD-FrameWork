Feature: UI automation framework

Scenario: Test script to test end to end checkout flow for purchasing

Given User is on the purchase page
When  title of page is coco
Then  User able to proceed with the checkout flow for purchasing Pillow
Then  User able to purchase though the Credit card payment method
