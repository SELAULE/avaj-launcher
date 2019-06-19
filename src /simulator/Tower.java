package simulator;

import java.util.ArrayList;
import simulator.vehicle.Flyable;
//import java.io.*;


public abstract class Tower {

    ArrayList<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
        System.out.println("Initial Stack: " + observers);
	}

	public void unregister(Flyable flyable) {
        observers.remove(flyable);
        System.out.println("Initial Stack: " + observers);
	}

	protected void conditionChanged() {
        for (int i = 0; i < observers.size(); i++)
        {
            observers.get(i).updateConditions();
        }
	}
}