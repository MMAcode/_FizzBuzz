package com.company;

public class Main {

    //f.without 'rewrite' boolean attribute
    public static String addTextConditionally(String originalString, String textToAdd, int currentNumber, int multiplier) {
        boolean rewrite = false;
        if (currentNumber % multiplier == 0) {
            originalString += textToAdd;
        }
        return originalString;
    }

    //f.with 'rewrite' boolean attribute
    public static String addTextConditionally(String originalString, String textToAdd, int currentNumber, int multiplier, boolean rewrite, String considerMultipleOf13) {
        if (currentNumber % multiplier == 0) {
            originalString += textToAdd;

            //Rewrite the text totally if requested.
            if (rewrite){
                originalString = textToAdd;

                //Watch out for multiple of 13.
                if(!considerMultipleOf13.equals("")){
                    originalString = considerMultipleOf13 + textToAdd;
                }
            }
        }
        return originalString;
    }

    public static void main(String[] args) {
        System.out.println("Fizz Buzz challenge:");


        String text = "";

        //iterate through all numbers
        for (int i = 1; i < 201; i++) {
            //Prepare text filed to display.
//            text = addTextConditionally(text, "Fizz", i, 3);
//            text = addTextConditionally(text, "Buzz", i, 5);
//            text = addTextConditionally(text, "Bang", i, 7);
//            text = addTextConditionally(text, "Bong", i, 11,true);

            text = addTextConditionally(text, "Fizz", i, 3);

            // Implementing multiple of 13.
            text = addTextConditionally(text, "Fezz", i, 13);

            text = addTextConditionally(text, "Buzz", i, 5);
            text = addTextConditionally(text, "Bang", i, 7);

            // handle multiple of 11 but watch-ut for multiple of 13 too (last parameter
            text = addTextConditionally(text, "Bong", i, 11, true, i%13==0 ? "Fezz" : "");

            //Display the text field conditionally.
            System.out.println(i + ")" + (text.equals("") ? i : text) );

            //Reset text field.
            text = "";
            }
    }
}
