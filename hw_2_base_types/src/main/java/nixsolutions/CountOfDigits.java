package nixsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfDigits {

    public static void countDigits() throws IOException {

            System.out.println("Enter the string to count digits");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            String name = reader.readLine();
            int count = 0;

            for (int i = 0; i < name.length(); i++) {
                if (Character.isDigit(name.charAt(i))) {
                    count += Integer.parseInt(String.valueOf(name.charAt(i)));
                }
            }
            System.out.println(count);
        }
    }