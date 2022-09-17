package dsa.section3_recursion_interview_q;

/*
 * decimal to binary
 * 8=1000
 * 17=10001
 */

class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary recursion = new DecimalToBinary();
        int rec = recursion.recursionMethod(10);
        System.out.println(rec);
    }

    public int recursionMethod(int decimal) {
        if (decimal <= 1) {
            return 1;
        }
        // return 10 * (decimal % 2) + recursionMethod(decimal / 2); //complete opposite
        return (decimal % 2) + (10 * recursionMethod(decimal / 2));
    }
}