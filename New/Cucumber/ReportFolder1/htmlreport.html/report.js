$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Eclipse_Final/New/Cucumber/src/test/java/com/featurefile/Cucumber1.feature");
formatter.feature({
  "name": "Facebook login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating the login page with valid username and credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launches the application url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the \"arulraj123\" in the username field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_in_the_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gives the \"commando123456789\" as the valid password in the field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_gives_the_as_the_valid_password_in_the_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
});