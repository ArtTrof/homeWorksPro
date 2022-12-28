package RegularExpressions.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a date and time in the format YYYY-MM-DD HH:MM:SS: ");
        System.out.println();
        String inputDateTime = in.readLine();
        findDiff(inputDateTime);
    }

    static void findDiff(String inTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(inTime, formatter);
        LocalDateTime currentDateTime = LocalDateTime.now();
        Duration diff = Duration.between(dateTime, currentDateTime);

        inTime = inTime.substring(0, 10);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inTime, formatterDate);
        Period dif = Period.between(date, currentDate);

        long seconds = diff.getSeconds();
        long absSeconds = Math.abs(seconds);
        long hours = diff.toHours()%24;
        long minutes = diff.toMinutes()%60;
        long remainingSeconds = absSeconds % 60;

        System.out.println("the difference year:" + dif.getYears() + " months:" + dif.getMonths() + " days:" + dif.getDays() + " hours:" + hours + " minutes:" + minutes + " seconds:" + remainingSeconds);
    }
}
