package simulator;

import java.io.IOException;
import java.util.ArrayList;
import simulator.vehicle.Flyable;
import simulator.vehicle.*;



public abstract class Tower {

    ArrayList<Flyable> observers = new ArrayList<Flyable>();
//    JetPlane jet = new JetPlane( , coordinates);

    public void register(Flyable flyable) {
        observers.add(flyable);
//        writeToFile("We have a new lad on board");
    }

	public void unregister(Flyable flyable) {
        observers.remove(flyable);
//        writeToFile("Weak lad can't fly for too long");
    }

	protected void conditionChanged() {
        for (int i = 0; i < observers.size(); i++)
        {
            observers.get(i).updateConditions();
        }
	}

    public ArrayList<Flyable> getList() {
        return observers;
    }
}