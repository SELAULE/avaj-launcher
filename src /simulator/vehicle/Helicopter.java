// import coordinates.Coordinates;

public class Helicopter extends Aircraft implements Flyable {

    WeatherTower weatherTower = new WeatherTower();

	protected Helicopter (String _name, Coordinates coordinates) {
		super(_name, coordinates);
	}

	public void updateCondition() {

	}

	public void registerTower(weatherTower) {
		
	}
}