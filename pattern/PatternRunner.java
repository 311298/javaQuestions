package com.kunal.patterns;

public class PatternRunner {
    public static void main(String[] args) {
        //first pattern question


        // rules
        /*
        1. outer loop will be equal to # number of lines
        2. for each row how many columns are present or types of element in column
        3. what do you need to print
        */

//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(3);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(3);
//        pattern10(3);
//        pattern11(3);
//        pattern12(4);
//        pattern13(4);
//        pattern14(3);
        pattern15(4);
    }

    public static void pattern1(int n) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern3(int n) {

        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        /*
         *
         * *
         * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 0; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            for (int j = 0; j < col; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern6(int n) {

//         *
//        **
//       ***
//      ****
//     *****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        // 1
        // 12
        // 123
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        //1
        //22
        //333
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        //0
        //12
        //345
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        //  1
        // 12
        //123
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print(k);
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        //  1
        // 121
        //12321
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print(k);
            for (int m = i - 1; m > 0; m--)
                System.out.print(m);
            System.out.println();
        }
    }

    public static void pattern12(int n) {
//      ****
//       ***
//        **
//         *
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            for (int j = n; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern13(int n) {
//        *
//       ***
//      *****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            for (int m = 1; m <= i - 1; m++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern14(int n) {
//      *****
//       ***
//        *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            for (int k = n; k >= i; k--)
                System.out.print("*");
            for (int m = 1; m < n - i; m++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern15(int n) {

    }
}
