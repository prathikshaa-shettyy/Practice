package com.company.Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n=5;
        //Creating triangle pattern
        for (int i=1; i<=n; i++) {

            for ( int j=i; j<=n;j++) {
                System.out.print(" ");
            }
            for ( int j=1; j<i;j++) {
                System.out.print("*");
            }
            for ( int j=1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    //Creates reverse triangle pattern
        for (int i=1; i<=n; i++) {

            for ( int j=1; j<=i;j++) {
                System.out.print(" ");
            }
            for ( int j=i; j<n;j++) {
                System.out.print("*");
            }
            for ( int j=i; j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
