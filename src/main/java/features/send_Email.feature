#Author: Manirathnam
#Keywords Summary :
#Feature: Composing and sending an email through Gmail


Feature: Send an email using Gmail
  User wants to compose an email and send it through Gmail

	Scenario: Compose an Email in Gmail
		Given user logged into Gmail account
		When user clicks on the compose button
		Then user validates the Compose window is opened
		
	Scenario: Enter the Email details
		Given user logged into Gmail account
		And user opens the compose email window
		When user enters "Incubyte" in the Subject
		And user enters "Automation QA test for Incubyte" in the email body
		Then user validates the email details are entered correctly

	Scenario: Send an email to receipients
		Given user logged into to Gmail account 
		And user enters the email details on compose email window
		When user enters the receipients details
		And user clicks on the send button
		Then the email is sent to the receipient
		
	Scenario: Verify Email is sent
		Given user is logged into Gmail account
		And user sends the email with proper email details
		When user navigates to sent email
		Then user verifies the email is available in sent folder

