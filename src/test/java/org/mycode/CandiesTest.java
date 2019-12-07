package org.mycode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandiesTest {
    private Candies testedCandyBox = new Candies();
    private int[] box1 = new int[]{1, 1, 8, 4, 4, 5};
    private int[] box2 = new int[]{1, 1, 4, 4, 1, 4};
    private int waitedAnswer1 = 3;
    private int waitedAnswer2 = 2;
    private int[] invalidBoxOddLength = new int[5];
    private int[] invalidBoxOutOfBoundLength = new int[10002];
    private int[] invalidBoxBigNums = new int[]{100050, 111000, 5, 3};
    @Test
    public void shouldGiveMaxKindsOfCandyToSister(){
        assertEquals(waitedAnswer1, testedCandyBox.maxSistersKindsOfCandy(box1));
        assertEquals(waitedAnswer2, testedCandyBox.maxSistersKindsOfCandy(box2));
    }
    @Test
    public void shouldReactInExceptionCases(){
        assertEquals(-1, testedCandyBox.maxSistersKindsOfCandy(null));
        assertEquals(-1, testedCandyBox.maxSistersKindsOfCandy(new int[]{}));
        assertEquals(-1, testedCandyBox.maxSistersKindsOfCandy(invalidBoxOddLength));
        assertEquals(-1, testedCandyBox.maxSistersKindsOfCandy(invalidBoxOutOfBoundLength));
        assertEquals(-1, testedCandyBox.maxSistersKindsOfCandy(invalidBoxBigNums));
    }
}