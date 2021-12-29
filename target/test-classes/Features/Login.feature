Feature: orangeHRM login page 

Scenario: Chicking login is successfull with valid credentials
	Given user entering the "https://opensource-demo.orangehrmlive.com/"
	When entering the "Admin" and "admin123"
	And clicked the login button
	Then home page should be visible