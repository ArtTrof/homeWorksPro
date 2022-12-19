package CollectionFramework.task2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Input five words");
        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());
        ArrayList<String> list2 = doubleValues(list);
        for(String tmp:list2){
            System.out.println(tmp);
        }
    }
    public static ArrayList<String> doubleValues (ArrayList<String> list) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            list.add(x, list.get(y));
            x += 2;
            y += 2;
        }
        return list;
    }
}
