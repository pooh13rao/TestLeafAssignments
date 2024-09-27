Feature: Delete Account


@RunThird
Scenario Outline: To Delete the created accounts

Given Login to Leaftaps site
When Enter Valid Username & Password
And Submit the login
Then Click on CRM_SFA link 
When Click Account tab
When Click on Find accounts
Then Enter the desired account name <Name>
And Click on Find Accounts button
Then select the respective account <Result Name>
And Click Deactive button
Then Accept the popUp
And Verify the Deactived Message

Examples:
|Name|Result Name|
|Pooja|Pooja|
|Pooja Testing|Pooja Testing|