package pl.edu.agh.podyplomowe;

import java.util.ArrayList;
import java.util.List;

public class TripsManager {
	
	List<Trip> trips = new ArrayList<Trip>();
	
	public void addTrip(Trip trip) {
		trips.add(trip);
	}
	
	public List<Trip> getTrips() {
		return trips;
	}

}
