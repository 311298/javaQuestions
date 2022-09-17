/*
 * highest common factor 
 */

package dsa.section3_recursion_interview_q;

class GCD {
    public static void main(String[] args) {
        GCD recursion = new GCD();
        int rec = recursion.recursionMethod(215, 30);
        System.out.println(rec);
    }

    public int recursionMethod(int dividend, int divisor) {
        if (dividend % divisor == 0) {
            return divisor;
        } else {
            return recursionMethod(divisor, dividend % divisor);
        }
    }
}