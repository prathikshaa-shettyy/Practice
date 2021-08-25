package com.company.Java;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Sum is: "+ (num1+num2));
    }
}
