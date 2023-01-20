package Lambda.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);

        int square = list.stream().
                map(i -> i * i).
                reduce((i, y) -> i + y).get();
        System.out.println(square);

    }
}
