$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/daniyalwaris/BDD-FrameWork/CucummberBDD_Framework/src/main/java/Feature/Fail_Payment.feature");
formatter.feature({
  "line": 1,
  "name": "UI automation framework",
  "description": "",
  "id": "ui-automation-framework",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#---------------------------------------------------------------------------#"
    },
    {
      "line": 4,
      "value": "# In case of Example we will us Scenario Outline"
    }
  ],
  "line": 6,
  "name": "Test Unsuccesful end to end checkout flow due expire card details and Show the Output",
  "description": "",
  "id": "ui-automation-framework;test-unsuccesful-end-to-end-checkout-flow-due-expire-card-details-and-show-the-output",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User is on the webPage For buying pillows",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "title of page is Sample Store",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User able to proceed with the payment checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User able to enter the Credit card details",
  "rows": [
    {
      "cells": [
        "CerditCardNumber",
        "Expirydate",
        "OPT"
      ],
      "line": 12
    },
    {
      "cells": [
        "4811111111111114",
        "0221",
        "123"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FailurePayment.webpage()"
});
formatter.result({
  "duration": 8018030700,
  "status": "passed"
});
formatter.match({
  "location": "FailurePayment.webpage_validation()"
});
formatter.result({
  "duration": 89504900,
  "status": "passed"
});
formatter.match({
  "location": "FailurePayment.customer_checkout()"
});
formatter.result({
  "duration": 312400300,
  "status": "passed"
});
formatter.match({
  "location": "FailurePayment.customercheckout_paymentMethod(DataTable)"
});
formatter.result({
  "duration": 3040091500,
  "status": "passed"
});
});