$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Maven2/Login.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHrm Login",
  "description": "",
  "id": "orangehrm-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7697952152,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "as user i should be logged in",
  "description": "",
  "id": "orangehrm-login;as-user-i-should-be-logged-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 92267509,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enters_Username_and_Password()"
});
formatter.result({
  "duration": 1878890831,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_login_page()"
});
formatter.result({
  "duration": 1552395992,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 173016037,
  "status": "passed"
});
formatter.after({
  "duration": 34619144,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "invalid Credentials",
  "description": "",
  "id": "orangehrm-login;invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@noLogin"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enters invalid\"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should not be able to login with \"\u003cerrormessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "orangehrm-login;invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "errormessage"
      ],
      "line": 18,
      "id": "orangehrm-login;invalid-credentials;;1"
    },
    {
      "cells": [
        "Raj",
        "raj123",
        "Invalid credentials"
      ],
      "line": 19,
      "id": "orangehrm-login;invalid-credentials;;2"
    },
    {
      "cells": [
        "",
        "",
        "Username cannot be empty"
      ],
      "line": 20,
      "id": "orangehrm-login;invalid-credentials;;3"
    },
    {
      "cells": [
        "Raj",
        "",
        "Password cannot be empty"
      ],
      "line": 21,
      "id": "orangehrm-login;invalid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2555630951,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "invalid Credentials",
  "description": "",
  "id": "orangehrm-login;invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@noLogin"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enters invalid\"Raj\" and \"raj123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should not be able to login with \"Invalid credentials\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 30329,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raj",
      "offset": 15
    },
    {
      "val": "raj123",
      "offset": 25
    }
  ],
  "location": "StepDef.enters_invalid_and(String,String)"
});
formatter.result({
  "duration": 1269312207,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_on_login_button()"
});
formatter.result({
  "duration": 668874026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid credentials",
      "offset": 39
    }
  ],
  "location": "StepDef.user_should_not_be_able_to_login_with(String)"
});
formatter.result({
  "duration": 167299213,
  "status": "passed"
});
formatter.after({
  "duration": 31687478,
  "status": "passed"
});
formatter.before({
  "duration": 2455731757,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "invalid Credentials",
  "description": "",
  "id": "orangehrm-login;invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@noLogin"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enters invalid\"\" and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should not be able to login with \"Username cannot be empty\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 38554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 15
    },
    {
      "val": "",
      "offset": 22
    }
  ],
  "location": "StepDef.enters_invalid_and(String,String)"
});
formatter.result({
  "duration": 1151389161,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_on_login_button()"
});
formatter.result({
  "duration": 391660768,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Username cannot be empty",
      "offset": 39
    }
  ],
  "location": "StepDef.user_should_not_be_able_to_login_with(String)"
});
formatter.result({
  "duration": 140505554,
  "status": "passed"
});
formatter.after({
  "duration": 33788428,
  "status": "passed"
});
formatter.before({
  "duration": 2572035011,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "invalid Credentials",
  "description": "",
  "id": "orangehrm-login;invalid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@noLogin"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enters invalid\"Raj\" and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should not be able to login with \"Password cannot be empty\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 27245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raj",
      "offset": 15
    },
    {
      "val": "",
      "offset": 25
    }
  ],
  "location": "StepDef.enters_invalid_and(String,String)"
});
formatter.result({
  "duration": 1230333864,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_on_login_button()"
});
formatter.result({
  "duration": 384134979,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password cannot be empty",
      "offset": 39
    }
  ],
  "location": "StepDef.user_should_not_be_able_to_login_with(String)"
});
formatter.result({
  "duration": 149750862,
  "status": "passed"
});
formatter.after({
  "duration": 18075259,
  "status": "passed"
});
});