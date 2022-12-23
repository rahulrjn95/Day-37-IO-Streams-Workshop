package com.workshop;

public class Reverse_String {
    public static void main(String[] args) {

        String data = "Hi my name is Rahul";
        String reverseString = " ";

        for (int i = 0; i < data.length(); i++) {
            //converting string into character and then reverse it.
            reverseString = data.charAt(i) + reverseString;
        }
        System.out.println("Reversed string :" + reverseString);

    }
}
