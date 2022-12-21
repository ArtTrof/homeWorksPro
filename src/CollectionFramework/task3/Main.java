package CollectionFramework.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input 10 numbers (random)");
        for(int i =0;i<5;i++){
            numbers.add(Integer.valueOf(reader.readLine()));
        }
        int min = numbers.get(0);

        for(int i = 0;i<numbers.size();i++){
            if(min>numbers.get(i)){
                min=numbers.get(i);
            }
        }

        System.out.println("Min number = "+min);

    }
}
