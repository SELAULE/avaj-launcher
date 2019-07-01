package simulator;

import FileManagement.FileValidation;
import FileManagement.Reading;
import FileManagement.Writing;
import simulator.vehicle.*;
import simulator.vehicle.AircraftFactory;
import weather.WeatherTower;

import java.io.*;

public class simulator {
    public static void main (String[] args) {
        Reading files = new Reading();
        WeatherTower weatherTower = new WeatherTower();
        Writing write = new Writing("simulator.txt", true);
        try {
            String path = "/Volumes/DISK_IMG/aj/src /test.txt";

            String[] test = files.OpenFile(path);
//            System.out.println(test[1]);
            FileValidation f = new FileValidation();
            System.out.print(test);
            f.validate(test);

            int simulation = Integer.parseInt(test[0]);

            for (int i = 1; i < test.length; i++) {
//                write.WriteToFile();
                String[] check = test[i].split(" ");
                AircraftFactory.newAircraft(check[0], check[1],
                        Integer.parseInt(check[2]),
                        Integer.parseInt(check[3]),
                        Integer.parseInt(check[4])).registerTower(weatherTower);
            }
            for (int j = 0; j < simulation; j++) {
                weatherTower.changeWeather();
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '");
        }
        catch (NoClassDefFoundError ex) {
            System.out.println("Class Not Found: " + ex.toString());
        }

        catch(IOException ex) {
            System.out.println("Error reading file '");
        }
    }
}
