package com.company.Patterns;

public class SandGlass {
    public static void main(String[] args) {
        int n=5;
        //For the downward triangle pattern
        for(int i=1; i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }

            System.out.println();

        }

        //For the upward triangle pattern
        for(int i=1; i<=n;i++){

            for (int j=i+1;j<=n;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" *");
            }

            System.out.println();

        }

    }

}
