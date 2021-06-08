Feature: Valid Registration Application feature

Scenario Outline: User Registration Scenario
		Given User is on Application Home Page 
		When Application Page Title is Basic Contact Form - myContactForm.com
		Then user enters "<name>" and "<email>"
		Then user enters message
		And user clicks on submit button
		When User navigate to confirmation page
		Then close the browser
			
		
    Examples: 
      | name | email |
      | vinay | rocky@gmail.com  |
