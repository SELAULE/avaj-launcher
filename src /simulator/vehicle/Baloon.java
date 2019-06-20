package simulator.vehicle;

import simulator.vehicle.Aircraft;
import simulator.vehicle.Flyable;
import weather.Coordinates;
import weather.WeatherProvider;
import weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
	// Coordinates coordinates = new Coordinates();
    WeatherTower weatherTower = new WeatherTower();
    WeatherProvider weatherProvider = new WeatherProvider();


    public Baloon(String _name, Coordinates coordinates) {
		super(_name, coordinates);
	}

	@Override
	public void updateConditions() {

        if (weatherProvider.getCurrentWeather(coordinates) == "SUN") {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude() + 2, coordinates.get_latitude(), coordinates.get_height() + 4);
            coordinates = newCoordinates;
            writeToFile("Shit is hot there's nothing more to cool it down");
        }
        else if (weatherProvider.getCurrentWeather(coordinates) == "RAIN" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 5);
            coordinates = newCoordinates;
            writeToFile("I like the smell of the soil on a rainy better land this real quick");
        }

        else if (weatherProvider.getCurrentWeather(coordinates) == "FOG" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 3);
            coordinates = newCoordinates;
            writeToFile("What kind of a shitty weather is a FOG");
        }

        else if (weatherProvider.getCurrentWeather(coordinates) == "SNOW" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 15);
            coordinates = newCoordinates;
            writeToFile("We not in fucked England okay");
        }

	}

	@Override
	public void registerTower(WeatherTower WeatherTower) {

	}
}