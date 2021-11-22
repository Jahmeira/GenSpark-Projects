package com.company;
import java.io.PushbackReader;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int randomGen(){
       return ThreadLocalRandom.current().nextInt(1,20);

    }

    static String getName(){
      try{
          System.out.println("Hello! What is your name?");
      }
      catch (Exception e){

      }
       return input.next();
    }
    static Integer guessANumber(){
        try {
            System.out.println("Choose a number between 1 - 20");
        }
        catch(Exception e){

        }
        return input.nextInt();
    }
    static boolean feedback(int guess, int realNum){
        try {
            if (guess < realNum) {
                System.out.println("Too Low");
            } else if (guess > realNum) {
                System.out.println("Too High");
            } else {
                System.out.println("You won");
                return true;
            }
        }
        catch (Exception e){

        }
        return false;
    }

    static boolean playAgain(){

       try {
           System.out.println("Would you like to play again? (y or n)");
           if (input.next().startsWith("y")) {
               return true;
           }
       }
       catch (Exception e){

       }
        return false;

    }
    public static void main(String[] args) {
      String name = getName();
        System.out.println("Hello, " + name);
        int secret = randomGen();

        while(true){
           if( feedback(guessANumber(), secret)){
              if(!playAgain()){
                  break;
              }
              secret = randomGen();
            }

        }
    }
   /* public static void startGame(){
        Scanner userInput = new Scanner(System.in);

        //Declarations
        // int computerNum;//Number computer chose for user to guess
        int numGuess = 0; // number of times user guesses
        int numTries = 5; //max number of guesses
        boolean restart = true;
        String answer = "";

        //Intro for user

        System.out.print("Hello! What is your name?");
        String name = userInput.nextLine();

        //Random randomNum = new Random();
        int computerNum = (int) (Math.random() * 1);

        System.out.print("Well " + (name) + ", I am thinking of a number between 1 and 20." +
                "           Take a guess.");
        int input = userInput.nextInt();


        while (numGuess < numTries) {


///////////////////////////////////////////////////////////

            //If statement & for loop for user guesses
            try {

                if (input == (computerNum)) {
                    System.out.println("Good job " + (name) +
                            ", You guessed my number in " + (numGuess) + " guess(es)!");

                    System.out.print("Would you like to play again? (y or n)");


                    if(answer == "n" || answer == "N"){
                        System.exit(0);

                    }

                    //numGuess++;

                }

                while (input != computerNum) {

                    //Greater than computerNum
                    if (input > (computerNum)) {
                        System.out.print("Your guess is too high." + " Guess again.");
                        input = userInput.nextInt();
                        numGuess++;
                    }

                    //Less than computerNum
                    else if (input < (computerNum)) {
                        System.out.print("Your guess is too low." + " Guess again.");
                        input = userInput.nextInt();
                        numGuess++;

                    }


                   // String answer = userInput.next();

                        //userInput.nextLine();
                        //restart = userInput.nextLine();
                        String playAgain = "";
                     if(answer == "y"){
                        startGame();
                        }
                        if(answer == "n" || answer == "N"){
                           System.exit(0);

                        }
                        break;
                        //System.out.println("Goodbye.");

                }//while #2
                System.out.print("You've maxed out tries. (6)" + "Try again? (If yes, guess another number." +
                        "If no, type (n)");

            }//try
            catch (Exception e){
                e.toString();
            }//Catch
        }//while #1
        }

    public static void main(String[] args) {
        startGame();

        }//Public static void main*/

    }//Main