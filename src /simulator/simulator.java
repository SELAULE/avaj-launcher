package simulator;

import FileManagement.Reading;

import java.io.*;

public class simulator {
    public static void main (String[] args) {
        Reading files = new Reading();

        try {
//            FileReader fileReader = new FileReader(args[0]);
//
//            String line = null;
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            bufferedReader.close();
            files.OpenFile(args[0]);
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + args[0] + "'");
        }

        catch(IOException ex) {
            System.out.println("Error reading file '" + args[0] + "'");
        }
    }
}
