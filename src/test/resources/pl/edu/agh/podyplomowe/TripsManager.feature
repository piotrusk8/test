Feature: Managing trip photos

Scenario: New trip has no photos
When a new trip is created
Then it should have 0 photos
 
Scenario: Adding photo to a trip
Given a trip with a name "Egipt" and description "Super wycieczka" exists
When a photo with comment "Komentarz" is added
Then the total number of photos should be 1

Scenario: Adding 2 photos to a trip
Given a trip with a name "Egipt" and description "Super wycieczka" exists
When a photo with comment "Komentarz" is added
When a photo with comment "Komentarz2" is added
Then the total number of photos should be 2
