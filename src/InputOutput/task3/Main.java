package InputOutput.task3;

public class Main {
    public static void main(String[] args) {
        String str = "the origins of the name Java are not clear. One possibility is that the island was named after the jáwa-wut plant, which was said to be common in the island during the time, and that prior to Indianization the island had different names.";

        do {
            System.out.println(str.substring(0,(str.indexOf(".")+1)));
            str = str.substring((str.indexOf(".")+ 1),str.length());
            str = str.trim();
        }while (str.indexOf(".") != -1);
    }
}
