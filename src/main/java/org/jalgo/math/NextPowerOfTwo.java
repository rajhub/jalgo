package org.jalgo.math;

public class NextPowerOfTwo
{
    public static void main(String[] args)
    {
        long num = 129;
        long result = findNextPowerOfTwo(num);
        System.out.println(result);
    }

    private static long findNextPowerOfTwo(long num)
    {
        long result = 1;
        while (num != 0)
        {
            num >>= 1;
            result <<= 1;
        }
        return result;
    }
}
