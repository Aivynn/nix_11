package nixsolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountOfChars {


    public static void countChars() throws IOException {

        System.out.println("Enter the string to count chars");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String name = reader.readLine();
        SimpleMap buf;
        int x = 0, t = 1;
        int count = 0;
        int ind = 0;
        int size = 0 ;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                size++;
            }
        }
        char[] ch = new char[size];
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                ch[ind] = name.charAt(i);
                ind++;
            }
        }
        System.out.println(ch.length);
        StringBuilder unique = new StringBuilder();
        Arrays.sort(ch);
        unique.append(ch[x]);
        boolean flag = false;

        while (!flag) {
            if (ch[x] != ch[t]) {
                x = t;
                unique.append(ch[x]);
            }
            t++;
            if (t == ch.length) {
                flag = true;
            }
        }

        flag = false;
        SimpleMap[] dictArray = new SimpleMap[unique.length()];
        for(int i = 0;i<unique.length();i++) {
            for (char c : ch) {
                if (unique.charAt(i) == c) {
                    count++;
                }
            }
            dictArray[i] = new SimpleMap(unique.charAt(i),count);
            count = 0;
        }

        while(!flag) {
            flag = true;
            for (int i = 0; i < dictArray.length-1; i++) {
                if(dictArray[i].x < dictArray[i+1].x)
                {
                    flag = false;
                    buf = dictArray[i];
                    dictArray[i] = dictArray[i+1];
                    dictArray[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(dictArray));
    }
}