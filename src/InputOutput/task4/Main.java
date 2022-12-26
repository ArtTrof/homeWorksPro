package InputOutput.task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
    String txt = "some text for test to input to file task4.txt \n some more text for test 1 2 3 4.5 @!!!1";
    Path path = Path.of("F:\\Programming\\EssentialJavaTests\\HomeWorksJavaPro\\src\\task4.txt");
    Files.writeString(path,txt);
    String cont = Files.readString(path);
        System.out.println(cont);

    }
}
