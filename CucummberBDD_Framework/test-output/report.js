$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/daniyalwaris/BDD-FrameWork/CucummberBDD_Framework/src/main/java/Feature/Successful_Payment.feature");
formatter.feature({
  "line": 1,
  "name": "UI automation framework",
  "description": "",
  "id": "ui-automation-framework",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test script to test end to end successful checkout flow for purchasing",
  "description": "",
  "id": "ui-automation-framework;test-script-to-test-end-to-end-successful-checkout-flow-for-purchasing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on the purchase page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of page is coco",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User able to proceed with the checkout flow for purchasing Pillow",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User able to purchase though the Credit card payment method and Enter the \"4811111111111114\" and \"0221\" and \"123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SuccessfulPaymentScript.webpage()"
});
formatter.result({
  "duration": 8175679300,
  "status": "passed"
});
formatter.match({
  "location": "SuccessfulPaymentScript.webpage_validation()"
});
formatter.result({
  "duration": 74729000,
  "status": "passed"
});
formatter.match({
  "location": "SuccessfulPaymentScript.customer_checkout()"
});
formatter.result({
  "duration": 437346200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4811111111111114",
      "offset": 75
    },
    {
      "val": "0221",
      "offset": 98
    },
    {
      "val": "123",
      "offset": 109
    }
  ],
  "location": "SuccessfulPaymentScript.customercheckout_paymentMethod(String,String,String)"
});
formatter.result({
  "duration": 3170863100,
  "status": "passed"
});
});