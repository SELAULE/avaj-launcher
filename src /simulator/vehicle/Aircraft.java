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

    public void writeToFile(String str) {

        // read the content from file
        try(FileReader fileReader = new FileReader("source.txt")) {
            int ch = fileReader.read();
            while(ch != -1) {
                ch = fileReader.read();
            }
        }

        catch (FileNotFoundException e) {
            System.out.print("File Not Found");
        }

        catch (IOException e) {
            System.out.println("An error happened");
        }

        try(FileWriter fileWriter = new FileWriter("src/simulation.txt")) {
            String fileContent = str;
            fileWriter.write(fileContent);
        } catch (IOException e) {
            System.out.println("Fail to write");
        } catch (Exception e) {
            System.out.println("There's nothing I can do ");
        }

    }
}