package simulator.vehicle;// import coordinates.Coordinates;

import weather.Coordinates;
import weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {



    public JetPlane(String _name, Coordinates _coordinates) {
        super(_name, _coordinates);
    }
//	public void registerTower(WeatherTower weatherTower) {
//
//	}

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower WeatherTower) {

    }
}