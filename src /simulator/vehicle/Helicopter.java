package simulator.vehicle;

import FileManagement.Writing;
import weather.Coordinates;
import weather.WeatherProvider;
import weather.WeatherTower;

import java.io.IOException;

public class Helicopter extends Aircraft implements Flyable {

    WeatherTower weatherTower;
    WeatherProvider weatherProvider;
    Writing write = new Writing("simulator.txt", true);


    public Helicopter (String _name, Coordinates coordinates) {
	    super(_name, coordinates);
	}



    @Override
	public void updateConditions() {

        String newWeather = weatherTower.getWeather(this.coordinates);

        if (newWeather == "SUN") {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 10, coordinates.get_height() + 2);
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "Helicopter#" + this.name + "(" + this.id + ")" + "Shit is hot there's nothing more to cool it down");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }
        }
        else if (newWeather == "RAIN" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 5, coordinates.get_height());
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "Helicopter#" + this.name + "(" + this.id + ")" + "I like the smell of the soil on a rainy better land this real quick");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }
        }

        else if (newWeather == "FOG" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 1, coordinates.get_height());
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "Helicopter#" + this.name + "(" + this.id + ")" + "What kind of a shitty weather is a FOG");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }
        }

        else if (newWeather == "SNOW" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 12);
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "Helicopter#" + this.name + "(" + this.id + ")" + "We not in fucked England okay");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }
        }

        if (coordinates.get_height() <= 0) {
            this.weatherTower.unregister(this);
            try {
                write.WriteToFile( "Tower says: Helicopter#" + this.name + "(" + this.id + ")" + " unregistered to weather tower.");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }
        }
	}

    @Override
	public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        try {
            write.WriteToFile( "Tower says: Helicopter#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
        }catch (IOException ex) {
            System.out.print("Error Writing to a file");
        }
	}
}