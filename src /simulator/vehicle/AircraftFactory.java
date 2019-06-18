public abstract class AircraftFactory {

	public Flyable	newAircraft(String type, String name, int longitude, int latitude, int height) {

		Coordinates Coordinates = new coordinates(longitude, latitude, height);
		return flyable;
	}
}