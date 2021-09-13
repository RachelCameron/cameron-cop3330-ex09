/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length?");
        double length = input.nextDouble();
        System.out.println("What is the width?");
        double width = input.nextDouble();
        double squareft = length * width;
        final double conversion = 350;
        double gallon = squareft/conversion;
        gallon = Math.ceil(gallon);
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", gallon, squareft);
    }
}