import java.io.File;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

public class Main {
    static String letsStart = "Let's Start";
    static String computerWords[] = {"Water"};
    static String hidden = new String(new char[computerWords.length]).replace("", "?");
    static String words = computerWords[(int) (Math.random() * computerWords.length)];
    Random random = new Random();
    String[] maxWord = new String[max];
    int wordIndex = random.nextInt( max + 1) + min;
    static int guesses = 0;
    static int max = 4;
    static int min = 0;
    float scoreData = 0;
    float average = 0;
    String bodyUtf = "\uD83E\uDDCD";
    String reply;
    String head,body,arms,legs;
    boolean playAgain;
    File namesScores = new File("C:\\genspark_projects\\NamesAndScoresForHangmanJava.txt");
    Scanner input = new Scanner(System.in);

    File headFile = new File("\"C:\\genspark_projects\\hangman_head.png\"");
    File bodyFile = new File("\"C:\\genspark_projects\\hangman_body.png\"");
    File armsFile = new File("\"C:\\genspark_projects\\hangman_arms.png\"");
    File legsFile = new File("\"C:\\genspark_projects\\hangman_legs.png\"");



    public static void pickALetter() {
        while (guesses <= 4 && hidden.contains("?")) {
               System.out.println("I am thinking of a word, " +
                       "a five letter word. Take a guess.");
               Scanner input = new Scanner(System.in);
               String guess = input.nextLine();
        }
    }

    public static void hangman(String guess) {
        String hiddenW = "";

            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == guess.charAt(0)) {
                    hiddenW += guess.charAt(0);
                    // missedLetters = 0;
                } else if (hidden.charAt(i) != '?') {
                    hiddenW += words.charAt(i);
                } else {
                    hiddenW += "?";
                }
                // return words;

                if (hidden.equals(hiddenW)) {
                    guesses++;
                    startMakingHangman();
                } else {
                    hidden = hiddenW;
                }
                if (hidden.equals(words)) {
                    System.out.println("Very Good! You got it!" + words);
                }
            }//for
        }//end hangman

    private static float calculateScore(HashMap<String, Integer> alreadyGuessed, String word) {

        float letters = 100 - ((alreadyGuessed.size()/26)*100) ;

        float wordLength = word.length()*100/(26);

        return letters+wordLength;

    }

    public boolean isComputerWordAnswer() {
        return words.equals(hidden);
    }

    public static void startMakingHangman() {
        Scanner input = new Scanner(System.in);

            if (guesses == 1) {
                System.out.println("\"C:\\genspark_projects\\hangman_head.png\"");
                // 1
                System.out.println("Incorrect, you now have 3 guesses left.");
            }

            if (guesses == 2) {
                System.out.println("\"C:\\genspark_projects\\hangman_body.png\"");
                // 2
                System.out.println("Incorrect, you now have 2 guesses left.");

            }

            if (guesses == 3) {

                System.out.println("\"C:\\genspark_projects\\hangman_arms.png\"");
                // 3
                System.out.println("Incorrect, you now have 1 guess left.");

            }

            if (guesses == 4) {

                System.out.println("\"C:\\genspark_projects\\hangman_legs.png\"");
                // 4
                System.out.println("Incorrect, you are now out of guesses.");
                System.out.println(computerWords + "Was the word");
            }

    }//startMakingHangman

       public static boolean playAgain(String reply){
            System.out.println("Do you want to play again? | y or n |");
          //  return playAgain(input.nextLine());

            if (reply.equals("y")) {
                return true;
            }
            return false;
        }

}
