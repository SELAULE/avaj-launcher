package simulator.vehicle;

//import vehicle.*;
import Exeptions.CanNotBeNegative;
import weather.*;

public abstract class AircraftFactory {

	public Flyable	newAircraft(String type, String name, int longitude, int latitude, int height) {

		Coordinates coordinates = new Coordinates(longitude, latitude, height);

		if (coordinates.get_latitude() < 0 || coordinates.get_longitude() < 0) {
		    throw new CanNotBeNegative("Latitude or Longitude can not be negative ", errmes);
        }

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