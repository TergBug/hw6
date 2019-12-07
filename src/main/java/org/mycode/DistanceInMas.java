package org.mycode;

public class DistanceInMas {
    public boolean getDistanceBetweenSameElements(int[] mas, int dist){
        if(mas==null || mas.length==0) return false;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i+1; j < mas.length; j++) {
                if(mas[i]==mas[j] && j-i<=dist) return true;
            }
        }
        return false;
    }
}
