package CollectionFramework.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input txt (input 'end' to finish the program");

        while (true) {
            String str = in.readLine();
            if (str.equals("end")) {
                for (String tmp : arr) {
                    System.out.println(tmp);
                }
                break;
            } else
                arr.add(str);
        }
    }
}
