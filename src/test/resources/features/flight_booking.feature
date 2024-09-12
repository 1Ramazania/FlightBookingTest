Feature: Flight Booking

  Scenario: Search and book a flight
    Given I am on the flight booking site
    When I search for flights from "ANK" to "İST"
    And I select the first available flight
    And I book the flight
    Then I should see the booking confirmation

  Scenario: Cancel a flight booking
    Given I have a booked flight
    When I cancel the flight
    Then I should see the cancellation confirmation