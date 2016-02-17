package com.cordoba.org.string;

import java.util.*;

/**
 * Created by manuel.cordoba on 2/17/16.
 */
public class AnagramInString {


    public int anagramInString(char[] a) {

        if (a.length % 2 != 0)
            return -1;

        Map<String, Integer> lettersAppearances = new HashMap<>();

        int replacements = 0;

        for (int i = a.length -1; i >= 0; i--) {
            Integer actualLetterOccurrence = lettersAppearances.get("" + a[i]);

            if (i>= (a.length/2)) {

                if (actualLetterOccurrence == null)
                    lettersAppearances.put("" + a[i], 1);
                else
                    lettersAppearances.put("" + a[i], actualLetterOccurrence + 1);

            } else {
                if (actualLetterOccurrence == null || actualLetterOccurrence <= 0)
                    replacements++;
                else {
                    lettersAppearances.put("" + a[i], actualLetterOccurrence - 1);
                }
            }

        }


        return replacements;
    }
}
