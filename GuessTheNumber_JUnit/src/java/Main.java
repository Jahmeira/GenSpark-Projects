import java.util.Scanner;

public class Main {
    String name;
    int number;
    boolean isFeedback;
    boolean playAgain;
    Scanner input = new Scanner(System.in);

    String getName(){
        System.out.println("Hello! What is your name?");
        input.nextLine();
        return name;
    }

    Integer guessANumber(int guessNum){
        System.out.println("Choose a number between 1 - 20");
        input.nextInt();
        return input.nextInt();
    }

    boolean isFeedback(int guess, int realNum){
        if(guess < realNum){
            System.out.println("Too Low!");
        }
        else if (guess > realNum){
            System.out.println("Too High!");
        }
        else{
            System.out.println("You Won!");
            return true;
        }
        return false;
    }

    boolean isPlayAgain(){
        System.out.println("Play Again? (y or n)");
        return playAgain(input.nextLine());
    }

    boolean playAgain(String answer){
        if(answer.startsWith("y")){
            return true;
        }
        return false;
    }
}

