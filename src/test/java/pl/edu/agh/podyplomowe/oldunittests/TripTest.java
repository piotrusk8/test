package pl.edu.agh.podyplomowe.oldunittests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import pl.edu.agh.podyplomowe.Photo;
import pl.edu.agh.podyplomowe.Trip;

public class TripTest {

	static final String TRIP_DESC = "To by³a wspania³a wycieczka do Egiptu. Pamiêtam j¹ jak dzisiaj. By³ Zenek i Jolka.";
	Trip trip;
	Photo photo;

	@Before
	public void setUp() {
		trip = new Trip("Szalony Egipt", TRIP_DESC);
		photo = new Photo();
		photo.setComment("Tutaj Zenek pozuje na tle Faraona");
	}

	@Test
	public void shouldConstructorSetNameAndDescription() {
		// Then
		assertEquals("Szalony Egipt", trip.getName());
		assertEquals(TRIP_DESC, trip.getDescription());
	}

	@Test
	public void shouldDefaultCommentBeEmptyString() {
		// Then
		assertEquals(new ArrayList<Photo>(), trip.getPhotos());
	}

	@Test
	public void shouldAddNewPhoto() {
		// When
		trip.addPhoto(photo);

		// Then
		assertEquals(1, trip.getPhotos().size());
		assertEquals(photo, trip.getPhotos().get(0));
	}

	@Test
	public void shouldNotAllowSamePhotoTwice() {
		// Given
		trip.addPhoto(photo);

		// When
		trip.addPhoto(photo);

		// Then
		assertEquals(1, trip.getPhotos().size());
		assertEquals(photo, trip.getPhotos().get(0));
	}
}
