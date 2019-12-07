/*
 * Task 4
 *
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data
 * error, one of the numbers in the set got duplicated to another number in the set, which
 * results in repetition of one number and loss of another number.
 * Given an array nums representing the data status of this set after the error. Your task
 * is to firstly find the number occurs twice and then find the number that is missing. Return
 * them in the form of an array.
 */
package org.mycode;

import java.util.*;

public class ErrorInSet {
    public ArrayList<int[]> findErrorInSet(int[] mas){
        if((mas == null) || (mas.length < 2) || (mas.length > 10000)) return null;
        Map<Integer, Integer> errorsMap = new HashMap<>();
        for (int i = 0; i < mas.length; i++) {
            if((mas[i] > mas.length) || (mas[i] < 1)) return null;
            errorsMap.put(i+1, mas[i]);
        }
        for (int i = 1; i <= mas.length; i++) {
            int keyForRemove;
            if(errorsMap.containsKey(i) && errorsMap.containsKey(keyForRemove=errorsMap.get(i))){
                errorsMap.put(i, errorsMap.get(keyForRemove));
                errorsMap.remove(keyForRemove);
            }
            if(errorsMap.containsKey(i) && i==errorsMap.get(i)) errorsMap.remove(i);
        }
        ArrayList<int[]> errorMas = new ArrayList<>();
        errorsMap.keySet().forEach(element -> errorMas.add(new int[]{errorsMap.get(element), element}));
        return errorMas;
    }
}
