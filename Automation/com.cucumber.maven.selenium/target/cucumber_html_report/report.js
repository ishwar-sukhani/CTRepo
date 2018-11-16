$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonCartTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 25,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "some other precondition",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I complete action",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "some other action",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "yet another action",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 35,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I check for the \u003cvalue\u003e in step",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "I verify the \u003cstatus\u003e in step",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ],
      "line": 41,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;1"
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ],
      "line": 42,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;2"
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ],
      "line": 43,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 42,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    },
    {
      "line": 34,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "I want to write a step with name1",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I check for the 5 in step",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "I verify the success in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 43,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    },
    {
      "line": 34,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "I want to write a step with name2",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I check for the 7 in step",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "I verify the Fail in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 45,
      "value": "# Verify user can add lowest price item to cart"
    }
  ],
  "line": 46,
  "name": "Successful addition of items in cart",
  "description": "",
  "id": "title-of-your-feature;successful-addition-of-items-in-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "I have",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("PGSLogin.feature");
formatter.feature({
  "line": 1,
  "name": "I want to test PGS Login Functionality",
  "description": "",
  "id": "i-want-to-test-pgs-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test PGS Login funcitonality with correct credentials",
  "description": "",
  "id": "i-want-to-test-pgs-login-functionality;test-pgs-login-funcitonality-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "chrome browser and application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "correct username and password is entered",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "PGS_Smoke_Test.chrome_browser_and_application()"
});
formatter.result({
  "duration": 3349962630,
  "status": "passed"
});
formatter.match({
  "location": "PGS_Smoke_Test.correct_username_and_password_is_entered()"
});
formatter.result({
  "duration": 599787137,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"txtLoginName\"}\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 596 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027ishwars-msd1\u0027, ip: \u002710.60.62.60\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_20\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91), userDataDir\u003dC:\\Users\\ishwars\\AppData\\Local\\Temp\\scoped_dir9536_23379}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.181, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 889fdc87b231d3d135553edff5a747e0\n*** Element info: {Using\u003did, value\u003dtxtLoginName}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:408)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat stepDefination.PGS_Smoke_Test.correct_username_and_password_is_entered(PGS_Smoke_Test.java:26)\r\n\tat ✽.When correct username and password is entered(PGSLogin.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PGS_Smoke_Test.login_should_be_successful()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("PGSLogout.feature");
formatter.feature({
  "line": 1,
  "name": "I want to test PGS Logout Functionality",
  "description": "",
  "id": "i-want-to-test-pgs-logout-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test PGS Logout funcitonality",
  "description": "",
  "id": "i-want-to-test-pgs-logout-functionality;test-pgs-logout-funcitonality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "A valid user is logged-in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user should be able to logout successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});