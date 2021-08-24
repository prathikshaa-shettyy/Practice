package com.company.Java;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        /* Standard output Stream */
        System.out.println("Hello World!");

        /* Standard input Stream*/
        Scanner input = new Scanner(System.in);
        System.out.println(input.next()); //Prints until it finds a space
        System.out.println(input.nextLine()); //Prints entire line

    }
}

/* Output
Hello World!
Hey How are you
Hey
 How are you
 */
