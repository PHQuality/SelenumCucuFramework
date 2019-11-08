$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/himaliabeykoon/eclipse-workspace2/HimaliSampleBDDFramework/src/test/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Login to the PL site",
  "description": "",
  "id": "testing-login-to-the-pl-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing login to the bbc site",
  "description": "",
  "id": "testing-login-to-the-pl-site;testing-login-to-the-bbc-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter user deatils and clicks Sign-in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is logged in to the system",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_home_page()"
});
formatter.result({
  "duration": 5845029597,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_Sign_in()"
});
formatter.result({
  "duration": 1160249296,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_user_deatils_and_clicks_Sign_in_button()"
});
formatter.result({
  "duration": 3527539896,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_logged_in_to_the_system()"
});
formatter.result({
  "duration": 80074854,
  "status": "passed"
});
});