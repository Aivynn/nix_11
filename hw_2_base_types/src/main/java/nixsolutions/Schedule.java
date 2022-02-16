package nixsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.TimeZone;

public class Schedule {


    public static void lessons() throws IOException {

        try {
            System.out.println("Enter the number of lessons(from 1 to 10): ");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String name = reader.readLine();
            int number = Integer.parseInt(name);
            int sec = 1000;
            int minute = sec * 60;
            int hour = minute * 60;
            int start_lessons = hour * 9;
            int lesson = 45 * minute;
            int small = minute * 5 * ((int) Math.ceil((number - 1) / 2f));
            int big = minute * 15 * (Math.round((number - 1) / 2));

            SimpleDateFormat simpleDateFormat =
                    new SimpleDateFormat("HH:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

            Date date = new Date();
            date.setTime(start_lessons + (lesson * number) + small + big);
            System.out.println("Lessons will end at : " + simpleDateFormat.format(date));
        } catch (Exception e) {
            System.out.println("Wrong input, your string shouldn't contain chars, try again.");
            lessons();
        }
    }
}
