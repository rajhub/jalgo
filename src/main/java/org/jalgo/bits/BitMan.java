package org.jalgo.bits;

/**
 * Created by rpitchai on 3/27/2015.
 */
public class BitMan {
    boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    int setBit(int num, int i) {
        return num | (1 << i);
    }

    int clearBit(int num, int i) {
        return num & ~(1 << i);
    }

    int clearBitsMSBThroughI(int num, int i) {
        int mask = (1 << i) - 1;
        return num & mask;
    }

    int clearBitsIThrough0(int num, int i) {
        int mask = (~0) << i + 1;
        return num & mask;
    }

    public static int swapOddEvenBits(int x) {
        return (((x & 0xaaaaaaaa) >> 1) | ((x & 0x55555555) << 1));
    }

}
