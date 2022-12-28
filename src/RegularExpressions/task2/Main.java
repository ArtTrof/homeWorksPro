package RegularExpressions.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher("Forever Java will be in my mind because Java is in my head so Java is in me.I love Java.");
        System.out.println(matcher.replaceAll("Java"));
    }

}
