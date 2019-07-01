package simulator.vehicle;


import FileManagement.Writing;
import weather.Coordinates;
import weather.WeatherProvider;
import weather.WeatherTower;

import java.io.IOException;

public class JetPlane extends Aircraft implements Flyable {
    WeatherProvider weatherProvider;
    WeatherTower weatherTower;// = new WeatherTower();
    Writing write = new Writing("simulator.txt", true);


    public JetPlane(String _name, Coordinates _coordinates) {
        super(_name, _coordinates);
    }
//	public void registerTower(WeatherTower weatherTower) {
//
//	}

    @Override
    public void updateConditions() {

        String newWeather = weatherTower.getWeather(coordinates);

         if (newWeather == "SUN") {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 10, coordinates.get_height() + 2);
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "JetPlane#" + this.name + "(" + this.id + ")" + "What kind of a shitty weather is a FOG");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }
        }
        else if (newWeather == "RAIN" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 5, coordinates.get_height());
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "JetPlane#" + this.name + "(" + this.id + ")" + "I like the smell of the soil on a rainy better land this real quick");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }

        }

        else if (newWeather == "FOG" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude() + 1, coordinates.get_height());
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "JetPlane#" + this.name + "(" + this.id + ")" + "What kind of a shitty weather is a FOG");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }

        }

        else if (newWeather == "SNOW" ) {
            Coordinates newCoordinates = new Coordinates(coordinates.get_longitude(), coordinates.get_latitude(), coordinates.get_height() - 7);
            coordinates = newCoordinates;
            try {
                write.WriteToFile( "JetPlane#" + this.name + "(" + this.id + ")" + "We not in fucked England okay");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }
        }

        if (coordinates.get_height() <= 0) {
            this.weatherTower.unregister(this);
            try {
                write.WriteToFile( "Tower  says: JetPlane#" + this.name + "(" + this.id + ")" + " unregistered to weather tower.");
            }catch (IOException ex) {
                System.out.print("Error Writing to a file");
            }
        }

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;

        this.weatherTower.register(this);

        try {
            write.WriteToFile( "Tower says: JetPlane#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
        }catch (IOException ex) {
            System.out.print("Error Writing to a file");
        }

    }
}