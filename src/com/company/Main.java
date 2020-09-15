package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Fizz Buzz challenge:");
        ArrayList<String> texts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers would you like to see?: ");
        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("try again");
            System.out.print("How many numbers would you like to see?: ");
        }
        int amountOfNumbers = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.println("Which rules/multiples would you like to implement?");
        System.out.print("Type numbers separated by spaces (e.g.: '3 7 5 11'): ");
//        while(!scanner.hasNextInt()){
//            scanner.nextLine();
//            System.out.println("try again");
//            System.out.print("How many numbers would you like to see?: ");
//        }
        String requestedMultiples = scanner.nextLine();
        System.out.println("received: " + requestedMultiples + " end" + requestedMultiples.length()) ;

//        get multiples from the string






        //iterate through all numbers
        for (int i = 1; i <= amountOfNumbers; i++) {

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
