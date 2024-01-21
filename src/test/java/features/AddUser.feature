Feature: Add user API Validations 


Scenario: Add user and verify response is as expected
	Given Add user details 
	When user calls POST User API 
	Then the API call is successfull and response is OK 
	
	