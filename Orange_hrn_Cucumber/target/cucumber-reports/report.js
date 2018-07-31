$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/HrmLogin.feature");
formatter.feature({
  "line": 2,
  "name": "User should be Login",
  "description": "",
  "id": "user-should-be-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User should be log in with valid credential",
  "description": "",
  "id": "user-should-be-login;user-should-be-log-in-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should be navigate to dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 121920351,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enter_username_and_password()"
});
formatter.result({
  "duration": 595792,
  "error_message": "java.lang.NullPointerException\r\n\tat Utils.enterText(Utils.java:22)\r\n\tat LoginPage.enterLogInCredentials(LoginPage.java:15)\r\n\tat MyStepDefs.user_enter_username_and_password(MyStepDefs.java:25)\r\n\tat ✽.When user enter username and password(src/test/Resources/Features/HrmLogin.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepDefs.user_Click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_navigate_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
});