$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Eclipse_Final/New/Cucumber/src/test/java/com/featurefilefinal/final.feature");
formatter.feature({
  "name": "Facebook login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Accessing the facebook page by providing the valid username and credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launches the application url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionFinal.user_launches_the_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provides the valid username",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFinal.user_provides_the_valid_username()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d131.0.6778.205)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-R46TOBS\u0027, ip: \u0027192.168.29.88\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 131.0.6778.205, chrome: {chromedriverVersion: 131.0.6778.204 (52183f9e99a..., userDataDir: C:\\Users\\Intel\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:53112}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 4d183ac37d4039ab0ae5f5d4a50aaf96\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat com.stepdefinitionfinal.StepDefinitionFinal.user_provides_the_valid_username(StepDefinitionFinal.java:24)\r\n\tat ✽.user provides the valid username(file:/C:/Eclipse_Final/New/Cucumber/src/test/java/com/featurefilefinal/final.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user provides the valid password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionFinal.user_provides_the_valid_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionFinal.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
});