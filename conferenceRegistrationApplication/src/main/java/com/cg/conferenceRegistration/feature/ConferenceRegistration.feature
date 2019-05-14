Feature: Conference Registration
Scenario: Registration checking
Given user is registering
When the title of page is Conference Registration
Then user enters first name
Then user enters last name
Then user enters email
Then user enters contact number
Then user selects number of people
Then user enters name of the building and room number
Then user enters area name
Then user selects city
Then user selects state
Then user selects conference access
Then click on next
Then title of the page is Payment Details
Then user enters card holder name
Then user enters debit card number
Then user enters cvv number
Then user enters card expiration month
Then user enters card expiration year
Then click on make payment