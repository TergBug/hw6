package org.mycode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckForDuplicatesTest {
    private CheckForDuplicates testedChecker = new CheckForDuplicates();
    private int[] masWithDuplicated = new int[] {1, 6, 4, 7, 1, 6, 4};
    private int[] masWithoutDuplicated = new int[] {1, 6, 4, 7, 9, 60, 14};
    @Test
    public void shouldCheckForDuplicates(){
        assertTrue(testedChecker.checkDuplicated(masWithDuplicated));
        assertFalse(testedChecker.checkDuplicated(masWithoutDuplicated));
    }
    @Test
    public void shouldReturnFalseInExceptionCases(){
        assertFalse(testedChecker.checkDuplicated(null));
        assertFalse(testedChecker.checkDuplicated(new int[]{}));
    }
}