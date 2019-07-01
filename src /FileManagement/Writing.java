package FileManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writing {
    private String path;
    private boolean append = false;

    public Writing(String path) {
        this.path = path;
    }

    public Writing(String path, boolean append_value) {
        this.path = path;
        this.append = append_value;
    }

    public void WriteToFile(String str) throws IOException {
        FileWriter write = new FileWriter(path, append);
        PrintWriter print_line = new PrintWriter(write);

        print_line.printf("%s" + "%n", str);

        print_line.close();
    }
}
