Feature: Error messages on the login page 

@temp
Scenario: Invalid email
	Given the user is on the login page
	When the user tries to register an invalid email
	Then the system should display error message "Invalid email address."
	
	
Scenario: 	
	# blank email
	# existing email
	# how to search for a text in eclipse