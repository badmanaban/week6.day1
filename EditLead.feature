Feature: leaftaps edit lead functionality

Scenario: Test with positive credentials
When Click on CRMSFA link
Then My Home page should open
When Click on Leads
Then My Leads page should open
When Click on find_leads
Then find leads page should open
Given Enter the first_name
When Click on findleads
When click on the firstresult
Then view lead page should open
When click on edit button
Then opentaps page should open
Given Edit the company name
When Click on update button
Then View lead page should open
