Feature: Edit Account

@RunSecond
Scenario Outline: To Edit the created accounts

Given Login to Leaftaps site
When Enter Valid Username & Password
And Submit the login
Then Click on CRM_SFA link 
When Click Account tab
When Click on Find accounts
Then Enter the desired account name <Name>
And Click on Find Accounts button
Then select the respective account <Result Name>
And click Edit
Then Enter the Annual Revenue value as <Value>
And click Save

Examples:
|Name|Result Name|Value|
|Pooja|Pooja|10000|
|Pooja Testing|Pooja Testing|20000|