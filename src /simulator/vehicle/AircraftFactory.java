import vehicle.*;
import Coordinates.*;

public abstract class AircraftFactory {

	public Flyable	newAircraft(String type, String name, int longitude, int latitude, int height) {

		Coordinates coordinates = new coordinates(longitude, latitude, height);

		switch (type) {
            case "Baloon":
                Baloon baloon = new Baloon(name, coordinates);
                System.out.println("This is the new Object : " + baloon);
                return baloon;
                break;

            case "Helicopter":
                Helicopter helicopter = new Helicopter(name, coordinates);
                System.out.println("This is the new Object : " + helicopter);
                return helicopter;
                break;

            case "JetPlane":
                JetPlane jetPlane = new JetPlane(name, coordinates);
                System.out.println("This is the new Object : " + jetPlane);
                return JetPlane;
        }
//		return flyable;
	}

	public void main(String[] args) {
	    try {
            AircraftFactory craft = new AircraftFactory();
            craft.newAircraft("Baloon", "b4", 34, 35, 2);
        } catch (Exception e) {
	        System.out.println("This is not working ");
        }
	}
}