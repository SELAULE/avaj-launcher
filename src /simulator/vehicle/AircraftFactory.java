package simulator.vehicle;

//import vehicle.*;
import weather.*;

public abstract class AircraftFactory {

	public static Flyable	newAircraft(String type, String name, int longitude, int latitude, int height) {

		Coordinates coordinates = new Coordinates(longitude, latitude, height);

		switch (type) {
            case "Baloon":
                Baloon baloon = new Baloon(name, coordinates);
                return baloon;
//                break;

            case "Helicopter":
                Helicopter helicopter = new Helicopter(name, coordinates);
                return helicopter;
//                break;

            case "JetPlane":
                JetPlane jetPlane = new JetPlane(name, coordinates);
                return jetPlane;
//                break;
            default:
                return null;
//                break;
        }
	}
}