package org.jalgo.math;

/**
 * Created by rpitchai on 3/13/2015.
 */
public class IntegerToBinary {
    public static String toBinary(int num) {
        String str = "";
        while(num > 0) {
            str = (num & 1) + str;
            num >>= 1;
        }
        return str;
    }
}
