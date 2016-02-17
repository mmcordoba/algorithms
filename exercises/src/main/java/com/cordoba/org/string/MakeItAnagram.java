package com.cordoba.org.string;

import java.util.Arrays;

/**
 * Created by manuel.cordoba on 2/17/16.
 */
public class MakeItAnagram {


    public int makeItAnagram(String first, String second) {
        int removeCount = 0;

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        for (int i=0, j=0; i< firstArray.length || j < secondArray.length;) {

            if(firstArray[i] == secondArray[j]) {
                i++;
                j++;
            } else {
                if (firstArray[i] < secondArray[j]) {
                    i ++;
                    removeCount++;
                } else {
                    j++;
                    removeCount++;
                }
            }

        }

        return removeCount;
    }

}
