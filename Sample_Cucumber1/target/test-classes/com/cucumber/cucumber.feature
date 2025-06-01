Feature: logging into Facebook page

Scenario: testing whether it is Log in or out

Given launching the application url
When entering the details in username field
Then user enters the details in password field
And user clicks on login button
And user closes the browser