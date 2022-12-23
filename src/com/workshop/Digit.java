package com.workshop;

public class Digit {
    public static void main(String[] args) {
        int i, j, row = 6;
        for (i = 3; i <= row; i++) {
            for (j = 3; j <= i; j++) {
                System.out.print(+i);
            }
            System.out.println();
        }
    }
}

