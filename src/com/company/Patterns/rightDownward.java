package com.company.Patterns;

public class rightDownward {
    public static void main(String[] args) {
        int n=5;

        // Right Downward Triangle
//        for (int i=1; i<=n; i++)  {
//
//            for (int j=i; j<=n; j++) {
//                System.out.print("*");
//            }
//
//            for (int j=1; j<=i; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }


        //Left upward Triangle
        for (int i=1; i<=n; i++)  {

            for (int j=i; j<=n; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
