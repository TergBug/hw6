package org.mycode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceInMasTest {
    private DistanceInMas testedCheckerDist = new DistanceInMas();
    private int[] masInDist = new int[]{1, 2, 3, 1, 1, 6};
    private int[] masOverDist = new int[]{1, 2, 3, 1, 3, 6};
    private int distArg = 1;
    @Test
    public void shouldCheckForDistBelowArg(){
        assertTrue(testedCheckerDist.getDistanceBetweenSameElements(masInDist, distArg));
        assertFalse(testedCheckerDist.getDistanceBetweenSameElements(masOverDist, distArg));
    }
    @Test
    public void shouldReturnFalseInExceptionCases(){
        assertFalse(testedCheckerDist.getDistanceBetweenSameElements(null, distArg));
        assertFalse(testedCheckerDist.getDistanceBetweenSameElements(new int[]{}, distArg));
    }
}