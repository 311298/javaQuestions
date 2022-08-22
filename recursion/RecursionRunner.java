package com.kunal.recursion;

import java.util.Scanner;

public class RecursionRunner {
    public static void main(String[] args) {
        // recursion via java
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        System.out.println(recursionLoop1(number));
//        recursionLoop2(number);
//        System.out.println(factorialRecursion(number));
//        System.out.println(fibonacciSeriesRecursion(number));
        System.out.println(hfcRecursion(26,13));
        scanner.close();
    }

    public static int recursionLoop1(int n) {
        // loop backward
      if(n==1)
          return 1;
      else {
          System.out.println(n);
          return recursionLoop1(n - 1);
      }
    }

    public static void recursionLoop2(int n){
        //forward loop
        if(n>=1){
            recursionLoop2(n-1);
            System.out.println(n);
        }
    }

    public static int factorialRecursion(int n){
        if(n==1)
            return 1;
        else
            return n*factorialRecursion(n-1);
    }

    public static int fibonacciSeriesRecursion(int n){
        if(n<=1)
            return n;
        else
            return fibonacciSeriesRecursion(n-1)+
                    fibonacciSeriesRecursion(n-2);
    }

    public static int hfcRecursion(int large, int small){
        if(large%small ==0)
            return small;
        else
            return hfcRecursion(small,large%small);
    }
}
