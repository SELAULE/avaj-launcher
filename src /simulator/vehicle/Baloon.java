package simulator.vehicle;

import simulator.vehicle.Aircraft;
import simulator.vehicle.Flyable;
import weather.Coordinates;
import weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
	// Coordinates coordinates = new Coordinates();
    WeatherTower weatherTower = new WeatherTower();


    public Baloon(String _name, Coordinates coordinates) {
		super(_name, coordinates);
	}

	@Override
	public void updateConditions() {
        
	}

	@Override
	public void registerTower(WeatherTower WeatherTower) {
		
	}
}