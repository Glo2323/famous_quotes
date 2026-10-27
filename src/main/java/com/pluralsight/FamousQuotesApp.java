package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class FamousQuotesApp {

    public static void main(String[] args) {

        //*Creating a Scanner
        Scanner input = new Scanner(System.in);

        //*Creating a loop to keep it going
        boolean appRunning = true;
        while (appRunning) {

            //?Wrapping it around a try/catch
            try {

                //?Creating my array
                ArrayList<String> quotes = new ArrayList<String>();

                //*Adding the quotes to the array
                quotes.add(" 1.If you don’t take risks, you can’t create a future!"); //One piece
                quotes.add(" 2.Power comes in response to a need, not a desire."); // Dragon Ball Z
                quotes.add(" 3.A lesson without pain is meaningless."); // Fullmetal Alchemist: Brotherhood
                quotes.add(" 4.Whatever you lose, you'll find it again. But what you throw away you'll never get back."); // Kenshin
                quotes.add(" 5.Fear is not evil. It tells you what your weakness is."); // Fairy Tail
                quotes.add(" 6.People’s lives don’t end when they die, it ends when they lose faith."); // Naruto
                quotes.add(" 7.If you can’t do something, then don’t. Focus on what you can do."); // One Piece
                quotes.add(" 8.The moment you think of giving up, think of the reason why you held on so long."); // Fairy Tail
                quotes.add(" 9.Hard work is worthless for those that don’t believe in themselves."); // Naruto
                quotes.add(" 10.The world isn’t perfect, but it’s there for us, doing the best it can."); // Fullmetal Alchemist

                //*Asking for user to pick quote
                System.out.println("Pick a number between 1 and 10 to get a quote: ");

                //*storing the answer
                int quotePicked = input.nextInt();

                //*making the input start at 1
                --quotePicked;


                //?Printing out the users choice
                System.out.println("Your quote is" + quotes.get(quotePicked));
                //placeholder
                input.nextLine();


                //*Askin if they want other quote or if they are done
                System.out.println("Would you like to pick other quote: ");

                String runAgain = input.nextLine();

                if (runAgain.equalsIgnoreCase("No") ) {
                    appRunning = false;
                }
            }

            catch (Exception e) {
                System.out.println(e.getMessage());

                System.out.println("Please enter a valid number");
            }

        }


    }

}
