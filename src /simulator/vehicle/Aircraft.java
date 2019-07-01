package simulator.vehicle;


import weather.Coordinates;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public  abstract class Aircraft {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    public Aircraft (String _name, Coordinates _coordinates) {
        name = _name;
        id = nextId();
        coordinates = _coordinates;
    }

    private long nextId() {
        return (idCounter++);
    }
}