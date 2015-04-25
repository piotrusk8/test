package pl.edu.agh.podyplomowe;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;	

public class TripAddPhotoSteps {

	Trip trip;

	@Given("^a trip with a name \"([^\"]*)\" and description \"([^\"]*)\" exists$")
    public void the_following_trip(String name, String desc) throws Throwable {
        trip = new Trip(name, desc);
    }

    @When("^a photo with comment \"([^\"]*)\" is added$")
    public void a_photo_is_added(String comment) throws Throwable {
    	Photo photo = new Photo();
    	photo.setComment(comment);
    	trip.addPhoto(photo);
    	
    }

    @Then("^the total number of photos should be (\\d+)$")
    public void the_number_of_photos_should_be_(int expectedNumberOfPhotos) throws Throwable {
        assertEquals("The number is incorrect", expectedNumberOfPhotos, trip.getPhotos().size());
    }
}
