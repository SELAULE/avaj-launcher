package simulator.vehicle;

import weather.Coordinates;
import weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

    WeatherTower weatherTower = new WeatherTower();

	public Helicopter (String _name, Coordinates coordinates) {
	    super(_name, coordinates);
	}



    @Override
	public void updateConditions() {

//	    if ()
	}
    @Override
	public void registerTower(WeatherTower weatherTower) {
		
	}
}