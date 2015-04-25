package pl.edu.agh.podyplomowe;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;	

public class TripZeroPhotosSteps {

	Trip trip;

    @When("^a new trip is created$")
    public void a_new_trip_is_created() throws Throwable {
    	trip = new Trip("name", "desc");
    }

    @Then("^it should have (\\d+) photos$")
    public void it_should_have_photos(int expectedNumberOfPhotos) throws Throwable {
        assertEquals("The number is incorrect", expectedNumberOfPhotos, trip.getPhotos().size());
    }
}
