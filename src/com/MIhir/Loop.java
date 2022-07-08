package com.MIhir;

import java.util.Scanner;

public class Loop {
    private static int num;

    public static void main(String[] args) {
//       for (int i=0;i<=5;i++){
//           System.out.println(i);
//       }
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
//
//        for (num = 0; num <= n; num++) {
//            System.out.println(num+" ");

//            while loop

//            while (num<10){
//                System.out.println(num);
//                num++;
//            }
//               DO-While
              do{
                  System.out.println(num);
                  num++;
              }while(num<=5);

    }
}
