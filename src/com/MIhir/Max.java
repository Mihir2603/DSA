package com.MIhir;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);

//        int max=a;
//        if(a>b){
//            max=a;
//        }else {
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);

        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }

}
