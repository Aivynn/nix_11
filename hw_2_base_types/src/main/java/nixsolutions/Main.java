package nixsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        while (true) {

            System.out.println("What program should do: ");
            System.out.println("1: Program should count all digits from string");
            System.out.println("2: Program should count how many times each char meets.");
            System.out.println("3: Program should count when lesson ends ");
            System.out.println("0 - exit");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            String name = reader.readLine();

            switch (name) {
                case "1" -> CountOfDigits.countDigits();
                case "2" -> CountOfChars.countChars();
                case "3" -> Schedule.lessons();
                case "0" -> System.exit(1);
            }
        }
    }
}
