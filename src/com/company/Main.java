package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    //text-modifying f. without 'rewrite' boolean attribute
    public static ArrayList<String> addTextConditionaly(ArrayList<String> originalString, String textToAdd, int currentNumber, int multiplier) {
        boolean rewrite = false;
        if (currentNumber % multiplier == 0) {
            originalString.add(textToAdd);
        }
        return originalString;
    }

    //text-modifying f. with 'rewrite' boolean attribute
    public static ArrayList<String> addTextConditionaly(ArrayList<String> originalString, String textToAdd, int currentNumber, int multiplier, boolean rewrite, String considerMultipleOf13) {
        if (currentNumber % multiplier == 0) {
            originalString.add(textToAdd);

            //Rewrite the text totally if requested.
            if (rewrite){
                originalString = new ArrayList<>();


                //Watch out for multiple of 13.
                if (!considerMultipleOf13.equals("")){
                    originalString.add(considerMultipleOf13);
                    originalString.add(textToAdd);
                }else {
                    originalString.add(textToAdd);
                }
            }
        }
        return originalString;
    }

    public static void main(String[] args) {
        //testing new branch

        System.out.println("Fizz Buzz challenge:");
        ArrayList<String> texts = new ArrayList<>();

        //iterate through all numbers
        for (int i = 1; i < 301; i++) {
            //Prepare text filed to display.
            texts = addTextConditionaly(texts, "Fizz", i, 3);
            texts = addTextConditionaly(texts, "Fezz", i, 13);
            texts = addTextConditionaly(texts, "Buzz", i, 5);
            texts = addTextConditionaly(texts, "Bang", i, 7);

            // handle multiple of 11 but watch-ut for multiple of 13 too (last parameter
            texts = addTextConditionaly(texts, "Bong", i, 11, true, i%13==0 ? "Fezz" : "");

            //swap words if multiple of 17
            if (i % 17 == 0){
                System.out.print("This is----------------- 17TT: ");
                Collections.reverse(texts);
            }

            //Display the text field conditionally.
            System.out.println(i + ")" + (texts.size()==0 ? i : (texts.stream().reduce("",(accumulator,currentValue)->accumulator+currentValue)) ) );

            //Reset texts
            texts = new ArrayList<>();
        }
    }


}
