package com.nixsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {

            System.out.println("What program should do: ");

            System.out.println("1: Enter the string to reverse it");
            System.out.println("2: Enter the string and substring to reverse it.");
            System.out.println("3: Enter the string, and two indexes(numbers) which program start and when supposed to end reverse ");
            System.out.println("0 - exit");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            String str = reader.readLine();
            String substring = "";


            switch (str) {
                case "1" -> {
                    System.out.println("Enter the string to reverse it");

                    str = reader.readLine();

                    System.out.println(Strings.reverse(str));
                }
                case "2" -> {
                    System.out.println("Enter string");

                    str = reader.readLine();

                    System.out.println("Enter the substring to reverse it");
                    substring = reader.readLine();

                    try{
                        if(str.contains(substring)) {
                            System.out.println(Strings.reverse(str, substring));
                        }
                        else
                        {
                            throw new Exception();
                        }
                    }
                    catch (Exception e) {
                        System.out.println("String doesn't contain such substring, try again.");
                    }
                }

                case "3" -> {
                    System.out.println("Enter the string: ");
                    str = reader.readLine();
                    String firstIndex;
                    String lastIndex;

                    try {
                        System.out.println("Enter first index");
                        firstIndex = reader.readLine();

                        System.out.println("Enter last index");
                        lastIndex = reader.readLine();

                        System.out.println(Strings.reverse(str,Integer.parseInt(firstIndex),Integer.parseInt(lastIndex)));

                    }

                    catch (Exception e) {
                        System.out.println("Wrong input, try again");
                    }

                }

                case "0" -> {
                    System.exit(1);
                }
            }
        }
    }
}
