package com.company;

public class Main {

    public static String addTextConditionally(String originalString, String textToAdd, int currentNumber, int multiplier) {
        if (currentNumber % multiplier == 0) {
            originalString += textToAdd;
        }
        return originalString;
    }

    public static void main(String[] args) {
        System.out.println("Fizz Buzz challenge:");


        String text = "";

        //iterate through all numbers
        for (int i = 1; i < 101; i++) {
            //Prepare text filed to display.
            text = addTextConditionally(text, "Fizz", i, 3);
            text = addTextConditionally(text, "Buzz", i, 5);
            text = addTextConditionally(text, "Bang", i, 7);

            //Display the text field conditionally.
            System.out.println(i + ")" + (text.equals("") ? i : text) );

            //Reset text field.
            text = "";
            }
    }
}
