package org.mycode;

import java.util.*;

public class ErrorInSet {
    public ArrayList<int[]> findErrorInSet(int[] mas){
        if(mas==null || mas.length<2 || mas.length>10000) return null;
        Map<Integer, Integer> errorsMap = new HashMap<>();
        for (int i = 0; i < mas.length; i++) {
            if(mas[i]>mas.length || mas[i]<1) return null;
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
