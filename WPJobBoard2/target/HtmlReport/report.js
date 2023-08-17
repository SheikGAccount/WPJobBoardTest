$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature2/Login2.feature");
formatter.feature({
  "name": "WP Job Board Application Login Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify if User able to Login to WP Job Board Application using valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition2.launch_the_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters \"user\" and \"user\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.user_Enters_Username_and_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.user_Clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User able to go to Home Page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.user_able_to_go_to_Home_Page_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});