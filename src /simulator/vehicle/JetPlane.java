package simulator.vehicle;


import weather.Coordinates;
import weather.WeatherProvider;
import weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {


    WeatherProvider weatherProvider = new WeatherProvider();
    WeatherTower weatherTower = new WeatherTower();


    public JetPlane(String _name, Coordinates _coordinates) {
        super(_name, _coordinates);
    }
//	public void registerTower(WeatherTower weatherTower) {
//
//	}

    @Override
    public void updateConditions() {

        if (weatherProvider.getCurrentWeather(coordinates) == "SUN") {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 10, coordinates.get_height() + 2);
            coordinates = newCoordinates;
            writeToFile("This is the list : " + weatherTower.getList());
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
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 7);
            coordinates = newCoordinates;
            writeToFile("We not in fucked England okay");
        }
    }

    @Override
    public void registerTower(WeatherTower WeatherTower) {
        if (coordinates.get_height() == 0) {
        }
    }
}