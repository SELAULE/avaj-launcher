package simulator.vehicle;

import FileManagement.Writing;
import weather.Coordinates;
import weather.WeatherProvider;
import weather.WeatherTower;
import java.io.IOException;
import java.lang.*;
public class Baloon extends Aircraft implements Flyable {
	// Coordinates coordinates = new Coordinates();
    WeatherTower weatherTower;// = new WeatherTower();
    WeatherProvider weatherProvider;




    public Baloon(String _name, Coordinates coordinates) {
		super(_name, coordinates);
	}

	@Override
	public void updateConditions() {
        Writing write = new Writing("simulator.txt", true);

        String newWeather = weatherTower.getWeather(this.coordinates);

        if (newWeather == "SUN") {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude() + 2, coordinates.get_latitude(), coordinates.get_height() + 4);
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "Baloon#" + this.name + "(" + this.id + ")" + "Shit is hot there's nothing more to cool it down");
            }catch(IOException ex) {
                System.out.println("Error reading file '");
            }
        }
        else if (newWeather == "RAIN" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 5);
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "Baloon#" + this.name + "(" + this.id + ")" + "I like the smell of the soil on a rainy better land this real quick");
            }catch(IOException ex) {
                System.out.println("Error reading file '");
            }

        }

        else if (newWeather == "FOG" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 3);
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "Baloon#" + this.name + "(" + this.id + ")" + "What kind of a shitty weather is a FOG");
            }catch(IOException ex) {
                System.out.println("Error reading file '");
            }

        }

        else if (newWeather == "SNOW" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 15);
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "Baloon#" + this.name + "(" + this.id + ")" + "We not in fucked England okay");
            }catch(IOException ex) {
                System.out.println("Error reading file '");
            }
        }

        if (coordinates.get_height() <= 0) {
            this.weatherTower.unregister(this);
            try {
                write.WriteToFile( "Tower says: Baloon#" + this.name + "(" + this.id + ")" + " unregistered to weather tower.");
            }catch (IOException ex) {
                System.out.print("Error Writing  to a file");
            }
        }
	}

	@Override
	public void registerTower(WeatherTower weatherTower) {
        Writing write = new Writing("simulator.txt", true);
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        try {
            write.WriteToFile( "Tower says: Baloon#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
        }catch(IOException ex) {
            System.out.println("Error reading file '");
        }

	}
}