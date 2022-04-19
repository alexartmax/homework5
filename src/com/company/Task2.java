package com.company;

public class Task2 {

    public static void main(String[] args) {

        int a = 1;
        for (int i = 1; i < 1001; i++) {
            a *= i;
            if (a >= 1000) {
                System.out.println("The result =" + a);
                break;
            }
        }
    }
}
