package com.cordoba.org.string;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by manuel.cordoba on 2/17/16.
 */
public class AnagramInStringTest {


    private AnagramInString anagramInString = new AnagramInString();

    @Test
    public void testAnnagrams() {
        Assert.assertEquals(3,anagramInString.anagramInString("aaabbb".toCharArray()));

        Assert.assertEquals(0,anagramInString.anagramInString("xyyx".toCharArray()));

        Assert.assertEquals(2,anagramInString.anagramInString("abcbde".toCharArray()));

        Assert.assertEquals(-1,anagramInString.anagramInString("abc".toCharArray()));
    }

}
