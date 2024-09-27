Feature: Create Account in leaftaps.com



@RunFirst
Scenario Outline: To create multiple accounts in leaftaps.com
Given Login to Leaftaps site
When Enter Valid Username & Password
And Submit the login
Then Click on CRM_SFA link 
When Click Account tab
Then Click Create Account
Then Enter Account Name as <Name>
And Add a short Description as <Description>
And Click on CreateAccount  

Examples:
|Name|Description|
|Pooja|This is Pooja.|
|Pooja Testing|This Account is for Training.|