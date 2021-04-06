Feature: Login 

Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://accounts.google.com/signin" 
	And User enters Email as "vanscacomuser@gmail.com" 
	And Click on Next
	And User enters Password as "Password@123"  
	And Click on Login 
	Then Page Title should contain "testerof2021@gmail.com - Gmail" 
	And Click on Compose button
	And User enters To "milan.padmashali@gmail.com"
	And User enters Subject "Hello World"
	And User enters messageBody "Hello World"
	And Click on Send
	And close browser 