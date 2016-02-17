package com.cordoba.org.string;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Words {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[ !,?._'@]");
        List<String> words = new LinkedList<>();

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] text = s.toCharArray();

        //Complete the code
        String currentWord = "";

        for (int i = 0; i < text.length; i++) {
            Character current = text[i];
            if (p.matcher("" + current).matches()) {
                if (currentWord.length() > 0) {
                    words.add(currentWord);
                    currentWord = "";
                }
            } else {
                currentWord += current;
            }
        }
        if (currentWord.length() > 0) {
            words.add(currentWord);
        }

        System.out.println(words.size());
        words.forEach(System.out::println);
    }
}
