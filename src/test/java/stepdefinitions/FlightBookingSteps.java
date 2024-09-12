package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightBookingSteps {

    @Given("I am on the flight booking site")
    public void i_am_on_the_flight_booking_site() {
        System.out.println("Navigating to flight booking site");
    }

    @When("I search for flights from {string} to {string}")
    public void i_search_for_flights(String from, String to) {
        System.out.println("Searching for flights from " + from + " to " + to);
    }

    @When("I select the first available flight")
    public void i_select_the_first_available_flight() {
        System.out.println("Selecting the first available flight");
    }

    @When("I book the flight")
    public void i_book_the_flight() {
        System.out.println("Booking the flight");
    }

    @Then("I should see the booking confirmation")
    public void i_should_see_the_booking_confirmation() {
        System.out.println("Booking confirmation is displayed");
    }

    @Given("I have a booked flight")
    public void i_have_a_booked_flight() {
        System.out.println("Assuming there is a booked flight");
    }

    @When("I cancel the flight")
    public void i_cancel_the_flight() {
        System.out.println("Cancelling the flight");
    }

}