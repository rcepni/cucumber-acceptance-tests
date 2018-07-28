Feature: Complete product information


Scenario: Product details
	Given the user is on the home page
	When the user selects "Printed Summer Dress" 
	Then product name should be "Printed Summer Dress"
	Then correct default count should be 1 
	
@temp
Scenario: Product details with map
	Given the user is on the home page
	When the user selects "Printed Summer Dress"
	Then the system should display the product information:
		|name	  |	Printed Summer Dress  |
		|count    |	1					  |
		|condition|	New					  |
		|size	  |	$28.98				  |
		|price    | 	S 				      |
		
		
		
		
		
		
		
		
		