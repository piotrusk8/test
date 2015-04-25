package pl.edu.agh.podyplomowe.oldunittests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import pl.edu.agh.podyplomowe.Photo;
import pl.edu.agh.podyplomowe.Trip;
import pl.edu.agh.podyplomowe.TripsManager;

public class TripsManagerTest {

	static final String TRIP_DESC = "To by³a wspania³a wycieczka do Egiptu. Pamiêtam j¹ jak dzisiaj. By³ Zenek i Jolka.";

	TripsManager tripsManager;
	Trip trip;
	Photo photo;

	@Before
	public void setUp() {
		tripsManager = new TripsManager();

		trip = new Trip("Szalony Egipt", TRIP_DESC);
		photo = new Photo();
		photo.setComment("Tutaj Zenek pozuje na tle Faraona");
	}

	@Test
	public void shouldNewTrip() {
		// When
		tripsManager.addTrip(trip);

		// Then
		assertEquals(1, tripsManager.getTrips().size());
	}
}
