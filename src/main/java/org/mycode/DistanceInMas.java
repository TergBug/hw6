/*
 * Task 2
 *
 * Given an array of integers and an integer k, find out whether there are two distinct
 * indices i and j in the array such that nums[i] = nums[j] and the absolute difference
 * between i and j is at most k.
 */
package org.mycode;

public class DistanceInMas {
    public boolean getDistanceBetweenSameElements(int[] mas, int dist){
        if((mas == null) || (mas.length == 0)) return false;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i+1; j < mas.length; j++) {
                if((mas[i] == mas[j]) && (j-i <= dist)) return true;
            }
        }
        return false;
    }
}
