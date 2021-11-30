import java.util.Random;
import java.util.Scanner;

public class DragonCaveJUnit {
    static Scanner input = new Scanner(System.in);

    public String caves(int chooseNum) {
        Scanner userInput = new Scanner(System.in);
       // pickChoose = userInput.nextInt();
        // return input.nextInt();

        if (chooseNum == 1) {
            return "You've chosen the nice dragon. " +
                    "Congrats! You have treasure!";
        } else if (chooseNum == 2) {
            return "You have chosen the mean dragon. " +
                    "You were eaten instantly and are DEAD.";
        }
        return "Try again";

    }


    public static void dragonCaveJUnit(String[] args) {

        Scanner userInput = new Scanner(System.in);

        try {
            int user = userInput.nextInt();
            System.out.println(new DragonCaveJUnit().caves(user));
        } catch (Exception e) {
            e.toString();
        }
        // return userInput;

    }


}

//int input1 = 1;
//int input2 = 2;
//String intro1 = ";

//String intro2 = "In front of you, you see two caves.";

// String intro3 = "In one cave, the dragon is friendly and" +
//  " will share his treasure with you.";

// String intro4 = "The other dragon is greedy and hungry " +
//  "and will eat you on sight.";
// String intro1 = "BEHOLD! You are in a land full of dragons!" +
//"Choose a cave (1 or 2)";
