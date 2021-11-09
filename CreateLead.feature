Feature: leaftaps create lead functionality

Scenario: Test with positive credentials
When Click on CRMSFA link
Then My Home page should display
When Click on Contacts
Then Contacts page should display
When Click on Create Contacts
Then Create contacts page should display
Given Enter the first name
Given Enter the last name
Given Enter the Description
Given Enter the E-Mail Address
Given Select the State
When Click on Create Lead Button
Then View Lead page should be Opened
	
