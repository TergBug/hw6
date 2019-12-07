package org.mycode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {
    private MyHashMap testedHashMap = new MyHashMap();
    private int testedKey = 5;
    private int testedValue = 54;
    private int outOfUpRangeNumber = 1000001;
    private int outOfDownRangeNumber = -4;
    @Test
    public void shouldMappingKeyValue(){
        testedHashMap.put(testedKey, testedValue);
        assertEquals(testedValue, testedHashMap.get(testedKey));
    }
    @Test
    public void shouldRemappingKeyValue(){
        testedHashMap.remove(testedKey);
        assertEquals(-1, testedHashMap.get(testedKey));
    }
    @Test
    public void shouldReactInExceptionCases(){
        testedHashMap.put(outOfUpRangeNumber, testedValue);
        assertEquals(-1, testedHashMap.get(outOfUpRangeNumber));
        testedHashMap.put(outOfDownRangeNumber, testedValue);
        assertEquals(-1, testedHashMap.get(outOfDownRangeNumber));
        testedHashMap.put(testedKey, outOfUpRangeNumber);
        assertEquals(-1, testedHashMap.get(testedKey));
        testedHashMap.put(testedKey, outOfDownRangeNumber);
        assertEquals(-1, testedHashMap.get(testedKey));
    }
}