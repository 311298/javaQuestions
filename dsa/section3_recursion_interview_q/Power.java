/*
 * 2^4 =16
 * 4^3=48
 */
package dsa.section3_recursion_interview_q;

class Power {
    public static void main(String[] args) {
        Power recursion = new Power();
        int rec = recursion.recursionMethod(4, 2);
        System.out.println(rec);
    }

    public int recursionMethod(int power, int base) {
        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return base;
        } else {
            return base * recursionMethod(power - 1, base);
        }
    }
}