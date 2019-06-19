package simulator.vehicle;

//import vehicle.*;
import weather.*;

public abstract class AircraftFactory {

	public Flyable	newAircraft(String type, String name, int longitude, int latitude, int height) {

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
//                Baloon aircraft = new Baloon(name, coordinates);
                return null;
//                break;
        }
//		return flyable;
	}

//	public void main(String[] args) {
//	    try {
//            AircraftFactory craft = new AircraftFactory();
//            craft.newAircraft("Baloon", "b4", 34, 35, 2);
//        } catch (Exception e) {
//	        System.out.println("This is not working ");
//        }
//	}
}