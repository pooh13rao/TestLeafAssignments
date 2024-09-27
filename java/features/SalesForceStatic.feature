Feature: : Passing data from a feature file


Scenario: Updating the SalesForce Account



Given Login to SalesForce url
When Click the App Launcher Icon next to Setup
Then Select Accounts
And Search for the account using your unique account name.
Then Click the dropdown icon next to the account and select Edit.
Then  Set Type to Technology Partner.
And  Set Industry to Healthcare.
When Enter the Billing Address 'Pune, 411057'.
And Enter the Shipping Address 'Chennai'.
Then Set Customer Priority to Low.
And  Set SLA to Silver.
And  Set Active to NO.
Then Enter Phone No '+91 9876543210'.
Then Set Upsell Opportunity to No.
When Click Save and verify the phone number.
