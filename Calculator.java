package com.calc;

public class Calculator {
    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void sub(int a, int b){
        System.out.println(a-b);
    }

    public static void mul(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to calculator program");
        add(5,6);
        sub(5,3);
        mul(5,5);

    }
}
