package dsa.section3_recursion_interview_q;

/* for example 10; 1+0=1
 * 22; 2+2=4
 * 112; 1+1+2=4
 */

class sumOfDigit {
    public static void main(String[] args) {
        sumOfDigit recursion = new sumOfDigit();
        int rec = recursion.recursionMethod(176);
        System.out.println(rec);
    }

    public int recursionMethod(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return -1;
        } else {
            return n % 10 + recursionMethod(n / 10);
        }
    }
}