package com.MIhir;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char op=input.next().trim().charAt(0);
        int a= input.nextInt();
        int b= input.nextInt();
        int result=0;
        switch (op){
            case '+':
                result=a+b;
            case '-':
                result=a-b;
            case '*':
                result=a*b;
            case '/':
                if(b!=0){
                    result=a/b;
                }
            case '%':
               result=a%b;
            default:
                System.out.println("Invalid Operation");
        }
        System.out.println(result);
    }
}
