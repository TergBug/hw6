package org.mycode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class ErrorInSetTest {
    private ErrorInSet testedErrorSearch = new ErrorInSet();
    private int[] setWithError = new int[]{2, 1, 3, 2, 3, 6};
    private ArrayList<int[]> errorMas = new ArrayList<>();
    private int[] setWithExceptionCase1 = new int[]{1, 2, 2, 3, 3, 8};
    private int[] setWithExceptionCase2 = new int[]{0, 2, 2, 3, 3, 6};
    @Before
    public void setupErrorMas(){
        Collections.addAll(errorMas, new int[]{2, 4}, new int[]{3, 5});
    }
    @Test
    public void shouldFindErrorInSet(){
        ArrayList<int[]> actualArray = testedErrorSearch.findErrorInSet(setWithError);
        for (int i = 0; i < errorMas.size(); i++) assertArrayEquals(errorMas.get(i), actualArray.get(i));
    }
    @Test
    public void shouldReturnNullInExceptionCases(){
        assertNull(testedErrorSearch.findErrorInSet(null));
        assertNull(testedErrorSearch.findErrorInSet(new int[1]));
        assertNull(testedErrorSearch.findErrorInSet(new int[10001]));
        assertNull(testedErrorSearch.findErrorInSet(setWithExceptionCase1));
        assertNull(testedErrorSearch.findErrorInSet(setWithExceptionCase2));
    }
}