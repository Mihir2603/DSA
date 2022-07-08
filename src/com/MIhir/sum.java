package com.MIhir;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number");
        float A = input.nextFloat();
        System.out.println("Enter the second number");
        float B = input.nextFloat();
        float sum = A + B;
        System.out.println("The Sum is ="+" "+sum);
    }
}

