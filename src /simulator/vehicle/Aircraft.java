package simulator.vehicle;


import weather.Coordinates;

public  abstract class Aircraft {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    protected Aircraft (String _name, Coordinates _coordinates) {
        name = _name;
        id = idCounter;
         coordinates = _coordinates;
    }

    private long nextId() {
        return (idCounter++);
    }
    public static void main(String[] argv) {
        System.out.println("HI there dummie");
    }
}