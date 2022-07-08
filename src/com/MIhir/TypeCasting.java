package com.MIhir;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float num=input.nextFloat();
        System.out.println(num);

//        TypeCasting
//        int a=(int)(45.4f);
//        System.out.println(a);
//
//        byte b=25;
//        byte c=40;
//        byte d=34;
//        byte e= (byte) ((b*c)/d);
//        System.out.println(e);

//        int z='B';
//        System.out.println(z);

        int i=1200;
        byte b=4;
        short s=1024;
        char c='a';
        float f=23.44f;
        double d=0.2334;
        double result=(i*b)+(s+c)+(f/d);
        System.out.println((i*b)+" "+(s+c)+" "+(f/d));
        System.out.println(result);



    }
}
