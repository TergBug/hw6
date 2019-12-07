package org.mycode;

import java.util.ArrayList;

public class MyHashMap {
    private final static int DOWN_RANGE = 0;
    private final static int UP_RANGE = 1000000;
    private ArrayList<Integer> map = new ArrayList<>();
    public void put(int key, int value){
        if(key< DOWN_RANGE || key> UP_RANGE || value< DOWN_RANGE || value> UP_RANGE) return;
        if(key>map.size()) for (int i = map.size(); i < key; i++) map.add(i, -1);
        map.add(key, value);
    }
    public int get(int key){
        if(key< DOWN_RANGE || key>=map.size()) return -1;
        return map.get(key);
    }
    public void remove(int key){
        if(key>= DOWN_RANGE && key<map.size()) map.set(key, -1);
    }
}
