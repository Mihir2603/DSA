package com.MIhir;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        String fruit=input.next();
//        switch (fruit) {
//            case "mango":
//                System.out.println("its my fav fruit");
//                break;
//            case "apple":
//                System.out.println("it is red fruit");
//                break;
//            case "orange":
//                System.out.println("its a orange color");
//                break;
//            case "grapes":
//                System.out.println("its a small fruit");
//                break;
//            default:
//                System.out.println("please input valid fruit");
//                break;
//    }
        Scanner input=new Scanner(System.in);
        String empId=input.next();

        switch (empId){
            case "1":
                System.out.println("mihir patel");
                break;
            case "2":
                System.out.println("abhi");
                break;
            case "3":
                String department=input.next();
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "managment":
                        System.out.println("home managment");
                        break;
                    default:
                        System.out.println("please enter valid department");
                }
            default:
                System.out.println("please enter correct name");
        }

    }
}
