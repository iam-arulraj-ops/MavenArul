Feature: Testing the Facebook Application 

Scenario Outline: Testing the Facebook Login Functionality 

	Given launching the facebook application url 
	When user enters the "<username>" 
	And user passes the "<password>" 
	Then user clicks the login button 

Examples:

|username| password|
|arulraj456@gmail.com| arulthecommando|
|cyril123@gmail.com| cyrilthemanofmass|
|amali987@gmail.com|amalithegreat|
|sahayarajan5466@gmail.com|sahayarajanthefire|