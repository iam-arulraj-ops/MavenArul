$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Eclipse_Final/Cucumber_02_11_2023/src/test/java/com/feature/Cucumber.feature");
formatter.feature({
  "name": "User Account page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User successfully enters login page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters facebook login",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_facebook_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters to \"username\" and \"password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_to_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_logins()"
});
formatter.result({
  "status": "passed"
});
});