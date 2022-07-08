package com.MIhir;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();
        float tempF = (9 / 5 * tempC) + 32;
        System.out.println(tempF);
    }
}


