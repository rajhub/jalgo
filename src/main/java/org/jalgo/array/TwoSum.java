package org.jalgo.array;

import java.util.HashMap;

/**
 * Created by raj on 3/17/15.
 */
public class TwoSum {
    public static int[] twoSum(int[] array, int target){
        if (array == null)
            return null;

        int[] ret = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                ret[0] = map.get(array[i]) + 1;
                ret[1] = i + 1;
                break;

            } else {
                map.put(target - array[i], i);
            }
        }

        return ret;
    }
}
