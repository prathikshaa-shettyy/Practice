package com.company.Patterns;

public class Triangle {
    public static void main(String[] args) {
        int n=5;

        for (int i=1; i<=n; i++) {

            for (int j=i; j<=n; j++) {  //Decreasing pattern
                System.out.print(" ");
            }

            for (int j = 1; j <i; j++) {     //Increasing pattern
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) {     //Increasing pattern
                System.out.print("*");
            }

            System.out.println();

        }
    }


}
