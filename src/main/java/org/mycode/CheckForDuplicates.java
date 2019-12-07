package org.mycode;

import java.util.HashSet;
import java.util.Set;

public class CheckForDuplicates {
    public boolean checkDuplicated(int[] mas){
        if(mas==null || mas.length==0) return false;
        Set<Integer> set = new HashSet<>();
        for (int el : mas) if(!set.add(el)) return true;
        return mas.length>set.size();
    }
}
