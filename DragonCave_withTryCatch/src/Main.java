import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Introduction to user
        System.out.println("BEHOLD! You are in a land full of dragons!");
        System.out.println("In front of you, you see two caves.");

        System.out.println("In one cave, the dragon is friendly and" +
                " will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry " +
                "and will eat you on sight.");

        System.out.print("Which cave will you go into? 1 or 2");

        System.out.print(" If you're too scared... Type '0'");
        Random randomD = new Random();
        Scanner userInput = new Scanner(System.in);

        try {
            int input = userInput.nextInt();
            String option [] = {"Exit Game", "Nice Dragon", "Mean Dragon"};

            if(input == 1 ) {
                System.out.println("You've chosen the nice dragon. Congrats! You have treasure!" +
                                   " ****Treasure Aquired From " + option [1] + "****");
            }

            else if(input == 2) {
                System.out.println("You have chosen the mean dragon. You were eaten instantly and are DEAD." + " ****You were killed by " + option [2] + "****");
            }

            else {
                System.out.println("You have chosen to exit.");
            }

        }
        catch(Exception e){

        }

        //Arrays

      //  Random randomD = new Random();
        //Scanner userInput = new Scanner(System.in);


        //int input = userInput.nextInt();

        //If Statement and output

    }

}
