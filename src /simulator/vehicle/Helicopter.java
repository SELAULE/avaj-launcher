package simulator.vehicle;

import weather.Coordinates;
import weather.WeatherProvider;
import weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

    WeatherTower weatherTower = new WeatherTower();
    WeatherProvider weatherProvider;


    public Helicopter (String _name, Coordinates coordinates) {
	    super(_name, coordinates);
	}



    @Override
	public void updateConditions() {

	    if (weatherProvider.getCurrentWeather(coordinates) == "SUN") {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 10, coordinates.get_height() + 2);
            coordinates = newCoordinates;
            writeToFile("Shit is hot there's nothing more to cool it down");
        }
        else if (weatherProvider.getCurrentWeather(coordinates) == "RAIN" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 5, coordinates.get_height());
            coordinates = newCoordinates;
            writeToFile("I like the smell of the soil on a rainy better land this real quick");
        }

        else if (weatherProvider.getCurrentWeather(coordinates) == "FOG" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 1, coordinates.get_height());
            coordinates = newCoordinates;
            writeToFile("What kind of a shitty weather is a FOG");
        }

        else if (weatherProvider.getCurrentWeather(coordinates) == "SNOW" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 12);
            coordinates = newCoordinates;
            writeToFile("We not in fucked England okay");
        }

        if (coordinates.get_height() <= 0) {
            weatherTower.unregister(this);
        }
	}

    @Override
	public void registerTower(WeatherTower weatherTower) {
        weatherTower.register(this);
        writeToFile(this.name + "Shit is registered");
	}
}