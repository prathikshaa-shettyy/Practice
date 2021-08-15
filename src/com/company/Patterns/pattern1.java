package com.company.Patterns;
//increasing pattern
public class pattern1 {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++ ) {     //i for the row
            for (int j = 1; j <= i; j++) {     //j for the column
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
