Feature: Test login functinality 
	
Scenario Outline: Clicking login with invalid credentials
	Given user entering the "https://opensource-demo.orangehrmlive.com/"
	When entering the "<username>" and "<password>"
	And clicked the login button
	Then Homepage should not be open
	
	
Examples:
	
 |username 	  | password |
 | Admin			| admin321 | 
 | admin			| admin123 | 
 | ADMIN			| ADMIN123 | 
 | admin 			| admin123 | 