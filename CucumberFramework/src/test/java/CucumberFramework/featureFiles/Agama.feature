Feature: Send a message

Scenario Outline: Login to account with credentials
	Given user navigates to "http://agamaamerica.com/index.html"
	And user navigates to the "contact us" page 
	And user enters name as "sunina Rajak"
	And user enter email as "rajaksunina4@gmail.com"
	And user enter the "How do I sign up?" message
	When user sends the message as "How are you doing?"
	Then the user should see a message "title"
	
		
	Examples:
	| 	url 							| 		username 		|		 password		 |title			|
	|http://www.facebook.com/			|	anticbaby@gmail.com	|		qaclass123		 | Facebook - Log In or Sign Up|
	
