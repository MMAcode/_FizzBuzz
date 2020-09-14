package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fizz Buzz challenge:");


//Fill the text field.
        String text = "";
        int nr = 0;
        for (int i=1; i<101; i++){
            nr = i % 3;

            if (i%3==0) {
                text = text + "Fizz";
            }
            if (i%5==0) {
                text = text + "Buzz";
            }


//Print the text field, if it exists.
            if (text=="") {
                System.out.println(i + ")" + i);
            } else {
                System.out.println(i + ")" + text);
            }
            text = "";
        }



    }
}
