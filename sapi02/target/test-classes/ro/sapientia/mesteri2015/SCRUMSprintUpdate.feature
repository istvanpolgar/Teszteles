Feature: Check if the scrum update works
	As Sapientia scrum tool user I want to be able to update a story

   Scenario: UpdateFirst
   Given I edit the scrum list's first story
   When I enter "updatefirstnew" in  the title textbox and I push the update button
   Then I should get result "updatefirstnew" in new stories list