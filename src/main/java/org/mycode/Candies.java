package org.mycode;

import java.util.HashMap;
import java.util.Map;

public class Candies {
    public int maxSistersKindsOfCandy(int[] candies){
        if(candies==null || candies.length<2 || candies.length>10000 || candies.length%2!=0) return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]<-100000 || candies[i]>100000) return -1;
            if(!map.containsKey(candies[i])) map.put(candies[i], 1);
            else map.put(candies[i], map.get(candies[i])+1);
        }
        return map.size()<candies.length/2 ? map.size() : candies.length/2;
    }
}
