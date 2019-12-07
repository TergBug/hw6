package org.mycode;

import java.util.ArrayList;

public class MyHashMap {
    private final static int downRange = 0;
    private final static int upRange = 1000000;
    private ArrayList<Integer> map = new ArrayList<>();
    public void put(int key, int value){
        if(key<downRange || key>upRange || value<downRange || value>upRange) return;
        if(key>map.size()) for (int i = map.size(); i < key; i++) map.add(i, -1);
        map.add(key, value);
    }
    public int get(int key){
        if(key<downRange || key>=map.size()) return -1;
        return map.get(key);
    }
    public void remove(int key){
        if(key>=downRange && key<map.size()) map.set(key, -1);
    }
}
