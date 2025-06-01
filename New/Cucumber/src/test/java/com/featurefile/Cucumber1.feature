Feature: Facebook login page 

Scenario: Validating the login page with valid username and credentials 

	Given user launches the application url 
	When user enters the "arulraj123" in the username field 
	And user gives the "commando123456789" as the valid password in the field 
	And user clicks the login button 
