package com.nixsolutions;

public class Strings {

    public static String reverse(String string) {
        int count = 0;
        int x = string.length() - 1;
        String reversed_string = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                count++;
            }
        }
        String[] words = new String[count + 1];
        int a = words.length - 1;
        while (x > 0) {
            if (string.charAt(x) == ' ') {
                words[a] = reversed_string;
                reversed_string = "";
                a--;
            } else {
                reversed_string += string.charAt(x);
            }

            x--;
            if (x == 0) {
                reversed_string += string.charAt(x);
                words[0] = reversed_string;
            }
        }
        StringBuilder answer = new StringBuilder();
        for (String s : words) {
            answer.append(s);
            answer.append(" ");
        }
        return answer.toString();
    }

    public static String reverse(String main, String substring) {
        String reversed = "";
        if (!main.contains(substring)) {
            System.out.println("No such substring, try again");
        } else {
            reversed = reverseSubstring(substring);;
        }
        return main.replace(substring,reversed);
    }

    public static String reverse(String string, int firstInd, int secondInd) {
        String substr = "";
        String reversed = "";
        for (int i = 0; i < string.length(); i++) {
            if (i >= firstInd && i <= secondInd && string.charAt(i) != ' ') {
                substr += string.charAt(i);
            }
            if (string.charAt(i) == ' ') {
                reversed = reverseSubstring(substr);
                string = string.replace(substr, reversed);
                substr = "";
                reversed = "";
            }
        }
        reversed = reverseSubstring(substr);
        string = string.replace(substr, reversed);
        return string;
    }

    private static String reverseSubstring(String substring) {
        String reversed = "";
        for (int j = substring.length(); j > 0; j--) {
            reversed += substring.charAt(j - 1);
        }
        return reversed;
    }
}
