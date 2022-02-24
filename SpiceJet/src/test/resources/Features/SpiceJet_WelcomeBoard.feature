Feature: Feature to test spice jet welcome board

#Scenario: validate spiceJet welcome board
#
#Given user is on spiceJet welcome board page
#When user select "DEL" and "BLR" cities
#And user select "20-March-2022" from calender
#And user click on search flight
#Then user nevigate to flights page


Scenario Outline: validate spiceJet welcome board

Given user is on spiceJet welcome board page
When user select "<City1>" and "<City2>" cities
And user select "<Date>" from calender
And user click on search flight
Then user nevigate to flights page

Examples:
| City1 | City2           | Date              |
| Delhi | Goa             | 18-May-2022       |
| Goa   | Chandigarh      | 25-September-2022 |