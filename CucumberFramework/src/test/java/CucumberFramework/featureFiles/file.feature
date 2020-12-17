Feature: Send the message

Scenario Outline: heads to the contact us page
	Given user open to "http://agamaamerica.com/index.html"
		When user clicks on  Contact US page
	And user enters your name as "Sunita"
	And user enter  your email as "Sunita7141@gmail.com"
	When user enter message as  "Thank you Paribartan ji for helping me to learn QA course and figure out the problem "
	And user send the message

	
	Examples:
	| 	url 							| 		username 		|		 password		 |title			|
	|http://www.facebook.com	|	anticbaby@gmail.com	|		qaclass123		 | Facebook - Log In or Sign Up|
	
	