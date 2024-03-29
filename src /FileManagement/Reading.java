package FileManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading {

    public String[] OpenFile(String path) throws IOException {

        FileReader file = new FileReader(path);
        BufferedReader filereader = new BufferedReader(file);

        int numberOfLines = readLines(path);
        String[] fileData = new String[numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {
            fileData[i] = filereader.readLine();
        }
        filereader.close();
        return fileData;
    }

    int     readLines(String path) throws IOException {
        FileReader fileToRead = new FileReader(path);
        BufferedReader bufReader = new BufferedReader(fileToRead);

        String aline;

        int numberOfLines = 0;

        while (( aline = bufReader.readLine() ) != null) {
            numberOfLines++;
        }
        return numberOfLines;
    }


}
