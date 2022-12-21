package CollectionFramework.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        map.put("Andrew","Ukraine");
        map.put("Liza","Poland");
        map.put("Maria","Italy");
        map.put("James","America");
        map.put("Goku","Japan");
        System.out.println("Input name : ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String key = in.readLine();

        System.out.println("Country : "+map.get(key)+" name: "+key );

    }
}
