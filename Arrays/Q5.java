/*Problem Statement:
Given an array, we have found the number of occurrences of each element in the array. */

import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println(map);
    
}

}