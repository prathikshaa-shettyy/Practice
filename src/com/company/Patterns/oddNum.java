package com.company.Patterns;

public class oddNum {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i<=n; i++) {
            if(i%2 != 0){   //Checks if the number i is not divisible by two
                System.out.println(i); //prints odd numbers from 1-10
            }
        }
    }
}
