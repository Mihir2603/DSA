package com.MIhir;

public class Condition {
    public static void main(String[] args) {
        int salary = 25000;
        if (salary > 20000) {
            salary += 2000;
        } else if (salary > 30000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}