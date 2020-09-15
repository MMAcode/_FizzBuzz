package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //user input 1: Get number of numbers to display
        System.out.println("Fizz Buzz challenge:");
        ArrayList<String> texts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers would you like to see?: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("try again");
            System.out.print("How many numbers would you like to see?: ");
        }
        int amountOfNumbers = scanner.nextInt();
        scanner.nextLine();

        //user input 2: Get rules/multiples
        System.out.println();
        System.out.println("Which rules/multiples would you like to implement?");
        System.out.print("Type numbers separated by spaces (e.g.: '3 7 5 11'): ");
        String requestedMultiples = scanner.nextLine();
        //// get multiples from the string
        ArrayList<String> rules = new ArrayList<>();
        for (int i = 0; i < requestedMultiples.length(); i++) {
            char currentCharacter = requestedMultiples.charAt(i);

            //check if there is more digits for this number
            String supportStringForMultiDigit = "";
            do {
                supportStringForMultiDigit +=currentCharacter;
                i++;
                if(i < requestedMultiples.length()) currentCharacter = requestedMultiples.charAt(i);
            }
            while(i < requestedMultiples.length() && Character.isDigit(currentCharacter));
            rules.add(supportStringForMultiDigit);
        }
        ////show rules
        System.out.println("Following rules/multiples identified: "+ rules);






        //iterate through all numbers
        for (int i = 1; i <= amountOfNumbers; i++) {

            //Prepare text filed to display.
            if (i % 3 == 0 && rules.contains("3")) texts.add("Fizz");
            if (i % 13 == 0 && rules.contains("13")) texts.add("Fezz");
            if (i % 5 == 0 && rules.contains("5")) texts.add("Buzz");
            if (i % 7 == 0 && rules.contains("7")) texts.add("Bang");

            if (i % 11 == 0 && rules.contains("11")) {
                //quick solution:
                //                ArrayList<String> texts = new ArrayList<>();
                //                if(i % 13 == 0) texts.add("Fezz");
                //                texts.add("Bong");

                //solution without using %13:
                ArrayList<String> textsSupportVar = new ArrayList<>();
                if (texts.indexOf("fezz") >= 0) textsSupportVar.add("Fezz");
                textsSupportVar.add("Bong");
                texts = textsSupportVar;
            }

            if (i % 17 == 0 && rules.contains("17")) {
                System.out.print("This is----------------- 17TT: ");
                Collections.reverse(texts);
            }

            //Display the text field conditionally.
            System.out.println(i + ")" + (texts.size() == 0 ? i : (texts.stream().reduce("", (accumulator, currentValue) -> accumulator + currentValue))));

            //Reset texts
            texts = new ArrayList<>();
        }
    }


}
