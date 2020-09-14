package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println("Fizz Buzz challenge:");
        ArrayList<String> texts = new ArrayList<>();

        //iterate through all numbers
        for (int i = 1; i < 301; i++) {

            //Prepare text filed to display.
            if(i % 3 == 0) texts.add("Fizz");
            if(i % 13 == 0) texts.add("Fezz");
            if(i % 5 == 0) texts.add("Buzz");
            if(i % 7 == 0) texts.add("Bang");

            if(i % 11 == 0) {
                //quick solution:
                //                ArrayList<String> texts = new ArrayList<>();
                //                if(i % 13 == 0) texts.add("Fezz");
                //                texts.add("Bong");

                //solution without using %13:
                ArrayList<String> textsSupportVar = new ArrayList<>();
                if(texts.indexOf("fezz") >= 0 ) textsSupportVar.add("Fezz");
                textsSupportVar.add("Bong");
                texts = textsSupportVar;
            }

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
