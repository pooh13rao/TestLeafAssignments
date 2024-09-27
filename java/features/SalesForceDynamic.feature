Feature: Create Account

Scenario Outline: Creating Multiple Accounts

Given Login to 'https://login.salesforce.com/'
When  Click on toggle menu button from the left corner
Then  Click view All and click Sales from App Launcher
And Click on Accounts tab 
And Click on New button
Then Enter as account name <Name>
And  Select Ownership as Public 
Then Click save and verify Account name 

Examples:
|Name|
|Pooja H|
|Pooja Rao|
|Pooja R|