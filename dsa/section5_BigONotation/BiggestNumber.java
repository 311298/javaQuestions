package dsa.section5_BigONotation;

import java.lang.Math;

class BiggestNumber {
    public static void main(String[] args) {
        BiggestNumber recurion = new BiggestNumber();
        int[] sampleArray = new int[] { 33, 3, 99, 45, 1, 10 };
        int length = 4;
        int result = recurion.recursiveMethod(sampleArray, length);
        System.out.println(result);
    }

    public int recursiveMethod(int[] sampleArray, int length) {
        if (length == 1) {
            return sampleArray[0];
        } else {
            return Math.max(sampleArray[length - 1], recursiveMethod(sampleArray, length - 1));
        }
    }
}