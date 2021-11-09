Feature: leaftaps duplicate lead functionality

Scenario: Test with positive credentials
When Click on CRMSFA link
Then My Home page should get open
When Click on Leads button
Then My Leads page should get open
When Clicking on find_leads
Then find leads page should get open
Given Enter the firstname
When Click on findleads button
When click on firstresult
Then view lead page should get open
When Click on Duplicate lead
Then Duplicate lead page should open
When Click on create lead button
Then View lead page should get open
