package com.example.gitstudy.simple;

public class firstClass {


    public static void main(String[] args) {

        int num =1;


        for (int i = 0; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");


            }
            for (int k = 1; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
