Feature: Facebook website page 

Scenario Outline: Login page 

	Given user launches the application url 
	When user enters the "<username>" 
	And user gives the "<password>" credentials 
	And user clicks the login button 
	
	
	Examples: 
	
		|username||password|
		|arulraj123$gmail.com||arul123|
		|cyril123$gmail.com|| cyril123|
		|sahayarajan67$gmail.com||sahayam67|
		|amali73$gmail.com||amali123|