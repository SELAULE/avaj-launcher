import coordinates.Coordinates;

public  abstract class Aircraft {
    protected long id;
    protected string name;
    protected Coordinates coordinates;
    private static long idCounter;

    protected Aircraft (String _name, Coordinates coordinates) {
        name = _name;
        id = idCounter;
        // coordinates = coordinates;
    }

    private long nextId() {
        return (idCounter++);
    }
    public static void main(String[] argv) {
        System.out.println("HI there dummie");
    }
}