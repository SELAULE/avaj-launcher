package FileManagement;

import simulator.vehicle.Flyable;

import java.util.ArrayList;
import java.lang.String;
public class FileValidation {

    public void validate() {
        ArrayList<Flyable> observers = new ArrayList<Flyable>();

        for (int n = 1; n < observers.size(); n++) {
            String[] check = observers.get(n).split(" ");

            if ((check[1].charAt(0) != check[0].charAt(0)) || check[1].length() < 2) {
                System.out.println("Error on line " + (n + 1) + ": Invalid aircraft name");
                System.exit(1);
            }
            if (check.length != 5) {
                System.out.println("Error on line " + (n + 1) + ": Insufficient values");
                System.exit(1);
            }
            if (!check[2].matches("-?\\d+?")) {
                System.out.println("Error on line " + (n + 1) + ": longitude value has to be a number");
                System.exit(1);
            }
            if (!check[3].matches("-?\\d+?")) {
                System.out.println("Error on line " + (n + 1) + ": latitude value has to be a number");
                System.exit(1);
            }
            if (!check[4].matches("-?\\d+?")) {
                System.out.println("Error on line " + (n + 1) + ": Height value has to be a number");
                System.exit(1);
            }
        }
    }
}
