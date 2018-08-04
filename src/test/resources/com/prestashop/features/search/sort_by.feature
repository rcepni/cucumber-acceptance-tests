Feature: Sorting options on the seach result page

@temp
Scenario: Sort by
	Given the user is on the home page
	And the user clicks on link Dresses
	When user sorts by "Price: Lowest first"
	Then following product should be displayed on top
	|name |Printed Chiffon Dress|
	|price| $16.40              |
	
	